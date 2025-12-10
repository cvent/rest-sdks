# ExistingLeadJson

A JSON Schema file for Lead.

## Example Usage

```typescript
import { ExistingLeadJson } from "@cvent/sdk/models/components";

let value: ExistingLeadJson = {
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
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `event`                                                                                       | [components.EventJson5](../../models/components/eventjson5.md)                                | :heavy_minus_sign:                                                                            | The Associated Event.                                                                         |                                                                                               |
| `exhibitor`                                                                                   | [components.ExhibitorJson](../../models/components/exhibitorjson.md)                          | :heavy_minus_sign:                                                                            | The Associated Exhibitor.                                                                     |                                                                                               |
| `attendee`                                                                                    | [components.LeadAttendeeJson](../../models/components/leadattendeejson.md)                    | :heavy_minus_sign:                                                                            | A JSON schema representing the Attendee object                                                |                                                                                               |
| `boothStaff`                                                                                  | [components.LeadBoothStaffJson](../../models/components/leadboothstaffjson.md)                | :heavy_minus_sign:                                                                            | A JSON schema representing Booth Staff entity                                                 |                                                                                               |
| `device`                                                                                      | [components.LeadDeviceJson](../../models/components/leaddevicejson.md)                        | :heavy_minus_sign:                                                                            | A JSON object representing an electronic device used to capture leads.                        |                                                                                               |
| `appointment`                                                                                 | [components.LeadAppointmentJson](../../models/components/leadappointmentjson.md)              | :heavy_minus_sign:                                                                            | A JSON schema representing the structure of an appointment object.                            |                                                                                               |
| `title`                                                                                       | *string*                                                                                      | :heavy_minus_sign:                                                                            | The title of the lead                                                                         | Mr.                                                                                           |
| `firstName`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The first name of the lead                                                                    | Henry                                                                                         |
| `lastName`                                                                                    | *string*                                                                                      | :heavy_minus_sign:                                                                            | The last name of the lead                                                                     | Potterfield                                                                                   |
| `email`                                                                                       | *string*                                                                                      | :heavy_minus_sign:                                                                            | The email address of the lead                                                                 | h.potterfield@test.com                                                                        |
| `company`                                                                                     | *string*                                                                                      | :heavy_minus_sign:                                                                            | The company/organization the lead belongs to.                                                 | Cvent Inc                                                                                     |
| `mobilePhone`                                                                                 | *string*                                                                                      | :heavy_minus_sign:                                                                            | Mobile phone number of the lead                                                               | 555-555-5555                                                                                  |
| `homeAddress`                                                                                 | [components.LeadAddressJson](../../models/components/leadaddressjson.md)                      | :heavy_minus_sign:                                                                            | Schema for address information                                                                |                                                                                               |
| `homePhone`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | Home phone number of the lead                                                                 | 555-555-5555                                                                                  |
| `workAddress`                                                                                 | [components.LeadAddressJson](../../models/components/leadaddressjson.md)                      | :heavy_minus_sign:                                                                            | Schema for address information                                                                |                                                                                               |
| `workPhone`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | Work Phone number of the lead                                                                 | 555-555-5555                                                                                  |
| `type`                                                                                        | [components.ExistingLeadJsonType](../../models/components/existingleadjsontype.md)            | :heavy_minus_sign:                                                                            | The type of lead.                                                                             |                                                                                               |
| `application`                                                                                 | [components.Application](../../models/components/application.md)                              | :heavy_minus_sign:                                                                            | The application used to capture lead.                                                         |                                                                                               |
| `source`                                                                                      | [components.Source](../../models/components/source.md)                                        | :heavy_minus_sign:                                                                            | The source of entry for the lead                                                              |                                                                                               |
| `deleted`                                                                                     | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | A boolean indicating whether a lead is deleted or not                                         |                                                                                               |
| `comments`                                                                                    | *string*                                                                                      | :heavy_minus_sign:                                                                            | Comments about the lead                                                                       | I am interested in your product.                                                              |
| `licenseCode`                                                                                 | *string*                                                                                      | :heavy_minus_sign:                                                                            | License (access code) that was used to capture the lead                                       | nag1248                                                                                       |
| `matched`                                                                                     | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | A boolean indicating whether the lead is matched or not                                       | true                                                                                          |
| `transcriptionStatus`                                                                         | [components.TranscriptionStatus](../../models/components/transcriptionstatus.md)              | :heavy_minus_sign:                                                                            | Current status of business card transcription                                                 |                                                                                               |
| `qualified`                                                                                   | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | A boolean indicating whether a lead is qualified or not                                       | true                                                                                          |
| `additionalBadgekitFields`                                                                    | [components.AdditionalBadgekitFields](../../models/components/additionalbadgekitfields.md)    | :heavy_minus_sign:                                                                            | Map containing extra properties from badgekit provider                                        |                                                                                               |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | ID of Lead.                                                                                   | cdd0d110-3a84-4bc5-a420-37c007716c73                                                          |