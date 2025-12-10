# UpdateContactByIdRequest

## Example Usage

```typescript
import { UpdateContactByIdRequest } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: UpdateContactByIdRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  contactUpdate: {
    firstName: "Henry",
    lastName: "Potterfield",
    middleName: "A",
    nickname: "Harry",
    email: "h.potterfield@test.com",
    ccEmail: "h.porter@tesing.com",
    gender: "Male",
    company: "Cvent Inc.",
    designation: "CPA",
    title: "Event Planner",
    type: {
      id: "861B51EC-AA7E-475F-B38D-4C8E35C47D63",
    },
    primaryAddressType: "Home",
    homeAddress: {
      address1: "Cvent Inc.",
      address2: "4001 West Parmer Lane",
      address3: "PO Box 123",
      city: "Austin",
      countryCode: "US",
      postalCode: "78727",
      regionCode: "TX",
    },
    homePhone: "555-555-5555",
    homeFax: "555-555-5555",
    workAddress: {
      address1: "Cvent Inc.",
      address2: "4001 West Parmer Lane",
      address3: "PO Box 123",
      city: "Austin",
      countryCode: "US",
      postalCode: "78727",
      regionCode: "TX",
    },
    workPhone: "555-555-5555",
    workFax: "555-555-5555",
    sourceId: "system-a-00000000-0000-0000-0000-000000000000",
    mobilePhone: "555-555-5555",
    prefix: "Mr.",
    pager: "555-555-5555",
    optOut: {},
    npi: "5555555555",
    links: {
      twitterUrl: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      facebookUrl: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      linkedInUrl: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
    },
    dateOfBirth: new RFCDate("1990-01-01"),
    passport: {
      number: "123456789",
      countryCode: "GB",
    },
    socialSecurityNumber: "123-45-6789",
    nationalIdentificationNumber: "123456789",
    headline:
      "Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands",
    personalWebsite: "https://www.example.com",
    biography:
      "I am a marketing professional with experience in event planning and brand strategy.",
    pronouns: "he/him/she/her/they/them",
    id: "fdf872db-b74d-4ac4-8651-a01b9c856c7c",
  },
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `id`                                                                 | *string*                                                             | :heavy_check_mark:                                                   | ID of a contact.                                                     | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                 |
| `contactUpdate`                                                      | [components.ContactUpdate](../../models/components/contactupdate.md) | :heavy_check_mark:                                                   | Contact to be updated                                                |                                                                      |