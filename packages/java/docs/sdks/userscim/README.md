# UserSCIM

## Overview

The [SCIM](https://www.simplecloud.info/) standard allows for easier cross-domain identity management. This API allows you to manage your account users and SCIM groups (representing Cvent user roles).

### Available Operations

* [getUserGroups](#getusergroups) - Get SCIM Groups
* [getResourceTypes](#getresourcetypes) - List Resource Types
* [getResourceType](#getresourcetype) - Get Resource Type
* [getSchemas](#getschemas) - List Schemas
* [getSchema](#getschema) - Get Schema
* [getServiceProviderConfig](#getserviceproviderconfig) - Get Service Provider Config
* [createUser](#createuser) - Create User
* [listUsers](#listusers) - List Users
* [getUser](#getuser) - Get User
* [updateUser](#updateuser) - Update User
* [deleteUser](#deleteuser) - Delete User

## getUserGroups

Gets a paginated list of SCIM groups (representing Cvent user roles) in an account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getUserGroups" method="get" path="/scim/v2/Groups" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponseJson20;
import com.cvent.models.operations.GetUserGroupsRequest;
import com.cvent.models.operations.GetUserGroupsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponseJson20, Exception {

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

        GetUserGroupsRequest req = GetUserGroupsRequest.builder()
                .build();

        GetUserGroupsResponse res = sdk.userSCIM().getUserGroups()
                .request(req)
                .call();

        if (res.userGroups().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetUserGroupsRequest](../../models/operations/GetUserGroupsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetUserGroupsResponse](../../models/operations/GetUserGroupsResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorResponseJson20 | 400, 401, 403, 429                | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## getResourceTypes

Gets a list of resource types.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getResourceTypes" method="get" path="/scim/v2/ResourceTypes" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponseJson20;
import com.cvent.models.operations.GetResourceTypesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponseJson20, Exception {

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

        GetResourceTypesResponse res = sdk.userSCIM().getResourceTypes()
                .call();

        if (res.resourceTypes().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetResourceTypesResponse](../../models/operations/GetResourceTypesResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorResponseJson20 | 401, 403, 429                     | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## getResourceType

Gets the details of a single resource type.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getResourceType" method="get" path="/scim/v2/ResourceTypes/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponseJson20;
import com.cvent.models.operations.GetResourceTypeRequest;
import com.cvent.models.operations.GetResourceTypeResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponseJson20, Exception {

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

        GetResourceTypeRequest req = GetResourceTypeRequest.builder()
                .id("User")
                .build();

        GetResourceTypeResponse res = sdk.userSCIM().getResourceType()
                .request(req)
                .call();

        if (res.resourceType().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetResourceTypeRequest](../../models/operations/GetResourceTypeRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetResourceTypeResponse](../../models/operations/GetResourceTypeResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorResponseJson20 | 400, 401, 403, 404, 429           | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## getSchemas

Gets the paginated list of user schemas and its extension models representing the user and SCIM groups (representing Cvent user roles).

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getSchemas" method="get" path="/scim/v2/Schemas" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponseJson20;
import com.cvent.models.operations.GetSchemasResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponseJson20, Exception {

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

        GetSchemasResponse res = sdk.userSCIM().getSchemas()
                .call();

        if (res.usersSchemas().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetSchemasResponse](../../models/operations/GetSchemasResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorResponseJson20 | 401, 403, 429                     | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## getSchema

Gets the details of a user schema and its extension models representing the user and SCIM groups (representing Cvent user roles).

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getSchema" method="get" path="/scim/v2/Schemas/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponseJson20;
import com.cvent.models.operations.GetSchemaRequest;
import com.cvent.models.operations.GetSchemaResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponseJson20, Exception {

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

        GetSchemaRequest req = GetSchemaRequest.builder()
                .id("urn:ietf:params:scim:schemas:core:2.0:User")
                .build();

        GetSchemaResponse res = sdk.userSCIM().getSchema()
                .request(req)
                .call();

        if (res.usersSchema().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetSchemaRequest](../../models/operations/GetSchemaRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetSchemaResponse](../../models/operations/GetSchemaResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorResponseJson20 | 400, 401, 403, 404, 429           | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## getServiceProviderConfig

Gets Cvent's configurations of SCIM.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getServiceProviderConfig" method="get" path="/scim/v2/ServiceProviderConfig" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponseJson20;
import com.cvent.models.operations.GetServiceProviderConfigResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponseJson20, Exception {

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

        GetServiceProviderConfigResponse res = sdk.userSCIM().getServiceProviderConfig()
                .call();

        if (res.serviceProviderConfig().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetServiceProviderConfigResponse](../../models/operations/GetServiceProviderConfigResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorResponseJson20 | 401, 403, 429                     | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## createUser

Creates a new user. For account users, the email address will initially be unverified. To verify it, please click on the link provided in the email sent to your email address.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createUser" method="post" path="/scim/v2/Users" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponseJson20;
import com.cvent.models.operations.CreateUserResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponseJson20, Exception {

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

        UserInput req = UserInput.builder()
                .name(NameJson.builder()
                    .givenName("Mike")
                    .familyName("Stuart")
                    .middleName("A")
                    .honorificPrefix("Mr.")
                    .build())
                .userName("aMike@test.com")
                .emails(List.of())
                .userType(UserTypeJson.PLANNER_ACCOUNT_USER)
                .locale("en-US")
                .groups(List.of())
                .urnIetfParamsScimSchemasExtensionEnterprise20User(UserEnterpriseExtensionJson.builder()
                    .federatedId("AKJU783UP")
                    .company("Cvent")
                    .workFax("+1123456")
                    .homeFax("+1123456")
                    .pager("+1123456")
                    .build())
                .title("Vice President")
                .phoneNumbers(List.of(
                    PhoneNumberJson1.builder()
                        .type(PhoneTypeJson.WORK)
                        .value("+911234567890")
                        .build()))
                .addresses(List.of(
                    AddressJson6.builder()
                        .type(AddressTypeJson1.WORK)
                        .streetAddress("100 Universal City Plaza")
                        .locality("Hollywood")
                        .region("CA")
                        .postalCode("91608")
                        .country("USA")
                        .primary(true)
                        .build()))
                .build();

        CreateUserResponse res = sdk.userSCIM().createUser()
                .request(req)
                .call();

        if (res.user().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                     | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `request`                                     | [UserInput](../../models/shared/UserInput.md) | :heavy_check_mark:                            | The request object to use for the request.    |

### Response

**[CreateUserResponse](../../models/operations/CreateUserResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorResponseJson20 | 400, 401, 403, 409, 429           | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## listUsers

Gets a list of users.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listUsers" method="get" path="/scim/v2/Users" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponseJson20;
import com.cvent.models.operations.ListUsersRequest;
import com.cvent.models.operations.ListUsersResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponseJson20, Exception {

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

        ListUsersRequest req = ListUsersRequest.builder()
                .filter("userName eq 'john@example.com' or userName eq 'Matt@example.com'")
                .build();

        ListUsersResponse res = sdk.userSCIM().listUsers()
                .request(req)
                .call();

        if (res.users().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [ListUsersRequest](../../models/operations/ListUsersRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[ListUsersResponse](../../models/operations/ListUsersResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorResponseJson20 | 400, 401, 403, 429                | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## getUser

Gets the details of a single user.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getUser" method="get" path="/scim/v2/Users/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponseJson20;
import com.cvent.models.operations.GetUserRequest;
import com.cvent.models.operations.GetUserResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponseJson20, Exception {

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

        GetUserRequest req = GetUserRequest.builder()
                .id("id1")
                .build();

        GetUserResponse res = sdk.userSCIM().getUser()
                .request(req)
                .call();

        if (res.user().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetUserRequest](../../models/operations/GetUserRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetUserResponse](../../models/operations/GetUserResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorResponseJson20 | 400, 401, 403, 404, 429           | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## updateUser

Updates a user. In case of an account user, if the email address field is updated then please verify the new email address using the link received in the verification email.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateUser" method="put" path="/scim/v2/Users/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponseJson20;
import com.cvent.models.operations.UpdateUserRequest;
import com.cvent.models.operations.UpdateUserResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponseJson20, Exception {

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

        UpdateUserRequest req = UpdateUserRequest.builder()
                .id("id1")
                .user(UserInput.builder()
                    .name(NameJson.builder()
                        .givenName("Mike")
                        .familyName("Stuart")
                        .middleName("A")
                        .honorificPrefix("Mr.")
                        .build())
                    .userName("aMike@test.com")
                    .emails(List.of())
                    .userType(UserTypeJson.PLANNER_ACCOUNT_USER)
                    .locale("en-US")
                    .groups(List.of(
                        GroupJson.builder()
                            .value("3b2359a7-4583-40ed-8afd-67e5f15373d3")
                            .display("Admin")
                            .build()))
                    .urnIetfParamsScimSchemasExtensionEnterprise20User(UserEnterpriseExtensionJson.builder()
                        .federatedId("AKJU783UP")
                        .company("Cvent")
                        .workFax("+1123456")
                        .homeFax("+1123456")
                        .pager("+1123456")
                        .build())
                    .title("Vice President")
                    .phoneNumbers(List.of(
                        PhoneNumberJson1.builder()
                            .type(PhoneTypeJson.WORK)
                            .value("+911234567890")
                            .build()))
                    .addresses(List.of(
                        AddressJson6.builder()
                            .type(AddressTypeJson1.WORK)
                            .streetAddress("100 Universal City Plaza")
                            .locality("Hollywood")
                            .region("CA")
                            .postalCode("91608")
                            .country("USA")
                            .primary(true)
                            .build()))
                    .build())
                .build();

        UpdateUserResponse res = sdk.userSCIM().updateUser()
                .request(req)
                .call();

        if (res.user().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [UpdateUserRequest](../../models/operations/UpdateUserRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[UpdateUserResponse](../../models/operations/UpdateUserResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorResponseJson20 | 400, 401, 403, 404, 429           | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## deleteUser

Deletes a user.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteUser" method="delete" path="/scim/v2/Users/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponseJson20;
import com.cvent.models.operations.DeleteUserRequest;
import com.cvent.models.operations.DeleteUserResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponseJson20, Exception {

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

        DeleteUserRequest req = DeleteUserRequest.builder()
                .id("id1")
                .build();

        DeleteUserResponse res = sdk.userSCIM().deleteUser()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [DeleteUserRequest](../../models/operations/DeleteUserRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[DeleteUserResponse](../../models/operations/DeleteUserResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorResponseJson20 | 401, 403, 404, 429                | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |