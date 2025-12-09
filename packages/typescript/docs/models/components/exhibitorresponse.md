# ExhibitorResponse

JSON schema for the exhibitor object

## Example Usage

```typescript
import { ExhibitorResponse } from "@cvent/sdk/models/components";

let value: ExhibitorResponse = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
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
  id: "4888db54-db22-11eb-8d19-0242ac130003",
  profileLogoId: "31bd3ae1-0dc3-487b-953e-41d6bbade7d2",
  profileLogoUrl: "https://images.cvent.com/pt/fileLocation/url_123",
  bannerId: "12ca3ae2-0dc3-487b-953e-86d6acadf7d5",
  bannerUrl: "https://images.cvent.com/pt/fileLocation/url_456",
};
```

## Fields

| Field                                                                                                   | Type                                                                                                    | Required                                                                                                | Description                                                                                             | Example                                                                                                 |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `created`                                                                                               | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)           | :heavy_minus_sign:                                                                                      | The ISO 8601 zoned date time when this record was created.                                              | 2017-01-02T02:00:00Z                                                                                    |
| `createdBy`                                                                                             | *string*                                                                                                | :heavy_minus_sign:                                                                                      | The identifier of the user that created this record.                                                    | hporter                                                                                                 |
| `lastModified`                                                                                          | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)           | :heavy_minus_sign:                                                                                      | The ISO 8601 zoned date time when this record was updated.                                              | 2019-02-12T03:00:00Z                                                                                    |
| `lastModifiedBy`                                                                                        | *string*                                                                                                | :heavy_minus_sign:                                                                                      | The identifier of the user that last updated this record.                                               | hporter                                                                                                 |
| `event`                                                                                                 | [components.EventJson5](../../models/components/eventjson5.md)                                          | :heavy_check_mark:                                                                                      | The Associated Event.                                                                                   |                                                                                                         |
| `name`                                                                                                  | *string*                                                                                                | :heavy_check_mark:                                                                                      | Name of the exhibitor. Cvent suggests limiting this to a maximum of 200 characters for optimal results. | Potterfield Harry                                                                                       |
| `description`                                                                                           | *string*                                                                                                | :heavy_minus_sign:                                                                                      | Exhibitor description                                                                                   | A man who sells relatively good hotdogs                                                                 |
| `code`                                                                                                  | *string*                                                                                                | :heavy_minus_sign:                                                                                      | Code used to identify the exhibitor                                                                     | abc123                                                                                                  |
| `sourceId`                                                                                              | *string*                                                                                                | :heavy_minus_sign:                                                                                      | Code used for marketing groupings                                                                       | software                                                                                                |
| `location`                                                                                              | *string*                                                                                                | :heavy_minus_sign:                                                                                      | Exhibitor location                                                                                      | Taj Mahal                                                                                               |
| `address`                                                                                               | [components.ExhibitorAddressJson](../../models/components/exhibitoraddressjson.md)                      | :heavy_minus_sign:                                                                                      | An object representing an address with various properties.                                              |                                                                                                         |
| `email`                                                                                                 | *string*                                                                                                | :heavy_minus_sign:                                                                                      | Email address of the exhibitor                                                                          | h.potterfield@test.com                                                                                  |
| `mobilePhone`                                                                                           | *string*                                                                                                | :heavy_minus_sign:                                                                                      | Mobile Phone of the exhibitor                                                                           | 555-555-5555                                                                                            |
| `workPhone`                                                                                             | *string*                                                                                                | :heavy_minus_sign:                                                                                      | Work Phone of the exhibitor                                                                             | 555-555-5555                                                                                            |
| `otherPhone`                                                                                            | *string*                                                                                                | :heavy_minus_sign:                                                                                      | Any other phone of the exhibitor                                                                        | 555-555-5555                                                                                            |
| `website`                                                                                               | *string*                                                                                                | :heavy_minus_sign:                                                                                      | Exhibitor's website URL                                                                                 | www.superhappyfuntime.com                                                                               |
| `contactLinks`                                                                                          | [components.ContactLinksJson2](../../models/components/contactlinksjson2.md)                            | :heavy_minus_sign:                                                                                      | A JSON schema representing contact links, including Twitter, Facebook, and LinkedIn URLs.               |                                                                                                         |
| `deleted`                                                                                               | *boolean*                                                                                               | :heavy_minus_sign:                                                                                      | A boolean indicating whether the exhibitor is deleted or not                                            |                                                                                                         |
| `hidden`                                                                                                | *boolean*                                                                                               | :heavy_minus_sign:                                                                                      | True indicates that the exhibitor is hidden.                                                            |                                                                                                         |
| `eventSponsor`                                                                                          | *boolean*                                                                                               | :heavy_minus_sign:                                                                                      | A boolean indicating whether the exhibitor is an event sponsor or not                                   |                                                                                                         |
| `featured`                                                                                              | *boolean*                                                                                               | :heavy_minus_sign:                                                                                      | A boolean indicating whether the exhibitor is designated as featured or not                             |                                                                                                         |
| `sponsorshipLevel`                                                                                      | [components.SponsorshipLevelJson](../../models/components/sponsorshipleveljson.md)                      | :heavy_minus_sign:                                                                                      | Associated sponsorship level for an exhibitor                                                           |                                                                                                         |
| `id`                                                                                                    | *string*                                                                                                | :heavy_minus_sign:                                                                                      | ID of an exhibitor.                                                                                     | 4888db54-db22-11eb-8d19-0242ac130003                                                                    |
| `profileLogoId`                                                                                         | *string*                                                                                                | :heavy_minus_sign:                                                                                      | File ID for exhibitor profile logo.                                                                     | 31bd3ae1-0dc3-487b-953e-41d6bbade7d2                                                                    |
| `profileLogoUrl`                                                                                        | *string*                                                                                                | :heavy_minus_sign:                                                                                      | URL for exhibitor profile logo.                                                                         | https://images.cvent.com/pt/fileLocation/url_123                                                        |
| `bannerId`                                                                                              | *string*                                                                                                | :heavy_minus_sign:                                                                                      | File ID for exhibitor banner.                                                                           | 12ca3ae2-0dc3-487b-953e-86d6acadf7d5                                                                    |
| `bannerUrl`                                                                                             | *string*                                                                                                | :heavy_minus_sign:                                                                                      | URL for exhibitor banner.                                                                               | https://images.cvent.com/pt/fileLocation/url_456                                                        |