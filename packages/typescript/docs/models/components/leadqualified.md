# LeadQualified

A qualified lead.

## Example Usage

```typescript
import { LeadQualified } from "@cvent/sdk/models/components";

let value: LeadQualified = {
  exhibitor: {
    code: "CODE_UPDATE_1",
    marketingCode: "MARKETING_CODE_1",
    name: "Example Company",
  },
  lead: {
    deviceId: "123",
    deviceName: "Jack's iPhone",
    boothStaff: {
      firstName: "John",
      lastName: "Doe",
      email: "h.potterfield@test.com",
    },
  },
  responses: [
    {
      question: {
        id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
        text: "How would you rate this session?",
        code: "CODE_A",
      },
      answers: [
        {
          id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
          text: "How would you rate this session?",
          type: "simple",
        },
      ],
    },
  ],
};
```

## Fields

| Field                                                                                                          | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `exhibitor`                                                                                                    | [components.ActivityExhibitorJson](../../models/components/activityexhibitorjson.md)                           | :heavy_minus_sign:                                                                                             | An activity exhibitor.                                                                                         |
| `lead`                                                                                                         | [components.ActivityLeadJson](../../models/components/activityleadjson.md)                                     | :heavy_minus_sign:                                                                                             | An activity lead.                                                                                              |
| `responses`                                                                                                    | [components.LeadQualifiedQuestionResponseJson](../../models/components/leadqualifiedquestionresponsejson.md)[] | :heavy_minus_sign:                                                                                             | The list of responses provided by the attendee.                                                                |