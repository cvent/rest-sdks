# Seating

## Overview

Seating lets you plan seating at your events by configuring tables and assigning seats to your attendees. The seating APIs allow you to create, update, and delete seating, tables, seats, and seating assignments.
* **Seating** - A diagram of tables and seats. Your event can have many seatings.
* **Table** - A communal location where chairs are assigned. Each table is assigned to a seating.
* **Seat** - Individual seat at a table. Each seat can be assigned to an attendee.
* **Assignments** - Seat that is assigned to an attendee.

### Available Operations

* [listSeating](#listseating) - List Seating
* [getEventTableAssignments](#geteventtableassignments) - List All Seating Assignments
* [getSeating](#getseating) - Get Seating
* [getTableAssignment](#gettableassignment) - List Seating Assignments
* [listTables](#listtables) - List Tables
* [getTable](#gettable) - Get Table
* [listSeats](#listseats) - List Seats
* [getSeat](#getseat) - Get Seat

## listSeating

Get seating details for the given event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listSeating" method="get" path="/events/{id}/seatings" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListSeatingRequest;
import com.cvent.models.operations.ListSeatingResponse;
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

        ListSeatingRequest req = ListSeatingRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq 'ad6df5aa-f21f-47e6-9c48-8d3a7831ad5f'")
                .build();


        sdk.seating().listSeating()
                .callAsStream()
                .forEach((ListSeatingResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListSeatingRequest](../../models/operations/ListSeatingRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListSeatingResponse](../../models/operations/ListSeatingResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getEventTableAssignments

Gets all the table assignments across all the seatings in an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getEventTableAssignments" method="get" path="/events/{id}/seatings/assignments" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEventTableAssignmentsRequest;
import com.cvent.models.operations.GetEventTableAssignmentsResponse;
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

        GetEventTableAssignmentsRequest req = GetEventTableAssignmentsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("seating.id eq 'ad6df5aa-f21f-47e6-9c48-8d3a7831ad5f' and attendee.id eq 'bdcb1fba-0fb3-46d2-b4e7-47ace9bc7907'")
                .expand(List.of(
                    SeatingAssignmentExpand.SEATING,
                    SeatingAssignmentExpand.TABLE))
                .build();


        sdk.seating().getEventTableAssignments()
                .callAsStream()
                .forEach((GetEventTableAssignmentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetEventTableAssignmentsRequest](../../models/operations/GetEventTableAssignmentsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetEventTableAssignmentsResponse](../../models/operations/GetEventTableAssignmentsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getSeating

Get seating details for the given event by seating ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getSeating" method="get" path="/events/{id}/seatings/{seatingId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetSeatingRequest;
import com.cvent.models.operations.GetSeatingResponse;
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

        GetSeatingRequest req = GetSeatingRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .seatingId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetSeatingResponse res = sdk.seating().getSeating()
                .request(req)
                .call();

        if (res.existingSeating().isPresent()) {
            System.out.println(res.existingSeating().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetSeatingRequest](../../models/operations/GetSeatingRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetSeatingResponse](../../models/operations/GetSeatingResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getTableAssignment

Gets the table assignments for a given seating ID in an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getTableAssignment" method="get" path="/events/{id}/seatings/{seatingId}/assignments" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetTableAssignmentRequest;
import com.cvent.models.operations.GetTableAssignmentResponse;
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

        GetTableAssignmentRequest req = GetTableAssignmentRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .seatingId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("seating.id eq 'ad6df5aa-f21f-47e6-9c48-8d3a7831ad5f' and attendee.id eq 'bdcb1fba-0fb3-46d2-b4e7-47ace9bc7907'")
                .expand(List.of(
                    SeatingAssignmentExpand.SEATING,
                    SeatingAssignmentExpand.TABLE))
                .build();


        sdk.seating().getTableAssignment()
                .callAsStream()
                .forEach((GetTableAssignmentResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetTableAssignmentRequest](../../models/operations/GetTableAssignmentRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetTableAssignmentResponse](../../models/operations/GetTableAssignmentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listTables

Get table details for a given seating.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listTables" method="get" path="/events/{id}/seatings/{seatingId}/tables" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListTablesRequest;
import com.cvent.models.operations.ListTablesResponse;
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

        ListTablesRequest req = ListTablesRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .seatingId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq 'ad6df5aa-f21f-47e6-9c48-8d3a7831ad5f'")
                .expand(List.of(
                    TableExpand.SEATS))
                .build();


        sdk.seating().listTables()
                .callAsStream()
                .forEach((ListTablesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [ListTablesRequest](../../models/operations/ListTablesRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[ListTablesResponse](../../models/operations/ListTablesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getTable

Get table info for given event by seating ID and table ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getTable" method="get" path="/events/{id}/seatings/{seatingId}/tables/{tableId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetTableRequest;
import com.cvent.models.operations.GetTableResponse;
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

        GetTableRequest req = GetTableRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .seatingId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .tableId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .expand(List.of(
                    TableExpand.SEATS))
                .build();

        GetTableResponse res = sdk.seating().getTable()
                .request(req)
                .call();

        if (res.existingTableWithSeats().isPresent()) {
            System.out.println(res.existingTableWithSeats().get());
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetTableRequest](../../models/operations/GetTableRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetTableResponse](../../models/operations/GetTableResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listSeats

Get seat details for given table ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listSeats" method="get" path="/events/{id}/seatings/{seatingId}/tables/{tableId}/seats" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListSeatsRequest;
import com.cvent.models.operations.ListSeatsResponse;
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

        ListSeatsRequest req = ListSeatsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .seatingId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .tableId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq 'ad6df5aa-f21f-47e6-9c48-8d3a7831ad5f'")
                .build();


        sdk.seating().listSeats()
                .callAsStream()
                .forEach((ListSeatsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [ListSeatsRequest](../../models/operations/ListSeatsRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[ListSeatsResponse](../../models/operations/ListSeatsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getSeat

Get seat info for given event by seating ID, table ID, and seat ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getSeat" method="get" path="/events/{id}/seatings/{seatingId}/tables/{tableId}/seats/{seatId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetSeatRequest;
import com.cvent.models.operations.GetSeatResponse;
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

        GetSeatRequest req = GetSeatRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .seatingId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .tableId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .seatId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetSeatResponse res = sdk.seating().getSeat()
                .request(req)
                .call();

        if (res.existingSeat().isPresent()) {
            System.out.println(res.existingSeat().get());
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetSeatRequest](../../models/operations/GetSeatRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetSeatResponse](../../models/operations/GetSeatResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |