# TravelBidDiscountJson

Discount for a travel bid.

## Example Usage

```typescript
import { TravelBidDiscountJson } from "@cvent/sdk/models/components";

let value: TravelBidDiscountJson = {
  propertyRoom: {
    id: "9ea95519-2fc5-49d8-991b-e954f49044fe",
  },
  discount: 10,
  status: "requested",
};
```

## Fields

| Field                                                                                                                                                              | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `propertyRoom`                                                                                                                                                     | [components.TravelBidDiscountJsonPropertyRoom](../../models/components/travelbiddiscountjsonpropertyroom.md)                                                       | :heavy_minus_sign:                                                                                                                                                 | ID of the property's room.                                                                                                                                         |                                                                                                                                                                    |
| `discount`                                                                                                                                                         | *number*                                                                                                                                                           | :heavy_minus_sign:                                                                                                                                                 | Discount percentage for the dynamic rate.                                                                                                                          | 10                                                                                                                                                                 |
| `status`                                                                                                                                                           | [components.BidItemStatusTypeJson](../../models/components/biditemstatustypejson.md)                                                                               | :heavy_minus_sign:                                                                                                                                                 | The status of the item in negotiation.  e.g. The corporation might mark an item as delete_requested, and the hotel, if they agree, can update the item to deleted. | requested                                                                                                                                                          |