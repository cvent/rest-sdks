# ListTravelProposalBidsResponse

## Example Usage

```typescript
import { ListTravelProposalBidsResponse } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: ListTravelProposalBidsResponse = {
  result: {
    paging: {
      previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
      nextToken: "1a2b3c4d5e6f7g8h9i10j11k",
      currentToken: "1a2b3c4d5e6f7g8h9i10j11k",
      limit: 100,
      totalCount: 2,
      links: {
        next: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        self: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        prev: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
      },
    },
    data: [
      {
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
      },
    ],
  },
};
```

## Fields

| Field                                                                                                          | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `result`                                                                                                       | [components.TravelProposalBidPaginatedResponse](../../models/components/travelproposalbidpaginatedresponse.md) | :heavy_check_mark:                                                                                             | N/A                                                                                                            |