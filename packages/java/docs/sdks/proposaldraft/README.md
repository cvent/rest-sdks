# ProposalDraft

## Overview

Beta - All APIs are in Beta. Proposal Drafts are editable copies of proposals. This API allows you to edit proposal data privately before publishing.

### Available Operations

* [createProposalDraft](#createproposaldraft) - Beta - Create Proposal Draft

## createProposalDraft

Creates a new proposal draft.

### Example Usage

<!-- UsageSnippet language="java" operationID="createProposalDraft" method="post" path="/proposal-drafts" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateProposalDraftResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        ProposalRequest req = ProposalRequest.builder()
                .scpTemplateId("a633b01c-e461-4cc2-8c66-8ae036115658")
                .supplierSummary(SupplierSummaryJson.builder()
                    .supplier(VenueSummary.builder()
                        .build())
                    .build())
                .rfpSummary(RfpSummaryJson.builder()
                    .id("385b9a4c-3f00-4b67-99ca-8dddc82a95b5")
                    .build())
                .eventSummary(EventSummaryJson.builder()
                    .id("bedc1f8e-f68b-40cf-b901-487e407f637a")
                    .build())
                .statusSummary(StatusSummaryJson.builder()
                    .reason("Other")
                    .comment("Not as per requirement")
                    .build())
                .introduction("Let us design the day of your dreams at our property.")
                .commissionableBid(true)
                .commissionRate(10.12)
                .name("Proposal for Royal Bank of Spain.")
                .blockCode("ABDCFD-234535-3535")
                .proposalDates(List.of(
                    ProposalDateJson.builder()
                        .startDate(LocalDate.parse("2021-01-13"))
                        .endDate(LocalDate.parse("2021-01-13"))
                        .build()))
                .sleepingRooms(List.of(
                    SleepingRoomJson.builder()
                        .checkInDate(LocalDate.parse("2021-01-13"))
                        .checkOutDate(LocalDate.parse("2021-01-13"))
                        .peakRoomNights(2L)
                        .totalRoomNights(200L)
                        .lowestRate(140d)
                        .maximumRate(200d)
                        .lowestAverageDailyRate(140d)
                        .highestAverageDailyRate(200d)
                        .totalRoomCost(300d)
                        .budgetedRoomRate(135d)
                        .lowestAvailableRoomCount(10L)
                        .highestAvailableRoomCount(10L)
                        .notes("Premier Suite not available for the selected dates.")
                        .sleepingRoomBlocks(List.of(
                            SleepingRoomBlockJson.builder()
                                .date(LocalDate.parse("2021-01-13"))
                                .quantity(20L)
                                .rate(150d)
                                .build()))
                        .build()))
                .aggregatedCost(AggregatedCostJson.builder()
                    .totalFoodAndBeverageCost(396.56)
                    .totalMiscCost(644.96)
                    .build())
                .estimatedCost(EstimatedCostJson.builder()
                    .guestRoom(100d)
                    .meetingRoom(10d)
                    .foodAndBeverage(100d)
                    .foodAndBeverageMinimum(10d)
                    .notes("Estimated cost includes taxes.")
                    .build())
                .contacts(List.of(
                    ContactJson1.builder()
                        .firstName("Saurabh")
                        .lastName("Sachdeva")
                        .organizationWebsite("www.cvent.com")
                        .organization("Cvent")
                        .title("Co-founder")
                        .email("saurabhsachdeva@xyz.com")
                        .countryCode("1")
                        .phone("198752236")
                        .fax("2487234567")
                        .mobile("2487649053")
                        .streetAddress1("299 ABC Street")
                        .streetAddress2("Unit 1A")
                        .streetAddress3("Seattle, Washington")
                        .city("Seattle")
                        .postalCode("110079")
                        .notes("Available between 8am - 5pm.")
                        .build()))
                .plannerContacts(List.of(
                    ContactJson1.builder()
                        .firstName("Saurabh")
                        .lastName("Sachdeva")
                        .organizationWebsite("www.cvent.com")
                        .organization("Cvent")
                        .title("Co-founder")
                        .email("saurabhsachdeva@xyz.com")
                        .countryCode("1")
                        .phone("198752236")
                        .fax("2487234567")
                        .mobile("2487649053")
                        .streetAddress1("299 ABC Street")
                        .streetAddress2("Unit 1A")
                        .streetAddress3("Seattle, Washington")
                        .city("Seattle")
                        .postalCode("110079")
                        .notes("Available between 8am - 5pm.")
                        .build()))
                .meetingRoom(MeetingRoomJson.builder()
                    .notes("This meeting room has the best audio quality.")
                    .build())
                .build();

        CreateProposalDraftResponse res = sdk.proposalDraft().createProposalDraft()
                .request(req)
                .call();

        if (res.proposalResponse().isPresent()) {
            System.out.println(res.proposalResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [ProposalRequest](../../models/shared/ProposalRequest.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[CreateProposalDraftResponse](../../models/operations/CreateProposalDraftResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |