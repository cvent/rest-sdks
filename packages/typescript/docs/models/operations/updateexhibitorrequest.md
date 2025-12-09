# UpdateExhibitorRequest

## Example Usage

```typescript
import { UpdateExhibitorRequest } from "@cvent/sdk/models/operations";

let value: UpdateExhibitorRequest = {
  id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  exhibitorRequest: {
    event: {
      id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    },
    name: "Potterfield Harry",
    description: "A man who sells relatively good hotdogs",
    code: "abc123",
    sourceId: "software",
    location: "Taj Mahal",
    address: {
      address1: "Cvent Inc.",
      address2: "4001 West Parmer Lane",
      city: "Austin",
      region: "Texas",
      postalCode: "78727",
      country: "United States of America",
    },
    email: "h.potterfield@test.com",
    mobilePhone: "555-555-5555",
    workPhone: "555-555-5555",
    otherPhone: "555-555-5555",
    website: "www.superhappyfuntime.com",
    contactLinks: {
      twitterUrl: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      facebookUrl: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      linkedInUrl: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      instagramUrl: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
    },
    sponsorshipLevel: {
      id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    },
  },
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                | Example                                                                    |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `id`                                                                       | *string*                                                                   | :heavy_check_mark:                                                         | ID of an event.                                                            | 3db28cfc-db22-11eb-8d19-0242ac130003                                       |
| `exhibitorId`                                                              | *string*                                                                   | :heavy_check_mark:                                                         | ID of an exhibitor.                                                        | 4888db54-db22-11eb-8d19-0242ac130003                                       |
| `exhibitorRequest`                                                         | [components.ExhibitorRequest](../../models/components/exhibitorrequest.md) | :heavy_check_mark:                                                         | Exhibitor details                                                          |                                                                            |