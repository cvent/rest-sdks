# WeddingDetailsJson0

Wedding details.

## Example Usage

```typescript
import { WeddingDetailsJson0 } from "@cvent/sdk/models/components";

let value: WeddingDetailsJson0 = {
  firstPartner: {
    name: "John Doe",
  },
  secondPartner: {
    name: "John Doe",
  },
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `firstPartner`                                                                 | [components.WeddingPartnerJson](../../models/components/weddingpartnerjson.md) | :heavy_minus_sign:                                                             | Represents wedding partner.                                                    |
| `secondPartner`                                                                | [components.WeddingPartnerJson](../../models/components/weddingpartnerjson.md) | :heavy_minus_sign:                                                             | Represents wedding partner.                                                    |
| `ceremony`                                                                     | *boolean*                                                                      | :heavy_minus_sign:                                                             | True indicates ceremony is planned.                                            |
| `reception`                                                                    | *boolean*                                                                      | :heavy_minus_sign:                                                             | True indicates reception is planned.                                           |
| `farewellBrunch`                                                               | *boolean*                                                                      | :heavy_minus_sign:                                                             | True indicates farewell brunch is planned.                                     |
| `rehearsalDinner`                                                              | *boolean*                                                                      | :heavy_minus_sign:                                                             | True indicates rehearsal dinner is planned.                                    |