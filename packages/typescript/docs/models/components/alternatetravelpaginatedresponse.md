# AlternateTravelPaginatedResponse

Paginated response containing alternate travel answers submitted by attendees who opt out of air or hotel bookings.

## Example Usage

```typescript
import { AlternateTravelPaginatedResponse } from "@cvent/sdk/models/components";

let value: AlternateTravelPaginatedResponse = {
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
  data: [],
};
```

## Fields

| Field                                                                                                                  | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `paging`                                                                                                               | [components.AlternateTravelPaginatedResponsePaging](../../models/components/alternatetravelpaginatedresponsepaging.md) | :heavy_check_mark:                                                                                                     | Represents pagination information for the list of results.                                                             |
| `data`                                                                                                                 | [components.AlternateTravelDetailJson](../../models/components/alternatetraveldetailjson.md)[]                         | :heavy_check_mark:                                                                                                     | Collection of alternate travel answers for attendees.                                                                  |