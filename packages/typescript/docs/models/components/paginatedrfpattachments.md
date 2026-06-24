# PaginatedRfpAttachments

Paginated list of RFP attachments.

## Example Usage

```typescript
import { PaginatedRfpAttachments } from "@cvent/sdk/models/components";

let value: PaginatedRfpAttachments = {
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

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `paging`                                                               | [components.Paging](../../models/components/paging.md)                 | :heavy_check_mark:                                                     | Represents pagination information for a collection of resources.       |
| `data`                                                                 | [components.RfpAttachment](../../models/components/rfpattachment.md)[] | :heavy_check_mark:                                                     | List of attachments added on an RFP.                                   |