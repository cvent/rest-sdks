# PaginatedRfpQuestions

Paginated response containing questions associated to an RFP.

## Example Usage

```typescript
import { PaginatedRfpQuestions } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: PaginatedRfpQuestions = {
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
      text:
        "Are you spending any significant time offsite and need transportation?",
      shortText: "Needs offsite transportation?",
      htmlText: "Question Html",
      code: "4l6x",
      type: "SingleChoice",
      choices: [
        {
          text:
            "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
          label: "Choice A",
        },
      ],
      categories: [
        {
          text:
            "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
          required: true,
        },
      ],
      subCategories: [
        {
          text:
            "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
        },
      ],
      notApplicableAnswer: {
        text: "Dietary Restriction - Other",
        shortText: "Dietary Preference - Other Allergies",
      },
      otherAnswer: {
        text: "Dietary Restriction - Other",
        shortText: "Dietary Preference - Other Allergies",
      },
      comments: "Comments Text",
      required: true,
      fields: [
        {
          text:
            "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
          choices: [
            {
              text:
                "Are you spending any significant time offsite and need transportation?",
              shortText: "Needs offsite transportation?",
              label: "Choice A",
            },
          ],
          notApplicableAnswer: {
            text: "Dietary Restriction - Other",
            shortText: "Dietary Preference - Other Allergies",
          },
          otherAnswer: {
            text: "Dietary Restriction - Other",
            shortText: "Dietary Preference - Other Allergies",
          },
          required: true,
        },
      ],
      maxScore: 20,
      totalSum: 45,
      minSelection: 1,
      maxSelection: 3,
      minDate: new RFCDate("2020-01-01"),
      maxDate: new RFCDate("2020-12-31"),
      showDateSelector: true,
      showCurrentDate: true,
      unitLabel: "miles",
      minLength: 5,
      maxLength: 100,
      customAnswerFormat: {
        id: 104,
      },
      supplierTypes: [
        "CVB",
        "HOTEL",
      ],
      order: 1,
      standardQuestion: {
        id: "50dc08af-24a9-4d01-84be-3d43133dc945",
      },
      aiQuestionGenerationSource: "MCP-Visual Studio Code/1.107.1",
    },
  ],
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [components.PagingJson](../../models/components/pagingjson.md)             | :heavy_minus_sign:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | [components.RfpQuestionJson](../../models/components/rfpquestionjson.md)[] | :heavy_minus_sign:                                                         | List of questions associated to an RFP.                                    |