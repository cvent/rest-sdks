# GetAttendeeMessagesMembersResponse

## Example Usage

```typescript
import { GetAttendeeMessagesMembersResponse } from "@cvent/sdk/models/operations";

let value: GetAttendeeMessagesMembersResponse = {
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
          id: "0a459133-1f5e-43b2-8694-7da9541b3f58",
          active: false,
          leftChannelAt: new Date("2025-03-13T18:00:00.000Z"),
        },
        channel: {
          id: "production_group_0cb93bab-32d2-4f82-b430-e1911f2348ac",
        },
      },
    ],
  },
};
```

## Fields

| Field                                                                                                          | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `result`                                                                                                       | [components.MessageRecipientsPaginatedResponse](../../models/components/messagerecipientspaginatedresponse.md) | :heavy_check_mark:                                                                                             | N/A                                                                                                            |