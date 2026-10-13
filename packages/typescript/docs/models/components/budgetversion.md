# BudgetVersion

Budget version ID information. Defaults to the account's default budget version when creating or updating budget items.

## Example Usage

```typescript
import { BudgetVersion } from "@cvent/sdk/models/components";

let value: BudgetVersion = {
  id: "b2e8f1a4-7c3d-4b9e-8f6a-2d1c5e0b7a9f",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_minus_sign:                   | The budget version ID.               | b2e8f1a4-7c3d-4b9e-8f6a-2d1c5e0b7a9f |