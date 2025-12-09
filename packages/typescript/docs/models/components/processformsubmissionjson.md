# ProcessFormSubmissionJson

Represents a process form submission in the context of a specific event.

## Example Usage

```typescript
import { ProcessFormSubmissionJson } from "@cvent/sdk/models/components";

let value: ProcessFormSubmissionJson = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  id: "f66a6cb0-4531-0f3a-cb1a-64f3017f1149",
  event: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  processForm: {
    id: "9c97eb50-9f88-4972-a603-f617fc3258dd",
  },
  status: "initialized",
  questions: [
    {
      id: "f1ea56cd-6860-4f1a-baf7-973118384384",
      name: "What is your favorite color?",
      type: "Currency",
      value: [
        "Green",
      ],
    },
  ],
};
```

## Fields

| Field                                                                                                                                           | Type                                                                                                                                            | Required                                                                                                                                        | Description                                                                                                                                     | Example                                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| `created`                                                                                                                                       | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                                                   | :heavy_minus_sign:                                                                                                                              | The ISO 8601 zoned date time when this record was created.                                                                                      | 2017-01-02T02:00:00Z                                                                                                                            |
| `createdBy`                                                                                                                                     | *string*                                                                                                                                        | :heavy_minus_sign:                                                                                                                              | The identifier of the user that created this record.                                                                                            | hporter                                                                                                                                         |
| `lastModified`                                                                                                                                  | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                                                   | :heavy_minus_sign:                                                                                                                              | The ISO 8601 zoned date time when this record was updated.                                                                                      | 2019-02-12T03:00:00Z                                                                                                                            |
| `lastModifiedBy`                                                                                                                                | *string*                                                                                                                                        | :heavy_minus_sign:                                                                                                                              | The identifier of the user that last updated this record.                                                                                       | hporter                                                                                                                                         |
| `id`                                                                                                                                            | *string*                                                                                                                                        | :heavy_minus_sign:                                                                                                                              | The unique ID representing the process form submission.                                                                                         | f66a6cb0-4531-0f3a-cb1a-64f3017f1149                                                                                                            |
| `event`                                                                                                                                         | [components.ProcessFormSubmissionJsonEvent](../../models/components/processformsubmissionjsonevent.md)                                          | :heavy_minus_sign:                                                                                                                              | The event which the process form submission is associated with.                                                                                 |                                                                                                                                                 |
| `processForm`                                                                                                                                   | [components.ProcessFormJson](../../models/components/processformjson.md)                                                                        | :heavy_minus_sign:                                                                                                                              | An object that contains the process form ID.<br/><br/>This is an **expandable** object and if requested will contain the name of a process form object. |                                                                                                                                                 |
| `status`                                                                                                                                        | *string*                                                                                                                                        | :heavy_minus_sign:                                                                                                                              | The status of the process form submission. The status is planner defined and can be any string.                                                 | initialized                                                                                                                                     |
| `questions`                                                                                                                                     | [components.ProcessFormSubmissionQuestionJson](../../models/components/processformsubmissionquestionjson.md)[]                                  | :heavy_minus_sign:                                                                                                                              | The list of possible answers to a question.                                                                                                     |                                                                                                                                                 |