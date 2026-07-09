# AirlinePreference

Representation of airlines based on preference

## Example Usage

```typescript
import { AirlinePreference } from "@cvent/sdk/models/components";

let value: AirlinePreference = {
  airlineName: "Emirates",
  rewardsCode: "SKYWARD12345",
};
```

## Fields

| Field                                             | Type                                              | Required                                          | Description                                       | Example                                           |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `airlineName`                                     | *string*                                          | :heavy_minus_sign:                                | Name of preferred airline.                        | Emirates                                          |
| `rewardsCode`                                     | *string*                                          | :heavy_minus_sign:                                | Loyalty program number for the preferred airline. | SKYWARD12345                                      |