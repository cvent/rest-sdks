# StandardSurveySendEmailResponse

A standard survey, sent-email response.

## Example Usage

```typescript
import { StandardSurveySendEmailResponse } from "@cvent/sdk/models/components";

let value: StandardSurveySendEmailResponse = {
  survey: {
    id: "9463c74e-18c6-401a-a710-ae0f485bf059",
  },
  respondent: {
    id: "9463c74e-18c6-401a-a710-ae0f485bf059",
  },
  emailTemplate: {
    id: "9463c74e-18c6-401a-a710-ae0f485bf059",
  },
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `survey`                                                             | [components.Survey](../../models/components/survey.md)               | :heavy_minus_sign:                                                   | Survey of response.                                                  |
| `respondent`                                                         | [components.Respondent](../../models/components/respondent.md)       | :heavy_minus_sign:                                                   | Respondent of response.                                              |
| `emailTemplate`                                                      | [components.EmailTemplate](../../models/components/emailtemplate.md) | :heavy_minus_sign:                                                   | Email template used.                                                 |