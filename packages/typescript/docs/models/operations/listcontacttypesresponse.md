# ListContactTypesResponse

## Example Usage

```typescript
import { ListContactTypesResponse } from "@cvent/sdk/models/operations";

let value: ListContactTypesResponse = {
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
        id: "f6de3c4c-4429-42d1-9bb6-46838005f63f",
        code: "VIP",
        name: "VIP Attendee",
        description: "Very important attendee.",
        active: true,
      },
    ],
  },
};
```

## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `result`                                                                                           | [components.ContactTypePaginatedResponse](../../models/components/contacttypepaginatedresponse.md) | :heavy_check_mark:                                                                                 | N/A                                                                                                |