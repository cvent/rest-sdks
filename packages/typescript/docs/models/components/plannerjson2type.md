# ~~PlannerJson2Type~~

Planner type.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

## Example Usage

```typescript
import { PlannerJson2Type } from "@cvent/sdk/models/components";

let value: PlannerJson2Type = {
  id: "861B51EC-AA7E-475F-B38D-4C8E35C47D63",
  name: "VIP Member",
};
```

## Fields

| Field                                      | Type                                       | Required                                   | Description                                | Example                                    |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `id`                                       | *string*                                   | :heavy_minus_sign:                         | The unique identifier of the contact type. | 861B51EC-AA7E-475F-B38D-4C8E35C47D63       |
| `name`                                     | *string*                                   | :heavy_minus_sign:                         | A descriptive name for the contact type.   | VIP Member                                 |