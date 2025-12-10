# ListSpeakerDocsResponse

## Example Usage

```typescript
import { ListSpeakerDocsResponse } from "@cvent/sdk/models/operations";

let value: ListSpeakerDocsResponse = {
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
        file: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        href:
          "https://custom.cvent.com/a5154f85f71a4cf2464e037feb75b308/00000000000000000000000000000000/files/universal-file/tmp/e209d73d845746b7a6deda4da9d91b2c.png",
        friendlyName: "Important Document",
        type: "image/png",
        size: 150,
        displayEnabled: true,
      },
    ],
  },
};
```

## Fields

| Field                                                                                                      | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `result`                                                                                                   | [components.SpeakerDocumentPaginatedResponse](../../models/components/speakerdocumentpaginatedresponse.md) | :heavy_check_mark:                                                                                         | N/A                                                                                                        |