# Seating

## Overview

Seating lets you plan seating at your events by configuring tables and assigning seats to your attendees. The seating APIs allow you to create, update, and delete seating, tables, seats, and seating assignments.
* **Seating** - A diagram of tables and seats. Your event can have many seatings.
* **Table** - A communal location where chairs are assigned. Each table is assigned to a seating.
* **Seat** - Individual seat at a table. Each seat can be assigned to an attendee.
* **Assignments** - Seat that is assigned to an attendee.

### Available Operations

* [ListSeating](#listseating) - List Seating
* [GetEventTableAssignments](#geteventtableassignments) - List All Seating Assignments
* [GetSeating](#getseating) - Get Seating
* [GetTableAssignment](#gettableassignment) - List Seating Assignments
* [ListTables](#listtables) - List Tables
* [GetTable](#gettable) - Get Table
* [ListSeats](#listseats) - List Seats
* [GetSeat](#getseat) - Get Seat

## ListSeating

Get seating details for the given event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listSeating" method="get" path="/events/{id}/seatings" -->
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

ListSeatingRequest req = new ListSeatingRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq 'ad6df5aa-f21f-47e6-9c48-8d3a7831ad5f'",
};

ListSeatingResponse? res = await sdk.Seating.ListSeatingAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [ListSeatingRequest](../../Models/Requests/ListSeatingRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[ListSeatingResponse](../../Models/Requests/ListSeatingResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetEventTableAssignments

Gets all the table assignments across all the seatings in an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEventTableAssignments" method="get" path="/events/{id}/seatings/assignments" -->
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

GetEventTableAssignmentsRequest req = new GetEventTableAssignmentsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "seating.id eq 'ad6df5aa-f21f-47e6-9c48-8d3a7831ad5f' and attendee.id eq 'bdcb1fba-0fb3-46d2-b4e7-47ace9bc7907'",
    Expand = new List<SeatingAssignmentExpand>() {
        SeatingAssignmentExpand.Seating,
        SeatingAssignmentExpand.Table,
    },
};

GetEventTableAssignmentsResponse? res = await sdk.Seating.GetEventTableAssignmentsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetEventTableAssignmentsRequest](../../Models/Requests/GetEventTableAssignmentsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetEventTableAssignmentsResponse](../../Models/Requests/GetEventTableAssignmentsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetSeating

Get seating details for the given event by seating ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getSeating" method="get" path="/events/{id}/seatings/{seatingId}" -->
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

GetSeatingRequest req = new GetSeatingRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SeatingId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Seating.GetSeatingAsync(req);

// handle response
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetSeatingRequest](../../Models/Requests/GetSeatingRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetSeatingResponse](../../Models/Requests/GetSeatingResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetTableAssignment

Gets the table assignments for a given seating ID in an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getTableAssignment" method="get" path="/events/{id}/seatings/{seatingId}/assignments" -->
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

GetTableAssignmentRequest req = new GetTableAssignmentRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SeatingId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "seating.id eq 'ad6df5aa-f21f-47e6-9c48-8d3a7831ad5f' and attendee.id eq 'bdcb1fba-0fb3-46d2-b4e7-47ace9bc7907'",
    Expand = new List<SeatingAssignmentExpand>() {
        SeatingAssignmentExpand.Seating,
        SeatingAssignmentExpand.Table,
    },
};

GetTableAssignmentResponse? res = await sdk.Seating.GetTableAssignmentAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetTableAssignmentRequest](../../Models/Requests/GetTableAssignmentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetTableAssignmentResponse](../../Models/Requests/GetTableAssignmentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListTables

Get table details for a given seating.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listTables" method="get" path="/events/{id}/seatings/{seatingId}/tables" -->
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

ListTablesRequest req = new ListTablesRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SeatingId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq 'ad6df5aa-f21f-47e6-9c48-8d3a7831ad5f'",
    Expand = new List<TableExpand>() {
        TableExpand.Seats,
    },
};

ListTablesResponse? res = await sdk.Seating.ListTablesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [ListTablesRequest](../../Models/Requests/ListTablesRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[ListTablesResponse](../../Models/Requests/ListTablesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetTable

Get table info for given event by seating ID and table ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getTable" method="get" path="/events/{id}/seatings/{seatingId}/tables/{tableId}" -->
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

GetTableRequest req = new GetTableRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SeatingId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    TableId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Expand = new List<TableExpand>() {
        TableExpand.Seats,
    },
};

var res = await sdk.Seating.GetTableAsync(req);

// handle response
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetTableRequest](../../Models/Requests/GetTableRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetTableResponse](../../Models/Requests/GetTableResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListSeats

Get seat details for given table ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listSeats" method="get" path="/events/{id}/seatings/{seatingId}/tables/{tableId}/seats" -->
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

ListSeatsRequest req = new ListSeatsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SeatingId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    TableId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq 'ad6df5aa-f21f-47e6-9c48-8d3a7831ad5f'",
};

ListSeatsResponse? res = await sdk.Seating.ListSeatsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [ListSeatsRequest](../../Models/Requests/ListSeatsRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[ListSeatsResponse](../../Models/Requests/ListSeatsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetSeat

Get seat info for given event by seating ID, table ID, and seat ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getSeat" method="get" path="/events/{id}/seatings/{seatingId}/tables/{tableId}/seats/{seatId}" -->
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

GetSeatRequest req = new GetSeatRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SeatingId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    TableId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SeatId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Seating.GetSeatAsync(req);

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [GetSeatRequest](../../Models/Requests/GetSeatRequest.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[GetSeatResponse](../../Models/Requests/GetSeatResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |