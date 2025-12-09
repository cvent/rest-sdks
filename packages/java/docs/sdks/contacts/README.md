# Contacts

## Overview

A contact is a record in your account’s address book that represents an individual. The data stored within these records includes personal information, group memberships, and historical data on event attendance.  Contact APIs will allow you to get contact information, track updates to contact information, and create contacts.

### Available Operations

* [createContactGroup](#createcontactgroup) - Create Contact Group
* [listContactGroups](#listcontactgroups) - List Contact Groups
* [getContactGroupById](#getcontactgroupbyid) - Get Contact Group
* [updateContactGroup](#updatecontactgroup) - Update Contact Group
* [deleteContactGroup](#deletecontactgroup) - Delete Contact Group
* [getContactIdsByContactGroup](#getcontactidsbycontactgroup) - Get Ids in Contact Group
* [addContactToContactGroup](#addcontacttocontactgroup) - Add Contact To Group
* [removeContactFromContactGroup](#removecontactfromcontactgroup) - Remove Contact From Group
* [listContactTypes](#listcontacttypes) - List Contact Types
* [listContacts](#listcontacts) - List Contacts
* [updateContacts](#updatecontacts) - Update Contacts
* [patchContacts](#patchcontacts) - Patch Contacts
* [createContacts](#createcontacts) - Create Contacts
* [listContactsPostFilters](#listcontactspostfilters) - List Contacts
* [getContactObfuscationStatusById](#getcontactobfuscationstatusbyid) - Get Obfuscation Status
* [getChangeHistoryForASpecificContact](#getchangehistoryforaspecificcontact) - Get Contact Change History
* [getContactById](#getcontactbyid) - Get Contact
* [updateContactById](#updatecontactbyid) - Update Contact
* [patchContactById](#patchcontactbyid) - Patch Contact
* [deleteContactById](#deletecontactbyid) - Delete Contact
* [updateContactCustomFieldAnswers](#updatecontactcustomfieldanswers) - Update Custom Field Answers
* [mergeContacts](#mergecontacts) - Merge Contacts
* [obfuscateContactById](#obfuscatecontactbyid) - Obfuscate a Contact
* [deleteContactProfileImage](#deletecontactprofileimage) - Delete Contact Profile Picture
* [assignContactProfileImage](#assigncontactprofileimage) - Assign Contact Profile Picture
* [getContactRelationshipsById](#getcontactrelationshipsbyid) - Get Related Contact Ids
* [createContactRelationship](#createcontactrelationship) - Add Contact Relationship
* [deleteContactRelationship](#deletecontactrelationship) - Delete Contact Relationship

## createContactGroup

Create a contact group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createContactGroup" method="post" path="/contact-groups" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateContactGroupResponse;
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

        ContactGroupInput req = ContactGroupInput.builder()
                .name("group name")
                .shortDescription("short description")
                .description("long description")
                .distributionListInfo(DistributionListInfoJsonInput.builder()
                    .internalNote("Sample distribution list internal note")
                    .build())
                .build();

        CreateContactGroupResponse res = sdk.contacts().createContactGroup()
                .request(req)
                .call();

        if (res.contactGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [ContactGroupInput](../../models/shared/ContactGroupInput.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[CreateContactGroupResponse](../../models/operations/CreateContactGroupResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listContactGroups

Gets a paginated list of contact groups

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listContactGroups" method="get" path="/contact-groups" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListContactGroupsRequest;
import com.cvent.models.operations.ListContactGroupsResponse;
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

        ListContactGroupsRequest req = ListContactGroupsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("name eq 'groupName' and type eq 'STANDARD'")
                .build();


        sdk.contacts().listContactGroups()
                .callAsStream()
                .forEach((ListContactGroupsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListContactGroupsRequest](../../models/operations/ListContactGroupsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListContactGroupsResponse](../../models/operations/ListContactGroupsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getContactGroupById

Get a single contact group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getContactGroupById" method="get" path="/contact-groups/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetContactGroupByIdRequest;
import com.cvent.models.operations.GetContactGroupByIdResponse;
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

        GetContactGroupByIdRequest req = GetContactGroupByIdRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetContactGroupByIdResponse res = sdk.contacts().getContactGroupById()
                .request(req)
                .call();

        if (res.contactGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetContactGroupByIdRequest](../../models/operations/GetContactGroupByIdRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetContactGroupByIdResponse](../../models/operations/GetContactGroupByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateContactGroup

Update a contact group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateContactGroup" method="put" path="/contact-groups/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateContactGroupRequest;
import com.cvent.models.operations.UpdateContactGroupResponse;
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

        UpdateContactGroupRequest req = UpdateContactGroupRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .contactGroup(ContactGroupInput.builder()
                    .name("group name")
                    .shortDescription("short description")
                    .description("long description")
                    .distributionListInfo(DistributionListInfoJsonInput.builder()
                        .internalNote("Sample distribution list internal note")
                        .build())
                    .build())
                .build();

        UpdateContactGroupResponse res = sdk.contacts().updateContactGroup()
                .request(req)
                .call();

        if (res.contactGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateContactGroupRequest](../../models/operations/UpdateContactGroupRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateContactGroupResponse](../../models/operations/UpdateContactGroupResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteContactGroup

Delete a contact group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteContactGroup" method="delete" path="/contact-groups/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteContactGroupRequest;
import com.cvent.models.operations.DeleteContactGroupResponse;
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

        DeleteContactGroupRequest req = DeleteContactGroupRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteContactGroupResponse res = sdk.contacts().deleteContactGroup()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [DeleteContactGroupRequest](../../models/operations/DeleteContactGroupRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[DeleteContactGroupResponse](../../models/operations/DeleteContactGroupResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getContactIdsByContactGroup

Get all contact ids in a single contact group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getContactIdsByContactGroup" method="get" path="/contact-groups/{id}/contacts" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetContactIdsByContactGroupRequest;
import com.cvent.models.operations.GetContactIdsByContactGroupResponse;
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

        GetContactIdsByContactGroupRequest req = GetContactIdsByContactGroupRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.contacts().getContactIdsByContactGroup()
                .callAsStream()
                .forEach((GetContactIdsByContactGroupResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [GetContactIdsByContactGroupRequest](../../models/operations/GetContactIdsByContactGroupRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[GetContactIdsByContactGroupResponse](../../models/operations/GetContactIdsByContactGroupResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## addContactToContactGroup

Adds a single Contact to a single Contact Group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="addContactToContactGroup" method="put" path="/contact-groups/{id}/contacts/{contactId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.AddContactToContactGroupRequest;
import com.cvent.models.operations.AddContactToContactGroupResponse;
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

        AddContactToContactGroupRequest req = AddContactToContactGroupRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .contactId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        AddContactToContactGroupResponse res = sdk.contacts().addContactToContactGroup()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AddContactToContactGroupRequest](../../models/operations/AddContactToContactGroupRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AddContactToContactGroupResponse](../../models/operations/AddContactToContactGroupResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## removeContactFromContactGroup

Removes a single Contact from a single Contact Group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="removeContactFromContactGroup" method="delete" path="/contact-groups/{id}/contacts/{contactId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.RemoveContactFromContactGroupRequest;
import com.cvent.models.operations.RemoveContactFromContactGroupResponse;
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

        RemoveContactFromContactGroupRequest req = RemoveContactFromContactGroupRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .contactId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        RemoveContactFromContactGroupResponse res = sdk.contacts().removeContactFromContactGroup()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [RemoveContactFromContactGroupRequest](../../models/operations/RemoveContactFromContactGroupRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[RemoveContactFromContactGroupResponse](../../models/operations/RemoveContactFromContactGroupResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listContactTypes

Gets a paginated list of contact types.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listContactTypes" method="get" path="/contact-types" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListContactTypesRequest;
import com.cvent.models.operations.ListContactTypesResponse;
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

        ListContactTypesRequest req = ListContactTypesRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("name eq 'groupType'")
                .build();


        sdk.contacts().listContactTypes()
                .callAsStream()
                .forEach((ListContactTypesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListContactTypesRequest](../../models/operations/ListContactTypesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListContactTypesResponse](../../models/operations/ListContactTypesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listContacts

Gets a paginated list of Contacts.

For information on reading secure contact fields, see the description of
<a href="#operation/getContactById">GET Contact</a>.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listContacts" method="get" path="/contacts" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListContactsRequest;
import com.cvent.models.operations.ListContactsResponse;
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

        ListContactsRequest req = ListContactsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("firstName eq 'John' or lastName eq 'Anderson'")
                .build();


        sdk.contacts().listContacts()
                .callAsStream()
                .forEach((ListContactsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListContactsRequest](../../models/operations/ListContactsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListContactsResponse](../../models/operations/ListContactsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateContacts

Updates a list of contacts based on the values provided in the request body. If you're changing  [de-duplication fields](https://support.cvent.com/s/communityarticle/Allowing-Multiple-People-to-Use-the-Same-Email-Address),  the new values must be unique in your account.
For information on updating secure contact fields, see the description of <a href="#operation/updateContactById">PUT Contact</a>.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateContacts" method="put" path="/contacts" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateContactsResponse;
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

        List<ContactUpdate> req = List.of();

        UpdateContactsResponse res = sdk.contacts().updateContacts()
                .request(req)
                .call();

        if (res.contactBulkResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [List<ContactUpdate>](../../models//.md)   | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[UpdateContactsResponse](../../models/operations/UpdateContactsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## patchContacts

Updates a list of contacts based on the values provided only, keeping the existing values intact for every contact.

For information on PATCH behavior, see the description of
<a href="#operation/patchContactById">PATCH Contact</a>.

For information on updating secure contact fields, see the description of
<a href="#operation/updateContactById">PUT Contact</a>.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="patchContacts" method="patch" path="/contacts" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.PatchContactsResponse;
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

        List<ContactPatch> req = List.of(
                ContactPatch.builder()
                    .id("6287f5c1-9d7f-4f15-9ffe-ca2cb290964c")
                    .firstName("Henry")
                    .lastName("Potterfield")
                    .middleName("A")
                    .nickname("Harry")
                    .email("h.potterfield@test.com")
                    .ccEmail("h.porter@tesing.com")
                    .designation("CPA")
                    .type(AttendeeContactTypeJsonInput.builder()
                        .id("861B51EC-AA7E-475F-B38D-4C8E35C47D63")
                        .build())
                    .primaryAddressType(AddressTypeJson.HOME)
                    .homeFax("555-555-5555")
                    .workAddress(AddressJsonInput.builder()
                        .address1("Cvent Inc.")
                        .address2("4001 West Parmer Lane")
                        .address3("PO Box 123")
                        .city("Austin")
                        .countryCode("US")
                        .postalCode("78727")
                        .regionCode("TX")
                        .build())
                    .workPhone("555-555-5555")
                    .workFax("555-555-5555")
                    .sourceId("system-a-00000000-0000-0000-0000-000000000000")
                    .mobilePhone("555-555-5555")
                    .prefix("Mr.")
                    .pager("555-555-5555")
                    .optOut(OptOutJsonInput.builder()
                        .build())
                    .npi("5555555555")
                    .passport(PassportJsonInput.builder()
                        .number("123456789")
                        .countryCode("GB")
                        .build())
                    .nationalIdentificationNumber("123456789")
                    .headline("Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands")
                    .personalWebsite("https://www.example.com")
                    .biography("I am a marketing professional with experience in event planning and brand strategy.")
                    .pronouns("he/him/she/her/they/them")
                    .build());

        PatchContactsResponse res = sdk.contacts().patchContacts()
                .request(req)
                .call();

        if (res.contactBulkResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [List<ContactPatch>](../../models//.md)    | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[PatchContactsResponse](../../models/operations/PatchContactsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createContacts

Creates a list of contacts based on the values provided in the request body. If you're changing  [de-duplication fields](https://support.cvent.com/s/communityarticle/Allowing-Multiple-People-to-Use-the-Same-Email-Address),  the new values must be unique in your account.
For information on creating contacts with secure contact fields, see the description of <a href="#operation/updateContactById">PUT Contact</a>.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createContacts" method="post" path="/contacts" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateContactsRequest;
import com.cvent.models.operations.CreateContactsResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        CreateContactsRequest req = CreateContactsRequest.builder()
                .requestBody(List.of(
                    ContactCreateRequestJson.builder()
                        .firstName("Henry")
                        .lastName("Potterfield")
                        .middleName("A")
                        .nickname("Harry")
                        .email("h.potterfield@test.com")
                        .ccEmail("h.porter@tesing.com")
                        .gender(GenderJson.MALE)
                        .company("Cvent Inc.")
                        .designation("CPA")
                        .title("Event Planner")
                        .type(AttendeeContactTypeJsonInput.builder()
                            .id("861B51EC-AA7E-475F-B38D-4C8E35C47D63")
                            .build())
                        .primaryAddressType(AddressTypeJson.HOME)
                        .homeAddress(AddressJsonInput.builder()
                            .address1("Cvent Inc.")
                            .address2("4001 West Parmer Lane")
                            .address3("PO Box 123")
                            .city("Austin")
                            .countryCode("US")
                            .postalCode("78727")
                            .regionCode("TX")
                            .build())
                        .homePhone("555-555-5555")
                        .homeFax("555-555-5555")
                        .workAddress(AddressJsonInput.builder()
                            .address1("Cvent Inc.")
                            .address2("4001 West Parmer Lane")
                            .address3("PO Box 123")
                            .city("Austin")
                            .countryCode("US")
                            .postalCode("78727")
                            .regionCode("TX")
                            .build())
                        .workPhone("555-555-5555")
                        .workFax("555-555-5555")
                        .sourceId("system-a-00000000-0000-0000-0000-000000000000")
                        .mobilePhone("555-555-5555")
                        .prefix("Mr.")
                        .pager("555-555-5555")
                        .optOut(OptOutJsonInput.builder()
                            .build())
                        .npi("5555555555")
                        .links(ContactLinksJsonInput.builder()
                            .twitterUrl(LinkJson.builder()
                                .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                                .build())
                            .facebookUrl(LinkJson.builder()
                                .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                                .build())
                            .linkedInUrl(LinkJson.builder()
                                .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                                .build())
                            .build())
                        .dateOfBirth(LocalDate.parse("1990-01-01"))
                        .passport(PassportJsonInput.builder()
                            .number("123456789")
                            .countryCode("GB")
                            .build())
                        .socialSecurityNumber("123-45-6789")
                        .nationalIdentificationNumber("123456789")
                        .headline("Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands")
                        .personalWebsite("https://www.example.com")
                        .biography("I am a marketing professional with experience in event planning and brand strategy.")
                        .pronouns("he/him/she/her/they/them")
                        .build()))
                .upsert(true)
                .build();

        CreateContactsResponse res = sdk.contacts().createContacts()
                .request(req)
                .call();

        if (res.contactBulkResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateContactsRequest](../../models/operations/CreateContactsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateContactsResponse](../../models/operations/CreateContactsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listContactsPostFilters

Gets a paginated list of Contacts by sending a filter in the body of the request. This method will return the same data as the GET List Contacts but allows for longer filters.
For information on reading secure contact fields, see the description of  <a href="#operation/getContactById">GET Contact</a>.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listContactsPostFilters" method="post" path="/contacts/filter" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListContactsPostFiltersRequest;
import com.cvent.models.operations.ListContactsPostFiltersResponse;
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

        ListContactsPostFiltersRequest req = ListContactsPostFiltersRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter(Filter.builder()
                    .filter("firstName eq 'John' or lastName eq 'Anderson'")
                    .build())
                .build();


        sdk.contacts().listContactsPostFilters()
                .callAsStream()
                .forEach((ListContactsPostFiltersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListContactsPostFiltersRequest](../../models/operations/ListContactsPostFiltersRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListContactsPostFiltersResponse](../../models/operations/ListContactsPostFiltersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getContactObfuscationStatusById

Get the obfuscation status of a contact by the Obfuscate ID provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getContactObfuscationStatusById" method="get" path="/contacts/obfuscate/{obfuscateId}/status" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetContactObfuscationStatusByIdRequest;
import com.cvent.models.operations.GetContactObfuscationStatusByIdResponse;
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

        GetContactObfuscationStatusByIdRequest req = GetContactObfuscationStatusByIdRequest.builder()
                .obfuscateId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetContactObfuscationStatusByIdResponse res = sdk.contacts().getContactObfuscationStatusById()
                .request(req)
                .call();

        if (res.contactObfuscationStatus().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [GetContactObfuscationStatusByIdRequest](../../models/operations/GetContactObfuscationStatusByIdRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[GetContactObfuscationStatusByIdResponse](../../models/operations/GetContactObfuscationStatusByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getChangeHistoryForASpecificContact

Get the change history for a specific contact.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getChangeHistoryForASpecificContact" method="get" path="/contacts/{contactId}/history" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetChangeHistoryForASpecificContactRequest;
import com.cvent.models.operations.GetChangeHistoryForASpecificContactResponse;
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

        GetChangeHistoryForASpecificContactRequest req = GetChangeHistoryForASpecificContactRequest.builder()
                .contactId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.contacts().getChangeHistoryForASpecificContact()
                .callAsStream()
                .forEach((GetChangeHistoryForASpecificContactResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [GetChangeHistoryForASpecificContactRequest](../../models/operations/GetChangeHistoryForASpecificContactRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[GetChangeHistoryForASpecificContactResponse](../../models/operations/GetChangeHistoryForASpecificContactResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getContactById

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

<!-- UsageSnippet language="java" operationID="getContactById" method="get" path="/contacts/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetContactByIdRequest;
import com.cvent.models.operations.GetContactByIdResponse;
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

        GetContactByIdRequest req = GetContactByIdRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetContactByIdResponse res = sdk.contacts().getContactById()
                .request(req)
                .call();

        if (res.contact().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetContactByIdRequest](../../models/operations/GetContactByIdRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetContactByIdResponse](../../models/operations/GetContactByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateContactById

Updates a contact based on contact ID and the values provided in the request body. If you're changing  [de-duplication fields](https://support.cvent.com/s/communityarticle/Allowing-Multiple-People-to-Use-the-Same-Email-Address),  the new values must be unique in your account.
When writing a contact, the following secure contact fields are only written when also providing the  `event/contacts:write-sensitive` scope:
  * socialSecurityNumber
  * passportNumber
  * nationalIdentificationNumber
  * dateOfBirth


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateContactById" method="put" path="/contacts/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateContactByIdRequest;
import com.cvent.models.operations.UpdateContactByIdResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        UpdateContactByIdRequest req = UpdateContactByIdRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .contactUpdate(ContactUpdate.builder()
                    .id("35072f36-7cef-4254-82ae-1b411ba42d5f")
                    .firstName("Henry")
                    .lastName("Potterfield")
                    .middleName("A")
                    .nickname("Harry")
                    .email("h.potterfield@test.com")
                    .ccEmail("h.porter@tesing.com")
                    .gender(GenderJson.MALE)
                    .company("Cvent Inc.")
                    .designation("CPA")
                    .title("Event Planner")
                    .type(AttendeeContactTypeJsonInput.builder()
                        .id("861B51EC-AA7E-475F-B38D-4C8E35C47D63")
                        .build())
                    .primaryAddressType(AddressTypeJson.HOME)
                    .homeAddress(AddressJsonInput.builder()
                        .address1("Cvent Inc.")
                        .address2("4001 West Parmer Lane")
                        .address3("PO Box 123")
                        .city("Austin")
                        .countryCode("US")
                        .postalCode("78727")
                        .regionCode("TX")
                        .build())
                    .homePhone("555-555-5555")
                    .homeFax("555-555-5555")
                    .workAddress(AddressJsonInput.builder()
                        .address1("Cvent Inc.")
                        .address2("4001 West Parmer Lane")
                        .address3("PO Box 123")
                        .city("Austin")
                        .countryCode("US")
                        .postalCode("78727")
                        .regionCode("TX")
                        .build())
                    .workPhone("555-555-5555")
                    .workFax("555-555-5555")
                    .sourceId("system-a-00000000-0000-0000-0000-000000000000")
                    .mobilePhone("555-555-5555")
                    .prefix("Mr.")
                    .pager("555-555-5555")
                    .optOut(OptOutJsonInput.builder()
                        .build())
                    .npi("5555555555")
                    .links(ContactLinksJsonInput.builder()
                        .twitterUrl(LinkJson.builder()
                            .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                            .build())
                        .facebookUrl(LinkJson.builder()
                            .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                            .build())
                        .linkedInUrl(LinkJson.builder()
                            .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                            .build())
                        .build())
                    .dateOfBirth(LocalDate.parse("1990-01-01"))
                    .passport(PassportJsonInput.builder()
                        .number("123456789")
                        .countryCode("GB")
                        .build())
                    .socialSecurityNumber("123-45-6789")
                    .nationalIdentificationNumber("123456789")
                    .headline("Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands")
                    .personalWebsite("https://www.example.com")
                    .biography("I am a marketing professional with experience in event planning and brand strategy.")
                    .pronouns("he/him/she/her/they/them")
                    .build())
                .build();

        UpdateContactByIdResponse res = sdk.contacts().updateContactById()
                .request(req)
                .call();

        if (res.contact().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateContactByIdRequest](../../models/operations/UpdateContactByIdRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateContactByIdResponse](../../models/operations/UpdateContactByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## patchContactById

Updates a part of a contact based on the given contactId.

To update a field, pass the value to be updated. To delete a field, set the field to null. Fields not passed in the request body will remain unchanged.

For information on updating secure contact fields, see the description of
<a href="#operation/updateContactById">PUT Contact</a>.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="patchContactById" method="patch" path="/contacts/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.PatchContactByIdRequest;
import com.cvent.models.operations.PatchContactByIdResponse;
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

        PatchContactByIdRequest req = PatchContactByIdRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .contactPatch(ContactPatch.builder()
                    .id("07460b8e-b91c-45c8-8cff-780165752daa")
                    .firstName("Henry")
                    .lastName("Potterfield")
                    .middleName("A")
                    .nickname("Harry")
                    .email("h.potterfield@test.com")
                    .ccEmail("h.porter@tesing.com")
                    .designation("CPA")
                    .type(AttendeeContactTypeJsonInput.builder()
                        .id("861B51EC-AA7E-475F-B38D-4C8E35C47D63")
                        .build())
                    .primaryAddressType(AddressTypeJson.HOME)
                    .homeFax("555-555-5555")
                    .workAddress(AddressJsonInput.builder()
                        .address1("Cvent Inc.")
                        .address2("4001 West Parmer Lane")
                        .address3("PO Box 123")
                        .city("Austin")
                        .countryCode("US")
                        .postalCode("78727")
                        .regionCode("TX")
                        .build())
                    .workPhone("555-555-5555")
                    .workFax("555-555-5555")
                    .sourceId("system-a-00000000-0000-0000-0000-000000000000")
                    .mobilePhone("555-555-5555")
                    .prefix("Mr.")
                    .pager("555-555-5555")
                    .optOut(OptOutJsonInput.builder()
                        .build())
                    .npi("5555555555")
                    .passport(PassportJsonInput.builder()
                        .number("123456789")
                        .countryCode("GB")
                        .build())
                    .nationalIdentificationNumber("123456789")
                    .headline("Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands")
                    .personalWebsite("https://www.example.com")
                    .biography("I am a marketing professional with experience in event planning and brand strategy.")
                    .pronouns("he/him/she/her/they/them")
                    .build())
                .build();

        PatchContactByIdResponse res = sdk.contacts().patchContactById()
                .request(req)
                .call();

        if (res.contact().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchContactByIdRequest](../../models/operations/PatchContactByIdRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchContactByIdResponse](../../models/operations/PatchContactByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteContactById

Deletes a contact from the address book but does not remove the contact from events.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteContactById" method="delete" path="/contacts/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteContactByIdRequest;
import com.cvent.models.operations.DeleteContactByIdResponse;
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

        DeleteContactByIdRequest req = DeleteContactByIdRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteContactByIdResponse res = sdk.contacts().deleteContactById()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [DeleteContactByIdRequest](../../models/operations/DeleteContactByIdRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[DeleteContactByIdResponse](../../models/operations/DeleteContactByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 409, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateContactCustomFieldAnswers

Update custom field answers for a single custom field and single contact

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateContactCustomFieldAnswers" method="put" path="/contacts/{id}/custom-fields/{customFieldId}/answers" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateContactCustomFieldAnswersRequest;
import com.cvent.models.operations.UpdateContactCustomFieldAnswersResponse;
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

        UpdateContactCustomFieldAnswersRequest req = UpdateContactCustomFieldAnswersRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .customFieldId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .customField(CustomFieldInput.builder()
                    .id("2900aa71-b025-4a43-ab99-825a225ac215")
                    .value(List.of(
                        "Choice C",
                        "Choice A"))
                    .type(CustomFieldCustomFieldType.GENERAL)
                    .build())
                .build();

        UpdateContactCustomFieldAnswersResponse res = sdk.contacts().updateContactCustomFieldAnswers()
                .request(req)
                .call();

        if (res.customField().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [UpdateContactCustomFieldAnswersRequest](../../models/operations/UpdateContactCustomFieldAnswersRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[UpdateContactCustomFieldAnswersResponse](../../models/operations/UpdateContactCustomFieldAnswersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## mergeContacts

Merges two or three contacts into a single contact.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="mergeContacts" method="post" path="/contacts/{id}/merge" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.MergeContactsRequest;
import com.cvent.models.operations.MergeContactsResponse;
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

        MergeContactsRequest req = MergeContactsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .contactMerge(ContactMerge.builder()
                    .secondaryContacts(List.of(
                        "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3"))
                    .conflictResolution(ConflictResolution.builder()
                        .contactFields(List.of(
                            ContactMergeFieldJson.builder()
                                .fieldName("firstName")
                                .contactId("a45a3341-d30f-4bd9-bfd8-fbcdae37f0f2")
                                .build()))
                        .build())
                    .build())
                .build();

        MergeContactsResponse res = sdk.contacts().mergeContacts()
                .request(req)
                .call();

        if (res.contact().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [MergeContactsRequest](../../models/operations/MergeContactsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[MergeContactsResponse](../../models/operations/MergeContactsResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse  | 400, 401, 403, 404, 409, 429 | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |

## obfuscateContactById

Initiate obfuscation of a contact based on the given ID. Verify the status of the obfuscation using
[Get Obfuscation Status](#operation/getContactObfuscationStatusById). Once this process succeeds, all
the data for the contact will be obfuscated and will no longer be retrievable. See the
[Obfuscation User Guide](https://developers.cvent.com/docs/rest-api/guides/obfuscation-guide) for
more details.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="obfuscateContactById" method="post" path="/contacts/{id}/obfuscate" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ObfuscateContactByIdRequest;
import com.cvent.models.operations.ObfuscateContactByIdResponse;
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

        ObfuscateContactByIdRequest req = ObfuscateContactByIdRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        ObfuscateContactByIdResponse res = sdk.contacts().obfuscateContactById()
                .request(req)
                .call();

        if (res.contactObfuscationStatus().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ObfuscateContactByIdRequest](../../models/operations/ObfuscateContactByIdRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ObfuscateContactByIdResponse](../../models/operations/ObfuscateContactByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 409, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteContactProfileImage

Deletes the profile picture of the given contact.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteContactProfileImage" method="delete" path="/contacts/{id}/profile-images" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteContactProfileImageRequest;
import com.cvent.models.operations.DeleteContactProfileImageResponse;
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

        DeleteContactProfileImageRequest req = DeleteContactProfileImageRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteContactProfileImageResponse res = sdk.contacts().deleteContactProfileImage()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [DeleteContactProfileImageRequest](../../models/operations/DeleteContactProfileImageRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[DeleteContactProfileImageResponse](../../models/operations/DeleteContactProfileImageResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## assignContactProfileImage

Assign a profile picture to a contact with a file UUID from <a href="#operation/uploadFile">file upload</a> endpoint. This will replace the current profile picture if one is assigned.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="assignContactProfileImage" method="put" path="/contacts/{id}/profile-images" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.AssignContactProfileImageRequest;
import com.cvent.models.operations.AssignContactProfileImageResponse;
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

        AssignContactProfileImageRequest req = AssignContactProfileImageRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .contactFile(ContactFileInput.builder()
                    .file(ContactFileFile.builder()
                        .build())
                    .build())
                .build();

        AssignContactProfileImageResponse res = sdk.contacts().assignContactProfileImage()
                .request(req)
                .call();

        if (res.contactFile().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AssignContactProfileImageRequest](../../models/operations/AssignContactProfileImageRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AssignContactProfileImageResponse](../../models/operations/AssignContactProfileImageResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getContactRelationshipsById

Get all contact Ids related to the provided contact.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getContactRelationshipsById" method="get" path="/contacts/{id}/related-contacts" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetContactRelationshipsByIdRequest;
import com.cvent.models.operations.GetContactRelationshipsByIdResponse;
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

        GetContactRelationshipsByIdRequest req = GetContactRelationshipsByIdRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.contacts().getContactRelationshipsById()
                .callAsStream()
                .forEach((GetContactRelationshipsByIdResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [GetContactRelationshipsByIdRequest](../../models/operations/GetContactRelationshipsByIdRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[GetContactRelationshipsByIdResponse](../../models/operations/GetContactRelationshipsByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createContactRelationship

Adds a single contact relationship between the two contact Ids provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createContactRelationship" method="put" path="/contacts/{id}/related-contacts/{relatedContactId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateContactRelationshipRequest;
import com.cvent.models.operations.CreateContactRelationshipResponse;
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

        CreateContactRelationshipRequest req = CreateContactRelationshipRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .relatedContactId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        CreateContactRelationshipResponse res = sdk.contacts().createContactRelationship()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [CreateContactRelationshipRequest](../../models/operations/CreateContactRelationshipRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[CreateContactRelationshipResponse](../../models/operations/CreateContactRelationshipResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteContactRelationship

Deletes a single contact relationship between the two contact Ids provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteContactRelationship" method="delete" path="/contacts/{id}/related-contacts/{relatedContactId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteContactRelationshipRequest;
import com.cvent.models.operations.DeleteContactRelationshipResponse;
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

        DeleteContactRelationshipRequest req = DeleteContactRelationshipRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .relatedContactId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteContactRelationshipResponse res = sdk.contacts().deleteContactRelationship()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [DeleteContactRelationshipRequest](../../models/operations/DeleteContactRelationshipRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[DeleteContactRelationshipResponse](../../models/operations/DeleteContactRelationshipResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |