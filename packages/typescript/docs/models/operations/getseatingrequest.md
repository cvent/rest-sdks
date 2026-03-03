# GetSeatingRequest

## Example Usage

```typescript
import { GetSeatingRequest } from "@cvent/sdk/models/operations";

let value: GetSeatingRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  seatingId: "b054dd32-efb6-444a-b4a6-a797a18315ef",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_check_mark:                   | ID of an event.                      | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
| `seatingId`                          | *string*                             | :heavy_check_mark:                   | ID of a seating.                     | b054dd32-efb6-444a-b4a6-a797a18315ef |