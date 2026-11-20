# RFPManagement

## Overview

RFP (Request for Proposal) management APIs for core RFP operations including CRUD operations for base RFPs.

### Available Operations

* [createRFP](#createrfp) - Create RFP
* [getRfpLeadSource](#getrfpleadsource) - Get RFP Lead Source
* [getRfpLeadSourceSection](#getrfpleadsourcesection) - Get RFP Lead Source Section
* [getRFP](#getrfp) - Get RFP
* [updateRFP](#updaterfp) - Update RFP
* [submitRFP](#submitrfp) - Submit RFP

## createRFP

Creates a new RFP with the provided details.

### Example Usage

<!-- UsageSnippet language="java" operationID="createRFP" method="post" path="/rfps" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.CreateRFPResponse;
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

        RfpRequest req = RfpRequest.builder()
                .needsMeetingSpace(true)
                .needsGuestRooms(false)
                .dateRequirements(DateRequirements1Input.builder()
                    .mode(RfpDateMode.DATE_PATTERN)
                    .alternateDates(List.of(
                        Dates1.builder()
                            .preferred(true)
                            .id("50dc08af-24a9-4d01-84be-3d43133dc945")
                            .endDate(LocalDate.parse("2016-10-15"))
                            .startDate(LocalDate.parse("2016-10-13"))
                            .note("Flexible dates")
                            .build()))
                    .pattern(DatePattern1Input.builder()
                        .endDate(LocalDate.parse("2016-10-15"))
                        .startDate(LocalDate.parse("2016-10-13"))
                        .durationDays(3L)
                        .startDays(List.of())
                        .note("Flexible dates on weekends.")
                        .build())
                    .build())
                .rfpEvent(RfpEventInput.builder()
                    .name("friday event")
                    .formatType(EventFormatType.IN_PERSON)
                    .event(Event12.builder()
                        .id("50dc08af-24a9-4d01-84be-3d43133dc945")
                        .build())
                    .contractSignatureLocation("Atlanta")
                    .destinationsUnderConsideration("New York")
                    .externalMeetingRequest(true)
                    .audioVisualNeeds("Need a projector in each meeting room.")
                    .peakMeetingRooms(14L)
                    .attendeesPerDay(500L)
                    .referenceNumber("XVYMP8970S")
                    .meetingRequestId("50dc08af-24a9-4d01-84be-3d43133dc945")
                    .virtualAttendeesPerDay(2000L)
                    .budget(10000d)
                    .roomRateBudget(200d)
                    .foodBeverageBudget(1000d)
                    .build())
                .description("Planning to host company's annual event in an outdoor location.")
                .agendaStartDate(LocalDate.parse("2025-10-13"))
                .contact(Contact1.builder()
                    .firstName("James")
                    .lastName("West")
                    .email("jwest@example.com")
                    .phone("555-555-5555")
                    .organizationName("Five Star Planners Inc.")
                    .address(Address1.builder()
                        .countryCode("US")
                        .city("Austin")
                        .regionCode("US-AL")
                        .build())
                    .commissionRate(10.75)
                    .commissionApplicableTypes(List.of(
                        CommissionApplicable1.builder()
                            .type(CommissionApplicableType1.FOOD_AND_BEVERAGE)
                            .value("Food and Beverage")
                            .build(),
                        CommissionApplicable1.builder()
                            .type(CommissionApplicableType1.OTHER)
                            .value("Spa services")
                            .build()))
                    .preferredContactMethods(List.of(
                        ContactMethods.CVENT))
                    .build())
                .rfpEventOrganization(EventOrganization1Input.builder()
                    .organization(Organization.builder()
                        .id("50dc08af-24a9-4d01-84be-3d43133dc945")
                        .build())
                    .name("Cvent Inc.")
                    .address(Address1.builder()
                        .countryCode("US")
                        .city("Austin")
                        .regionCode("US-AL")
                        .build())
                    .build())
                .decisionFactors("Price, location, and quality of service.")
                .responseDueDate(LocalDate.parse("2016-10-13"))
                .decisionDate(LocalDate.parse("2016-10-13"))
                .billingDetails(BillingDetails1.builder()
                    .additionalInformation("Guest rooms will be a mix of IPO and RM&TX to master. Will submit rooming list with billing specified. Credit card will be provided as guarantee.")
                    .concessionsContractualInfo("Request use of LOI or Express Agreement.")
                    .rebateValue(10d)
                    .build())
                .internalNote("Don't award this RFP to the same venue as last year.")
                .currencyCode("USD")
                .requiredCostItems(List.of(
                    OfferingCostType1.BREAK_AM,
                    OfferingCostType1.BREAK_PM))
                .hiddenCostItems(List.of(
                    OfferingCostType1.BREAK_DRINKS_ONLY,
                    OfferingCostType1.BREAK_SNACKS_AND_DRINKS))
                .cvbForwardLimit(5L)
                .notificationRecipients(List.of(
                    RecipientInfo.builder()
                        .order(1L)
                        .type(RecipientType.EMAIL)
                        .value("johnDoe@example.com")
                        .build(),
                    RecipientInfo.builder()
                        .order(2L)
                        .type(RecipientType.ACCOUNT_USER)
                        .value("de0af126-2ec2-4a61-a4ba-bc82c73604c9")
                        .build(),
                    RecipientInfo.builder()
                        .order(3L)
                        .type(RecipientType.ACCOUNT_USER_GROUP)
                        .value("70de07af-24a9-4d01-84be-3d43133dc932")
                        .build()))
                .sourceId("123456")
                .weddingDetails(WeddingDetails1.builder()
                    .firstPartner(WeddingPartner.builder()
                        .name("John Doe")
                        .build())
                    .secondPartner(WeddingPartner.builder()
                        .name("John Doe")
                        .build())
                    .build())
                .packagePricingPreference(PackagePricingPreference.OPTIONAL)
                .venueIntegrationPreference(VenueIntegrationPreference.builder()
                    .type(VenueIntegrationType.PASSKEY)
                    .optIn(true)
                    .build())
                .leadSource(RfpRequestLeadSource.builder()
                    .id("50dc08af-24a9-4d01-84be-3d43133dc945")
                    .section(LeadSourceSection.builder()
                        .id("40dc08af-24a9-4d01-84be-3d43133dc945")
                        .build())
                    .build())
                .build();

        CreateRFPResponse res = sdk.rfpManagement().createRFP()
                .request(req)
                .call();

        if (res.rfp().isPresent()) {
            System.out.println(res.rfp().get());
        }
    }
}
```

### Parameters

| Parameter                                       | Type                                            | Required                                        | Description                                     |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `request`                                       | [RfpRequest](../../models/shared/RfpRequest.md) | :heavy_check_mark:                              | The request object to use for the request.      |

### Response

**[CreateRFPResponse](../../models/operations/CreateRFPResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getRfpLeadSource

Returns details about a given lead source of an RFP. The lead source indicates the primary origin of the RFP or the supplier being added to the RFP, such as a particular software or website.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRfpLeadSource" method="get" path="/rfps/lead-sources/{leadSourceId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetRfpLeadSourceRequest;
import com.cvent.models.operations.GetRfpLeadSourceResponse;
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

        GetRfpLeadSourceRequest req = GetRfpLeadSourceRequest.builder()
                .leadSourceId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetRfpLeadSourceResponse res = sdk.rfpManagement().getRfpLeadSource()
                .request(req)
                .call();

        if (res.rfpLeadSource().isPresent()) {
            System.out.println(res.rfpLeadSource().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetRfpLeadSourceRequest](../../models/operations/GetRfpLeadSourceRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetRfpLeadSourceResponse](../../models/operations/GetRfpLeadSourceResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getRfpLeadSourceSection

Returns details about the lead source section of an RFP. The lead source section identifies the specific segment or channel within the broader lead source, such as a particular website domain, form, or integration point, where the RFP originated. This enables more granular tracking and attribution of RFPs by pinpointing the exact section within the overall lead source. See the [Lead Source](#tag/RFP-Management/operation/getRfpLeadSource) endpoint for more information about lead sources.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRfpLeadSourceSection" method="get" path="/rfps/lead-sources/{leadSourceId}/sections/{leadSourceSectionId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetRfpLeadSourceSectionRequest;
import com.cvent.models.operations.GetRfpLeadSourceSectionResponse;
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

        GetRfpLeadSourceSectionRequest req = GetRfpLeadSourceSectionRequest.builder()
                .leadSourceId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .leadSourceSectionId("779934d2-f6eb-4815-bcfa-a2dd8655c164")
                .build();

        GetRfpLeadSourceSectionResponse res = sdk.rfpManagement().getRfpLeadSourceSection()
                .request(req)
                .call();

        if (res.rfpLeadSourceSection().isPresent()) {
            System.out.println(res.rfpLeadSourceSection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetRfpLeadSourceSectionRequest](../../models/operations/GetRfpLeadSourceSectionRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetRfpLeadSourceSectionResponse](../../models/operations/GetRfpLeadSourceSectionResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getRFP

Returns the basic details of an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRFP" method="get" path="/rfps/{rfpId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetRFPRequest;
import com.cvent.models.operations.GetRFPResponse;
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

        GetRFPRequest req = GetRFPRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .expand(List.of(
                    LeadSourceExpand.LEAD_SOURCE,
                    LeadSourceExpand.LEAD_SOURCE_SECTION))
                .build();

        GetRFPResponse res = sdk.rfpManagement().getRFP()
                .request(req)
                .call();

        if (res.rfp().isPresent()) {
            System.out.println(res.rfp().get());
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [GetRFPRequest](../../models/operations/GetRFPRequest.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[GetRFPResponse](../../models/operations/GetRFPResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updateRFP

Updates an existing RFP with the provided details.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRFP" method="put" path="/rfps/{rfpId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.UpdateRFPRequest;
import com.cvent.models.operations.UpdateRFPResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.time.OffsetDateTime;
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

        UpdateRFPRequest req = UpdateRFPRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .rfp(RfpInput.builder()
                    .needsMeetingSpace(true)
                    .needsGuestRooms(false)
                    .dateRequirements(DateRequirements1Input.builder()
                        .mode(RfpDateMode.DATE_PATTERN)
                        .alternateDates(List.of(
                            Dates1.builder()
                                .preferred(true)
                                .id("50dc08af-24a9-4d01-84be-3d43133dc945")
                                .endDate(LocalDate.parse("2016-10-15"))
                                .startDate(LocalDate.parse("2016-10-13"))
                                .note("Flexible dates")
                                .build()))
                        .pattern(DatePattern1Input.builder()
                            .endDate(LocalDate.parse("2016-10-15"))
                            .startDate(LocalDate.parse("2016-10-13"))
                            .durationDays(3L)
                            .startDays(List.of(
                                DayOfWeek.MONDAY))
                            .note("Flexible dates on weekends.")
                            .build())
                        .build())
                    .rfpEvent(RfpEventInput.builder()
                        .name("friday event")
                        .formatType(EventFormatType.IN_PERSON)
                        .event(Event12.builder()
                            .id("50dc08af-24a9-4d01-84be-3d43133dc945")
                            .build())
                        .contractSignatureLocation("Atlanta")
                        .destinationsUnderConsideration("New York")
                        .externalMeetingRequest(true)
                        .audioVisualNeeds("Need a projector in each meeting room.")
                        .peakMeetingRooms(14L)
                        .attendeesPerDay(500L)
                        .referenceNumber("XVYMP8970S")
                        .meetingRequestId("50dc08af-24a9-4d01-84be-3d43133dc945")
                        .virtualAttendeesPerDay(2000L)
                        .budget(10000d)
                        .roomRateBudget(200d)
                        .foodBeverageBudget(1000d)
                        .build())
                    .id("a3edf581-b80c-4a0b-bdcf-ab8bf5fdcd1b")
                    .description("Planning to host company's annual event in an outdoor location.")
                    .agendaStartDate(LocalDate.parse("2025-10-13"))
                    .contact(Contact1.builder()
                        .firstName("James")
                        .lastName("West")
                        .email("jwest@example.com")
                        .phone("555-555-5555")
                        .organizationName("Five Star Planners Inc.")
                        .address(Address1.builder()
                            .countryCode("US")
                            .city("Austin")
                            .regionCode("US-AL")
                            .build())
                        .commissionRate(10.75)
                        .commissionApplicableTypes(List.of(
                            CommissionApplicable1.builder()
                                .type(CommissionApplicableType1.FOOD_AND_BEVERAGE)
                                .value("Food and Beverage")
                                .build(),
                            CommissionApplicable1.builder()
                                .type(CommissionApplicableType1.OTHER)
                                .value("Spa services")
                                .build()))
                        .preferredContactMethods(List.of(
                            ContactMethods.CVENT))
                        .build())
                    .rfpEventOrganization(EventOrganization1Input.builder()
                        .organization(Organization.builder()
                            .id("50dc08af-24a9-4d01-84be-3d43133dc945")
                            .build())
                        .name("Cvent Inc.")
                        .address(Address1.builder()
                            .countryCode("US")
                            .city("Austin")
                            .regionCode("US-AL")
                            .build())
                        .build())
                    .decisionFactors("Price, location, and quality of service.")
                    .responseDueDate(LocalDate.parse("2016-10-13"))
                    .decisionDate(LocalDate.parse("2016-10-13"))
                    .billingDetails(BillingDetails1.builder()
                        .additionalInformation("Guest rooms will be a mix of IPO and RM&TX to master. Will submit rooming list with billing specified. Credit card will be provided as guarantee.")
                        .concessionsContractualInfo("Request use of LOI or Express Agreement.")
                        .rebateValue(10d)
                        .build())
                    .internalNote("Don't award this RFP to the same venue as last year.")
                    .currencyCode("USD")
                    .requiredCostItems(List.of(
                        OfferingCostType1.BREAK_AM,
                        OfferingCostType1.BREAK_PM))
                    .hiddenCostItems(List.of(
                        OfferingCostType1.BREAK_DRINKS_ONLY,
                        OfferingCostType1.BREAK_SNACKS_AND_DRINKS))
                    .cvbForwardLimit(5L)
                    .notificationRecipients(List.of(
                        RecipientInfo.builder()
                            .order(1L)
                            .type(RecipientType.EMAIL)
                            .value("johnDoe@example.com")
                            .build(),
                        RecipientInfo.builder()
                            .order(2L)
                            .type(RecipientType.ACCOUNT_USER)
                            .value("de0af126-2ec2-4a61-a4ba-bc82c73604c9")
                            .build(),
                        RecipientInfo.builder()
                            .order(3L)
                            .type(RecipientType.ACCOUNT_USER_GROUP)
                            .value("70de07af-24a9-4d01-84be-3d43133dc932")
                            .build()))
                    .sourceId("123456")
                    .weddingDetails(WeddingDetails1.builder()
                        .firstPartner(WeddingPartner.builder()
                            .name("John Doe")
                            .build())
                        .secondPartner(WeddingPartner.builder()
                            .name("John Doe")
                            .build())
                        .build())
                    .packagePricingPreference(PackagePricingPreference.OPTIONAL)
                    .venueIntegrationPreference(VenueIntegrationPreference.builder()
                        .type(VenueIntegrationType.PASSKEY)
                        .optIn(true)
                        .build())
                    .cancellationDetails(CancellationDetails.builder()
                        .dateTime(OffsetDateTime.parse("2021-01-13T14:06:20.080Z"))
                        .comments("I am cancelling my event, postponing to Q4.")
                        .build())
                    .archivalDate(OffsetDateTime.parse("2021-01-13T14:06:20.080Z"))
                    .build())
                .build();

        UpdateRFPResponse res = sdk.rfpManagement().updateRFP()
                .request(req)
                .call();

        if (res.rfp().isPresent()) {
            System.out.println(res.rfp().get());
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [UpdateRFPRequest](../../models/operations/UpdateRFPRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[UpdateRFPResponse](../../models/operations/UpdateRFPResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## submitRFP

Submits an existing RFP. Transitions the RFP from draft status to active or pending status based on whether the RFP approval process is enabled.

### Example Usage

<!-- UsageSnippet language="java" operationID="submitRFP" method="post" path="/rfps/{rfpId}/submit" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.SubmitRFPRequest;
import com.cvent.models.operations.SubmitRFPResponse;
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

        SubmitRFPRequest req = SubmitRFPRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        SubmitRFPResponse res = sdk.rfpManagement().submitRFP()
                .request(req)
                .call();

        if (res.rfpWithStatus().isPresent()) {
            System.out.println(res.rfpWithStatus().get());
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [SubmitRFPRequest](../../models/operations/SubmitRFPRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[SubmitRFPResponse](../../models/operations/SubmitRFPResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |