# ActivityAdJson

The details of the advertisement.

## Example Usage

```typescript
import { ActivityAdJson } from "@cvent/sdk/models/components";

let value: ActivityAdJson = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  name: "New Year Sale",
  product: "ATTENDEE_HUB",
  location: "Home Page",
  attribution: {
    type: "CUSTOM",
  },
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `id`                                                                   | *string*                                                               | :heavy_minus_sign:                                                     | The unique identifier of the ad.                                       | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                   |
| `name`                                                                 | *string*                                                               | :heavy_minus_sign:                                                     | The name of the ad.                                                    | New Year Sale                                                          |
| `product`                                                              | *string*                                                               | :heavy_minus_sign:                                                     | The product for which ad is created                                    | ATTENDEE_HUB                                                           |
| `location`                                                             | [components.AdLocationJson](../../models/components/adlocationjson.md) | :heavy_minus_sign:                                                     | The placement of the ad within the specific product.                   | Home Page                                                              |
| `attribution`                                                          | [components.Attribution](../../models/components/attribution.md)       | :heavy_minus_sign:                                                     | The entity to which the ad is associated.                              |                                                                        |