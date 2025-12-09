# ReservationRequestResponseJson

Representation of the reservation request response.

## Example Usage

```typescript
import { ReservationRequestResponseJson } from "@cvent/sdk/models/components";

let value: ReservationRequestResponseJson = {
  attendee: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  reservationRequest: {
    id: "D6A63423-G796",
    bookingSite: {
      href:
        "https://book.passkey.com/entry?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJwYXlsb2FkIjp7ImVudHJ5IjoiUkVHSVNUUkFUSU9OIiwicGFyYW1zIjpbeyJuYW1lIjoiYnJpZGdlSWQiLCJ2YWx1ZSI6IlQ3VFdNTEhQLUdFNEQifV19fQ.7sH1gO_1Aambk-SRRlO2c7ac2DOpqLmCB-zsxB71q_A",
    },
  },
  lastModified: new Date("2019-02-12T03:00:00Z"),
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `attendee`                                                                                    | [components.AttendeeJson4](../../models/components/attendeejson4.md)                          | :heavy_minus_sign:                                                                            | Representation of the attendee                                                                |                                                                                               |
| `reservationRequest`                                                                          | [components.ReservationRequestJson](../../models/components/reservationrequestjson.md)        | :heavy_minus_sign:                                                                            | Representation of the housing reservation details.                                            |                                                                                               |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |