# GetHousingReservationRequestsResponse

## Example Usage

```typescript
import { GetHousingReservationRequestsResponse } from "@cvent/sdk/models/operations";

let value: GetHousingReservationRequestsResponse = {
  result: {
    paging: {
      previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
      nextToken: "1a2b3c4d5e6f7g8h9i10j11k",
      currentToken: "1a2b3c4d5e6f7g8h9i10j11k",
      limit: 100,
      totalCount: 2,
      links: {
        next: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        self: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        prev: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
      },
    },
    data: [
      {
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
      },
    ],
  },
};
```

## Fields

| Field                                                                                                            | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `result`                                                                                                         | [components.ReservationRequestPaginatedResponse](../../models/components/reservationrequestpaginatedresponse.md) | :heavy_check_mark:                                                                                               | N/A                                                                                                              |