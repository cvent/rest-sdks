# AirlinePreferenceJson

Representation of airlines based on preference

## Example Usage

```typescript
import { AirlinePreferenceJson } from "@cvent/sdk/models/components";

let value: AirlinePreferenceJson = {
  airlineName: "Emirates",
  rewardsCode: "REWARDS_ONE",
};
```

## Fields

| Field                      | Type                       | Required                   | Description                | Example                    |
| -------------------------- | -------------------------- | -------------------------- | -------------------------- | -------------------------- |
| `airlineName`              | *string*                   | :heavy_minus_sign:         | Name of preferred airline. | Emirates                   |
| `rewardsCode`              | *string*                   | :heavy_minus_sign:         | Any rewards code applied.  | REWARDS_ONE                |