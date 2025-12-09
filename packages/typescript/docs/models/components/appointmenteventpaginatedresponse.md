# AppointmentEventPaginatedResponse

The response from a request to get the list of appointment events, includes the paging object.

## Example Usage

```typescript
import { AppointmentEventPaginatedResponse } from "@cvent/sdk/models/components";

let value: AppointmentEventPaginatedResponse = {
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
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
      id: "2d8234f1-55df-483c-abe3-7e2cb98f8275",
      code: "GKNNHYW9GFV",
      event: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      apptEventType: "STANDARD",
      status: "ACTIVE",
      deleted: false,
      archived: true,
      defaultLocale: "en-US",
      title: "Cvent Connect 2020",
      description: "The Cvent yearly user conference.",
      start: new Date("2019-06-29T17:00:00.000Z"),
      end: new Date("2019-06-29T21:00:00.000Z"),
      timezone: "America/New_York",
      venues: [
        {
          name: "Capital Convention Center",
          address: {
            address1: "Cvent Inc.",
            address2: "4001 West Parmer Lane",
            address3: "PO Box 123",
            city: "Austin",
            countryCode: "US",
            postalCode: "78727",
            region: "Texas",
            regionCode: "TX",
            country: "United States of America",
            latitude: 30.42501,
            longitude: -97.71518,
          },
        },
      ],
      phone: "555-555-5555",
      planners: [
        {
          firstName: "Henry",
          lastName: "Potterfield",
          email: "h.potterfield@test.com",
          company: "Cvent Inc.",
          title: "Event Planner",
          prefix: "Mr.",
        },
      ],
    },
  ],
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `paging`                                                                     | [components.PagingJson](../../models/components/pagingjson.md)               | :heavy_check_mark:                                                           | Represents pagination information for a collection of resources.             |
| `data`                                                                       | [components.AppointmentEvent](../../models/components/appointmentevent.md)[] | :heavy_check_mark:                                                           | Collection of appointment events and their related details.                  |