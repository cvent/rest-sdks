# ProposalDraft

## Overview

Beta - All APIs are in Beta. Proposal Drafts are editable copies of proposals. This API allows you to edit proposal data privately before publishing.

### Available Operations

* [CreateProposalDraft](#createproposaldraft) - Beta - Create Proposal Draft

## CreateProposalDraft

Creates a new proposal draft.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createProposalDraft" method="post" path="/proposal-drafts" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
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

ProposalRequest req = new ProposalRequest() {
    ScpTemplateId = "a633b01c-e461-4cc2-8c66-8ae036115658",
    SupplierSummary = new SupplierSummaryJson() {
        Supplier = Supplier.CreateVenue(
            new VenueSummary() {}
        ),
    },
    RfpSummary = new RfpSummaryJson() {
        Id = "385b9a4c-3f00-4b67-99ca-8dddc82a95b5",
    },
    EventSummary = new EventSummaryJson() {
        Id = "bedc1f8e-f68b-40cf-b901-487e407f637a",
    },
    StatusSummary = new StatusSummaryJson() {
        Reason = "Other",
        Comment = "Not as per requirement",
    },
    Introduction = "Let us design the day of your dreams at our property.",
    CommissionableBid = true,
    CommissionRate = 10.12D,
    Name = "Proposal for Royal Bank of Spain.",
    BlockCode = "ABDCFD-234535-3535",
    ProposalDates = new List<ProposalDateJson>() {
        new ProposalDateJson() {
            StartDate = DateOnly.Parse("2021-01-13"),
            EndDate = DateOnly.Parse("2021-01-13"),
        },
    },
    SleepingRooms = new List<SleepingRoomJson>() {
        new SleepingRoomJson() {
            CheckInDate = DateOnly.Parse("2021-01-13"),
            CheckOutDate = DateOnly.Parse("2021-01-13"),
            PeakRoomNights = 2,
            TotalRoomNights = 200,
            LowestRate = 140D,
            MaximumRate = 200D,
            LowestAverageDailyRate = 140D,
            HighestAverageDailyRate = 200D,
            TotalRoomCost = 300D,
            BudgetedRoomRate = 135D,
            LowestAvailableRoomCount = 10,
            HighestAvailableRoomCount = 10,
            Notes = "Premier Suite not available for the selected dates.",
            SleepingRoomBlocks = new List<SleepingRoomBlockJson>() {
                new SleepingRoomBlockJson() {
                    Date = DateOnly.Parse("2021-01-13"),
                    Quantity = 20,
                    Rate = 150D,
                },
            },
        },
    },
    AggregatedCost = new AggregatedCostJson() {
        TotalFoodAndBeverageCost = 396.56D,
        TotalMiscCost = 644.96D,
    },
    EstimatedCost = new EstimatedCostJson() {
        GuestRoom = 100D,
        MeetingRoom = 10D,
        FoodAndBeverage = 100D,
        FoodAndBeverageMinimum = 10D,
        Notes = "Estimated cost includes taxes.",
    },
    Contacts = new List<ContactJson1>() {
        new ContactJson1() {
            FirstName = "Saurabh",
            LastName = "Sachdeva",
            OrganizationWebsite = "www.cvent.com",
            Organization = "Cvent",
            Title = "Co-founder",
            Email = "saurabhsachdeva@xyz.com",
            CountryCode = "1",
            Phone = "198752236",
            Fax = "2487234567",
            Mobile = "2487649053",
            StreetAddress1 = "299 ABC Street",
            StreetAddress2 = "Unit 1A",
            StreetAddress3 = "Seattle, Washington",
            City = "Seattle",
            PostalCode = "110079",
            Notes = "Available between 8am - 5pm.",
        },
    },
    PlannerContacts = new List<ContactJson1>() {
        new ContactJson1() {
            FirstName = "Saurabh",
            LastName = "Sachdeva",
            OrganizationWebsite = "www.cvent.com",
            Organization = "Cvent",
            Title = "Co-founder",
            Email = "saurabhsachdeva@xyz.com",
            CountryCode = "1",
            Phone = "198752236",
            Fax = "2487234567",
            Mobile = "2487649053",
            StreetAddress1 = "299 ABC Street",
            StreetAddress2 = "Unit 1A",
            StreetAddress3 = "Seattle, Washington",
            City = "Seattle",
            PostalCode = "110079",
            Notes = "Available between 8am - 5pm.",
        },
    },
    MeetingRoom = new MeetingRoomJson() {
        Notes = "This meeting room has the best audio quality.",
    },
};

var res = await sdk.ProposalDraft.CreateProposalDraftAsync(req);

// handle response
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [ProposalRequest](../../Models/Components/ProposalRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[CreateProposalDraftResponse](../../Models/Requests/CreateProposalDraftResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |