# GetSeatRequest

## Example Usage

```typescript
import { GetSeatRequest } from "@cvent/sdk/models/operations";

let value: GetSeatRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  seatingId: "b054dd32-efb6-444a-b4a6-a797a18315ef",
  tableId: "ff4fb435-4340-44bc-9c86-c1a9c050710f",
  seatId: "e5019035-815e-4b46-9b4f-772a7b48f336",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_check_mark:                   | ID of an event.                      | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
| `seatingId`                          | *string*                             | :heavy_check_mark:                   | ID of a seating.                     | b054dd32-efb6-444a-b4a6-a797a18315ef |
| `tableId`                            | *string*                             | :heavy_check_mark:                   | ID of a table.                       | ff4fb435-4340-44bc-9c86-c1a9c050710f |
| `seatId`                             | *string*                             | :heavy_check_mark:                   | ID of a seat.                        | e5019035-815e-4b46-9b4f-772a7b48f336 |