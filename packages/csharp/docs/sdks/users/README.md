# Users

## Overview

Operations for managing account users and user groups, including creation, retrieval, update, and deletion. Use these endpoints to administer user access and roles within your account.

### Available Operations

* [GetAccountUserGroups](#getaccountusergroups) - List Account User Groups
* [CreateAccountUserGroup](#createaccountusergroup) - Create Account User Group
* [GetAccountUserGroup](#getaccountusergroup) - Get Account User Group
* [UpdateAccountUserGroup](#updateaccountusergroup) - Update Account User Group
* [DeleteAccountUserGroup](#deleteaccountusergroup) - Delete Account User Group
* [AddUserToAccountUserGroup](#addusertoaccountusergroup) - Associate User to Group
* [DeleteUserFromAccountUserGroup](#deleteuserfromaccountusergroup) - Delete User from Group

## GetAccountUserGroups

Gets a list of user groups in your account.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAccountUserGroups" method="get" path="/account-user-groups" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

GetAccountUserGroupsRequest req = new GetAccountUserGroupsRequest() {
    Token = "1a2b3c4d5e6f7g8h9i10j11k",
    Filter = "name eq 'My User Group'",
};

GetAccountUserGroupsResponse? res = await sdk.Users.GetAccountUserGroupsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetAccountUserGroupsRequest](../../Models/Requests/GetAccountUserGroupsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetAccountUserGroupsResponse](../../Models/Requests/GetAccountUserGroupsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateAccountUserGroup

Creates a new Account User Group.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="createAccountUserGroup" method="post" path="/account-user-groups" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

UserGroupJsonInput req = new UserGroupJsonInput() {
    Name = "MyUserGroup",
    Description = "MyUserGroupDescription",
};

var res = await sdk.Users.CreateAccountUserGroupAsync(req);

// handle response
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [UserGroupJsonInput](../../Models/Components/UserGroupJsonInput.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[CreateAccountUserGroupResponse](../../Models/Requests/CreateAccountUserGroupResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetAccountUserGroup

Gets a single account user group by its ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAccountUserGroup" method="get" path="/account-user-groups/{userGroupId}" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

GetAccountUserGroupRequest req = new GetAccountUserGroupRequest() {
    UserGroupId = "B089AC31-1212-63FB-AAEA-382037E1BCDF",
};

var res = await sdk.Users.GetAccountUserGroupAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAccountUserGroupRequest](../../Models/Requests/GetAccountUserGroupRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAccountUserGroupResponse](../../Models/Requests/GetAccountUserGroupResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateAccountUserGroup

Update a given account user group using details in the body of the request.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateAccountUserGroup" method="put" path="/account-user-groups/{userGroupId}" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

UpdateAccountUserGroupRequest req = new UpdateAccountUserGroupRequest() {
    UserGroupId = "B089AC31-1212-63FB-AAEA-382037E1BCDF",
    UserGroupJson = new UserGroupJsonInput() {
        Name = "MyUserGroup",
        Description = "MyUserGroupDescription",
    },
};

var res = await sdk.Users.UpdateAccountUserGroupAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateAccountUserGroupRequest](../../Models/Requests/UpdateAccountUserGroupRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateAccountUserGroupResponse](../../Models/Requests/UpdateAccountUserGroupResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteAccountUserGroup

Deletes an account user group using its ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteAccountUserGroup" method="delete" path="/account-user-groups/{userGroupId}" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

DeleteAccountUserGroupRequest req = new DeleteAccountUserGroupRequest() {
    UserGroupId = "B089AC31-1212-63FB-AAEA-382037E1BCDF",
};

var res = await sdk.Users.DeleteAccountUserGroupAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [DeleteAccountUserGroupRequest](../../Models/Requests/DeleteAccountUserGroupRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[DeleteAccountUserGroupResponse](../../Models/Requests/DeleteAccountUserGroupResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## AddUserToAccountUserGroup

Associates a user to an account user group.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="addUserToAccountUserGroup" method="post" path="/account-user-groups/{userGroupId}/users/{userId}" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

AddUserToAccountUserGroupRequest req = new AddUserToAccountUserGroupRequest() {
    UserGroupId = "B089AC31-1212-63FB-AAEA-382037E1BCDF",
    UserId = "FF8AF134-3505-4D67-AAEA-1975D8E1327C",
};

var res = await sdk.Users.AddUserToAccountUserGroupAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AddUserToAccountUserGroupRequest](../../Models/Requests/AddUserToAccountUserGroupRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AddUserToAccountUserGroupResponse](../../Models/Requests/AddUserToAccountUserGroupResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteUserFromAccountUserGroup

Removes a user from an account user group.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteUserFromAccountUserGroup" method="delete" path="/account-user-groups/{userGroupId}/users/{userId}" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

DeleteUserFromAccountUserGroupRequest req = new DeleteUserFromAccountUserGroupRequest() {
    UserGroupId = "B089AC31-1212-63FB-AAEA-382037E1BCDF",
    UserId = "FF8AF134-3505-4D67-AAEA-1975D8E1327C",
};

var res = await sdk.Users.DeleteUserFromAccountUserGroupAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [DeleteUserFromAccountUserGroupRequest](../../Models/Requests/DeleteUserFromAccountUserGroupRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[DeleteUserFromAccountUserGroupResponse](../../Models/Requests/DeleteUserFromAccountUserGroupResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |