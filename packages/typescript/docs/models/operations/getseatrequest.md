# GetSeatRequest

## Example Usage

```typescript
import { GetSeatRequest } from "@cvent/sdk/models/operations";

let value: GetSeatRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  seatingId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  tableId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  seatId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_check_mark:                   | ID of an event.                      | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
| `seatingId`                          | *string*                             | :heavy_check_mark:                   | ID of a seating.                     | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
| `tableId`                            | *string*                             | :heavy_check_mark:                   | ID of a table.                       | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
| `seatId`                             | *string*                             | :heavy_check_mark:                   | ID of a seat.                        | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |