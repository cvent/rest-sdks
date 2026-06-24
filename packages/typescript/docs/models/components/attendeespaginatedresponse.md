# AttendeesPaginatedResponse

A paginated response containing a list of attendees who have redeemed a voucher.

## Example Usage

```typescript
import { AttendeesPaginatedResponse } from "@cvent/sdk/models/components";

let value: AttendeesPaginatedResponse = {
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
      id: "5b0e8d1f-8fd6-4ebe-977a-602b4a1f9c43",
    },
  ],
};
```

## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [components.Paging](../../models/components/paging.md)           | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | [components.Attendee2](../../models/components/attendee2.md)[]   | :heavy_check_mark:                                               | Collection of attendees who have redeemed the voucher.           |