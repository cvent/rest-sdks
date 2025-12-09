# ListTravelProgramsQuestionsResponse

## Example Usage

```typescript
import { ListTravelProgramsQuestionsResponse } from "@cvent/sdk/models/operations";

let value: ListTravelProgramsQuestionsResponse = {
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
        travelProgram: {
          id: "ddc61444-45c7-4e1d-9fdd-07713c8baf9b",
        },
        id: "76c461cb-77f6-40b3-acc8-db44452f11c4",
        text: "What type of food is served in the hotel restaurant?",
        required: true,
        responseType: "choice",
        responseDataType: "text",
        responseFormat: "proper_case",
        responseChoices: [
          "Mexican",
          "American",
          "French",
          "Other",
        ],
      },
    ],
  },
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `result`                                                                                         | [components.QuestionsPaginatedResponse1](../../models/components/questionspaginatedresponse1.md) | :heavy_check_mark:                                                                               | N/A                                                                                              |