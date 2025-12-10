# AdditionalGuestFeesJson

Details about additional fees for extra guests.

## Example Usage

```typescript
import { AdditionalGuestFeesJson } from "@cvent/sdk/models/components";

let value: AdditionalGuestFeesJson = {
  guestCount: 2,
  fee: 20,
};
```

## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `guestCount`                                               | *number*                                                   | :heavy_check_mark:                                         | The number of guests for which the additional fee applies. | 2                                                          |
| `fee`                                                      | *number*                                                   | :heavy_check_mark:                                         | The value of the additional fee for extra guests.          | 20                                                         |