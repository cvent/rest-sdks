# EventQuestionChoicesResponse

Response to the request to get a list of event question choices.

## Example Usage

```typescript
import { EventQuestionChoicesResponse } from "@cvent/sdk/models/components";

let value: EventQuestionChoicesResponse = {
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

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `paging`                                                                                   | [components.PagingJson](../../models/components/pagingjson.md)                             | :heavy_minus_sign:                                                                         | Represents pagination information for a collection of resources.                           |
| `data`                                                                                     | [components.EventQuestionChoiceJson](../../models/components/eventquestionchoicejson.md)[] | :heavy_check_mark:                                                                         | Collection of choices for a choice question.                                               |