# Lead

Lead with an ID.

## Example Usage

```typescript
import { Lead } from "@cvent/sdk/models/components";

let value: Lead = {
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
  email: "h.potterfield@example.com",
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
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `event`                                                                                       | [components.Event4](../../models/components/event4.md)                                        | :heavy_minus_sign:                                                                            | Associated event.                                                                             |                                                                                               |
| `exhibitor`                                                                                   | [components.Exhibitor](../../models/components/exhibitor.md)                                  | :heavy_minus_sign:                                                                            | Associated exhibitor.                                                                         |                                                                                               |
| `attendee`                                                                                    | [components.Attendee13](../../models/components/attendee13.md)                                | :heavy_minus_sign:                                                                            | Attendee of the lead.                                                                         |                                                                                               |
| `boothStaff`                                                                                  | [components.BoothStaff](../../models/components/boothstaff.md)                                | :heavy_minus_sign:                                                                            | Booth staff member of the lead.                                                               |                                                                                               |
| `device`                                                                                      | [components.Device](../../models/components/device.md)                                        | :heavy_minus_sign:                                                                            | Device that captured the lead.                                                                |                                                                                               |
| `appointment`                                                                                 | [components.Appointment1](../../models/components/appointment1.md)                            | :heavy_minus_sign:                                                                            | Appointment of the lead.                                                                      |                                                                                               |
| `title`                                                                                       | *string*                                                                                      | :heavy_minus_sign:                                                                            | Title of the lead.                                                                            | Mr.                                                                                           |
| `firstName`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | First name of the lead.                                                                       | Henry                                                                                         |
| `lastName`                                                                                    | *string*                                                                                      | :heavy_minus_sign:                                                                            | Last name of the lead.                                                                        | Potterfield                                                                                   |
| `email`                                                                                       | *string*                                                                                      | :heavy_minus_sign:                                                                            | Email address of the lead.                                                                    | h.potterfield@example.com                                                                     |
| `company`                                                                                     | *string*                                                                                      | :heavy_minus_sign:                                                                            | Company or organization of the lead.                                                          | Cvent Inc                                                                                     |
| `mobilePhone`                                                                                 | *string*                                                                                      | :heavy_minus_sign:                                                                            | Mobile phone number of the lead.                                                              | 555-555-5555                                                                                  |
| `homeAddress`                                                                                 | [components.Address11](../../models/components/address11.md)                                  | :heavy_minus_sign:                                                                            | Address of the lead.                                                                          |                                                                                               |
| `homePhone`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | Home phone number of the lead.                                                                | 555-555-5555                                                                                  |
| `workAddress`                                                                                 | [components.Address11](../../models/components/address11.md)                                  | :heavy_minus_sign:                                                                            | Address of the lead.                                                                          |                                                                                               |
| `workPhone`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | Work phone number of the lead.                                                                | 555-555-5555                                                                                  |
| `type`                                                                                        | [components.LeadType](../../models/components/leadtype.md)                                    | :heavy_minus_sign:                                                                            | Type of the lead.                                                                             |                                                                                               |
| `application`                                                                                 | [components.Application](../../models/components/application.md)                              | :heavy_minus_sign:                                                                            | Application that captured the lead.                                                           |                                                                                               |
| `source`                                                                                      | [components.Source](../../models/components/source.md)                                        | :heavy_minus_sign:                                                                            | Source of the lead entry.                                                                     |                                                                                               |
| `deleted`                                                                                     | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates that the lead is deleted.                                                      |                                                                                               |
| `comments`                                                                                    | *string*                                                                                      | :heavy_minus_sign:                                                                            | Comments about the lead.                                                                      | I am interested in your product.                                                              |
| `licenseCode`                                                                                 | *string*                                                                                      | :heavy_minus_sign:                                                                            | License (access code) that captured the lead.                                                 | nag1248                                                                                       |
| `matched`                                                                                     | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates that the lead is matched.                                                      | true                                                                                          |
| `transcriptionStatus`                                                                         | [components.TranscriptionStatus](../../models/components/transcriptionstatus.md)              | :heavy_minus_sign:                                                                            | Status of the business card transcription.                                                    |                                                                                               |
| `qualified`                                                                                   | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates that the lead is qualified.                                                    | true                                                                                          |
| `additionalBadgekitFields`                                                                    | [components.AdditionalBadgekitFields](../../models/components/additionalbadgekitfields.md)    | :heavy_minus_sign:                                                                            | Map of the additional properties from the badgekit provider.                                  |                                                                                               |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | Lead ID.                                                                                      | cdd0d110-3a84-4bc5-a420-37c007716c73                                                          |