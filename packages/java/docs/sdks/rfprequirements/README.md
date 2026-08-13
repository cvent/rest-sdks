# RFPRequirements

## Overview

RFP requirements APIs for managing RFP-specific requirements including guest rooms, meeting rooms, custom questions, custom fields, and attachments (CRUD operations).

### Available Operations

* [listRfpAgendaItems](#listrfpagendaitems) - List RFP Agenda Items
* [listRfpAgendaItemSchedules](#listrfpagendaitemschedules) - List RFP Agenda Item Schedules
* [listRfpAttachments](#listrfpattachments) - List RFP Attachments
* [listRfpCustomFields](#listrfpcustomfields) - List RFP Custom Fields Answers
* [getRfpGuestRooms](#getrfpguestrooms) - Get RFP Guest Rooms
* [listRfpInternalDocuments](#listrfpinternaldocuments) - List RFP Internal Documents
* [listRfpQuestions](#listrfpquestions) - List RFP Questions

## listRfpAgendaItems

Returns a paginated list of agenda items associated with an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="listRfpAgendaItems" method="get" path="/rfps/{rfpId}/agenda-items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse11;
import com.cvent.models.operations.ListRfpAgendaItemsRequest;
import com.cvent.models.operations.ListRfpAgendaItemsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse11, Exception {

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
| models/errors/ErrorResponse11 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## listRfpAgendaItemSchedules

Returns paginated list of schedules for agenda items added on an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="listRfpAgendaItemSchedules" method="get" path="/rfps/{rfpId}/agenda-items/schedules" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse11;
import com.cvent.models.operations.ListRfpAgendaItemSchedulesRequest;
import com.cvent.models.operations.ListRfpAgendaItemSchedulesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse11, Exception {

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
| models/errors/ErrorResponse11 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## listRfpAttachments

Returns paginated list of [attachments](#tag/RFP-Requirements) added on an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="listRfpAttachments" method="get" path="/rfps/{rfpId}/attachments" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse11;
import com.cvent.models.operations.ListRfpAttachmentsRequest;
import com.cvent.models.operations.ListRfpAttachmentsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse11, Exception {

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
| models/errors/ErrorResponse11 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## listRfpCustomFields

Returns a paginated list of answers for each custom field associated with a given RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="listRfpCustomFields" method="get" path="/rfps/{rfpId}/custom-fields/answers" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse11;
import com.cvent.models.operations.ListRfpCustomFieldsRequest;
import com.cvent.models.operations.ListRfpCustomFieldsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse11, Exception {

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
| models/errors/ErrorResponse11 | 400, 401, 403, 404, 429       | application/json              |
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
import com.cvent.models.errors.ErrorResponse11;
import com.cvent.models.operations.GetRfpGuestRoomsRequest;
import com.cvent.models.operations.GetRfpGuestRoomsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse11, Exception {

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
| models/errors/ErrorResponse11 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## listRfpInternalDocuments

Returns paginated list of [internal documents](#tag/RFP-Requirements) added on an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="listRfpInternalDocuments" method="get" path="/rfps/{rfpId}/internal-documents" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse11;
import com.cvent.models.operations.ListRfpInternalDocumentsRequest;
import com.cvent.models.operations.ListRfpInternalDocumentsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse11, Exception {

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
| models/errors/ErrorResponse11 | 400, 401, 403, 404, 429       | application/json              |
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
import com.cvent.models.errors.ErrorResponse11;
import com.cvent.models.operations.ListRfpQuestionsRequest;
import com.cvent.models.operations.ListRfpQuestionsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse11, Exception {

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
| models/errors/ErrorResponse11 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |