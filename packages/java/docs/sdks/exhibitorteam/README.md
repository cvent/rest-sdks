# ExhibitorTeam

## Overview

* **Exhibitor Admin -** Exhibitor Admins are administrators that have access to the exhibitor portal. In the portal, they are able to complete pre-event tasks, manage their team, purchase LeadCapture (if applicable), and download leads. Use this API to get details for existing admins, create new admins, and update admin details.

* **Exhibitor Booth Staff -** Exhibitor booth staff is someone that manages the frontline of the exhibitor's booth onsite or virtually. Booth staff needs to be registered for the event in order to be associated with an exhibitor. Use this API to get details for the existing booth staff(s) for a specific exhibitor, associate new booth staff to the exhibitor, and delete the association of a booth staff if required.


### Available Operations

* [listExhibitorAdmins](#listexhibitoradmins) - List Exhibitor Admins
* [postExhibitorAdmin](#postexhibitoradmin) - Create Exhibitor Admin
* [getExhibitorAdmin](#getexhibitoradmin) - Get Exhibitor Admin
* [updateExhibitorAdmin](#updateexhibitoradmin) - Update Exhibitor Admin
* [listBoothStaff](#listboothstaff) - List Booth Staff
* [associateBoothStaff](#associateboothstaff) - Create Booth Staff
* [getBoothStaff](#getboothstaff) - Get Booth Staff member
* [deleteBoothStaff](#deleteboothstaff) - Delete Booth Staff member

## listExhibitorAdmins

Retrieves a paginated list of exhibitor admins for an exhibitor within an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listExhibitorAdmins" method="get" path="/events/{id}/exhibitors/{exhibitorId}/admins" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListExhibitorAdminsRequest;
import com.cvent.models.operations.ListExhibitorAdminsResponse;
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

        ListExhibitorAdminsRequest req = ListExhibitorAdminsRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.exhibitorTeam().listExhibitorAdmins()
                .callAsStream()
                .forEach((ListExhibitorAdminsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListExhibitorAdminsRequest](../../models/operations/ListExhibitorAdminsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListExhibitorAdminsResponse](../../models/operations/ListExhibitorAdminsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## postExhibitorAdmin

Creates an exhibitor admin for the given exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="postExhibitorAdmin" method="post" path="/events/{id}/exhibitors/{exhibitorId}/admins" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.PostExhibitorAdminRequest;
import com.cvent.models.operations.PostExhibitorAdminResponse;
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

        PostExhibitorAdminRequest req = PostExhibitorAdminRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .exhibitorAdminRequest(ExhibitorAdminRequest.builder()
                    .exhibitor(ExhibitorJson.builder()
                        .id("4888db54-db22-11eb-8d19-0242ac130003")
                        .build())
                    .firstName("John")
                    .lastName("Eddy")
                    .email("john.eddy@test.com")
                    .build())
                .build();

        PostExhibitorAdminResponse res = sdk.exhibitorTeam().postExhibitorAdmin()
                .request(req)
                .call();

        if (res.exhibitorAdminResponse().isPresent()) {
            System.out.println(res.exhibitorAdminResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PostExhibitorAdminRequest](../../models/operations/PostExhibitorAdminRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PostExhibitorAdminResponse](../../models/operations/PostExhibitorAdminResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getExhibitorAdmin

Gets the details of a single exhibitor admin, such as name or contact email.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getExhibitorAdmin" method="get" path="/events/{id}/exhibitors/{exhibitorId}/admins/{adminId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetExhibitorAdminRequest;
import com.cvent.models.operations.GetExhibitorAdminResponse;
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

        GetExhibitorAdminRequest req = GetExhibitorAdminRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .adminId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetExhibitorAdminResponse res = sdk.exhibitorTeam().getExhibitorAdmin()
                .request(req)
                .call();

        if (res.exhibitorAdminResponse().isPresent()) {
            System.out.println(res.exhibitorAdminResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetExhibitorAdminRequest](../../models/operations/GetExhibitorAdminRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetExhibitorAdminResponse](../../models/operations/GetExhibitorAdminResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateExhibitorAdmin

Updates a single exhibitor admin.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateExhibitorAdmin" method="put" path="/events/{id}/exhibitors/{exhibitorId}/admins/{adminId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateExhibitorAdminRequest;
import com.cvent.models.operations.UpdateExhibitorAdminResponse;
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

        UpdateExhibitorAdminRequest req = UpdateExhibitorAdminRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .adminId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .exhibitorAdminRequest(ExhibitorAdminRequest.builder()
                    .exhibitor(ExhibitorJson.builder()
                        .id("4888db54-db22-11eb-8d19-0242ac130003")
                        .build())
                    .firstName("John")
                    .lastName("Eddy")
                    .email("john.eddy@test.com")
                    .build())
                .build();

        UpdateExhibitorAdminResponse res = sdk.exhibitorTeam().updateExhibitorAdmin()
                .request(req)
                .call();

        if (res.exhibitorAdminResponse().isPresent()) {
            System.out.println(res.exhibitorAdminResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateExhibitorAdminRequest](../../models/operations/UpdateExhibitorAdminRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateExhibitorAdminResponse](../../models/operations/UpdateExhibitorAdminResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listBoothStaff

Gets a list of booth staff members for a given event and exhibitor id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listBoothStaff" method="get" path="/events/{id}/exhibitors/{exhibitorId}/booth-staff" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListBoothStaffRequest;
import com.cvent.models.operations.ListBoothStaffResponse;
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

        ListBoothStaffRequest req = ListBoothStaffRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.exhibitorTeam().listBoothStaff()
                .callAsStream()
                .forEach((ListBoothStaffResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListBoothStaffRequest](../../models/operations/ListBoothStaffRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListBoothStaffResponse](../../models/operations/ListBoothStaffResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## associateBoothStaff

Associates a registered attendee as a booth staff to a specific exhibitor id within an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="associateBoothStaff" method="post" path="/events/{id}/exhibitors/{exhibitorId}/booth-staff" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.AssociateBoothStaffRequest;
import com.cvent.models.operations.AssociateBoothStaffResponse;
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

        AssociateBoothStaffRequest req = AssociateBoothStaffRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .boothStaffRequest(BoothStaffRequest.builder()
                    .attendee(AttendeeJson3.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .event(EventJson6.builder()
                        .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                        .build())
                    .exhibitor(ExhibitorJson.builder()
                        .id("4888db54-db22-11eb-8d19-0242ac130003")
                        .build())
                    .build())
                .build();

        AssociateBoothStaffResponse res = sdk.exhibitorTeam().associateBoothStaff()
                .request(req)
                .call();

        if (res.boothStaffResponse().isPresent()) {
            System.out.println(res.boothStaffResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [AssociateBoothStaffRequest](../../models/operations/AssociateBoothStaffRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[AssociateBoothStaffResponse](../../models/operations/AssociateBoothStaffResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getBoothStaff

Retrieves the attendee id associated with an exhibitor booth staff member.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getBoothStaff" method="get" path="/events/{id}/exhibitors/{exhibitorId}/booth-staff/{boothstaffId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetBoothStaffRequest;
import com.cvent.models.operations.GetBoothStaffResponse;
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

        GetBoothStaffRequest req = GetBoothStaffRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .boothstaffId("4e0f5152-515e-11ee-be56-0242ac120002")
                .build();

        GetBoothStaffResponse res = sdk.exhibitorTeam().getBoothStaff()
                .request(req)
                .call();

        if (res.boothStaffResponse().isPresent()) {
            System.out.println(res.boothStaffResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetBoothStaffRequest](../../models/operations/GetBoothStaffRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetBoothStaffResponse](../../models/operations/GetBoothStaffResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteBoothStaff

Disassociate a single booth staff member from a single exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteBoothStaff" method="delete" path="/events/{id}/exhibitors/{exhibitorId}/booth-staff/{boothstaffId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteBoothStaffRequest;
import com.cvent.models.operations.DeleteBoothStaffResponse;
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

        DeleteBoothStaffRequest req = DeleteBoothStaffRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .boothstaffId("4e0f5152-515e-11ee-be56-0242ac120002")
                .build();

        DeleteBoothStaffResponse res = sdk.exhibitorTeam().deleteBoothStaff()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [DeleteBoothStaffRequest](../../models/operations/DeleteBoothStaffRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[DeleteBoothStaffResponse](../../models/operations/DeleteBoothStaffResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |