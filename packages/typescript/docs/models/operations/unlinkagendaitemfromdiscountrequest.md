# UnlinkAgendaItemFromDiscountRequest

## Example Usage

```typescript
import { UnlinkAgendaItemFromDiscountRequest } from "@cvent/sdk/models/operations";

let value: UnlinkAgendaItemFromDiscountRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  discountId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  agendaItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_check_mark:                   | Unique ID of an event.               | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
| `discountId`                         | *string*                             | :heavy_check_mark:                   | Unique ID of a discount.             | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
| `agendaItemId`                       | *string*                             | :heavy_check_mark:                   | Unique ID of an agenda item.         | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |