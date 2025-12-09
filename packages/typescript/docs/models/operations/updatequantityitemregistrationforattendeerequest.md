# UpdateQuantityItemRegistrationForAttendeeRequest

## Example Usage

```typescript
import { UpdateQuantityItemRegistrationForAttendeeRequest } from "@cvent/sdk/models/operations";

let value: UpdateQuantityItemRegistrationForAttendeeRequest = {
  quantityItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    | Example                                                                        |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `quantityItemId`                                                               | *string*                                                                       | :heavy_check_mark:                                                             | Unique ID of a quantity item.                                                  | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                           |
| `quantityItemUpdate`                                                           | [components.QuantityItemUpdate](../../models/components/quantityitemupdate.md) | :heavy_minus_sign:                                                             | Details in body required to update quantity item for an attendee.              |                                                                                |