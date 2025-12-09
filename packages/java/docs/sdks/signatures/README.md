# Signatures

## Overview

Retrieves Check-In & Check-Out Signatures Of Attendees

### Available Operations

* [getSignatures](#getsignatures) - List Signatures

## getSignatures

Retrieves a paginated list of check-in & check-out signatures associated with the account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getSignatures" method="get" path="/signatures" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetSignaturesRequest;
import com.cvent.models.operations.GetSignaturesResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
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

        GetSignaturesRequest req = GetSignaturesRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .sort("event.id:ASC,lastModified:DESC")
                .filter("event.id eq 'a81bc81b-dead-4e5d-abff-90865d1e13b1' or session.id eq 'de14c31b-aaad-2e5d-asgf-89865d1e13b1'")
                .build();


        sdk.signatures().getSignatures()
                .callAsStream()
                .forEach((GetSignaturesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetSignaturesRequest](../../models/operations/GetSignaturesRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetSignaturesResponse](../../models/operations/GetSignaturesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |