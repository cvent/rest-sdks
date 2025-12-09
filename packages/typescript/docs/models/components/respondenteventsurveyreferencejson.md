# RespondentEventSurveyReferenceJson

Respondent event survey reference.

## Example Usage

```typescript
import { RespondentEventSurveyReferenceJson } from "@cvent/sdk/models/components";

let value: RespondentEventSurveyReferenceJson = {
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

| Field                                                                                                                        | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  | Example                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                         | *string*                                                                                                                     | :heavy_minus_sign:                                                                                                           | Respondent chapter reference ID.                                                                                             |                                                                                                                              |
| `status`                                                                                                                     | [components.StatusJson](../../models/components/statusjson.md)                                                               | :heavy_minus_sign:                                                                                                           | In case of Event Survey this represents Survey Status and in case of Standard Survey this represents Chapter Status          | In Progress                                                                                                                  |
| `score`                                                                                                                      | *number*                                                                                                                     | :heavy_minus_sign:                                                                                                           | Score                                                                                                                        | 70                                                                                                                           |
| `maxPossibleScore`                                                                                                           | *number*                                                                                                                     | :heavy_minus_sign:                                                                                                           | Maximum Possible Score                                                                                                       | 100                                                                                                                          |
| `percentageScore`                                                                                                            | *number*                                                                                                                     | :heavy_minus_sign:                                                                                                           | Percentage Score                                                                                                             | 70                                                                                                                           |
| `session`                                                                                                                    | [components.RespondentEventSurveyReferenceJsonSession](../../models/components/respondenteventsurveyreferencejsonsession.md) | :heavy_minus_sign:                                                                                                           | Associated session.                                                                                                          |                                                                                                                              |