# RFPRequirements

## Overview

RFP requirements APIs for managing RFP-specific requirements including guest rooms, meeting rooms, custom questions, custom fields, and attachments (CRUD operations).

### Available Operations

* [listRfpAgendaItems](#listrfpagendaitems) - List RFP Agenda Items
* [createRfpAgendaItem](#createrfpagendaitem) - Create RFP Agenda Item
* [listRfpAgendaItemSchedules](#listrfpagendaitemschedules) - List RFP Agenda Item Schedules
* [getRfpAgendaItem](#getrfpagendaitem) - Get RFP Agenda Item
* [updateRfpAgendaItem](#updaterfpagendaitem) - Update RFP Agenda Item
* [deleteRfpAgendaItem](#deleterfpagendaitem) - Delete RFP Agenda Item
* [listRfpAttachments](#listrfpattachments) - List RFP Attachments
* [createRfpAttachment](#createrfpattachment) - Create RFP Attachment
* [getRfpAttachment](#getrfpattachment) - Get RFP Attachment
* [deleteRfpAttachment](#deleterfpattachment) - Delete RFP Attachment
* [listRfpCustomFields](#listrfpcustomfields) - List RFP Custom Field Answers
* [getRfpCustomFieldAnswers](#getrfpcustomfieldanswers) - Get RFP Custom Field Answers
* [updateRfpCustomFieldAnswers](#updaterfpcustomfieldanswers) - Update Custom Field Answers
* [getRfpGuestRooms](#getrfpguestrooms) - Get RFP Guest Rooms
* [updateRfpGuestRooms](#updaterfpguestrooms) - Update RFP Guest Rooms
* [listRfpInternalDocuments](#listrfpinternaldocuments) - List RFP Internal Documents
* [getRfpInternalDocument](#getrfpinternaldocument) - Get RFP Internal Document
* [associateRfpInternalDocument](#associaterfpinternaldocument) - Associate Internal Document
* [disassociateRfpInternalDocument](#disassociaterfpinternaldocument) - Disassociate Internal Document
* [listRfpQuestions](#listrfpquestions) - List RFP Questions
* [createRfpQuestion](#createrfpquestion) - Create RFP Question
* [getRfpQuestion](#getrfpquestion) - Get RFP Question
* [updateRfpQuestion](#updaterfpquestion) - Update RFP Question
* [deleteRfpQuestion](#deleterfpquestion) - Delete RFP Question

## listRfpAgendaItems

Returns a paginated list of agenda items associated with an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="listRfpAgendaItems" method="get" path="/rfps/{rfpId}/agenda-items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.ListRfpAgendaItemsRequest;
import com.cvent.models.operations.ListRfpAgendaItemsResponse;
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

        ListRfpAgendaItemsRequest req = ListRfpAgendaItemsRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id in ('209a11d-5bf6-47d2-b81f-89360d7229b6')")
                .build();


        sdk.rfpRequirements().listRfpAgendaItems()
                .callAsStream()
                .forEach((ListRfpAgendaItemsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListRfpAgendaItemsRequest](../../models/operations/ListRfpAgendaItemsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListRfpAgendaItemsResponse](../../models/operations/ListRfpAgendaItemsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## createRfpAgendaItem

Creates a new agenda item for the specified RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="createRfpAgendaItem" method="post" path="/rfps/{rfpId}/agenda-items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.CreateRfpAgendaItemRequest;
import com.cvent.models.operations.CreateRfpAgendaItemResponse;
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

        CreateRfpAgendaItemRequest req = CreateRfpAgendaItemRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .rfpAgendaItemRequest(RfpAgendaItemRequest.builder()
                    .number(5L)
                    .schedules(List.of(
                        RfpAgendaItemScheduleInput.builder()
                            .dayNumber(1L)
                            .build()))
                    .name("Agenda Item 1")
                    .note("This is a sample comment for this agenda item.")
                    .startTime("10:00:00")
                    .endTime("10:30:00")
                    .roomSize(1000L)
                    .attendeeCount(10000L)
                    .roomInfoRequired(false)
                    .twentyFourHourHold(true)
                    .locatedAtPrimaryEventVenue(false)
                    .build())
                .build();

        CreateRfpAgendaItemResponse res = sdk.rfpRequirements().createRfpAgendaItem()
                .request(req)
                .call();

        if (res.rfpAgendaItem().isPresent()) {
            System.out.println(res.rfpAgendaItem().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateRfpAgendaItemRequest](../../models/operations/CreateRfpAgendaItemRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateRfpAgendaItemResponse](../../models/operations/CreateRfpAgendaItemResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## listRfpAgendaItemSchedules

Returns a paginated list of the schedules of the agenda items of an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="listRfpAgendaItemSchedules" method="get" path="/rfps/{rfpId}/agenda-items/schedules" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.ListRfpAgendaItemSchedulesRequest;
import com.cvent.models.operations.ListRfpAgendaItemSchedulesResponse;
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

        ListRfpAgendaItemSchedulesRequest req = ListRfpAgendaItemSchedulesRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.rfpRequirements().listRfpAgendaItemSchedules()
                .callAsStream()
                .forEach((ListRfpAgendaItemSchedulesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListRfpAgendaItemSchedulesRequest](../../models/operations/ListRfpAgendaItemSchedulesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListRfpAgendaItemSchedulesResponse](../../models/operations/ListRfpAgendaItemSchedulesResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getRfpAgendaItem

Returns details of a specific agenda item associated with an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRfpAgendaItem" method="get" path="/rfps/{rfpId}/agenda-items/{agendaItemId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetRfpAgendaItemRequest;
import com.cvent.models.operations.GetRfpAgendaItemResponse;
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

        GetRfpAgendaItemRequest req = GetRfpAgendaItemRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .agendaItemId("f56a51a4-84b0-46c9-a612-716dc95a1c96")
                .build();

        GetRfpAgendaItemResponse res = sdk.rfpRequirements().getRfpAgendaItem()
                .request(req)
                .call();

        if (res.rfpAgendaItem().isPresent()) {
            System.out.println(res.rfpAgendaItem().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetRfpAgendaItemRequest](../../models/operations/GetRfpAgendaItemRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetRfpAgendaItemResponse](../../models/operations/GetRfpAgendaItemResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updateRfpAgendaItem

Updates an existing agenda item for the specified RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRfpAgendaItem" method="put" path="/rfps/{rfpId}/agenda-items/{agendaItemId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.UpdateRfpAgendaItemRequest;
import com.cvent.models.operations.UpdateRfpAgendaItemResponse;
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

        UpdateRfpAgendaItemRequest req = UpdateRfpAgendaItemRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .agendaItemId("f56a51a4-84b0-46c9-a612-716dc95a1c96")
                .rfpAgendaItem(RfpAgendaItemInput.builder()
                    .number(5L)
                    .schedules(List.of(
                        RfpAgendaItemScheduleInput.builder()
                            .dayNumber(1L)
                            .build()))
                    .id("9290ddfb-cc91-4cc3-9b3f-5ee5caba486b")
                    .name("Agenda Item 1")
                    .note("This is a sample comment for this agenda item.")
                    .startTime("10:00:00")
                    .endTime("10:30:00")
                    .roomSize(1000L)
                    .attendeeCount(10000L)
                    .roomInfoRequired(false)
                    .twentyFourHourHold(true)
                    .locatedAtPrimaryEventVenue(false)
                    .build())
                .build();

        UpdateRfpAgendaItemResponse res = sdk.rfpRequirements().updateRfpAgendaItem()
                .request(req)
                .call();

        if (res.rfpAgendaItem().isPresent()) {
            System.out.println(res.rfpAgendaItem().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateRfpAgendaItemRequest](../../models/operations/UpdateRfpAgendaItemRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateRfpAgendaItemResponse](../../models/operations/UpdateRfpAgendaItemResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## deleteRfpAgendaItem

Deletes an existing agenda item from the specified RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteRfpAgendaItem" method="delete" path="/rfps/{rfpId}/agenda-items/{agendaItemId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.DeleteRfpAgendaItemRequest;
import com.cvent.models.operations.DeleteRfpAgendaItemResponse;
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

        DeleteRfpAgendaItemRequest req = DeleteRfpAgendaItemRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .agendaItemId("f56a51a4-84b0-46c9-a612-716dc95a1c96")
                .build();

        DeleteRfpAgendaItemResponse res = sdk.rfpRequirements().deleteRfpAgendaItem()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [DeleteRfpAgendaItemRequest](../../models/operations/DeleteRfpAgendaItemRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[DeleteRfpAgendaItemResponse](../../models/operations/DeleteRfpAgendaItemResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## listRfpAttachments

Returns a paginated list of [attachments](#tag/RFP-Requirements) added to an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="listRfpAttachments" method="get" path="/rfps/{rfpId}/attachments" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.ListRfpAttachmentsRequest;
import com.cvent.models.operations.ListRfpAttachmentsResponse;
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

        ListRfpAttachmentsRequest req = ListRfpAttachmentsRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("supplierSpecific eq 'false' or supplier.id in ('37f2de41-6f50-484a-a55d-3cf0ede2ebac','f56a51a4-84b0-46c9-a612-716dc95a1c96') AND sendInEmail eq 'false'")
                .build();


        sdk.rfpRequirements().listRfpAttachments()
                .callAsStream()
                .forEach((ListRfpAttachmentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListRfpAttachmentsRequest](../../models/operations/ListRfpAttachmentsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListRfpAttachmentsResponse](../../models/operations/ListRfpAttachmentsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## createRfpAttachment

Creates a new attachment on the specified RFP by copying an existing file. The file must be uploaded with [Upload File](#tag/File-Management/operation/uploadFile) before it can be copied.

### Example Usage

<!-- UsageSnippet language="java" operationID="createRfpAttachment" method="post" path="/rfps/{rfpId}/attachments" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.CreateRfpAttachmentRequest;
import com.cvent.models.operations.CreateRfpAttachmentResponse;
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

        CreateRfpAttachmentRequest req = CreateRfpAttachmentRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .rfpAttachmentRequest(RfpAttachmentRequest.builder()
                    .file(ReferenceToFile.builder()
                        .id("94a18afa-30ad-407e-87c2-526e1e871a82")
                        .build())
                    .build())
                .build();

        CreateRfpAttachmentResponse res = sdk.rfpRequirements().createRfpAttachment()
                .request(req)
                .call();

        if (res.rfpAttachmentBase().isPresent()) {
            System.out.println(res.rfpAttachmentBase().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateRfpAttachmentRequest](../../models/operations/CreateRfpAttachmentRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateRfpAttachmentResponse](../../models/operations/CreateRfpAttachmentResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getRfpAttachment

Returns details of a specific attachment added on an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRfpAttachment" method="get" path="/rfps/{rfpId}/attachments/{attachmentId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetRfpAttachmentRequest;
import com.cvent.models.operations.GetRfpAttachmentResponse;
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

        GetRfpAttachmentRequest req = GetRfpAttachmentRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .attachmentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetRfpAttachmentResponse res = sdk.rfpRequirements().getRfpAttachment()
                .request(req)
                .call();

        if (res.rfpAttachmentBase().isPresent()) {
            System.out.println(res.rfpAttachmentBase().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetRfpAttachmentRequest](../../models/operations/GetRfpAttachmentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetRfpAttachmentResponse](../../models/operations/GetRfpAttachmentResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## deleteRfpAttachment

Deletes the specified attachment from an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteRfpAttachment" method="delete" path="/rfps/{rfpId}/attachments/{attachmentId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.DeleteRfpAttachmentRequest;
import com.cvent.models.operations.DeleteRfpAttachmentResponse;
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

        DeleteRfpAttachmentRequest req = DeleteRfpAttachmentRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .attachmentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteRfpAttachmentResponse res = sdk.rfpRequirements().deleteRfpAttachment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [DeleteRfpAttachmentRequest](../../models/operations/DeleteRfpAttachmentRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[DeleteRfpAttachmentResponse](../../models/operations/DeleteRfpAttachmentResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## listRfpCustomFields

Returns a paginated list of answers for each custom field associated with a given RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="listRfpCustomFields" method="get" path="/rfps/{rfpId}/custom-fields/answers" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.ListRfpCustomFieldsRequest;
import com.cvent.models.operations.ListRfpCustomFieldsResponse;
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

        ListRfpCustomFieldsRequest req = ListRfpCustomFieldsRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .expand(List.of(
                    CustomFieldExpand.CUSTOM_FIELD))
                .build();


        sdk.rfpRequirements().listRfpCustomFields()
                .callAsStream()
                .forEach((ListRfpCustomFieldsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListRfpCustomFieldsRequest](../../models/operations/ListRfpCustomFieldsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListRfpCustomFieldsResponse](../../models/operations/ListRfpCustomFieldsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getRfpCustomFieldAnswers

Returns details of answers specific to a custom field associated to an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRfpCustomFieldAnswers" method="get" path="/rfps/{rfpId}/custom-fields/{customFieldId}/answers" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetRfpCustomFieldAnswersRequest;
import com.cvent.models.operations.GetRfpCustomFieldAnswersResponse;
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

        GetRfpCustomFieldAnswersRequest req = GetRfpCustomFieldAnswersRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .customFieldId("8cbcdb70-e2d0-46c2-8b3f-006e545394a7")
                .expand(List.of(
                    CustomFieldExpand.CUSTOM_FIELD))
                .build();

        GetRfpCustomFieldAnswersResponse res = sdk.rfpRequirements().getRfpCustomFieldAnswers()
                .request(req)
                .call();

        if (res.customFieldAnswers().isPresent()) {
            System.out.println(res.customFieldAnswers().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetRfpCustomFieldAnswersRequest](../../models/operations/GetRfpCustomFieldAnswersRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetRfpCustomFieldAnswersResponse](../../models/operations/GetRfpCustomFieldAnswersResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updateRfpCustomFieldAnswers

Updates the answers to a custom field of an RFP. Create the custom field at the account level with [Create Custom Field](#tag/Custom-Fields/operation/createCustomField) before you update its answers.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRfpCustomFieldAnswers" method="put" path="/rfps/{rfpId}/custom-fields/{customFieldId}/answers" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.UpdateRfpCustomFieldAnswersRequest;
import com.cvent.models.operations.UpdateRfpCustomFieldAnswersResponse;
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

        UpdateRfpCustomFieldAnswersRequest req = UpdateRfpCustomFieldAnswersRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .customFieldId("8cbcdb70-e2d0-46c2-8b3f-006e545394a7")
                .customFieldAnswers(CustomFieldAnswers.builder()
                    .customField(ExpandableCustomObject.builder()
                        .id("50dc08af-24a9-4d01-84be-3d43133dc945")
                        .build())
                    .answers(List.of(
                        "Choice 1"))
                    .build())
                .expand(List.of(
                    CustomFieldExpand.CUSTOM_FIELD))
                .build();

        UpdateRfpCustomFieldAnswersResponse res = sdk.rfpRequirements().updateRfpCustomFieldAnswers()
                .request(req)
                .call();

        if (res.customFieldAnswers().isPresent()) {
            System.out.println(res.customFieldAnswers().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [UpdateRfpCustomFieldAnswersRequest](../../models/operations/UpdateRfpCustomFieldAnswersRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UpdateRfpCustomFieldAnswersResponse](../../models/operations/UpdateRfpCustomFieldAnswersResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getRfpGuestRooms

Returns guest room requirements associated with an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRfpGuestRooms" method="get" path="/rfps/{rfpId}/guest-rooms" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetRfpGuestRoomsRequest;
import com.cvent.models.operations.GetRfpGuestRoomsResponse;
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

        GetRfpGuestRoomsRequest req = GetRfpGuestRoomsRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetRfpGuestRoomsResponse res = sdk.rfpRequirements().getRfpGuestRooms()
                .request(req)
                .call();

        if (res.rfpGuestRooms().isPresent()) {
            System.out.println(res.rfpGuestRooms().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetRfpGuestRoomsRequest](../../models/operations/GetRfpGuestRoomsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetRfpGuestRoomsResponse](../../models/operations/GetRfpGuestRoomsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updateRfpGuestRooms

Updates guest room requirements associated with an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRfpGuestRooms" method="put" path="/rfps/{rfpId}/guest-rooms" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.UpdateRfpGuestRoomsRequest;
import com.cvent.models.operations.UpdateRfpGuestRoomsResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        UpdateRfpGuestRoomsRequest req = UpdateRfpGuestRoomsRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .rfpGuestRooms(RfpGuestRoomsInput.builder()
                    .occupancies(List.of(
                        GuestRoomOccupancyPerRoomType.builder()
                            .type(GuestRoomType.DOUBLE)
                            .occupancy(GuestRoomOccupancy.SINGLE)
                            .build()))
                    .checkInDate(LocalDate.parse("2025-10-13"))
                    .roomBlocks(List.of(
                        RoomBlockInput.builder()
                            .dayNumber(3L)
                            .details(List.of(
                                RoomBlockDetails.builder()
                                    .quantity(24L)
                                    .type(GuestRoomType.DOUBLE)
                                    .build()))
                            .build()))
                    .additionalInformation("2 Executive suites are mandatory.")
                    .build())
                .build();

        UpdateRfpGuestRoomsResponse res = sdk.rfpRequirements().updateRfpGuestRooms()
                .request(req)
                .call();

        if (res.rfpGuestRooms().isPresent()) {
            System.out.println(res.rfpGuestRooms().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateRfpGuestRoomsRequest](../../models/operations/UpdateRfpGuestRoomsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateRfpGuestRoomsResponse](../../models/operations/UpdateRfpGuestRoomsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## listRfpInternalDocuments

Returns a paginated list of [internal documents](#tag/RFP-Requirements) added to an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="listRfpInternalDocuments" method="get" path="/rfps/{rfpId}/internal-documents" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.ListRfpInternalDocumentsRequest;
import com.cvent.models.operations.ListRfpInternalDocumentsResponse;
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

        ListRfpInternalDocumentsRequest req = ListRfpInternalDocumentsRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id in ('209a11d-5bf6-47d2-b81f-89360d7229b6')")
                .build();


        sdk.rfpRequirements().listRfpInternalDocuments()
                .callAsStream()
                .forEach((ListRfpInternalDocumentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListRfpInternalDocumentsRequest](../../models/operations/ListRfpInternalDocumentsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListRfpInternalDocumentsResponse](../../models/operations/ListRfpInternalDocumentsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getRfpInternalDocument

Returns details of an internal document associated with an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRfpInternalDocument" method="get" path="/rfps/{rfpId}/internal-documents/{documentId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetRfpInternalDocumentRequest;
import com.cvent.models.operations.GetRfpInternalDocumentResponse;
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

        GetRfpInternalDocumentRequest req = GetRfpInternalDocumentRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .documentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetRfpInternalDocumentResponse res = sdk.rfpRequirements().getRfpInternalDocument()
                .request(req)
                .call();

        if (res.rfpInternalDocument().isPresent()) {
            System.out.println(res.rfpInternalDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetRfpInternalDocumentRequest](../../models/operations/GetRfpInternalDocumentRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetRfpInternalDocumentResponse](../../models/operations/GetRfpInternalDocumentResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## associateRfpInternalDocument

Associates a single document with an RFP. The `documentId` path parameter is the file ID that [Upload File](#tag/File-Management/operation/uploadFile) returns. A document with the same name or ID should not already exist.

### Example Usage

<!-- UsageSnippet language="java" operationID="associateRfpInternalDocument" method="put" path="/rfps/{rfpId}/internal-documents/{documentId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.AssociateRfpInternalDocumentRequest;
import com.cvent.models.operations.AssociateRfpInternalDocumentResponse;
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

        AssociateRfpInternalDocumentRequest req = AssociateRfpInternalDocumentRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .documentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        AssociateRfpInternalDocumentResponse res = sdk.rfpRequirements().associateRfpInternalDocument()
                .request(req)
                .call();

        if (res.rfpInternalDocument().isPresent()) {
            System.out.println(res.rfpInternalDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [AssociateRfpInternalDocumentRequest](../../models/operations/AssociateRfpInternalDocumentRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[AssociateRfpInternalDocumentResponse](../../models/operations/AssociateRfpInternalDocumentResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## disassociateRfpInternalDocument

Disassociates an internal document from an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="disassociateRfpInternalDocument" method="delete" path="/rfps/{rfpId}/internal-documents/{documentId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.DisassociateRfpInternalDocumentRequest;
import com.cvent.models.operations.DisassociateRfpInternalDocumentResponse;
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

        DisassociateRfpInternalDocumentRequest req = DisassociateRfpInternalDocumentRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .documentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DisassociateRfpInternalDocumentResponse res = sdk.rfpRequirements().disassociateRfpInternalDocument()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [DisassociateRfpInternalDocumentRequest](../../models/operations/DisassociateRfpInternalDocumentRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[DisassociateRfpInternalDocumentResponse](../../models/operations/DisassociateRfpInternalDocumentResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## listRfpQuestions

Returns a paginated list of standard and custom questions associated with the given RFP. Does not include answer details.

### Example Usage

<!-- UsageSnippet language="java" operationID="listRfpQuestions" method="get" path="/rfps/{rfpId}/questions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.ListRfpQuestionsRequest;
import com.cvent.models.operations.ListRfpQuestionsResponse;
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

        ListRfpQuestionsRequest req = ListRfpQuestionsRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.rfpRequirements().listRfpQuestions()
                .callAsStream()
                .forEach((ListRfpQuestionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListRfpQuestionsRequest](../../models/operations/ListRfpQuestionsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListRfpQuestionsResponse](../../models/operations/ListRfpQuestionsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## createRfpQuestion

Creates a new question for the specified RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="createRfpQuestion" method="post" path="/rfps/{rfpId}/questions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.CreateRfpQuestionRequest;
import com.cvent.models.operations.CreateRfpQuestionResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        CreateRfpQuestionRequest req = CreateRfpQuestionRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .rfpQuestion(RfpQuestionInput.builder()
                    .supplierTypes(List.of(
                        SupplierType.CVB,
                        SupplierType.HOTEL))
                    .classificationType(QuestionClassificationType.GUEST_ROOM)
                    .text("Are you spending any significant time offsite and need transportation?")
                    .shortText("Needs offsite transportation?")
                    .htmlText("Question Html")
                    .code("4l6x")
                    .type(QuestionType.SINGLE_CHOICE)
                    .choices(List.of(
                        ChoiceInput.builder()
                            .text("Are you spending any significant time offsite and need transportation?")
                            .shortText("Needs offsite transportation?")
                            .label("Choice A")
                            .build()))
                    .categories(List.of(
                        CategoryInput.builder()
                            .text("Are you spending any significant time offsite and need transportation?")
                            .shortText("Needs offsite transportation?")
                            .required(true)
                            .build()))
                    .subCategories(List.of(
                        TextFieldInput.builder()
                            .text("Are you spending any significant time offsite and need transportation?")
                            .shortText("Needs offsite transportation?")
                            .build()))
                    .notApplicableAnswer(AdditionalChoice.builder()
                        .text("Dietary Restriction - Other")
                        .shortText("Dietary Preference - Other Allergies")
                        .build())
                    .otherAnswer(AdditionalChoice.builder()
                        .text("Dietary Restriction - Other")
                        .shortText("Dietary Preference - Other Allergies")
                        .build())
                    .comments("Comments Text")
                    .required(true)
                    .fields(List.of(
                        FieldInput.builder()
                            .text("Are you spending any significant time offsite and need transportation?")
                            .shortText("Needs offsite transportation?")
                            .choices(List.of(
                                ChoiceInput.builder()
                                    .text("Are you spending any significant time offsite and need transportation?")
                                    .shortText("Needs offsite transportation?")
                                    .label("Choice A")
                                    .build()))
                            .notApplicableAnswer(AdditionalChoice.builder()
                                .text("Dietary Restriction - Other")
                                .shortText("Dietary Preference - Other Allergies")
                                .build())
                            .otherAnswer(AdditionalChoice.builder()
                                .text("Dietary Restriction - Other")
                                .shortText("Dietary Preference - Other Allergies")
                                .build())
                            .required(true)
                            .build()))
                    .maxScore(20d)
                    .totalSum(45L)
                    .minSelection(1L)
                    .maxSelection(3L)
                    .minDate(LocalDate.parse("2020-01-01"))
                    .maxDate(LocalDate.parse("2020-12-31"))
                    .showDateSelector(true)
                    .showCurrentDate(true)
                    .unitLabel("miles")
                    .minLength(5L)
                    .maxLength(100L)
                    .customAnswerFormat(CustomAnswerFormat.builder()
                        .id(104L)
                        .build())
                    .order(1L)
                    .standardQuestion(StandardQuestion.builder()
                        .id("50dc08af-24a9-4d01-84be-3d43133dc945")
                        .build())
                    .build())
                .build();

        CreateRfpQuestionResponse res = sdk.rfpRequirements().createRfpQuestion()
                .request(req)
                .call();

        if (res.rfpQuestion().isPresent()) {
            System.out.println(res.rfpQuestion().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateRfpQuestionRequest](../../models/operations/CreateRfpQuestionRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateRfpQuestionResponse](../../models/operations/CreateRfpQuestionResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getRfpQuestion

Returns the details of a specific question associated with an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRfpQuestion" method="get" path="/rfps/{rfpId}/questions/{questionId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetRfpQuestionRequest;
import com.cvent.models.operations.GetRfpQuestionResponse;
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

        GetRfpQuestionRequest req = GetRfpQuestionRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .questionId("a4ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetRfpQuestionResponse res = sdk.rfpRequirements().getRfpQuestion()
                .request(req)
                .call();

        if (res.rfpQuestion().isPresent()) {
            System.out.println(res.rfpQuestion().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetRfpQuestionRequest](../../models/operations/GetRfpQuestionRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetRfpQuestionResponse](../../models/operations/GetRfpQuestionResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updateRfpQuestion

Updates an existing question for the specified RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRfpQuestion" method="put" path="/rfps/{rfpId}/questions/{questionId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.UpdateRfpQuestionRequest;
import com.cvent.models.operations.UpdateRfpQuestionResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        UpdateRfpQuestionRequest req = UpdateRfpQuestionRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .questionId("a4ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .rfpQuestion(RfpQuestionInput.builder()
                    .supplierTypes(List.of(
                        SupplierType.CVB,
                        SupplierType.HOTEL))
                    .classificationType(QuestionClassificationType.MEETING_ROOM)
                    .text("Are you spending any significant time offsite and need transportation?")
                    .shortText("Needs offsite transportation?")
                    .htmlText("Question Html")
                    .code("4l6x")
                    .type(QuestionType.SINGLE_CHOICE)
                    .choices(List.of(
                        ChoiceInput.builder()
                            .text("Are you spending any significant time offsite and need transportation?")
                            .shortText("Needs offsite transportation?")
                            .label("Choice A")
                            .build()))
                    .categories(List.of(
                        CategoryInput.builder()
                            .text("Are you spending any significant time offsite and need transportation?")
                            .shortText("Needs offsite transportation?")
                            .required(true)
                            .build()))
                    .subCategories(List.of(
                        TextFieldInput.builder()
                            .text("Are you spending any significant time offsite and need transportation?")
                            .shortText("Needs offsite transportation?")
                            .build()))
                    .notApplicableAnswer(AdditionalChoice.builder()
                        .text("Dietary Restriction - Other")
                        .shortText("Dietary Preference - Other Allergies")
                        .build())
                    .otherAnswer(AdditionalChoice.builder()
                        .text("Dietary Restriction - Other")
                        .shortText("Dietary Preference - Other Allergies")
                        .build())
                    .comments("Comments Text")
                    .required(true)
                    .fields(List.of(
                        FieldInput.builder()
                            .text("Are you spending any significant time offsite and need transportation?")
                            .shortText("Needs offsite transportation?")
                            .choices(List.of(
                                ChoiceInput.builder()
                                    .text("Are you spending any significant time offsite and need transportation?")
                                    .shortText("Needs offsite transportation?")
                                    .label("Choice A")
                                    .build()))
                            .notApplicableAnswer(AdditionalChoice.builder()
                                .text("Dietary Restriction - Other")
                                .shortText("Dietary Preference - Other Allergies")
                                .build())
                            .otherAnswer(AdditionalChoice.builder()
                                .text("Dietary Restriction - Other")
                                .shortText("Dietary Preference - Other Allergies")
                                .build())
                            .required(true)
                            .build()))
                    .maxScore(20d)
                    .totalSum(45L)
                    .minSelection(1L)
                    .maxSelection(3L)
                    .minDate(LocalDate.parse("2020-01-01"))
                    .maxDate(LocalDate.parse("2020-12-31"))
                    .showDateSelector(true)
                    .showCurrentDate(true)
                    .unitLabel("miles")
                    .minLength(5L)
                    .maxLength(100L)
                    .customAnswerFormat(CustomAnswerFormat.builder()
                        .id(104L)
                        .build())
                    .order(1L)
                    .standardQuestion(StandardQuestion.builder()
                        .id("50dc08af-24a9-4d01-84be-3d43133dc945")
                        .build())
                    .build())
                .build();

        UpdateRfpQuestionResponse res = sdk.rfpRequirements().updateRfpQuestion()
                .request(req)
                .call();

        if (res.rfpQuestion().isPresent()) {
            System.out.println(res.rfpQuestion().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateRfpQuestionRequest](../../models/operations/UpdateRfpQuestionRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateRfpQuestionResponse](../../models/operations/UpdateRfpQuestionResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## deleteRfpQuestion

Deletes an existing question from the specified RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteRfpQuestion" method="delete" path="/rfps/{rfpId}/questions/{questionId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.DeleteRfpQuestionRequest;
import com.cvent.models.operations.DeleteRfpQuestionResponse;
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

        DeleteRfpQuestionRequest req = DeleteRfpQuestionRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .questionId("a4ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteRfpQuestionResponse res = sdk.rfpRequirements().deleteRfpQuestion()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [DeleteRfpQuestionRequest](../../models/operations/DeleteRfpQuestionRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[DeleteRfpQuestionResponse](../../models/operations/DeleteRfpQuestionResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |