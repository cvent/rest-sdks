# GetAirRequestsResponse

## Example Usage

```typescript
import { GetAirRequestsResponse } from "@cvent/sdk/models/operations";

let value: GetAirRequestsResponse = {
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
        attendee: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        airRequestDetails: [
          {
            created: new Date("2017-01-02T02:00:00Z"),
            createdBy: "hporter",
            lastModified: new Date("2019-02-12T03:00:00Z"),
            lastModifiedBy: "hporter",
            airRequestId: "3b2359a7-4583-40ed-8afd-67e5f15373d3",
            requesterId: "3b2359a7-4583-40ed-8afd-67e5f15373d3",
            requesterType: "Contact",
            requesterFirstName: "John",
            requesterMiddleName: "Frances",
            requesterLastName: "Doe",
            requesterSuffix: "Jr.",
            fullName: "John Doe",
            redressNumber: "1234567",
            knownTravelerNumber: "1234567",
            outgoingLeg: {
              origin: "Delhi - Indira Gandhi Intl - (DEL)",
              destination: "Dubai - International (DXB)",
              date: new Date("2023-05-19T00:00:00"),
              time: "Morning",
            },
            incomingLeg: {
              origin: "Delhi - Indira Gandhi Intl - (DEL)",
              destination: "Dubai - International (DXB)",
              date: new Date("2023-05-19T00:00:00"),
              time: "Morning",
            },
            ticketType: "Economy/Coach",
            foodPreference: "Please provide vegetarian meal.",
            specialRequest: "Please provide blanket",
            airlinePreference: [
              {
                airlineName: "Emirates",
                rewardsCode: "REWARDS_ONE",
              },
            ],
            ageCategory: "Adult",
            status: "SUBMITTED",
            dateOfBirth: "1980-03-04",
            gender: "Male",
            plannerMemo: "Some planner related text.",
            airRequestAnswers: [
              {
                question: {
                  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
                },
                value: [
                  "1234",
                ],
              },
            ],
          },
        ],
      },
    ],
  },
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `result`                                                                           | [components.AirReservationDetail](../../models/components/airreservationdetail.md) | :heavy_check_mark:                                                                 | N/A                                                                                |