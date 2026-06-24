# WeddingDetails1

Wedding details.

## Example Usage

```typescript
import { WeddingDetails1 } from "@cvent/sdk/models/components";

let value: WeddingDetails1 = {
  firstPartner: {
    name: "John Doe",
  },
  secondPartner: {
    name: "John Doe",
  },
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `firstPartner`                                                         | [components.WeddingPartner](../../models/components/weddingpartner.md) | :heavy_minus_sign:                                                     | Represents wedding partner.                                            |
| `secondPartner`                                                        | [components.WeddingPartner](../../models/components/weddingpartner.md) | :heavy_minus_sign:                                                     | Represents wedding partner.                                            |
| `ceremony`                                                             | *boolean*                                                              | :heavy_minus_sign:                                                     | True indicates ceremony is planned.                                    |
| `reception`                                                            | *boolean*                                                              | :heavy_minus_sign:                                                     | True indicates reception is planned.                                   |
| `farewellBrunch`                                                       | *boolean*                                                              | :heavy_minus_sign:                                                     | True indicates farewell brunch is planned.                             |
| `rehearsalDinner`                                                      | *boolean*                                                              | :heavy_minus_sign:                                                     | True indicates rehearsal dinner is planned.                            |