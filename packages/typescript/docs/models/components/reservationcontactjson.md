# ReservationContactJson

Reservation contact details for this event.

## Example Usage

```typescript
import { ReservationContactJson } from "@cvent/sdk/models/components";

let value: ReservationContactJson = {
  phone: "2345239540-123",
  fax: "25123-234-12",
  tollFree: "323-324",
  email: "venue@example.com",
};
```

## Fields

| Field              | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `phone`            | *string*           | :heavy_minus_sign: | Phone number.      | 2345239540-123     |
| `fax`              | *string*           | :heavy_minus_sign: | Fax number.        | 25123-234-12       |
| `tollFree`         | *string*           | :heavy_minus_sign: | Toll-free number.  | 323-324            |
| `email`            | *string*           | :heavy_minus_sign: | Email address.     | venue@example.com  |