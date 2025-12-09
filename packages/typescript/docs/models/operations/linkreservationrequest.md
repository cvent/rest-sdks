# LinkReservationRequest

## Example Usage

```typescript
import { LinkReservationRequest } from "@cvent/sdk/models/operations";

let value: LinkReservationRequest = {
  reservationRequestsId: "D6A63423-G796",
  reservationId: "327S856H",
};
```

## Fields

| Field                               | Type                                | Required                            | Description                         | Example                             |
| ----------------------------------- | ----------------------------------- | ----------------------------------- | ----------------------------------- | ----------------------------------- |
| `reservationRequestsId`             | *string*                            | :heavy_check_mark:                  | Unique room reservation request ID. | D6A63423-G796                       |
| `reservationId`                     | *string*                            | :heavy_check_mark:                  | Cvent Passkey confirmation number.  | 327S856H                            |