# UserSCIM

## Overview

The [SCIM](https://www.simplecloud.info/) standard allows for easier cross-domain identity management. This API allows you to manage your account users and SCIM groups (representing Cvent user roles).

### Available Operations

* [GetUserGroups](#getusergroups) - Get SCIM Groups
* [GetResourceTypes](#getresourcetypes) - List Resource Types
* [GetResourceType](#getresourcetype) - Get Resource Type
* [GetSchemas](#getschemas) - List Schemas
* [GetSchema](#getschema) - Get Schema
* [GetServiceProviderConfig](#getserviceproviderconfig) - Get Service Provider Config
* [CreateUser](#createuser) - Create User
* [ListUsers](#listusers) - List Users
* [GetUser](#getuser) - Get User
* [UpdateUser](#updateuser) - Update User
* [DeleteUser](#deleteuser) - Delete User

## GetUserGroups

Gets a paginated list of SCIM groups (representing Cvent user roles) in an account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getUserGroups" method="get" path="/scim/v2/Groups" -->
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

GetUserGroupsRequest req = new GetUserGroupsRequest() {};

var res = await sdk.UserSCIM.GetUserGroupsAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetUserGroupsRequest](../../Models/Requests/GetUserGroupsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetUserGroupsResponse](../../Models/Requests/GetUserGroupsResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponseJson20 | 400, 401, 403, 429                          | application/json                            |
| Cvent.SDK.Models.Errors.APIException        | 4XX, 5XX                                    | \*/\*                                       |

## GetResourceTypes

Gets a list of resource types.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getResourceTypes" method="get" path="/scim/v2/ResourceTypes" -->
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

var res = await sdk.UserSCIM.GetResourceTypesAsync();

// handle response
```

### Response

**[GetResourceTypesResponse](../../Models/Requests/GetResourceTypesResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponseJson20 | 401, 403, 429                               | application/json                            |
| Cvent.SDK.Models.Errors.APIException        | 4XX, 5XX                                    | \*/\*                                       |

## GetResourceType

Gets the details of a single resource type.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getResourceType" method="get" path="/scim/v2/ResourceTypes/{id}" -->
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

GetResourceTypeRequest req = new GetResourceTypeRequest() {
    Id = "User",
};

var res = await sdk.UserSCIM.GetResourceTypeAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetResourceTypeRequest](../../Models/Requests/GetResourceTypeRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetResourceTypeResponse](../../Models/Requests/GetResourceTypeResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponseJson20 | 400, 401, 403, 404, 429                     | application/json                            |
| Cvent.SDK.Models.Errors.APIException        | 4XX, 5XX                                    | \*/\*                                       |

## GetSchemas

Gets the paginated list of user schemas and its extension models representing the user and SCIM groups (representing Cvent user roles).

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getSchemas" method="get" path="/scim/v2/Schemas" -->
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

var res = await sdk.UserSCIM.GetSchemasAsync();

// handle response
```

### Response

**[GetSchemasResponse](../../Models/Requests/GetSchemasResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponseJson20 | 401, 403, 429                               | application/json                            |
| Cvent.SDK.Models.Errors.APIException        | 4XX, 5XX                                    | \*/\*                                       |

## GetSchema

Gets the details of a user schema and its extension models representing the user and SCIM groups (representing Cvent user roles).

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getSchema" method="get" path="/scim/v2/Schemas/{id}" -->
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

GetSchemaRequest req = new GetSchemaRequest() {
    Id = "urn:ietf:params:scim:schemas:core:2.0:User",
};

var res = await sdk.UserSCIM.GetSchemaAsync(req);

// handle response
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetSchemaRequest](../../Models/Requests/GetSchemaRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetSchemaResponse](../../Models/Requests/GetSchemaResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponseJson20 | 400, 401, 403, 404, 429                     | application/json                            |
| Cvent.SDK.Models.Errors.APIException        | 4XX, 5XX                                    | \*/\*                                       |

## GetServiceProviderConfig

Gets Cvent's configurations of SCIM.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getServiceProviderConfig" method="get" path="/scim/v2/ServiceProviderConfig" -->
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

var res = await sdk.UserSCIM.GetServiceProviderConfigAsync();

// handle response
```

### Response

**[GetServiceProviderConfigResponse](../../Models/Requests/GetServiceProviderConfigResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponseJson20 | 401, 403, 429                               | application/json                            |
| Cvent.SDK.Models.Errors.APIException        | 4XX, 5XX                                    | \*/\*                                       |

## CreateUser

Creates a new user. For account users, the email address will initially be unverified. To verify it, please click on the link provided in the email sent to your email address.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createUser" method="post" path="/scim/v2/Users" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

UserInput req = new UserInput() {
    Name = new NameJson() {
        GivenName = "Mike",
        FamilyName = "Stuart",
        MiddleName = "A",
        HonorificPrefix = "Mr.",
    },
    UserName = "aMike@test.com",
    Emails = new List<EmailJson1>() {},
    Title = "Vice President",
    PhoneNumbers = new List<PhoneNumberJson1>() {
        new PhoneNumberJson1() {
            Type = PhoneTypeJson.Work,
            Value = "+911234567890",
        },
    },
    Addresses = new List<AddressJson6>() {
        new AddressJson6() {
            Type = AddressTypeJson1.Work,
            StreetAddress = "100 Universal City Plaza",
            Locality = "Hollywood",
            Region = "CA",
            PostalCode = "91608",
            Country = "USA",
            Primary = true,
        },
    },
    UserType = UserTypeJson.PlannerAccountUser,
    Locale = "en-US",
    Groups = new List<GroupJson>() {},
    UrnIetfParamsScimSchemasExtensionEnterprise20User = new UserEnterpriseExtensionJson() {
        FederatedId = "AKJU783UP",
        Company = "Cvent",
        WorkFax = "+1123456",
        HomeFax = "+1123456",
        Pager = "+1123456",
    },
};

var res = await sdk.UserSCIM.CreateUserAsync(req);

// handle response
```

### Parameters

| Parameter                                         | Type                                              | Required                                          | Description                                       |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `request`                                         | [UserInput](../../Models/Components/UserInput.md) | :heavy_check_mark:                                | The request object to use for the request.        |

### Response

**[CreateUserResponse](../../Models/Requests/CreateUserResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponseJson20 | 400, 401, 403, 409, 429                     | application/json                            |
| Cvent.SDK.Models.Errors.APIException        | 4XX, 5XX                                    | \*/\*                                       |

## ListUsers

Gets a list of users.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listUsers" method="get" path="/scim/v2/Users" -->
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

ListUsersRequest req = new ListUsersRequest() {
    Filter = "userName eq 'john@example.com' or userName eq 'Matt@example.com'",
};

var res = await sdk.UserSCIM.ListUsersAsync(req);

// handle response
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [ListUsersRequest](../../Models/Requests/ListUsersRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[ListUsersResponse](../../Models/Requests/ListUsersResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponseJson20 | 400, 401, 403, 429                          | application/json                            |
| Cvent.SDK.Models.Errors.APIException        | 4XX, 5XX                                    | \*/\*                                       |

## GetUser

Gets the details of a single user.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getUser" method="get" path="/scim/v2/Users/{id}" -->
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

GetUserRequest req = new GetUserRequest() {
    Id = "id1",
};

var res = await sdk.UserSCIM.GetUserAsync(req);

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [GetUserRequest](../../Models/Requests/GetUserRequest.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[GetUserResponse](../../Models/Requests/GetUserResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponseJson20 | 400, 401, 403, 404, 429                     | application/json                            |
| Cvent.SDK.Models.Errors.APIException        | 4XX, 5XX                                    | \*/\*                                       |

## UpdateUser

Updates a user. In case of an account user, if the email address field is updated then please verify the new email address using the link received in the verification email.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateUser" method="put" path="/scim/v2/Users/{id}" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

UpdateUserRequest req = new UpdateUserRequest() {
    Id = "id1",
    User = new UserInput() {
        Name = new NameJson() {
            GivenName = "Mike",
            FamilyName = "Stuart",
            MiddleName = "A",
            HonorificPrefix = "Mr.",
        },
        UserName = "aMike@test.com",
        Emails = new List<EmailJson1>() {},
        Title = "Vice President",
        PhoneNumbers = new List<PhoneNumberJson1>() {
            new PhoneNumberJson1() {
                Type = PhoneTypeJson.Work,
                Value = "+911234567890",
            },
        },
        Addresses = new List<AddressJson6>() {
            new AddressJson6() {
                Type = AddressTypeJson1.Work,
                StreetAddress = "100 Universal City Plaza",
                Locality = "Hollywood",
                Region = "CA",
                PostalCode = "91608",
                Country = "USA",
                Primary = true,
            },
        },
        UserType = UserTypeJson.PlannerAccountUser,
        Locale = "en-US",
        Groups = new List<GroupJson>() {
            new GroupJson() {
                Value = "3b2359a7-4583-40ed-8afd-67e5f15373d3",
                Display = "Admin",
            },
        },
        UrnIetfParamsScimSchemasExtensionEnterprise20User = new UserEnterpriseExtensionJson() {
            FederatedId = "AKJU783UP",
            Company = "Cvent",
            WorkFax = "+1123456",
            HomeFax = "+1123456",
            Pager = "+1123456",
        },
    },
};

var res = await sdk.UserSCIM.UpdateUserAsync(req);

// handle response
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [UpdateUserRequest](../../Models/Requests/UpdateUserRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[UpdateUserResponse](../../Models/Requests/UpdateUserResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponseJson20 | 400, 401, 403, 404, 429                     | application/json                            |
| Cvent.SDK.Models.Errors.APIException        | 4XX, 5XX                                    | \*/\*                                       |

## DeleteUser

Deletes a user.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteUser" method="delete" path="/scim/v2/Users/{id}" -->
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

DeleteUserRequest req = new DeleteUserRequest() {
    Id = "id1",
};

var res = await sdk.UserSCIM.DeleteUserAsync(req);

// handle response
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [DeleteUserRequest](../../Models/Requests/DeleteUserRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[DeleteUserResponse](../../Models/Requests/DeleteUserResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponseJson20 | 401, 403, 404, 429                          | application/json                            |
| Cvent.SDK.Models.Errors.APIException        | 4XX, 5XX                                    | \*/\*                                       |