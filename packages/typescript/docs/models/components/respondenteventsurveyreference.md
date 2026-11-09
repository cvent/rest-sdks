# RespondentEventSurveyReference

Respondent event survey reference.

## Example Usage

```typescript
import { RespondentEventSurveyReference } from "@cvent/sdk/models/components";

let value: RespondentEventSurveyReference = {
  status: "In Progress",
  score: 70,
  maxPossibleScore: 100,
  percentageScore: 70,
  session: {
    id: "9463c74e-18c6-401a-a710-ae0f485bf059",
  },
};
```

## Fields

| Field                                                                                                                | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          | Example                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                 | *string*                                                                                                             | :heavy_minus_sign:                                                                                                   | Respondent chapter reference ID.                                                                                     |                                                                                                                      |
| `status`                                                                                                             | [components.Status](../../models/components/status.md)                                                               | :heavy_minus_sign:                                                                                                   | In case of Event Survey this represents Survey Status and in case of Standard Survey this represents Chapter Status  | In Progress                                                                                                          |
| `score`                                                                                                              | *number*                                                                                                             | :heavy_minus_sign:                                                                                                   | Score                                                                                                                | 70                                                                                                                   |
| `maxPossibleScore`                                                                                                   | *number*                                                                                                             | :heavy_minus_sign:                                                                                                   | Maximum Possible Score                                                                                               | 100                                                                                                                  |
| `percentageScore`                                                                                                    | *number*                                                                                                             | :heavy_minus_sign:                                                                                                   | Percentage Score                                                                                                     | 70                                                                                                                   |
| `session`                                                                                                            | [components.RespondentEventSurveyReferenceSession](../../models/components/respondenteventsurveyreferencesession.md) | :heavy_minus_sign:                                                                                                   | Associated session.                                                                                                  |                                                                                                                      |