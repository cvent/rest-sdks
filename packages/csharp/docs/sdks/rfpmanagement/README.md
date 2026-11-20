# RFPManagement

## Overview

RFP (Request for Proposal) management APIs for core RFP operations including CRUD operations for base RFPs.

### Available Operations

* [CreateRFP](#createrfp) - Create RFP
* [GetRfpLeadSource](#getrfpleadsource) - Get RFP Lead Source
* [GetRfpLeadSourceSection](#getrfpleadsourcesection) - Get RFP Lead Source Section
* [GetRFP](#getrfp) - Get RFP
* [UpdateRFP](#updaterfp) - Update RFP
* [SubmitRFP](#submitrfp) - Submit RFP

## CreateRFP

Creates a new RFP with the provided details.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createRFP" method="post" path="/rfps" -->
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

RfpRequest req = new RfpRequest() {
    NeedsMeetingSpace = true,
    NeedsGuestRooms = false,
    Description = "Planning to host company's annual event in an outdoor location.",
    DateRequirements = new DateRequirements1Input() {
        Mode = RfpDateMode.DatePattern,
        AlternateDates = new List<Dates1>() {
            new Dates1() {
                Preferred = true,
                Id = "50dc08af-24a9-4d01-84be-3d43133dc945",
                EndDate = DateOnly.Parse("2016-10-15"),
                StartDate = DateOnly.Parse("2016-10-13"),
                Note = "Flexible dates",
            },
        },
        Pattern = new DatePattern1Input() {
            Note = "Flexible dates on weekends.",
            EndDate = DateOnly.Parse("2016-10-15"),
            StartDate = DateOnly.Parse("2016-10-13"),
            DurationDays = 3,
            StartDays = new List<DayOfWeek>() {},
        },
    },
    RfpEvent = new RfpEventInput() {
        Event = new Event12() {
            Id = "50dc08af-24a9-4d01-84be-3d43133dc945",
        },
        Name = "friday event",
        ContractSignatureLocation = "Atlanta",
        DestinationsUnderConsideration = "New York",
        ExternalMeetingRequest = true,
        AudioVisualNeeds = "Need a projector in each meeting room.",
        PeakMeetingRooms = 14,
        AttendeesPerDay = 500,
        ReferenceNumber = "XVYMP8970S",
        MeetingRequestId = "50dc08af-24a9-4d01-84be-3d43133dc945",
        FormatType = EventFormatType.InPerson,
        VirtualAttendeesPerDay = 2000,
        Budget = 10000D,
        RoomRateBudget = 200D,
        FoodBeverageBudget = 1000D,
    },
    AgendaStartDate = DateOnly.Parse("2025-10-13"),
    Contact = new Contact1() {
        FirstName = "James",
        LastName = "West",
        Email = "jwest@example.com",
        Address = new Address1() {
            CountryCode = "US",
            City = "Austin",
            RegionCode = "US-AL",
        },
        CommissionRate = 10.75D,
        CommissionApplicableTypes = new List<CommissionApplicable1>() {
            new CommissionApplicable1() {
                Type = CommissionApplicableType1.FoodAndBeverage,
                Value = "Food and Beverage",
            },
            new CommissionApplicable1() {
                Type = CommissionApplicableType1.Other,
                Value = "Spa services",
            },
        },
        Phone = "555-555-5555",
        OrganizationName = "Five Star Planners Inc.",
        PreferredContactMethods = new List<ContactMethods>() {
            ContactMethods.Cvent,
        },
    },
    RfpEventOrganization = new EventOrganization1Input() {
        Organization = new Organization() {
            Id = "50dc08af-24a9-4d01-84be-3d43133dc945",
        },
        Name = "Cvent Inc.",
        Address = new Address1() {
            CountryCode = "US",
            City = "Austin",
            RegionCode = "US-AL",
        },
    },
    DecisionFactors = "Price, location, and quality of service.",
    ResponseDueDate = DateOnly.Parse("2016-10-13"),
    DecisionDate = DateOnly.Parse("2016-10-13"),
    BillingDetails = new BillingDetails1() {
        AdditionalInformation = "Guest rooms will be a mix of IPO and RM&TX to master. Will submit rooming list with billing specified. Credit card will be provided as guarantee.",
        ConcessionsContractualInfo = "Request use of LOI or Express Agreement.",
        RebateValue = 10D,
    },
    InternalNote = "Don't award this RFP to the same venue as last year.",
    CurrencyCode = "USD",
    RequiredCostItems = new List<OfferingCostType1>() {
        OfferingCostType1.BreakAm,
        OfferingCostType1.BreakPm,
    },
    HiddenCostItems = new List<OfferingCostType1>() {
        OfferingCostType1.BreakDrinksOnly,
        OfferingCostType1.BreakSnacksAndDrinks,
    },
    CvbForwardLimit = 5,
    NotificationRecipients = new List<RecipientInfo>() {
        new RecipientInfo() {
            Order = 1,
            Type = RecipientType.Email,
            Value = "johnDoe@example.com",
        },
        new RecipientInfo() {
            Order = 2,
            Type = RecipientType.AccountUser,
            Value = "de0af126-2ec2-4a61-a4ba-bc82c73604c9",
        },
        new RecipientInfo() {
            Order = 3,
            Type = RecipientType.AccountUserGroup,
            Value = "70de07af-24a9-4d01-84be-3d43133dc932",
        },
    },
    SourceId = "123456",
    WeddingDetails = new WeddingDetails1() {
        FirstPartner = new WeddingPartner() {
            Name = "John Doe",
        },
        SecondPartner = new WeddingPartner() {
            Name = "John Doe",
        },
    },
    PackagePricingPreference = PackagePricingPreference.Optional,
    VenueIntegrationPreference = new VenueIntegrationPreference() {
        Type = VenueIntegrationType.Passkey,
        OptIn = true,
    },
    LeadSource = new RfpRequestLeadSource() {
        Id = "50dc08af-24a9-4d01-84be-3d43133dc945",
        Section = new LeadSourceSection() {
            Id = "40dc08af-24a9-4d01-84be-3d43133dc945",
        },
    },
};

var res = await sdk.RFPManagement.CreateRFPAsync(req);

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [RfpRequest](../../Models/Components/RfpRequest.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[CreateRFPResponse](../../Models/Requests/CreateRFPResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetRfpLeadSource

Returns details about a given lead source of an RFP. The lead source indicates the primary origin of the RFP or the supplier being added to the RFP, such as a particular software or website.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRfpLeadSource" method="get" path="/rfps/lead-sources/{leadSourceId}" -->
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

GetRfpLeadSourceRequest req = new GetRfpLeadSourceRequest() {
    LeadSourceId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.RFPManagement.GetRfpLeadSourceAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetRfpLeadSourceRequest](../../Models/Requests/GetRfpLeadSourceRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetRfpLeadSourceResponse](../../Models/Requests/GetRfpLeadSourceResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetRfpLeadSourceSection

Returns details about the lead source section of an RFP. The lead source section identifies the specific segment or channel within the broader lead source, such as a particular website domain, form, or integration point, where the RFP originated. This enables more granular tracking and attribution of RFPs by pinpointing the exact section within the overall lead source. See the [Lead Source](#tag/RFP-Management/operation/getRfpLeadSource) endpoint for more information about lead sources.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRfpLeadSourceSection" method="get" path="/rfps/lead-sources/{leadSourceId}/sections/{leadSourceSectionId}" -->
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

GetRfpLeadSourceSectionRequest req = new GetRfpLeadSourceSectionRequest() {
    LeadSourceId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    LeadSourceSectionId = "779934d2-f6eb-4815-bcfa-a2dd8655c164",
};

var res = await sdk.RFPManagement.GetRfpLeadSourceSectionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetRfpLeadSourceSectionRequest](../../Models/Requests/GetRfpLeadSourceSectionRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetRfpLeadSourceSectionResponse](../../Models/Requests/GetRfpLeadSourceSectionResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetRFP

Returns the basic details of an RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRFP" method="get" path="/rfps/{rfpId}" -->
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

GetRFPRequest req = new GetRFPRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Expand = new List<LeadSourceExpand>() {
        LeadSourceExpand.LeadSource,
        LeadSourceExpand.LeadSourceSection,
    },
};

var res = await sdk.RFPManagement.GetRFPAsync(req);

// handle response
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [GetRFPRequest](../../Models/Requests/GetRFPRequest.md) | :heavy_check_mark:                                      | The request object to use for the request.              |

### Response

**[GetRFPResponse](../../Models/Requests/GetRFPResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## UpdateRFP

Updates an existing RFP with the provided details.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateRFP" method="put" path="/rfps/{rfpId}" -->
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

UpdateRFPRequest req = new UpdateRFPRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Rfp = new RfpInput() {
        NeedsMeetingSpace = true,
        NeedsGuestRooms = false,
        Description = "Planning to host company's annual event in an outdoor location.",
        DateRequirements = new DateRequirements1Input() {
            Mode = RfpDateMode.DatePattern,
            AlternateDates = new List<Dates1>() {
                new Dates1() {
                    Preferred = true,
                    Id = "50dc08af-24a9-4d01-84be-3d43133dc945",
                    EndDate = DateOnly.Parse("2016-10-15"),
                    StartDate = DateOnly.Parse("2016-10-13"),
                    Note = "Flexible dates",
                },
            },
            Pattern = new DatePattern1Input() {
                Note = "Flexible dates on weekends.",
                EndDate = DateOnly.Parse("2016-10-15"),
                StartDate = DateOnly.Parse("2016-10-13"),
                DurationDays = 3,
                StartDays = new List<DayOfWeek>() {
                    DayOfWeek.Monday,
                },
            },
        },
        RfpEvent = new RfpEventInput() {
            Event = new Event12() {
                Id = "50dc08af-24a9-4d01-84be-3d43133dc945",
            },
            Name = "friday event",
            ContractSignatureLocation = "Atlanta",
            DestinationsUnderConsideration = "New York",
            ExternalMeetingRequest = true,
            AudioVisualNeeds = "Need a projector in each meeting room.",
            PeakMeetingRooms = 14,
            AttendeesPerDay = 500,
            ReferenceNumber = "XVYMP8970S",
            MeetingRequestId = "50dc08af-24a9-4d01-84be-3d43133dc945",
            FormatType = EventFormatType.InPerson,
            VirtualAttendeesPerDay = 2000,
            Budget = 10000D,
            RoomRateBudget = 200D,
            FoodBeverageBudget = 1000D,
        },
        AgendaStartDate = DateOnly.Parse("2025-10-13"),
        Contact = new Contact1() {
            FirstName = "James",
            LastName = "West",
            Email = "jwest@example.com",
            Address = new Address1() {
                CountryCode = "US",
                City = "Austin",
                RegionCode = "US-AL",
            },
            CommissionRate = 10.75D,
            CommissionApplicableTypes = new List<CommissionApplicable1>() {
                new CommissionApplicable1() {
                    Type = CommissionApplicableType1.FoodAndBeverage,
                    Value = "Food and Beverage",
                },
                new CommissionApplicable1() {
                    Type = CommissionApplicableType1.Other,
                    Value = "Spa services",
                },
            },
            Phone = "555-555-5555",
            OrganizationName = "Five Star Planners Inc.",
            PreferredContactMethods = new List<ContactMethods>() {
                ContactMethods.Cvent,
            },
        },
        RfpEventOrganization = new EventOrganization1Input() {
            Organization = new Organization() {
                Id = "50dc08af-24a9-4d01-84be-3d43133dc945",
            },
            Name = "Cvent Inc.",
            Address = new Address1() {
                CountryCode = "US",
                City = "Austin",
                RegionCode = "US-AL",
            },
        },
        DecisionFactors = "Price, location, and quality of service.",
        ResponseDueDate = DateOnly.Parse("2016-10-13"),
        DecisionDate = DateOnly.Parse("2016-10-13"),
        BillingDetails = new BillingDetails1() {
            AdditionalInformation = "Guest rooms will be a mix of IPO and RM&TX to master. Will submit rooming list with billing specified. Credit card will be provided as guarantee.",
            ConcessionsContractualInfo = "Request use of LOI or Express Agreement.",
            RebateValue = 10D,
        },
        InternalNote = "Don't award this RFP to the same venue as last year.",
        CurrencyCode = "USD",
        RequiredCostItems = new List<OfferingCostType1>() {
            OfferingCostType1.BreakAm,
            OfferingCostType1.BreakPm,
        },
        HiddenCostItems = new List<OfferingCostType1>() {
            OfferingCostType1.BreakDrinksOnly,
            OfferingCostType1.BreakSnacksAndDrinks,
        },
        CvbForwardLimit = 5,
        NotificationRecipients = new List<RecipientInfo>() {
            new RecipientInfo() {
                Order = 1,
                Type = RecipientType.Email,
                Value = "johnDoe@example.com",
            },
            new RecipientInfo() {
                Order = 2,
                Type = RecipientType.AccountUser,
                Value = "de0af126-2ec2-4a61-a4ba-bc82c73604c9",
            },
            new RecipientInfo() {
                Order = 3,
                Type = RecipientType.AccountUserGroup,
                Value = "70de07af-24a9-4d01-84be-3d43133dc932",
            },
        },
        SourceId = "123456",
        WeddingDetails = new WeddingDetails1() {
            FirstPartner = new WeddingPartner() {
                Name = "John Doe",
            },
            SecondPartner = new WeddingPartner() {
                Name = "John Doe",
            },
        },
        PackagePricingPreference = PackagePricingPreference.Optional,
        VenueIntegrationPreference = new VenueIntegrationPreference() {
            Type = VenueIntegrationType.Passkey,
            OptIn = true,
        },
        Id = "a3edf581-b80c-4a0b-bdcf-ab8bf5fdcd1b",
        CancellationDetails = new CancellationDetails() {
            DateTime = System.DateTime.Parse("2021-01-13T14:06:20.080Z").ToUniversalTime(),
            Comments = "I am cancelling my event, postponing to Q4.",
        },
        ArchivalDate = System.DateTime.Parse("2021-01-13T14:06:20.080Z").ToUniversalTime(),
    },
};

var res = await sdk.RFPManagement.UpdateRFPAsync(req);

// handle response
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [UpdateRFPRequest](../../Models/Requests/UpdateRFPRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[UpdateRFPResponse](../../Models/Requests/UpdateRFPResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## SubmitRFP

Submits an existing RFP. Transitions the RFP from draft status to active or pending status based on whether the RFP approval process is enabled.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="submitRFP" method="post" path="/rfps/{rfpId}/submit" -->
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

SubmitRFPRequest req = new SubmitRFPRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.RFPManagement.SubmitRFPAsync(req);

// handle response
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [SubmitRFPRequest](../../Models/Requests/SubmitRFPRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[SubmitRFPResponse](../../Models/Requests/SubmitRFPResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |