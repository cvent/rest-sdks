# TravelProposalBid

A travel proposal bid erate plan that is being proposed to a customer.

## Example Usage

```typescript
import { TravelProposalBid } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: TravelProposalBid = {
  travelProposal: {
    id: "a91187db-d3c2-4035-b696-1d77fb1ab9d8",
  },
  id: "3e2a8614-7d52-442e-8c4f-a6a18ed9ac4d",
  name: "My Corporate Bid",
  rate: {
    level: "corporate",
    planCode: "rp123",
    tier: "tier1",
  },
  marketCode: "mc12",
  currencyCode: "USD",
  weekendDays: [
    "Sunday",
  ],
  internalNote: "",
  comments: [
    {
      commentType: "promotions",
      comment: "This is a high value client.",
    },
  ],
  roomTypes: [
    {
      propertyRoom: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      allocation: 10,
      order: 1,
      status: "requested",
    },
  ],
  seasons: [
    {
      name: "Season 1",
      startDate: new RFCDate("2021-07-13"),
      endDate: new RFCDate("2021-07-13"),
      releasePeriod: 1,
      weekendReleasePeriod: 2,
      rates: [
        {
          propertyRoom: {
            id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          },
          singleRate: 100,
          doubleRate: 101,
          tripleRate: 102,
          quadRate: 103,
          nlraSingleRate: 104,
          nlraDoubleRate: 105,
          allotment: 100,
          status: "requested",
        },
      ],
      weekendRates: [
        {
          propertyRoom: {
            id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          },
          singleRate: 100,
          doubleRate: 101,
          tripleRate: 102,
          quadRate: 103,
          nlraSingleRate: 104,
          nlraDoubleRate: 105,
          allotment: 100,
          status: "requested",
        },
      ],
      status: "requested",
    },
  ],
  discounts: [
    {
      propertyRoom: {
        id: "9ea95519-2fc5-49d8-991b-e954f49044fe",
      },
      discount: 10,
      status: "requested",
    },
  ],
  fairSeasons: [
    {
      name: "Fair season 1",
      startDate: new RFCDate("2021-07-13"),
      endDate: new RFCDate("2021-07-13"),
      minLengthOfStay: 1,
      releasePeriod: 1,
      rates: [
        {
          propertyRoom: {
            id: "9ea95519-2fc5-49d8-991b-e954f49044fe",
          },
          singleRate: 100,
          doubleRate: 101,
          tripleRate: 102,
          quadRate: 103,
          allotment: 100,
          status: "requested",
        },
      ],
      status: "requested",
    },
  ],
  amenities: [
    {
      type: "amenity",
      code: "parking_valet",
      category: "Parking",
      price: 100,
      discountAmount: 90,
      internalCost: 80,
      description: "Valet parking is available for all guests.",
      status: "requested",
    },
  ],
  policies: [
    {
      code: "cancellation_period",
      category: "cancellation_period",
      value: "24h",
      description: "The cancellation period is 24 hours.",
      status: "requested",
    },
  ],
  taxesAndFees: [
    {
      code: "city_tax",
      amount: 20,
      notes: "This is a tax",
      status: "requested",
    },
  ],
};
```

## Fields

| Field                                                                                                                                      | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                | Example                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `travelProposal`                                                                                                                           | [components.TravelProposalBidTravelProposal](../../models/components/travelproposalbidtravelproposal.md)                                   | :heavy_minus_sign:                                                                                                                         | The travel proposal that the bid belongs to.                                                                                               |                                                                                                                                            |
| `id`                                                                                                                                       | *string*                                                                                                                                   | :heavy_minus_sign:                                                                                                                         | The unique ID of the bid.                                                                                                                  | 3e2a8614-7d52-442e-8c4f-a6a18ed9ac4d                                                                                                       |
| `stayType`                                                                                                                                 | [components.BidStayTypeJson](../../models/components/bidstaytypejson.md)                                                                   | :heavy_minus_sign:                                                                                                                         | Bid stay type.                                                                                                                             |                                                                                                                                            |
| `order`                                                                                                                                    | *number*                                                                                                                                   | :heavy_minus_sign:                                                                                                                         | The order of the bid compared to other bids of the same stay type. This is used to distinguish between extended stay 1 vs extended stay 2. | 1                                                                                                                                          |
| `status`                                                                                                                                   | [components.BidStatusTypeJson](../../models/components/bidstatustypejson.md)                                                               | :heavy_minus_sign:                                                                                                                         | Bid stay type.                                                                                                                             |                                                                                                                                            |
| `name`                                                                                                                                     | *string*                                                                                                                                   | :heavy_minus_sign:                                                                                                                         | Name given to the bid.                                                                                                                     | My Corporate Bid                                                                                                                           |
| `rate`                                                                                                                                     | [components.TravelBidRateJson](../../models/components/travelbidratejson.md)                                                               | :heavy_minus_sign:                                                                                                                         | The rate (cost) information for a travel bid.                                                                                              |                                                                                                                                            |
| `marketCode`                                                                                                                               | *string*                                                                                                                                   | :heavy_minus_sign:                                                                                                                         | The market code given to the rate plan / bid by the supplier.                                                                              | mc12                                                                                                                                       |
| `currencyCode`                                                                                                                             | *string*                                                                                                                                   | :heavy_minus_sign:                                                                                                                         | The ISO 4217 currency code used for the rates and other monetary values in the bid.                                                        | USD                                                                                                                                        |
| `weekendDays`                                                                                                                              | [components.TravelBidWeekendDayJson](../../models/components/travelbidweekenddayjson.md)[]                                                 | :heavy_minus_sign:                                                                                                                         | Days of the week that are considered weekend days, to apply weekend rates. Does not apply when format is GBTA2013.                         |                                                                                                                                            |
| `lra`                                                                                                                                      | *boolean*                                                                                                                                  | :heavy_minus_sign:                                                                                                                         | Does the bid include LRA (Last Room Availability) rates?                                                                                   |                                                                                                                                            |
| `nlra`                                                                                                                                     | *boolean*                                                                                                                                  | :heavy_minus_sign:                                                                                                                         | Does the bid include non-LRA rates?                                                                                                        |                                                                                                                                            |
| `fairDateLra`                                                                                                                              | *boolean*                                                                                                                                  | :heavy_minus_sign:                                                                                                                         | Are the fair date rates LRA (Last Room Availability)?                                                                                      |                                                                                                                                            |
| `internalNote`                                                                                                                             | *string*                                                                                                                                   | :heavy_minus_sign:                                                                                                                         | Additional comments passed from the domain-level rate plan.                                                                                |                                                                                                                                            |
| `comments`                                                                                                                                 | [components.TravelBidCommentJson](../../models/components/travelbidcommentjson.md)[]                                                       | :heavy_minus_sign:                                                                                                                         | Additional Info                                                                                                                            |                                                                                                                                            |
| `roomTypes`                                                                                                                                | [components.TravelBidRoomJson](../../models/components/travelbidroomjson.md)[]                                                             | :heavy_minus_sign:                                                                                                                         | Room Types associated with the bid                                                                                                         |                                                                                                                                            |
| `seasons`                                                                                                                                  | [components.TravelBidSeasonJson](../../models/components/travelbidseasonjson.md)[]                                                         | :heavy_minus_sign:                                                                                                                         | Seasons associated with the bid                                                                                                            |                                                                                                                                            |
| `discounts`                                                                                                                                | [components.TravelBidDiscountJson](../../models/components/travelbiddiscountjson.md)[]                                                     | :heavy_minus_sign:                                                                                                                         | Dynamic discounts associated with the bid                                                                                                  |                                                                                                                                            |
| `fairSeasons`                                                                                                                              | [components.TravelBidFairSeasonJson](../../models/components/travelbidfairseasonjson.md)[]                                                 | :heavy_minus_sign:                                                                                                                         | Fair seasons associated with the bid                                                                                                       |                                                                                                                                            |
| `amenities`                                                                                                                                | [components.TravelBidAmenityJson](../../models/components/travelbidamenityjson.md)[]                                                       | :heavy_minus_sign:                                                                                                                         | Amenities associated with the bid                                                                                                          |                                                                                                                                            |
| `policies`                                                                                                                                 | [components.TravelBidPolicyJson](../../models/components/travelbidpolicyjson.md)[]                                                         | :heavy_minus_sign:                                                                                                                         | Policies associated with the bid                                                                                                           |                                                                                                                                            |
| `taxesAndFees`                                                                                                                             | [components.TravelBidTaxFeeJson](../../models/components/travelbidtaxfeejson.md)[]                                                         | :heavy_minus_sign:                                                                                                                         | Taxes & fees associated with the bid                                                                                                       |                                                                                                                                            |