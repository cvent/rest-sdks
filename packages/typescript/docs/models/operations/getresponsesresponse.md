# GetResponsesResponse

## Example Usage

```typescript
import { GetResponsesResponse } from "@cvent/sdk/models/operations";

let value: GetResponsesResponse = {
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
        respondent: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        question: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        answers: [],
        event: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        session: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        chapter: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        survey: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        speaker: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        loopingChoice: {
          id: "9463c74e-18c6-401a-a710-ae0f485bf059",
        },
        attempt: 2,
      },
    ],
  },
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `result`                                                                                       | [components.ResponsesPaginatedResponse](../../models/components/responsespaginatedresponse.md) | :heavy_check_mark:                                                                             | N/A                                                                                            |