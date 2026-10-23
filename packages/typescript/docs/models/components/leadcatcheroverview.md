# LeadCatcherOverview

A lightweight, non-PII overview of a lead catcher contact.

## Example Usage

```typescript
import { LeadCatcherOverview } from "@cvent/sdk/models/components";

let value: LeadCatcherOverview = {
  id: "7e5c2c23-b2bb-461a-adc9-025184988519",
  firstName: "Jane",
  lastName: "Smith",
};
```

## Fields

| Field                                   | Type                                    | Required                                | Description                             | Example                                 |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `id`                                    | *string*                                | :heavy_check_mark:                      | Lead catcher ID.                        | 7e5c2c23-b2bb-461a-adc9-025184988519    |
| `firstName`                             | *string*                                | :heavy_check_mark:                      | First name of the lead catcher contact. | Jane                                    |
| `lastName`                              | *string*                                | :heavy_check_mark:                      | Last name of the lead catcher contact.  | Smith                                   |