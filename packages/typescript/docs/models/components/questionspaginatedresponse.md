# QuestionsPaginatedResponse

Response include paging and collection of questions of surveys

## Example Usage

```typescript
import { QuestionsPaginatedResponse } from "@cvent/sdk/models/components";

let value: QuestionsPaginatedResponse = {
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
      text: "Field value",
      shortText: "Category 1 Reporting value",
      htmlText: "Question Html",
      code: "4l6x",
      type: "SingleChoice",
      choices: [
        {
          text: "Field value",
          shortText: "Category 1 Reporting value",
          label: "Choice A",
        },
      ],
      categories: [
        {
          text: "Field value",
          shortText: "Category 1 Reporting value",
          required: true,
        },
      ],
      subCategories: [
        {
          text: "Field value",
          shortText: "Category 1 Reporting value",
        },
      ],
      notApplicableAnswer: {
        text: "N/A or Other",
        shortText: "N/A or Other Reporting value",
      },
      otherAnswer: {
        text: "N/A or Other",
        shortText: "N/A or Other Reporting value",
      },
      comments: "Comments Text",
      required: true,
      fields: [
        {
          text: "Field value",
          shortText: "Category 1 Reporting value",
          type: "SingleChoice",
          choices: [
            {
              text: "Field value",
              shortText: "Category 1 Reporting value",
              label: "Choice A",
            },
          ],
          notApplicableAnswer: {
            text: "N/A or Other",
            shortText: "N/A or Other Reporting value",
          },
          otherAnswer: {
            text: "N/A or Other",
            shortText: "N/A or Other Reporting value",
          },
          required: true,
        },
      ],
      maxScore: 20,
      totalSum: 45,
      survey: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      chapter: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
    },
  ],
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `paging`                                                               | [components.PagingJson](../../models/components/pagingjson.md)         | :heavy_check_mark:                                                     | Represents pagination information for a collection of resources.       |
| `data`                                                                 | [components.QuestionJson2](../../models/components/questionjson2.md)[] | :heavy_check_mark:                                                     | Collection of questions for surveys.                                   |