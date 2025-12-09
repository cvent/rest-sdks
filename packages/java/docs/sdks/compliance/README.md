# Compliance

## Overview

These API's provide compliance support for regulated industries.

**Communication Compliance** lets you view communication activities across your account.
Various written forms of communication are captured. For example, emails, SMS, chat messages, or push notifications
can be downloaded for archival or analysis.


### Available Operations

* [getConfiguration](#getconfiguration) - Get Communication Config

* [updateConfiguration](#updateconfiguration) - Update Communication Config

* [getCommunicationLogMessages](#getcommunicationlogmessages) - List Communication

* [filterCommunicationLogMessages](#filtercommunicationlogmessages) - List Communication


## getConfiguration

Gets communication compliance configuration for an account. For example, gets the communication types enabled for an account.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getConfiguration" method="get" path="/logs/communications/configuration" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetConfigurationResponse;
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

        GetConfigurationResponse res = sdk.compliance().getConfiguration()
                .call();

        if (res.communicationConfiguration().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetConfigurationResponse](../../models/operations/GetConfigurationResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateConfiguration

Update the communication compliance configuration for an account.  For example, configure which communication types will be recorded in the communication log.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateConfiguration" method="put" path="/logs/communications/configuration" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateConfigurationResponse;
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

        CommunicationConfiguration req = CommunicationConfiguration.builder()
                .enabledMessageTypes(List.of())
                .build();

        UpdateConfigurationResponse res = sdk.compliance().updateConfiguration()
                .request(req)
                .call();

        if (res.communicationConfiguration().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CommunicationConfiguration](../../models/shared/CommunicationConfiguration.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateConfigurationResponse](../../models/operations/UpdateConfigurationResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getCommunicationLogMessages

Gets a paginated list of communication log messages from your account. The filter is not required. If no filter
is provided then the API will return communication log messages of all types between the specified dates.

Supported types are:

  * email
  * chat
  * session_qa


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommunicationLogMessages" method="get" path="/logs/communications/messages" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetCommunicationLogMessagesRequest;
import com.cvent.models.operations.GetCommunicationLogMessagesResponse;
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

        GetCommunicationLogMessagesRequest req = GetCommunicationLogMessagesRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("type eq 'email'")
                .build();


        sdk.compliance().getCommunicationLogMessages()
                .callAsStream()
                .forEach((GetCommunicationLogMessagesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [GetCommunicationLogMessagesRequest](../../models/operations/GetCommunicationLogMessagesRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[GetCommunicationLogMessagesResponse](../../models/operations/GetCommunicationLogMessagesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## filterCommunicationLogMessages

Gets a paginated list of communication log messages from your account. The filter in the request body is not required. If no filter
is provided then the API will return communication log messages of all types between the specified dates.

Supported types are:

  * email
  * chat
  * session_qa


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="filterCommunicationLogMessages" method="post" path="/logs/communications/messages/filter" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.FilterCommunicationLogMessagesRequest;
import com.cvent.models.operations.FilterCommunicationLogMessagesResponse;
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

        FilterCommunicationLogMessagesRequest req = FilterCommunicationLogMessagesRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter(Filter.builder()
                    .filter("type eq 'email'")
                    .build())
                .build();


        sdk.compliance().filterCommunicationLogMessages()
                .callAsStream()
                .forEach((FilterCommunicationLogMessagesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [FilterCommunicationLogMessagesRequest](../../models/operations/FilterCommunicationLogMessagesRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[FilterCommunicationLogMessagesResponse](../../models/operations/FilterCommunicationLogMessagesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |