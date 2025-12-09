# Attribution

The entity to which the ad is associated.

## Example Usage

```typescript
import { Attribution } from "@cvent/sdk/models/components";

let value: Attribution = {
  type: "CUSTOM",
};
```

## Fields

| Field                                     | Type                                      | Required                                  | Description                               | Example                                   |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| `id`                                      | *string*                                  | :heavy_minus_sign:                        | The unique identifier of the attribution. |                                           |
| `type`                                    | *string*                                  | :heavy_minus_sign:                        | The type of attribution.                  | CUSTOM                                    |