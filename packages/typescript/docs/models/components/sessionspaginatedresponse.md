# SessionsPaginatedResponse

A paginated response of session objects.

## Example Usage

```typescript
import { SessionsPaginatedResponse } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: SessionsPaginatedResponse = {
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
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      virtual: true,
      event: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      title: "Day 1 Keynote Session",
      code: "R5NP4NJYB3D",
      category: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        name: "Sample Object name",
      },
      type: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        code: "MU",
        name: "Meet up",
      },
      location: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        code: "ConfA",
        name: "Conference Room A",
      },
      description:
        "Keynote session to kick off the event. The dynamic and energetic Dr. Smith will be speaking about the industry.",
      start: new Date("2020-02-03T13:00:00.000Z"),
      end: new Date("2020-02-07T17:00:00.000Z"),
      status: "Active",
      automaticallyOpensOn: new RFCDate("2022-08-01"),
      automaticallyClosesOn: new RFCDate("2022-08-12"),
      enableWaitlist: false,
      waitlistCapacity: 100,
      enableWaitlistVirtual: true,
      capacity: 150,
      capacityUnlimited: false,
      capacityVirtual: 150,
      virtualCapacityUnlimited: false,
      waitlistCapacityVirtual: 150,
      featured: true,
      group: "b0cd3bac-0565-4593-be6e-5333753a6c25",
      admissionItems: [
        "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      ],
      openForRegistration: false,
      openForAttendeeHub: true,
      registrationTypes: [
        "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      ],
      presentationType: "Power Point",
      dataTagCode: "Optional Session",
      customFields: [
        {
          id: "00cb1a18-dd09-4db4-8c7b-2607f5a61812",
          name: "What is your favorite color?",
          value: [
            "Choice C",
            "Choice A",
          ],
          order: 1,
          type: "MultiSelect",
        },
      ],
      segments: [
        "788426ac-5d83-11ee-8c99-0242ac120002",
      ],
      order: 1,
      includedSession: true,
      relevance: 2.3,
    },
  ],
};
```

## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [components.PagingJson](../../models/components/pagingjson.md)   | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | [components.Session](../../models/components/session.md)[]       | :heavy_check_mark:                                               | Collection of sessions.                                          |