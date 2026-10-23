# CreateLeadCatcherRequest

## Example Usage

```typescript
import { CreateLeadCatcherRequest } from "@cvent/sdk/models/operations";

let value: CreateLeadCatcherRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  leadCatcher: {
    firstName: "Jane",
    lastName: "Smith",
    title: "Director of Sales",
    email: "jane.smith@example.com",
    phone: "+1-555-555-0101",
    fax: "+1-555-555-0101",
    address: {
      streetAddress1: "1234 Trap Road",
      streetAddress2: "Suite 100",
      city: "Vienna",
      zipPostalCode: "22182",
    },
    config: {
      supplierContactRole: "Sales Manager",
    },
    additionalInfo: "Preferred contact for APAC venues.",
  },
};
```

## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      | Example                                                          |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `venueId`                                                        | *string*                                                         | :heavy_check_mark:                                               | Unique Cvent based identifier for a Venue.                       | 6bb0e2db-861f-46e3-a923-eb4d959ffa00                             |
| `leadCatcher`                                                    | [components.LeadCatcher](../../models/components/leadcatcher.md) | :heavy_check_mark:                                               | N/A                                                              |                                                                  |