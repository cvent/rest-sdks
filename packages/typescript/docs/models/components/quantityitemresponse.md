# QuantityItemResponse

Represents details for updating a quantity item for an attendee's registration.

## Example Usage

```typescript
import { QuantityItemResponse } from "@cvent/sdk/models/components";

let value: QuantityItemResponse = {
  id: "8163c74e-18c6-401a-a710-ae0f485bf059",
  attendee: {
    id: "9463c74e-18c6-401a-a710-ae0f485bf059",
  },
  updatedQuantity: 5,
  sendEmail: false,
};
```

## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `id`                                                                                               | *string*                                                                                           | :heavy_check_mark:                                                                                 | Unique identifier of a quantity item.                                                              | 8163c74e-18c6-401a-a710-ae0f485bf059                                                               |
| `attendee`                                                                                         | [components.QuantityItemResponseAttendee](../../models/components/quantityitemresponseattendee.md) | :heavy_check_mark:                                                                                 | The reference to the attendee. Contains only the ID of the attendee.                               |                                                                                                    |
| `updatedQuantity`                                                                                  | *number*                                                                                           | :heavy_check_mark:                                                                                 | Updated quantity of the item.                                                                      | 5                                                                                                  |
| `sendEmail`                                                                                        | *boolean*                                                                                          | :heavy_minus_sign:                                                                                 | True indicates a registration modification email should be triggered after the request succeeds.   | false                                                                                              |