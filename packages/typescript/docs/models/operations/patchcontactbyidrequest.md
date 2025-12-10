# PatchContactByIdRequest

## Example Usage

```typescript
import { PatchContactByIdRequest } from "@cvent/sdk/models/operations";

let value: PatchContactByIdRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  contactPatch: {
    firstName: "Henry",
    lastName: "Potterfield",
    middleName: "A",
    nickname: "Harry",
    email: "h.potterfield@test.com",
    ccEmail: "h.porter@tesing.com",
    designation: "CPA",
    type: {
      id: "861B51EC-AA7E-475F-B38D-4C8E35C47D63",
    },
    primaryAddressType: "Home",
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
    passport: {
      number: "123456789",
      countryCode: "GB",
    },
    nationalIdentificationNumber: "123456789",
    headline:
      "Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands",
    personalWebsite: "https://www.example.com",
    biography:
      "I am a marketing professional with experience in event planning and brand strategy.",
    pronouns: "he/him/she/her/they/them",
    id: "968f784c-df0e-47d3-9557-b90310d90bc5",
  },
};
```

## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        | Example                                                            |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `id`                                                               | *string*                                                           | :heavy_check_mark:                                                 | ID of a contact.                                                   | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                               |
| `contactPatch`                                                     | [components.ContactPatch](../../models/components/contactpatch.md) | :heavy_check_mark:                                                 | Contact to be updated                                              |                                                                    |