# EventWeblinksPaginatedResponse

Paginated collection of event weblinks.

## Example Usage

```typescript
import { EventWeblinksPaginatedResponse } from "@cvent/sdk/models/components";

let value: EventWeblinksPaginatedResponse = {
  paging: {
    limit: 100,
    previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
    nextToken: "1a2b3c4d5e6f7g8h9i10j11k",
    currentToken: "1a2b3c4d5e6f7g8h9i10j11k",
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
      name: "VIP Registration",
      url: "https://cvent.me/XX51b9",
      landingPage: "Registration",
      locale: "en-US",
    },
  ],
};
```

## Fields

| Field                                                                                                              | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `paging`                                                                                                           | [components.EventWeblinksPaginatedResponsePaging](../../models/components/eventweblinkspaginatedresponsepaging.md) | :heavy_check_mark:                                                                                                 | N/A                                                                                                                |
| `data`                                                                                                             | [components.EventWeblinkJson](../../models/components/eventweblinkjson.md)[]                                       | :heavy_check_mark:                                                                                                 | Collection of event weblinks.                                                                                      |