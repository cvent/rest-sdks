# VenueAvailability

## Overview

Manage the date ranges when a venue is available for event bookings.


### Available Operations

* [getVenueAvailabilitySettings](#getvenueavailabilitysettings) - Get Availability Settings
* [updateVenueAvailabilitySettings](#updatevenueavailabilitysettings) - Update Availability Settings
* [listVenueNeedDates](#listvenueneeddates) - List Venue Need Dates
* [createVenueNeedDate](#createvenueneeddate) - Create Venue Need Date
* [getVenueNeedDate](#getvenueneeddate) - Get Venue Need Date
* [updateVenueNeedDate](#updatevenueneeddate) - Update Venue Need Date
* [deleteVenueNeedDate](#deletevenueneeddate) - Delete Venue Need Date

## getVenueAvailabilitySettings

Retrieve the availability settings for the specified venue.

### Example Usage

<!-- UsageSnippet language="java" operationID="getVenueAvailabilitySettings" method="get" path="/venues/{venueId}/availability-settings" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetVenueAvailabilitySettingsRequest;
import com.cvent.models.operations.GetVenueAvailabilitySettingsResponse;
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

        GetVenueAvailabilitySettingsRequest req = GetVenueAvailabilitySettingsRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .build();

        GetVenueAvailabilitySettingsResponse res = sdk.venueAvailability().getVenueAvailabilitySettings()
                .request(req)
                .call();

        if (res.existingVenueAvailabilitySettings().isPresent()) {
            System.out.println(res.existingVenueAvailabilitySettings().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [GetVenueAvailabilitySettingsRequest](../../models/operations/GetVenueAvailabilitySettingsRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[GetVenueAvailabilitySettingsResponse](../../models/operations/GetVenueAvailabilitySettingsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updateVenueAvailabilitySettings

Update the availability settings for the specified venue.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateVenueAvailabilitySettings" method="put" path="/venues/{venueId}/availability-settings" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.UpdateVenueAvailabilitySettingsRequest;
import com.cvent.models.operations.UpdateVenueAvailabilitySettingsResponse;
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

        UpdateVenueAvailabilitySettingsRequest req = UpdateVenueAvailabilitySettingsRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .venueAvailabilitySettings(VenueAvailabilitySettings.builder()
                    .displayNeedDatesToPlanner(true)
                    .build())
                .build();

        UpdateVenueAvailabilitySettingsResponse res = sdk.venueAvailability().updateVenueAvailabilitySettings()
                .request(req)
                .call();

        if (res.existingVenueAvailabilitySettings().isPresent()) {
            System.out.println(res.existingVenueAvailabilitySettings().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [UpdateVenueAvailabilitySettingsRequest](../../models/operations/UpdateVenueAvailabilitySettingsRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[UpdateVenueAvailabilitySettingsResponse](../../models/operations/UpdateVenueAvailabilitySettingsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## listVenueNeedDates

Returns a paginated list of active need dates for the specified venue.

### Example Usage

<!-- UsageSnippet language="java" operationID="listVenueNeedDates" method="get" path="/venues/{venueId}/need-dates" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.ListVenueNeedDatesRequest;
import com.cvent.models.operations.ListVenueNeedDatesResponse;
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

        ListVenueNeedDatesRequest req = ListVenueNeedDatesRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.venueAvailability().listVenueNeedDates()
                .callAsStream()
                .forEach((ListVenueNeedDatesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListVenueNeedDatesRequest](../../models/operations/ListVenueNeedDatesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListVenueNeedDatesResponse](../../models/operations/ListVenueNeedDatesResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## createVenueNeedDate

Creates a new need date range for the specified venue. If the submitted range overlaps or is adjacent to an existing range, they are merged into a single range. For example, submitting 2026-08-10 to 2026-08-14 when 2026-08-12 to 2026-08-18 exists returns 2026-08-10 to 2026-08-18.

### Example Usage

<!-- UsageSnippet language="java" operationID="createVenueNeedDate" method="post" path="/venues/{venueId}/need-dates" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.CreateVenueNeedDateRequest;
import com.cvent.models.operations.CreateVenueNeedDateResponse;
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

        CreateVenueNeedDateRequest req = CreateVenueNeedDateRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .venueNeedDate(VenueNeedDate.builder()
                    .startDate(LocalDate.parse("2026-07-01"))
                    .endDate(LocalDate.parse("2026-07-31"))
                    .build())
                .build();

        CreateVenueNeedDateResponse res = sdk.venueAvailability().createVenueNeedDate()
                .request(req)
                .call();

        if (res.existingVenueNeedDate().isPresent()) {
            System.out.println(res.existingVenueNeedDate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateVenueNeedDateRequest](../../models/operations/CreateVenueNeedDateRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateVenueNeedDateResponse](../../models/operations/CreateVenueNeedDateResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getVenueNeedDate

Retrieves an active need date range for the specified venue.

### Example Usage

<!-- UsageSnippet language="java" operationID="getVenueNeedDate" method="get" path="/venues/{venueId}/need-dates/{needDateId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetVenueNeedDateRequest;
import com.cvent.models.operations.GetVenueNeedDateResponse;
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

        GetVenueNeedDateRequest req = GetVenueNeedDateRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .needDateId("8a4d1f3c-c9ee-42b5-bcd0-037295f7820a")
                .build();

        GetVenueNeedDateResponse res = sdk.venueAvailability().getVenueNeedDate()
                .request(req)
                .call();

        if (res.existingVenueNeedDate().isPresent()) {
            System.out.println(res.existingVenueNeedDate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetVenueNeedDateRequest](../../models/operations/GetVenueNeedDateRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetVenueNeedDateResponse](../../models/operations/GetVenueNeedDateResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updateVenueNeedDate

Replaces the specified need date range with the values provided in the request body. If the updated range overlaps or is adjacent to another existing range, both are merged into a single range. For example, if 2026-08-01 to 2026-08-10 and 2026-08-15 to 2026-08-20 exist and you update the first to 2026-08-01 to 2026-08-16, the response returns 2026-08-01 to 2026-08-20.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateVenueNeedDate" method="put" path="/venues/{venueId}/need-dates/{needDateId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.UpdateVenueNeedDateRequest;
import com.cvent.models.operations.UpdateVenueNeedDateResponse;
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

        UpdateVenueNeedDateRequest req = UpdateVenueNeedDateRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .needDateId("8a4d1f3c-c9ee-42b5-bcd0-037295f7820a")
                .existingVenueNeedDate(ExistingVenueNeedDateInput.builder()
                    .startDate(LocalDate.parse("2026-07-01"))
                    .endDate(LocalDate.parse("2026-07-31"))
                    .build())
                .build();

        UpdateVenueNeedDateResponse res = sdk.venueAvailability().updateVenueNeedDate()
                .request(req)
                .call();

        if (res.existingVenueNeedDate().isPresent()) {
            System.out.println(res.existingVenueNeedDate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateVenueNeedDateRequest](../../models/operations/UpdateVenueNeedDateRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateVenueNeedDateResponse](../../models/operations/UpdateVenueNeedDateResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## deleteVenueNeedDate

Deletes the specified need date range for the venue.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteVenueNeedDate" method="delete" path="/venues/{venueId}/need-dates/{needDateId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.DeleteVenueNeedDateRequest;
import com.cvent.models.operations.DeleteVenueNeedDateResponse;
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

        DeleteVenueNeedDateRequest req = DeleteVenueNeedDateRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .needDateId("8a4d1f3c-c9ee-42b5-bcd0-037295f7820a")
                .build();

        DeleteVenueNeedDateResponse res = sdk.venueAvailability().deleteVenueNeedDate()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [DeleteVenueNeedDateRequest](../../models/operations/DeleteVenueNeedDateRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[DeleteVenueNeedDateResponse](../../models/operations/DeleteVenueNeedDateResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |