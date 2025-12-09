# LeadsPaginatedResponse

A paginated response of leads.

## Example Usage

```typescript
import { LeadsPaginatedResponse } from "@cvent/sdk/models/components";

let value: LeadsPaginatedResponse = {
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
      event: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
      exhibitor: {
        id: "4888db54-db22-11eb-8d19-0242ac130003",
      },
      attendee: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      boothStaff: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      device: {
        id: "EKEK993IF9F",
        name: "North Gate",
      },
      appointment: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      title: "Mr.",
      firstName: "Henry",
      lastName: "Potterfield",
      email: "h.potterfield@test.com",
      company: "Cvent Inc",
      mobilePhone: "555-555-5555",
      homeAddress: {
        address1: "Cvent Inc.",
        address2: "4001 West Parmer Lane",
        city: "Austin",
        region: "Texas",
        regionCode: "TX",
        postalCode: "78727",
        country: "United States of America",
        countryCode: "US",
      },
      homePhone: "555-555-5555",
      workAddress: {
        address1: "Cvent Inc.",
        address2: "4001 West Parmer Lane",
        city: "Austin",
        region: "Texas",
        regionCode: "TX",
        postalCode: "78727",
        country: "United States of America",
        countryCode: "US",
      },
      workPhone: "555-555-5555",
      comments: "I am interested in your product.",
      licenseCode: "nag1248",
      matched: true,
      qualified: true,
      id: "cdd0d110-3a84-4bc5-a420-37c007716c73",
    },
  ],
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `paging`                                                                     | [components.PagingJson](../../models/components/pagingjson.md)               | :heavy_minus_sign:                                                           | Represents pagination information for a collection of resources.             |
| `data`                                                                       | [components.ExistingLeadJson](../../models/components/existingleadjson.md)[] | :heavy_minus_sign:                                                           | Collection of leads.                                                         |