<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAccountUserGroupsRequest;
import com.cvent.models.operations.GetAccountUserGroupsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                        .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                                .clientID("<id>")
                                .clientSecret("<value>")
                                .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                                .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                                .build())
                        .build())
                .build();

        GetAccountUserGroupsRequest req = GetAccountUserGroupsRequest.builder()
                .token("1a2b3c4d5e6f7g8h9i10j11k")
                .filter("name eq 'My User Group'")
                .build();

        sdk.users().getAccountUserGroups().callAsStream().forEach((GetAccountUserGroupsResponse item) -> {
            // handle page
        });
    }
}

```
<!-- End SDK Example Usage [usage] -->