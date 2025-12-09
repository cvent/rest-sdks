# ListContactHooksResponse

## Example Usage

```typescript
import { ListContactHooksResponse } from "@cvent/sdk/models/operations";

let value: ListContactHooksResponse = {
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
        created: new Date("2017-01-02T02:00:00Z"),
        createdBy: "hporter",
        lastModified: new Date("2019-02-12T03:00:00Z"),
        lastModifiedBy: "hporter",
        id: "3b2359a7-4583-40ed-8afd-67e5f15373d3",
        name: "Attendee Identification",
        callback: "https://myserver.com/send/callback/here",
        security: {
          type: "apiKey",
          authHeaderKey: "x-api-key",
          apiKeyPrefix: true,
        },
      },
    ],
  },
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `result`                                                                               | [components.HooksPaginatedResponse](../../models/components/hookspaginatedresponse.md) | :heavy_check_mark:                                                                     | N/A                                                                                    |