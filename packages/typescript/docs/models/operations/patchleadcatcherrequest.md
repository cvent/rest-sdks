# PatchLeadCatcherRequest

## Example Usage

```typescript
import { PatchLeadCatcherRequest } from "@cvent/sdk/models/operations";

let value: PatchLeadCatcherRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  leadCatcherId: "79359fc5-4d78-493e-a90f-0913d5a97d2e",
  leadCatcherPatch: {
    firstName: "Jane",
    lastName: "Smith",
    title: "Director of Sales",
    email: "jane.smith@example.com",
    phone: "+1-555-0100",
    fax: "+1-555-0101",
    address: {
      streetAddress1: "1234 Trap Road",
      streetAddress2: "Suite 100",
      city: "Vienna",
      zipPostalCode: "22182",
    },
    locale: "en-US",
    config: {
      rfpEmailEnabled: true,
      pdfLinkEnabled: true,
      supplierContactRole: "roleName",
    },
    additionalInfo: "Preferred contact for APAC venues.",
  },
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                | Example                                                                    |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `venueId`                                                                  | *string*                                                                   | :heavy_check_mark:                                                         | Unique Cvent based identifier for a Venue.                                 | 6bb0e2db-861f-46e3-a923-eb4d959ffa00                                       |
| `leadCatcherId`                                                            | *string*                                                                   | :heavy_check_mark:                                                         | Unique identifier for a lead catcher.                                      |                                                                            |
| `leadCatcherPatch`                                                         | [components.LeadCatcherPatch](../../models/components/leadcatcherpatch.md) | :heavy_check_mark:                                                         | N/A                                                                        |                                                                            |