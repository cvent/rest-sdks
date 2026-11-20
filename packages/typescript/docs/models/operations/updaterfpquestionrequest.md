# UpdateRfpQuestionRequest

## Example Usage

```typescript
import { UpdateRfpQuestionRequest } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: UpdateRfpQuestionRequest = {
  rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  questionId: "a4ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  rfpQuestion: {
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
    classificationType: "GUEST_ROOM",
    order: 1,
    standardQuestion: {
      id: "50dc08af-24a9-4d01-84be-3d43133dc945",
    },
  },
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                | Example                                                                    |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `rfpId`                                                                    | *string*                                                                   | :heavy_check_mark:                                                         | The unique identifier of the RFP we are requesting                         | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                       |
| `questionId`                                                               | *string*                                                                   | :heavy_check_mark:                                                         | The unique identifier of the Question.                                     | a4ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                       |
| `rfpQuestion`                                                              | [components.RfpQuestionInput](../../models/components/rfpquestioninput.md) | :heavy_check_mark:                                                         | Request body for updating an RFP question.                                 |                                                                            |