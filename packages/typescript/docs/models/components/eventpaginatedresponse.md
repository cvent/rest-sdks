# EventPaginatedResponse

Represents a paginated collection of event objects.

## Example Usage

```typescript
import { EventPaginatedResponse } from "@cvent/sdk/models/components";

let value: EventPaginatedResponse = {
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
      id: "9463c74e-18c6-401a-a710-ae0f485bf059",
      title: "Cvent Connect 2020",
      code: "R5NP4NJYB3D",
      format: "Virtual",
      description: "Cvent annual user conference.",
      start: new Date("2020-02-03T13:00:00.000Z"),
      end: new Date("2020-02-07T17:00:00.000Z"),
      closeAfter: new Date("2020-02-01T23:59:00.000Z"),
      archiveAfter: new Date("2020-05-07T12:00:00.000Z"),
      launchAfter: new Date("2020-01-07T12:00:00.000Z"),
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
      note: "This event will need some coordination with external systems.",
      defaultLocale: "en-US",
      languages: [
        "en-US",
      ],
      currency: "USD",
      registrationSecurityLevel: "Private",
      status: "Pending",
      eventStatus: "Upcoming",
      planningStatus: "Submitted",
      testMode: false,
      capacity: 50,
      planners: [
        {
          prefix: "Dr.",
          firstName: "Henry",
          lastName: "Smith",
          company: "Cvent Inc",
          title: "Event Planner",
          email: "hsmith@example.com",
          deleted: false,
        },
      ],
      stakeholders: [
        {
          firstName: "Henry",
          lastName: "Potterfield",
          company: "Cvent Inc",
          title: "Event stakeholder",
          email: "stakeholderemail@test.com",
          workPhone: "555-555-5555",
          homePhone: "555-555-5555",
          mobilePhone: "555-555-5555",
          deleted: false,
        },
      ],
      customFields: [
        {
          id: "a3572698-a615-4f55-a7a1-b30b588e81fa",
          name: "What is your favorite color?",
          value: [
            "Choice C",
            "Choice A",
          ],
          order: 1,
          type: "MultiSelect",
        },
      ],
      type: "Conference",
      links: {
        invitation: {
          href: "https://cvent.com",
        },
        agenda: {
          href: "https://cvent.com",
        },
        summary: {
          href: "https://cvent.com",
        },
        registration: {
          href: "https://cvent.com",
        },
      },
      created: new Date("2017-01-02T02:00:00Z"),
      lastModified: new Date("2019-02-12T03:00:00Z"),
      meetingRequestId: "b566c24e-12a8-452d-c490-ad0e796be093",
      createdBy: "John Doe",
      lastModifiedBy: "Jane Doe",
    },
  ],
};
```

## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [components.PagingJson](../../models/components/pagingjson.md)   | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | [components.Event](../../models/components/event.md)[]           | :heavy_check_mark:                                               | A collection of event objects.                                   |