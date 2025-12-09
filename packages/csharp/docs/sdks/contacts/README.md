# Contacts

## Overview

A contact is a record in your account’s address book that represents an individual. The data stored within these records includes personal information, group memberships, and historical data on event attendance.  Contact APIs will allow you to get contact information, track updates to contact information, and create contacts.

### Available Operations

* [CreateContactGroup](#createcontactgroup) - Create Contact Group
* [ListContactGroups](#listcontactgroups) - List Contact Groups
* [GetContactGroupById](#getcontactgroupbyid) - Get Contact Group
* [UpdateContactGroup](#updatecontactgroup) - Update Contact Group
* [DeleteContactGroup](#deletecontactgroup) - Delete Contact Group
* [GetContactIdsByContactGroup](#getcontactidsbycontactgroup) - Get Ids in Contact Group
* [AddContactToContactGroup](#addcontacttocontactgroup) - Add Contact To Group
* [RemoveContactFromContactGroup](#removecontactfromcontactgroup) - Remove Contact From Group
* [ListContactTypes](#listcontacttypes) - List Contact Types
* [ListContacts](#listcontacts) - List Contacts
* [UpdateContacts](#updatecontacts) - Update Contacts
* [PatchContacts](#patchcontacts) - Patch Contacts
* [CreateContacts](#createcontacts) - Create Contacts
* [ListContactsPostFilters](#listcontactspostfilters) - List Contacts
* [GetContactObfuscationStatusById](#getcontactobfuscationstatusbyid) - Get Obfuscation Status
* [GetChangeHistoryForASpecificContact](#getchangehistoryforaspecificcontact) - Get Contact Change History
* [GetContactById](#getcontactbyid) - Get Contact
* [UpdateContactById](#updatecontactbyid) - Update Contact
* [PatchContactById](#patchcontactbyid) - Patch Contact
* [DeleteContactById](#deletecontactbyid) - Delete Contact
* [UpdateContactCustomFieldAnswers](#updatecontactcustomfieldanswers) - Update Custom Field Answers
* [MergeContacts](#mergecontacts) - Merge Contacts
* [ObfuscateContactById](#obfuscatecontactbyid) - Obfuscate a Contact
* [DeleteContactProfileImage](#deletecontactprofileimage) - Delete Contact Profile Picture
* [AssignContactProfileImage](#assigncontactprofileimage) - Assign Contact Profile Picture
* [GetContactRelationshipsById](#getcontactrelationshipsbyid) - Get Related Contact Ids
* [CreateContactRelationship](#createcontactrelationship) - Add Contact Relationship
* [DeleteContactRelationship](#deletecontactrelationship) - Delete Contact Relationship

## CreateContactGroup

Create a contact group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createContactGroup" method="post" path="/contact-groups" -->
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

ContactGroupInput req = new ContactGroupInput() {
    Name = "group name",
    ShortDescription = "short description",
    Description = "long description",
    DistributionListInfo = new DistributionListInfoJsonInput() {
        InternalNote = "Sample distribution list internal note",
    },
};

var res = await sdk.Contacts.CreateContactGroupAsync(req);

// handle response
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [ContactGroupInput](../../Models/Components/ContactGroupInput.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[CreateContactGroupResponse](../../Models/Requests/CreateContactGroupResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListContactGroups

Gets a paginated list of contact groups

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listContactGroups" method="get" path="/contact-groups" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

ListContactGroupsRequest req = new ListContactGroupsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "name eq 'groupName' and type eq 'STANDARD'",
};

ListContactGroupsResponse? res = await sdk.Contacts.ListContactGroupsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListContactGroupsRequest](../../Models/Requests/ListContactGroupsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListContactGroupsResponse](../../Models/Requests/ListContactGroupsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetContactGroupById

Get a single contact group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getContactGroupById" method="get" path="/contact-groups/{id}" -->
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

GetContactGroupByIdRequest req = new GetContactGroupByIdRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Contacts.GetContactGroupByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetContactGroupByIdRequest](../../Models/Requests/GetContactGroupByIdRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetContactGroupByIdResponse](../../Models/Requests/GetContactGroupByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateContactGroup

Update a contact group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateContactGroup" method="put" path="/contact-groups/{id}" -->
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

UpdateContactGroupRequest req = new UpdateContactGroupRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    ContactGroup = new ContactGroupInput() {
        Name = "group name",
        ShortDescription = "short description",
        Description = "long description",
        DistributionListInfo = new DistributionListInfoJsonInput() {
            InternalNote = "Sample distribution list internal note",
        },
    },
};

var res = await sdk.Contacts.UpdateContactGroupAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateContactGroupRequest](../../Models/Requests/UpdateContactGroupRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateContactGroupResponse](../../Models/Requests/UpdateContactGroupResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteContactGroup

Delete a contact group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteContactGroup" method="delete" path="/contact-groups/{id}" -->
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

DeleteContactGroupRequest req = new DeleteContactGroupRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Contacts.DeleteContactGroupAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [DeleteContactGroupRequest](../../Models/Requests/DeleteContactGroupRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[DeleteContactGroupResponse](../../Models/Requests/DeleteContactGroupResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetContactIdsByContactGroup

Get all contact ids in a single contact group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getContactIdsByContactGroup" method="get" path="/contact-groups/{id}/contacts" -->
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

GetContactIdsByContactGroupRequest req = new GetContactIdsByContactGroupRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

GetContactIdsByContactGroupResponse? res = await sdk.Contacts.GetContactIdsByContactGroupAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetContactIdsByContactGroupRequest](../../Models/Requests/GetContactIdsByContactGroupRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetContactIdsByContactGroupResponse](../../Models/Requests/GetContactIdsByContactGroupResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## AddContactToContactGroup

Adds a single Contact to a single Contact Group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="addContactToContactGroup" method="put" path="/contact-groups/{id}/contacts/{contactId}" -->
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

AddContactToContactGroupRequest req = new AddContactToContactGroupRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    ContactId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Contacts.AddContactToContactGroupAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [AddContactToContactGroupRequest](../../Models/Requests/AddContactToContactGroupRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[AddContactToContactGroupResponse](../../Models/Requests/AddContactToContactGroupResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## RemoveContactFromContactGroup

Removes a single Contact from a single Contact Group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="removeContactFromContactGroup" method="delete" path="/contact-groups/{id}/contacts/{contactId}" -->
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

RemoveContactFromContactGroupRequest req = new RemoveContactFromContactGroupRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    ContactId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Contacts.RemoveContactFromContactGroupAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [RemoveContactFromContactGroupRequest](../../Models/Requests/RemoveContactFromContactGroupRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[RemoveContactFromContactGroupResponse](../../Models/Requests/RemoveContactFromContactGroupResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListContactTypes

Gets a paginated list of contact types.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listContactTypes" method="get" path="/contact-types" -->
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

ListContactTypesRequest req = new ListContactTypesRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "name eq 'groupType'",
};

ListContactTypesResponse? res = await sdk.Contacts.ListContactTypesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListContactTypesRequest](../../Models/Requests/ListContactTypesRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListContactTypesResponse](../../Models/Requests/ListContactTypesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListContacts

Gets a paginated list of Contacts.

For information on reading secure contact fields, see the description of
<a href="#operation/getContactById">GET Contact</a>.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listContacts" method="get" path="/contacts" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

ListContactsRequest req = new ListContactsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "firstName eq 'John' or lastName eq 'Anderson'",
};

ListContactsResponse? res = await sdk.Contacts.ListContactsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListContactsRequest](../../Models/Requests/ListContactsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListContactsResponse](../../Models/Requests/ListContactsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateContacts

Updates a list of contacts based on the values provided in the request body. If you're changing  [de-duplication fields](https://support.cvent.com/s/communityarticle/Allowing-Multiple-People-to-Use-the-Same-Email-Address),  the new values must be unique in your account.
For information on updating secure contact fields, see the description of <a href="#operation/updateContactById">PUT Contact</a>.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateContacts" method="put" path="/contacts" -->
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

List<ContactUpdate> req = new List<ContactUpdate>() {};

var res = await sdk.Contacts.UpdateContactsAsync(req);

// handle response
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | List<[ContactUpdate](../../Models/Components/ContactUpdate.md)> | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[UpdateContactsResponse](../../Models/Requests/UpdateContactsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## PatchContacts

Updates a list of contacts based on the values provided only, keeping the existing values intact for every contact.

For information on PATCH behavior, see the description of
<a href="#operation/patchContactById">PATCH Contact</a>.

For information on updating secure contact fields, see the description of
<a href="#operation/updateContactById">PUT Contact</a>.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="patchContacts" method="patch" path="/contacts" -->
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

List<ContactPatch> req = new List<ContactPatch>() {
    new ContactPatch() {
        FirstName = "Henry",
        LastName = "Potterfield",
        MiddleName = "A",
        Nickname = "Harry",
        Email = "h.potterfield@test.com",
        CcEmail = "h.porter@tesing.com",
        Designation = "CPA",
        Type = new AttendeeContactTypeJsonInput() {
            Id = "861B51EC-AA7E-475F-B38D-4C8E35C47D63",
        },
        PrimaryAddressType = AddressTypeJson.Home,
        HomeFax = "555-555-5555",
        WorkAddress = new AddressJsonInput() {
            Address1 = "Cvent Inc.",
            Address2 = "4001 West Parmer Lane",
            Address3 = "PO Box 123",
            City = "Austin",
            CountryCode = "US",
            PostalCode = "78727",
            RegionCode = "TX",
        },
        WorkPhone = "555-555-5555",
        WorkFax = "555-555-5555",
        SourceId = "system-a-00000000-0000-0000-0000-000000000000",
        MobilePhone = "555-555-5555",
        Prefix = "Mr.",
        Pager = "555-555-5555",
        OptOut = new OptOutJsonInput() {},
        Npi = "5555555555",
        Passport = new PassportJsonInput() {
            Number = "123456789",
            CountryCode = "GB",
        },
        NationalIdentificationNumber = "123456789",
        Headline = "Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands",
        PersonalWebsite = "https://www.example.com",
        Biography = "I am a marketing professional with experience in event planning and brand strategy.",
        Pronouns = "he/him/she/her/they/them",
        Id = "6287f5c1-9d7f-4f15-9ffe-ca2cb290964c",
    },
};

var res = await sdk.Contacts.PatchContactsAsync(req);

// handle response
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | List<[ContactPatch](../../Models/Components/ContactPatch.md)> | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[PatchContactsResponse](../../Models/Requests/PatchContactsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateContacts

Creates a list of contacts based on the values provided in the request body. If you're changing  [de-duplication fields](https://support.cvent.com/s/communityarticle/Allowing-Multiple-People-to-Use-the-Same-Email-Address),  the new values must be unique in your account.
For information on creating contacts with secure contact fields, see the description of <a href="#operation/updateContactById">PUT Contact</a>.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createContacts" method="post" path="/contacts" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

CreateContactsRequest req = new CreateContactsRequest() {
    Upsert = true,
    RequestBody = new List<ContactCreateRequestJson>() {
        new ContactCreateRequestJson() {
            FirstName = "Henry",
            LastName = "Potterfield",
            MiddleName = "A",
            Nickname = "Harry",
            Email = "h.potterfield@test.com",
            CcEmail = "h.porter@tesing.com",
            Gender = GenderJson.Male,
            Company = "Cvent Inc.",
            Designation = "CPA",
            Title = "Event Planner",
            Type = new AttendeeContactTypeJsonInput() {
                Id = "861B51EC-AA7E-475F-B38D-4C8E35C47D63",
            },
            PrimaryAddressType = AddressTypeJson.Home,
            HomeAddress = new AddressJsonInput() {
                Address1 = "Cvent Inc.",
                Address2 = "4001 West Parmer Lane",
                Address3 = "PO Box 123",
                City = "Austin",
                CountryCode = "US",
                PostalCode = "78727",
                RegionCode = "TX",
            },
            HomePhone = "555-555-5555",
            HomeFax = "555-555-5555",
            WorkAddress = new AddressJsonInput() {
                Address1 = "Cvent Inc.",
                Address2 = "4001 West Parmer Lane",
                Address3 = "PO Box 123",
                City = "Austin",
                CountryCode = "US",
                PostalCode = "78727",
                RegionCode = "TX",
            },
            WorkPhone = "555-555-5555",
            WorkFax = "555-555-5555",
            SourceId = "system-a-00000000-0000-0000-0000-000000000000",
            MobilePhone = "555-555-5555",
            Prefix = "Mr.",
            Pager = "555-555-5555",
            OptOut = new OptOutJsonInput() {},
            Npi = "5555555555",
            Links = new ContactLinksJsonInput() {
                TwitterUrl = new LinkJson() {
                    Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
                },
                FacebookUrl = new LinkJson() {
                    Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
                },
                LinkedInUrl = new LinkJson() {
                    Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
                },
            },
            DateOfBirth = DateOnly.Parse("1990-01-01"),
            Passport = new PassportJsonInput() {
                Number = "123456789",
                CountryCode = "GB",
            },
            SocialSecurityNumber = "123-45-6789",
            NationalIdentificationNumber = "123456789",
            Headline = "Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands",
            PersonalWebsite = "https://www.example.com",
            Biography = "I am a marketing professional with experience in event planning and brand strategy.",
            Pronouns = "he/him/she/her/they/them",
        },
    },
};

var res = await sdk.Contacts.CreateContactsAsync(req);

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreateContactsRequest](../../Models/Requests/CreateContactsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateContactsResponse](../../Models/Requests/CreateContactsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListContactsPostFilters

Gets a paginated list of Contacts by sending a filter in the body of the request. This method will return the same data as the GET List Contacts but allows for longer filters.
For information on reading secure contact fields, see the description of  <a href="#operation/getContactById">GET Contact</a>.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listContactsPostFilters" method="post" path="/contacts/filter" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

ListContactsPostFiltersRequest req = new ListContactsPostFiltersRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = new Filter() {
        FilterValue = "firstName eq 'John' or lastName eq 'Anderson'",
    },
};

ListContactsPostFiltersResponse? res = await sdk.Contacts.ListContactsPostFiltersAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListContactsPostFiltersRequest](../../Models/Requests/ListContactsPostFiltersRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListContactsPostFiltersResponse](../../Models/Requests/ListContactsPostFiltersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetContactObfuscationStatusById

Get the obfuscation status of a contact by the Obfuscate ID provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getContactObfuscationStatusById" method="get" path="/contacts/obfuscate/{obfuscateId}/status" -->
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

GetContactObfuscationStatusByIdRequest req = new GetContactObfuscationStatusByIdRequest() {
    ObfuscateId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Contacts.GetContactObfuscationStatusByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [GetContactObfuscationStatusByIdRequest](../../Models/Requests/GetContactObfuscationStatusByIdRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[GetContactObfuscationStatusByIdResponse](../../Models/Requests/GetContactObfuscationStatusByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetChangeHistoryForASpecificContact

Get the change history for a specific contact.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getChangeHistoryForASpecificContact" method="get" path="/contacts/{contactId}/history" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

GetChangeHistoryForASpecificContactRequest req = new GetChangeHistoryForASpecificContactRequest() {
    ContactId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

GetChangeHistoryForASpecificContactResponse? res = await sdk.Contacts.GetChangeHistoryForASpecificContactAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [GetChangeHistoryForASpecificContactRequest](../../Models/Requests/GetChangeHistoryForASpecificContactRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |

### Response

**[GetChangeHistoryForASpecificContactResponse](../../Models/Requests/GetChangeHistoryForASpecificContactResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetContactById

Get a single contact.

When reading a contact, the following secure contact fields are only returned when
also providing the `event/contacts:read-sensitive` scope:
  * socialSecurityNumber
  * passportNumber
  * nationalIdentificationNumber
  * dateOfBirth


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getContactById" method="get" path="/contacts/{id}" -->
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

GetContactByIdRequest req = new GetContactByIdRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Contacts.GetContactByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetContactByIdRequest](../../Models/Requests/GetContactByIdRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetContactByIdResponse](../../Models/Requests/GetContactByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateContactById

Updates a contact based on contact ID and the values provided in the request body. If you're changing  [de-duplication fields](https://support.cvent.com/s/communityarticle/Allowing-Multiple-People-to-Use-the-Same-Email-Address),  the new values must be unique in your account.
When writing a contact, the following secure contact fields are only written when also providing the  `event/contacts:write-sensitive` scope:
  * socialSecurityNumber
  * passportNumber
  * nationalIdentificationNumber
  * dateOfBirth


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateContactById" method="put" path="/contacts/{id}" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

UpdateContactByIdRequest req = new UpdateContactByIdRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    ContactUpdate = new ContactUpdate() {
        FirstName = "Henry",
        LastName = "Potterfield",
        MiddleName = "A",
        Nickname = "Harry",
        Email = "h.potterfield@test.com",
        CcEmail = "h.porter@tesing.com",
        Gender = GenderJson.Male,
        Company = "Cvent Inc.",
        Designation = "CPA",
        Title = "Event Planner",
        Type = new AttendeeContactTypeJsonInput() {
            Id = "861B51EC-AA7E-475F-B38D-4C8E35C47D63",
        },
        PrimaryAddressType = AddressTypeJson.Home,
        HomeAddress = new AddressJsonInput() {
            Address1 = "Cvent Inc.",
            Address2 = "4001 West Parmer Lane",
            Address3 = "PO Box 123",
            City = "Austin",
            CountryCode = "US",
            PostalCode = "78727",
            RegionCode = "TX",
        },
        HomePhone = "555-555-5555",
        HomeFax = "555-555-5555",
        WorkAddress = new AddressJsonInput() {
            Address1 = "Cvent Inc.",
            Address2 = "4001 West Parmer Lane",
            Address3 = "PO Box 123",
            City = "Austin",
            CountryCode = "US",
            PostalCode = "78727",
            RegionCode = "TX",
        },
        WorkPhone = "555-555-5555",
        WorkFax = "555-555-5555",
        SourceId = "system-a-00000000-0000-0000-0000-000000000000",
        MobilePhone = "555-555-5555",
        Prefix = "Mr.",
        Pager = "555-555-5555",
        OptOut = new OptOutJsonInput() {},
        Npi = "5555555555",
        Links = new ContactLinksJsonInput() {
            TwitterUrl = new LinkJson() {
                Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
            },
            FacebookUrl = new LinkJson() {
                Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
            },
            LinkedInUrl = new LinkJson() {
                Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
            },
        },
        DateOfBirth = DateOnly.Parse("1990-01-01"),
        Passport = new PassportJsonInput() {
            Number = "123456789",
            CountryCode = "GB",
        },
        SocialSecurityNumber = "123-45-6789",
        NationalIdentificationNumber = "123456789",
        Headline = "Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands",
        PersonalWebsite = "https://www.example.com",
        Biography = "I am a marketing professional with experience in event planning and brand strategy.",
        Pronouns = "he/him/she/her/they/them",
        Id = "35072f36-7cef-4254-82ae-1b411ba42d5f",
    },
};

var res = await sdk.Contacts.UpdateContactByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateContactByIdRequest](../../Models/Requests/UpdateContactByIdRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateContactByIdResponse](../../Models/Requests/UpdateContactByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## PatchContactById

Updates a part of a contact based on the given contactId.

To update a field, pass the value to be updated. To delete a field, set the field to null. Fields not passed in the request body will remain unchanged.

For information on updating secure contact fields, see the description of
<a href="#operation/updateContactById">PUT Contact</a>.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="patchContactById" method="patch" path="/contacts/{id}" -->
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

PatchContactByIdRequest req = new PatchContactByIdRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    ContactPatch = new ContactPatch() {
        FirstName = "Henry",
        LastName = "Potterfield",
        MiddleName = "A",
        Nickname = "Harry",
        Email = "h.potterfield@test.com",
        CcEmail = "h.porter@tesing.com",
        Designation = "CPA",
        Type = new AttendeeContactTypeJsonInput() {
            Id = "861B51EC-AA7E-475F-B38D-4C8E35C47D63",
        },
        PrimaryAddressType = AddressTypeJson.Home,
        HomeFax = "555-555-5555",
        WorkAddress = new AddressJsonInput() {
            Address1 = "Cvent Inc.",
            Address2 = "4001 West Parmer Lane",
            Address3 = "PO Box 123",
            City = "Austin",
            CountryCode = "US",
            PostalCode = "78727",
            RegionCode = "TX",
        },
        WorkPhone = "555-555-5555",
        WorkFax = "555-555-5555",
        SourceId = "system-a-00000000-0000-0000-0000-000000000000",
        MobilePhone = "555-555-5555",
        Prefix = "Mr.",
        Pager = "555-555-5555",
        OptOut = new OptOutJsonInput() {},
        Npi = "5555555555",
        Passport = new PassportJsonInput() {
            Number = "123456789",
            CountryCode = "GB",
        },
        NationalIdentificationNumber = "123456789",
        Headline = "Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands",
        PersonalWebsite = "https://www.example.com",
        Biography = "I am a marketing professional with experience in event planning and brand strategy.",
        Pronouns = "he/him/she/her/they/them",
        Id = "07460b8e-b91c-45c8-8cff-780165752daa",
    },
};

var res = await sdk.Contacts.PatchContactByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchContactByIdRequest](../../Models/Requests/PatchContactByIdRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchContactByIdResponse](../../Models/Requests/PatchContactByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteContactById

Deletes a contact from the address book but does not remove the contact from events.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteContactById" method="delete" path="/contacts/{id}" -->
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

DeleteContactByIdRequest req = new DeleteContactByIdRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Contacts.DeleteContactByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [DeleteContactByIdRequest](../../Models/Requests/DeleteContactByIdRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[DeleteContactByIdResponse](../../Models/Requests/DeleteContactByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 409, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateContactCustomFieldAnswers

Update custom field answers for a single custom field and single contact

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateContactCustomFieldAnswers" method="put" path="/contacts/{id}/custom-fields/{customFieldId}/answers" -->
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

UpdateContactCustomFieldAnswersRequest req = new UpdateContactCustomFieldAnswersRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    CustomFieldId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    CustomField = new CustomFieldInput() {
        Id = "2900aa71-b025-4a43-ab99-825a225ac215",
        Type = CustomFieldCustomFieldType.General,
        Value = new List<string>() {
            "Choice C",
            "Choice A",
        },
    },
};

var res = await sdk.Contacts.UpdateContactCustomFieldAnswersAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [UpdateContactCustomFieldAnswersRequest](../../Models/Requests/UpdateContactCustomFieldAnswersRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[UpdateContactCustomFieldAnswersResponse](../../Models/Requests/UpdateContactCustomFieldAnswersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## MergeContacts

Merges two or three contacts into a single contact.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="mergeContacts" method="post" path="/contacts/{id}/merge" -->
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

MergeContactsRequest req = new MergeContactsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    ContactMerge = new ContactMerge() {
        SecondaryContacts = new List<string>() {
            "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        ConflictResolution = new ConflictResolution() {
            ContactFields = new List<ContactMergeFieldJson>() {
                new ContactMergeFieldJson() {
                    FieldName = "firstName",
                    ContactId = "a45a3341-d30f-4bd9-bfd8-fbcdae37f0f2",
                },
            },
        },
    },
};

var res = await sdk.Contacts.MergeContactsAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [MergeContactsRequest](../../Models/Requests/MergeContactsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[MergeContactsResponse](../../Models/Requests/MergeContactsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 409, 429          | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ObfuscateContactById

Initiate obfuscation of a contact based on the given ID. Verify the status of the obfuscation using
[Get Obfuscation Status](#operation/getContactObfuscationStatusById). Once this process succeeds, all
the data for the contact will be obfuscated and will no longer be retrievable. See the
[Obfuscation User Guide](https://developers.cvent.com/docs/rest-api/guides/obfuscation-guide) for
more details.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="obfuscateContactById" method="post" path="/contacts/{id}/obfuscate" -->
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

ObfuscateContactByIdRequest req = new ObfuscateContactByIdRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Contacts.ObfuscateContactByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ObfuscateContactByIdRequest](../../Models/Requests/ObfuscateContactByIdRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ObfuscateContactByIdResponse](../../Models/Requests/ObfuscateContactByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 409, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteContactProfileImage

Deletes the profile picture of the given contact.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteContactProfileImage" method="delete" path="/contacts/{id}/profile-images" -->
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

DeleteContactProfileImageRequest req = new DeleteContactProfileImageRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Contacts.DeleteContactProfileImageAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [DeleteContactProfileImageRequest](../../Models/Requests/DeleteContactProfileImageRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[DeleteContactProfileImageResponse](../../Models/Requests/DeleteContactProfileImageResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## AssignContactProfileImage

Assign a profile picture to a contact with a file UUID from <a href="#operation/uploadFile">file upload</a> endpoint. This will replace the current profile picture if one is assigned.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="assignContactProfileImage" method="put" path="/contacts/{id}/profile-images" -->
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

AssignContactProfileImageRequest req = new AssignContactProfileImageRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    ContactFile = new ContactFileInput() {
        File = new ContactFileFile() {},
    },
};

var res = await sdk.Contacts.AssignContactProfileImageAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AssignContactProfileImageRequest](../../Models/Requests/AssignContactProfileImageRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AssignContactProfileImageResponse](../../Models/Requests/AssignContactProfileImageResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetContactRelationshipsById

Get all contact Ids related to the provided contact.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getContactRelationshipsById" method="get" path="/contacts/{id}/related-contacts" -->
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

GetContactRelationshipsByIdRequest req = new GetContactRelationshipsByIdRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

GetContactRelationshipsByIdResponse? res = await sdk.Contacts.GetContactRelationshipsByIdAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetContactRelationshipsByIdRequest](../../Models/Requests/GetContactRelationshipsByIdRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetContactRelationshipsByIdResponse](../../Models/Requests/GetContactRelationshipsByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateContactRelationship

Adds a single contact relationship between the two contact Ids provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createContactRelationship" method="put" path="/contacts/{id}/related-contacts/{relatedContactId}" -->
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

CreateContactRelationshipRequest req = new CreateContactRelationshipRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RelatedContactId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Contacts.CreateContactRelationshipAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateContactRelationshipRequest](../../Models/Requests/CreateContactRelationshipRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateContactRelationshipResponse](../../Models/Requests/CreateContactRelationshipResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteContactRelationship

Deletes a single contact relationship between the two contact Ids provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteContactRelationship" method="delete" path="/contacts/{id}/related-contacts/{relatedContactId}" -->
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

DeleteContactRelationshipRequest req = new DeleteContactRelationshipRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RelatedContactId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Contacts.DeleteContactRelationshipAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [DeleteContactRelationshipRequest](../../Models/Requests/DeleteContactRelationshipRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[DeleteContactRelationshipResponse](../../Models/Requests/DeleteContactRelationshipResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |