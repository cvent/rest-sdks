# Hooks

## Overview

These APIs allow you to create hooks. When triggered, a hook sends a request to your service to
get updated data related to the related Cvent object.

For more information on using hooks, see the
[getting started guide](https://developers.cvent.com/docs/cid/attendee-identification-service).


### Available Operations

* [listContactHooks](#listcontacthooks) - List Contact Hooks
* [createContactHook](#createcontacthook) - Create Contact Hook
* [updateContactHook](#updatecontacthook) - Update Contact Hook
* [deleteContactHook](#deletecontacthook) - Delete Contact Hook

## listContactHooks

Gets a list of contact hooks configured in your account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="ListContactHooks" method="get" path="/contacts/hooks" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListContactHooksRequest;
import com.cvent.models.operations.ListContactHooksResponse;
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

        ListContactHooksRequest req = ListContactHooksRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' and name ne 'sampleIntegration'")
                .build();


        sdk.hooks().listContactHooks()
                .callAsStream()
                .forEach((ListContactHooksResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListContactHooksRequest](../../models/operations/ListContactHooksRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListContactHooksResponse](../../models/operations/ListContactHooksResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createContactHook

Creates a contact hook. Contact hooks have a callback URI pointing to your system where Cvent will request contact information.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createContactHook" method="post" path="/contacts/hooks" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateContactHookResponse;
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

        HookInput req = HookInput.builder()
                .name("Attendee Identification")
                .callback("https://myserver.com/send/callback/here")
                .security(HookSecurityJson.of(BasicAuthentication.builder()
                    .type(AuthorizationHeaderType2.API_KEY)
                    .secret("ZGVtbzpwQDU1dzByZA==")
                    .build()))
                .build();

        CreateContactHookResponse res = sdk.hooks().createContactHook()
                .request(req)
                .call();

        if (res.hook().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                     | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `request`                                     | [HookInput](../../models/shared/HookInput.md) | :heavy_check_mark:                            | The request object to use for the request.    |

### Response

**[CreateContactHookResponse](../../models/operations/CreateContactHookResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateContactHook

Update a contact hook's details, including its associated callback URI.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateContactHook" method="put" path="/contacts/hooks/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateContactHookRequest;
import com.cvent.models.operations.UpdateContactHookResponse;
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

        UpdateContactHookRequest req = UpdateContactHookRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .hook(HookInput.builder()
                    .name("Attendee Identification")
                    .callback("https://myserver.com/send/callback/here")
                    .security(HookSecurityJson.of(APIKeyAuthentication.builder()
                        .type(AuthorizationHeaderType1.API_KEY)
                        .secret("2b3cc2bf083ff11206ce6b2f3ee09591")
                        .authHeaderKey("x-api-key")
                        .build()))
                    .build())
                .build();

        UpdateContactHookResponse res = sdk.hooks().updateContactHook()
                .request(req)
                .call();

        if (res.hook().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateContactHookRequest](../../models/operations/UpdateContactHookRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateContactHookResponse](../../models/operations/UpdateContactHookResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteContactHook

Delete a contact hook's details.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteContactHook" method="delete" path="/contacts/hooks/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteContactHookRequest;
import com.cvent.models.operations.DeleteContactHookResponse;
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

        DeleteContactHookRequest req = DeleteContactHookRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteContactHookResponse res = sdk.hooks().deleteContactHook()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [DeleteContactHookRequest](../../models/operations/DeleteContactHookRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[DeleteContactHookResponse](../../models/operations/DeleteContactHookResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |