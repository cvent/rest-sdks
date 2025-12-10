# ReservationRequestJson

Representation of the housing reservation details.

## Example Usage

```typescript
import { ReservationRequestJson } from "@cvent/sdk/models/components";

let value: ReservationRequestJson = {
  id: "D6A63423-G796",
  bookingSite: {
    href:
      "https://book.passkey.com/entry?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJwYXlsb2FkIjp7ImVudHJ5IjoiUkVHSVNUUkFUSU9OIiwicGFyYW1zIjpbeyJuYW1lIjoiYnJpZGdlSWQiLCJ2YWx1ZSI6IlQ3VFdNTEhQLUdFNEQifV19fQ.7sH1gO_1Aambk-SRRlO2c7ac2DOpqLmCB-zsxB71q_A",
  },
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    | Example                                                                                        |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `id`                                                                                           | *string*                                                                                       | :heavy_minus_sign:                                                                             | Reservation request ID, also known as a bridge ID.                                             | D6A63423-G796                                                                                  |
| `bookingSite`                                                                                  | [components.ReservationRequestJsonLink](../../models/components/reservationrequestjsonlink.md) | :heavy_minus_sign:                                                                             | Represents a link to a related resource.                                                       |                                                                                                |