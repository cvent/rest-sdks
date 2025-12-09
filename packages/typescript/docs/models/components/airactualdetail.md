# AirActualDetail

The response from a request to get the list of air actual for the attendees.  This includes the paging object as well as the collection of air actual details.

## Example Usage

```typescript
import { AirActualDetail } from "@cvent/sdk/models/components";

let value: AirActualDetail = {
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
      airActualDetails: [
        {
          created: new Date("2017-01-02T02:00:00Z"),
          createdBy: "hporter",
          lastModified: new Date("2019-02-12T03:00:00Z"),
          lastModifiedBy: "hporter",
          airActualId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          requesterId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          status: "SUBMITTED",
          requesterType: "Contact",
          name: "John Doe",
          confirmationNumber: "123-456-XYZ",
          totalAmount: 500,
          currencyCode: "USD",
          note: "Additional note here.",
          recordLocatorGDS: "ABC123",
          noteGDS: "GDS note.",
          flightDetail: [
            {
              airline: "Emirates",
              flightNumber: "EK 516",
              origin: "Delhi - Indira Gandhi Intl - (DEL)",
              originCode: "DEL",
              destination: "New York - John F Kennedy Intl - (JFK)",
              destinationCode: "JFK",
              departing: new Date("2023-05-19T00:00:00"),
              arriving: new Date("2023-05-19T00:00:00"),
              seatNumber: "21A",
              ticketClass: "coach",
              flightConfirmationNumber: "123-456-XYZ",
              flightGDSRecordLocator: "ABC123",
              journeySegment: "LeavingEvent",
            },
          ],
          airActualAnswers: [
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
};
```

## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `paging`                                                                                           | [components.PagingJson](../../models/components/pagingjson.md)                                     | :heavy_check_mark:                                                                                 | Represents pagination information for a collection of resources.                                   |
| `data`                                                                                             | [components.AirActualDetailResponseJson](../../models/components/airactualdetailresponsejson.md)[] | :heavy_check_mark:                                                                                 | Collection of air actuals for attendees.                                                           |