# GetEventQuestionsResponse

## Example Usage

```typescript
import { GetEventQuestionsResponse } from "@cvent/sdk/models/operations";

let value: GetEventQuestionsResponse = {
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
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        event: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        text: "Let us know why you can't attend.",
        code: "ONE_LINE_43534",
        tag: "All Admission Items",
        session: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        admissionItem: {
          id: "06ca5ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
      },
    ],
  },
};
```

## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `result`                                                                                                 | [components.EventQuestionsPaginatedResponse](../../models/components/eventquestionspaginatedresponse.md) | :heavy_check_mark:                                                                                       | N/A                                                                                                      |