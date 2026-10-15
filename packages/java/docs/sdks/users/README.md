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
* [listAccountUsers](#listaccountusers) - List Account Users
* [getAccountUser](#getaccountuser) - Get Account User

## getAccountUserGroups

Gets a list of user groups in your account.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountUserGroups" method="get" path="/account-user-groups" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetAccountUserGroupsRequest;
import com.cvent.models.operations.GetAccountUserGroupsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, Exception {

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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## createAccountUserGroup

Creates a new Account User Group.


### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountUserGroup" method="post" path="/account-user-groups" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.CreateAccountUserGroupResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, Exception {

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

        AccountUserGroupInput req = AccountUserGroupInput.builder()
                .name("MyUserGroup")
                .description("MyUserGroupDescription")
                .build();

        CreateAccountUserGroupResponse res = sdk.users().createAccountUserGroup()
                .request(req)
                .call();

        if (res.accountUserGroup().isPresent()) {
            System.out.println(res.accountUserGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [AccountUserGroupInput](../../models/shared/AccountUserGroupInput.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CreateAccountUserGroupResponse](../../models/operations/CreateAccountUserGroupResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getAccountUserGroup

Gets a single account user group by its ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountUserGroup" method="get" path="/account-user-groups/{userGroupId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetAccountUserGroupRequest;
import com.cvent.models.operations.GetAccountUserGroupResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, Exception {

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

        if (res.accountUserGroup().isPresent()) {
            System.out.println(res.accountUserGroup().get());
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updateAccountUserGroup

Update a given account user group using details in the body of the request.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountUserGroup" method="put" path="/account-user-groups/{userGroupId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.UpdateAccountUserGroupRequest;
import com.cvent.models.operations.UpdateAccountUserGroupResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, Exception {

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
                .accountUserGroup(AccountUserGroupInput.builder()
                    .name("MyUserGroup")
                    .description("MyUserGroupDescription")
                    .build())
                .build();

        UpdateAccountUserGroupResponse res = sdk.users().updateAccountUserGroup()
                .request(req)
                .call();

        if (res.accountUserGroup().isPresent()) {
            System.out.println(res.accountUserGroup().get());
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## deleteAccountUserGroup

Deletes an account user group using its ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteAccountUserGroup" method="delete" path="/account-user-groups/{userGroupId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.DeleteAccountUserGroupRequest;
import com.cvent.models.operations.DeleteAccountUserGroupResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, Exception {

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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## addUserToAccountUserGroup

Associates a user to an account user group.

### Example Usage

<!-- UsageSnippet language="java" operationID="addUserToAccountUserGroup" method="post" path="/account-user-groups/{userGroupId}/users/{userId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.AddUserToAccountUserGroupRequest;
import com.cvent.models.operations.AddUserToAccountUserGroupResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, Exception {

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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## deleteUserFromAccountUserGroup

Removes a user from an account user group.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteUserFromAccountUserGroup" method="delete" path="/account-user-groups/{userGroupId}/users/{userId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.DeleteUserFromAccountUserGroupRequest;
import com.cvent.models.operations.DeleteUserFromAccountUserGroupResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, Exception {

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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## listAccountUsers

Gets a list of all users associated with your account.

### Example Usage: active

<!-- UsageSnippet language="java" operationID="listAccountUsers" method="get" path="/users" example="active" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.ListAccountUsersRequest;
import com.cvent.models.operations.ListAccountUsersResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, Exception {

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

        ListAccountUsersRequest req = ListAccountUsersRequest.builder()
                .filter("active eq 'true'")
                .token("1a2b3c4d5e6f7g8h9i10j11k")
                .sort("username DESC")
                .build();


        sdk.users().listAccountUsers()
                .callAsStream()
                .forEach((ListAccountUsersResponse item) -> {
                   // handle page
                });

    }
}
```
### Example Usage: combined

<!-- UsageSnippet language="java" operationID="listAccountUsers" method="get" path="/users" example="combined" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.ListAccountUsersRequest;
import com.cvent.models.operations.ListAccountUsersResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, Exception {

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

        ListAccountUsersRequest req = ListAccountUsersRequest.builder()
                .filter("active eq 'true' and (role.id eq '007cfa3b-8c25-4b3b-b5d3-f6280aa7e6ee' or lockedOut eq 'true')")
                .token("1a2b3c4d5e6f7g8h9i10j11k")
                .sort("username DESC")
                .build();


        sdk.users().listAccountUsers()
                .callAsStream()
                .forEach((ListAccountUsersResponse item) -> {
                   // handle page
                });

    }
}
```
### Example Usage: created

<!-- UsageSnippet language="java" operationID="listAccountUsers" method="get" path="/users" example="created" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.ListAccountUsersRequest;
import com.cvent.models.operations.ListAccountUsersResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, Exception {

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

        ListAccountUsersRequest req = ListAccountUsersRequest.builder()
                .filter("audit.created ge '2026-01-01T00:00:00.000Z'")
                .token("1a2b3c4d5e6f7g8h9i10j11k")
                .sort("username DESC")
                .build();


        sdk.users().listAccountUsers()
                .callAsStream()
                .forEach((ListAccountUsersResponse item) -> {
                   // handle page
                });

    }
}
```
### Example Usage: role

<!-- UsageSnippet language="java" operationID="listAccountUsers" method="get" path="/users" example="role" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.ListAccountUsersRequest;
import com.cvent.models.operations.ListAccountUsersResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, Exception {

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

        ListAccountUsersRequest req = ListAccountUsersRequest.builder()
                .filter("role.id in ('e7e8c33e-aa42-40cd-b600-7d02d9c53f89', 'b41709f9-5f31-4ee5-800a-b77989d01b5d')")
                .token("1a2b3c4d5e6f7g8h9i10j11k")
                .sort("username DESC")
                .build();


        sdk.users().listAccountUsers()
                .callAsStream()
                .forEach((ListAccountUsersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListAccountUsersRequest](../../models/operations/ListAccountUsersRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListAccountUsersResponse](../../models/operations/ListAccountUsersResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getAccountUser

Gets a single account user.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountUser" method="get" path="/users/{userId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetAccountUserRequest;
import com.cvent.models.operations.GetAccountUserResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, Exception {

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

        GetAccountUserRequest req = GetAccountUserRequest.builder()
                .userId("ff8af134-3505-4d67-aaea-1975d8e1327c")
                .build();

        GetAccountUserResponse res = sdk.users().getAccountUser()
                .request(req)
                .call();

        if (res.accountUser().isPresent()) {
            System.out.println(res.accountUser().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetAccountUserRequest](../../models/operations/GetAccountUserRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetAccountUserResponse](../../models/operations/GetAccountUserResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |