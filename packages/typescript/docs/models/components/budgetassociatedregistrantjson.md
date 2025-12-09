# BudgetAssociatedRegistrantJson

Contains information about a registrant associated with a budget.

## Example Usage

```typescript
import { BudgetAssociatedRegistrantJson } from "@cvent/sdk/models/components";

let value: BudgetAssociatedRegistrantJson = {
  firstName: "Amit",
  lastName: "Kumar",
  hcpStatus: true,
  inviteeId: "7cc5304a-9323-452f-8ae8-111cae0047b0",
  contactId: "0c478ddc-cf11-4026-a8e5-e6a59ae1c902",
};
```

## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   | Example                                                                       |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `firstName`                                                                   | *string*                                                                      | :heavy_minus_sign:                                                            | First name of associated registrant.                                          | Amit                                                                          |
| `lastName`                                                                    | *string*                                                                      | :heavy_minus_sign:                                                            | Last name of associated registrant.                                           | Kumar                                                                         |
| `hcpStatus`                                                                   | *boolean*                                                                     | :heavy_minus_sign:                                                            | True indicates the associated registrant is a HCP (Health Care Practitioner). | true                                                                          |
| `inviteeId`                                                                   | *string*                                                                      | :heavy_minus_sign:                                                            | Unique identifier for the invitee associated with the budget.                 | 7cc5304a-9323-452f-8ae8-111cae0047b0                                          |
| `contactId`                                                                   | *string*                                                                      | :heavy_minus_sign:                                                            | Unique identifier for the contact associated with the budget.                 | 0c478ddc-cf11-4026-a8e5-e6a59ae1c902                                          |