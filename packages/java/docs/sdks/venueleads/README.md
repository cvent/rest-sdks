# VenueLeads

## Overview

Manage inbound leads submitted to venues through Cvent's sourcing channels.

### Available Operations

* [createLeadCatcher](#createleadcatcher) - Create Lead Catcher
* [listLeadCatchersOverview](#listleadcatchersoverview) - List Lead Catchers Overview
* [updateLeadCatcher](#updateleadcatcher) - Update Lead Catcher
* [patchLeadCatcher](#patchleadcatcher) - Patch Lead Catcher
* [deleteLeadCatcher](#deleteleadcatcher) - Delete Lead Catcher
* [getLeadCatcherOverview](#getleadcatcheroverview) - Get Lead Catcher Overview

## createLeadCatcher

Creates a new lead catcher contact for the specified venue. Lead catchers receive email notifications when RFPs are submitted to the venue.

### Example Usage

<!-- UsageSnippet language="java" operationID="createLeadCatcher" method="post" path="/venues/{venueId}/lead-catchers" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.CreateLeadCatcherRequest;
import com.cvent.models.operations.CreateLeadCatcherResponse;
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

        CreateLeadCatcherRequest req = CreateLeadCatcherRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .leadCatcher(LeadCatcher.builder()
                    .firstName("Jane")
                    .lastName("Smith")
                    .email("jane.smith@example.com")
                    .phone("+1-555-555-0101")
                    .title("Director of Sales")
                    .fax("+1-555-555-0101")
                    .address(LeadCatcherAddress.builder()
                        .streetAddress1("1234 Trap Road")
                        .streetAddress2("Suite 100")
                        .city("Vienna")
                        .zipPostalCode("22182")
                        .build())
                    .config(LeadCatcherConfig.builder()
                        .supplierContactRole("Sales Manager")
                        .build())
                    .additionalInfo("Preferred contact for APAC venues.")
                    .build())
                .build();

        CreateLeadCatcherResponse res = sdk.venueLeads().createLeadCatcher()
                .request(req)
                .call();

        if (res.existingLeadCatcher().isPresent()) {
            System.out.println(res.existingLeadCatcher().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateLeadCatcherRequest](../../models/operations/CreateLeadCatcherRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateLeadCatcherResponse](../../models/operations/CreateLeadCatcherResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## listLeadCatchersOverview

Returns a paginated, lightweight overview of the lead catchers for the specified venue,
containing only `id`, `firstName`, and `lastName` for each contact.

Use this endpoint to discover the `leadCatcherId` needed for PATCH, PUT, and DELETE.
The response does not include contact details such as email address or phone number.


### Example Usage

<!-- UsageSnippet language="java" operationID="listLeadCatchersOverview" method="get" path="/venues/{venueId}/lead-catchers/overview" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.ListLeadCatchersOverviewRequest;
import com.cvent.models.operations.ListLeadCatchersOverviewResponse;
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

        ListLeadCatchersOverviewRequest req = ListLeadCatchersOverviewRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.venueLeads().listLeadCatchersOverview()
                .callAsStream()
                .forEach((ListLeadCatchersOverviewResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListLeadCatchersOverviewRequest](../../models/operations/ListLeadCatchersOverviewRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListLeadCatchersOverviewResponse](../../models/operations/ListLeadCatchersOverviewResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updateLeadCatcher

Updates the given lead catcher for the specified venue, replacing the existing lead catcher data.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLeadCatcher" method="put" path="/venues/{venueId}/lead-catchers/{leadCatcherId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.UpdateLeadCatcherRequest;
import com.cvent.models.operations.UpdateLeadCatcherResponse;
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

        UpdateLeadCatcherRequest req = UpdateLeadCatcherRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .leadCatcherId("6e7d0d64-13f7-4472-8308-fa7067dba173")
                .existingLeadCatcher(ExistingLeadCatcherInput.builder()
                    .firstName("Jane")
                    .lastName("Smith")
                    .email("jane.smith@example.com")
                    .phone("+1-555-555-0101")
                    .title("Director of Sales")
                    .fax("+1-555-555-0101")
                    .address(LeadCatcherAddress.builder()
                        .streetAddress1("1234 Trap Road")
                        .streetAddress2("Suite 100")
                        .city("Vienna")
                        .zipPostalCode("22182")
                        .build())
                    .config(LeadCatcherConfig.builder()
                        .supplierContactRole("Sales Manager")
                        .build())
                    .additionalInfo("Preferred contact for APAC venues.")
                    .build())
                .build();

        UpdateLeadCatcherResponse res = sdk.venueLeads().updateLeadCatcher()
                .request(req)
                .call();

        if (res.existingLeadCatcher().isPresent()) {
            System.out.println(res.existingLeadCatcher().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateLeadCatcherRequest](../../models/operations/UpdateLeadCatcherRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateLeadCatcherResponse](../../models/operations/UpdateLeadCatcherResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## patchLeadCatcher

Partially updates the specified lead catcher using JSON Merge Patch, as defined in [RFC 7396](https://www.rfc-editor.org/rfc/rfc7396.html).

- Only fields present in the request body are updated; omitted fields remain unchanged.
- Set a field to `null` to unset it.
- The response contains only the fields that were provided in the request payload.


### Example Usage

<!-- UsageSnippet language="java" operationID="patchLeadCatcher" method="patch" path="/venues/{venueId}/lead-catchers/{leadCatcherId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.PatchLeadCatcherRequest;
import com.cvent.models.operations.PatchLeadCatcherResponse;
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

        PatchLeadCatcherRequest req = PatchLeadCatcherRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .leadCatcherId("f72c984a-4f55-4563-90e5-7e34a3be1552")
                .leadCatcherPatch(LeadCatcherPatch.builder()
                    .firstName("Jane")
                    .lastName("Smith")
                    .title("Director of Sales")
                    .email("jane.smith@example.com")
                    .phone("+1-555-0100")
                    .fax("+1-555-0101")
                    .address(LeadCatcherAddressPatch.builder()
                        .streetAddress1("1234 Trap Road")
                        .streetAddress2("Suite 100")
                        .city("Vienna")
                        .zipPostalCode("22182")
                        .build())
                    .locale("en-US")
                    .config(LeadCatcherConfigPatch.builder()
                        .rfpEmailEnabled(true)
                        .pdfLinkEnabled(true)
                        .supplierContactRole("roleName")
                        .build())
                    .additionalInfo("Preferred contact for APAC venues.")
                    .build())
                .build();

        PatchLeadCatcherResponse res = sdk.venueLeads().patchLeadCatcher()
                .request(req)
                .call();

        if (res.leadCatcherPatch().isPresent()) {
            System.out.println(res.leadCatcherPatch().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchLeadCatcherRequest](../../models/operations/PatchLeadCatcherRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchLeadCatcherResponse](../../models/operations/PatchLeadCatcherResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## deleteLeadCatcher

Deletes the specified lead catcher for the venue.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteLeadCatcher" method="delete" path="/venues/{venueId}/lead-catchers/{leadCatcherId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.DeleteLeadCatcherRequest;
import com.cvent.models.operations.DeleteLeadCatcherResponse;
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

        DeleteLeadCatcherRequest req = DeleteLeadCatcherRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .leadCatcherId("d7aa3fa0-4c8f-4353-9810-3984886b6a9d")
                .build();

        DeleteLeadCatcherResponse res = sdk.venueLeads().deleteLeadCatcher()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [DeleteLeadCatcherRequest](../../models/operations/DeleteLeadCatcherRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[DeleteLeadCatcherResponse](../../models/operations/DeleteLeadCatcherResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getLeadCatcherOverview

Retrieves a lightweight overview of a specific lead catcher for the specified venue,
containing only `id`, `firstName`, and `lastName`.

The response does not include contact details such as email address or phone number.


### Example Usage

<!-- UsageSnippet language="java" operationID="getLeadCatcherOverview" method="get" path="/venues/{venueId}/lead-catchers/{leadCatcherId}/overview" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetLeadCatcherOverviewRequest;
import com.cvent.models.operations.GetLeadCatcherOverviewResponse;
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

        GetLeadCatcherOverviewRequest req = GetLeadCatcherOverviewRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .leadCatcherId("7de41b14-8083-46d4-91b6-5a3239d59277")
                .build();

        GetLeadCatcherOverviewResponse res = sdk.venueLeads().getLeadCatcherOverview()
                .request(req)
                .call();

        if (res.leadCatcherOverview().isPresent()) {
            System.out.println(res.leadCatcherOverview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetLeadCatcherOverviewRequest](../../models/operations/GetLeadCatcherOverviewRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetLeadCatcherOverviewResponse](../../models/operations/GetLeadCatcherOverviewResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |