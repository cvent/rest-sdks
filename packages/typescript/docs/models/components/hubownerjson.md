# HubOwnerJson

The owner of the Events+ hub and their information.

## Example Usage

```typescript
import { HubOwnerJson } from "@cvent/sdk/models/components";

let value: HubOwnerJson = {
  firstName: "Achuthanandan",
  lastName: "Velikkakathu Sankaran",
  email: "owner@example.com",
};
```

## Fields

| Field                                   | Type                                    | Required                                | Description                             | Example                                 |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `firstName`                             | *string*                                | :heavy_minus_sign:                      | First name of the Events+ hub owner.    | Achuthanandan                           |
| `lastName`                              | *string*                                | :heavy_minus_sign:                      | Last name of the Events+ hub owner.     | Velikkakathu Sankaran                   |
| `email`                                 | *string*                                | :heavy_minus_sign:                      | Email address of the Events+ hub owner. | owner@example.com                       |