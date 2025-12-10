# Users

## Overview

Operations for managing account users and user groups, including creation, retrieval, update, and deletion. Use these endpoints to administer user access and roles within your account.

### Available Operations

* [getAccountUserGroups](#getaccountusergroups) - List Account User Groups
* [createAccountUserGroup](#createaccountusergroup) - Create Account User Group
* [getAccountUserGroup](#getaccountusergroup) - Get Account User Group
* [updateAccountUserGroup](#updateaccountusergroup) - Update Account User Group
* [deleteAccountUserGroup](#deleteaccountusergroup) - Delete Account User Group
* [addUserToAccountUserGroup](#addusertoaccountusergroup) - Associate User to Group
* [deleteUserFromAccountUserGroup](#deleteuserfromaccountusergroup) - Delete User from Group

## getAccountUserGroups

Gets a list of user groups in your account.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountUserGroups" method="get" path="/account-user-groups" -->
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


        sdk.users().getAccountUserGroups()
                .callAsStream()
                .forEach((GetAccountUserGroupsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAccountUserGroupsRequest](../../models/operations/GetAccountUserGroupsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAccountUserGroupsResponse](../../models/operations/GetAccountUserGroupsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createAccountUserGroup

Creates a new Account User Group.


### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountUserGroup" method="post" path="/account-user-groups" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateAccountUserGroupResponse;
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

        UserGroupJsonInput req = UserGroupJsonInput.builder()
                .name("MyUserGroup")
                .description("MyUserGroupDescription")
                .build();

        CreateAccountUserGroupResponse res = sdk.users().createAccountUserGroup()
                .request(req)
                .call();

        if (res.userGroupJson().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [UserGroupJsonInput](../../models/shared/UserGroupJsonInput.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[CreateAccountUserGroupResponse](../../models/operations/CreateAccountUserGroupResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getAccountUserGroup

Gets a single account user group by its ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountUserGroup" method="get" path="/account-user-groups/{userGroupId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAccountUserGroupRequest;
import com.cvent.models.operations.GetAccountUserGroupResponse;
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

        GetAccountUserGroupRequest req = GetAccountUserGroupRequest.builder()
                .userGroupId("B089AC31-1212-63FB-AAEA-382037E1BCDF")
                .build();

        GetAccountUserGroupResponse res = sdk.users().getAccountUserGroup()
                .request(req)
                .call();

        if (res.userGroupJson().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetAccountUserGroupRequest](../../models/operations/GetAccountUserGroupRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetAccountUserGroupResponse](../../models/operations/GetAccountUserGroupResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateAccountUserGroup

Update a given account user group using details in the body of the request.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountUserGroup" method="put" path="/account-user-groups/{userGroupId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateAccountUserGroupRequest;
import com.cvent.models.operations.UpdateAccountUserGroupResponse;
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

        UpdateAccountUserGroupRequest req = UpdateAccountUserGroupRequest.builder()
                .userGroupId("B089AC31-1212-63FB-AAEA-382037E1BCDF")
                .userGroupJson(UserGroupJsonInput.builder()
                    .name("MyUserGroup")
                    .description("MyUserGroupDescription")
                    .build())
                .build();

        UpdateAccountUserGroupResponse res = sdk.users().updateAccountUserGroup()
                .request(req)
                .call();

        if (res.userGroupJson().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateAccountUserGroupRequest](../../models/operations/UpdateAccountUserGroupRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateAccountUserGroupResponse](../../models/operations/UpdateAccountUserGroupResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteAccountUserGroup

Deletes an account user group using its ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteAccountUserGroup" method="delete" path="/account-user-groups/{userGroupId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteAccountUserGroupRequest;
import com.cvent.models.operations.DeleteAccountUserGroupResponse;
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

        DeleteAccountUserGroupRequest req = DeleteAccountUserGroupRequest.builder()
                .userGroupId("B089AC31-1212-63FB-AAEA-382037E1BCDF")
                .build();

        DeleteAccountUserGroupResponse res = sdk.users().deleteAccountUserGroup()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [DeleteAccountUserGroupRequest](../../models/operations/DeleteAccountUserGroupRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[DeleteAccountUserGroupResponse](../../models/operations/DeleteAccountUserGroupResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## addUserToAccountUserGroup

Associates a user to an account user group.

### Example Usage

<!-- UsageSnippet language="java" operationID="addUserToAccountUserGroup" method="post" path="/account-user-groups/{userGroupId}/users/{userId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.AddUserToAccountUserGroupRequest;
import com.cvent.models.operations.AddUserToAccountUserGroupResponse;
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

        AddUserToAccountUserGroupRequest req = AddUserToAccountUserGroupRequest.builder()
                .userGroupId("B089AC31-1212-63FB-AAEA-382037E1BCDF")
                .userId("FF8AF134-3505-4D67-AAEA-1975D8E1327C")
                .build();

        AddUserToAccountUserGroupResponse res = sdk.users().addUserToAccountUserGroup()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AddUserToAccountUserGroupRequest](../../models/operations/AddUserToAccountUserGroupRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AddUserToAccountUserGroupResponse](../../models/operations/AddUserToAccountUserGroupResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteUserFromAccountUserGroup

Removes a user from an account user group.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteUserFromAccountUserGroup" method="delete" path="/account-user-groups/{userGroupId}/users/{userId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteUserFromAccountUserGroupRequest;
import com.cvent.models.operations.DeleteUserFromAccountUserGroupResponse;
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

        DeleteUserFromAccountUserGroupRequest req = DeleteUserFromAccountUserGroupRequest.builder()
                .userGroupId("B089AC31-1212-63FB-AAEA-382037E1BCDF")
                .userId("FF8AF134-3505-4D67-AAEA-1975D8E1327C")
                .build();

        DeleteUserFromAccountUserGroupResponse res = sdk.users().deleteUserFromAccountUserGroup()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [DeleteUserFromAccountUserGroupRequest](../../models/operations/DeleteUserFromAccountUserGroupRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[DeleteUserFromAccountUserGroupResponse](../../models/operations/DeleteUserFromAccountUserGroupResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |