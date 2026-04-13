# MeetingRequestCreateJson

A meeting request to create.

## Example Usage

```typescript
import { MeetingRequestCreateJson } from "@cvent/sdk/models/components";

let value: MeetingRequestCreateJson = {
  name: "####test",
  sourceId: "sourceId12",
  questions: [
    {
      id: "f1ea56cd-6860-4f1a-baf7-973118384384",
      value: [
        "Green",
      ],
      answerType: "Other",
      secondaryValue: "The other answer for the question.",
    },
  ],
};
```

## Fields

| Field                                                                                                                                                                                                   | Type                                                                                                                                                                                                    | Required                                                                                                                                                                                                | Description                                                                                                                                                                                             | Example                                                                                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                                                                                                                  | *string*                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                      | The name of the specific meeting request.                                                                                                                                                               | ####test                                                                                                                                                                                                |
| `sourceId`                                                                                                                                                                                              | *string*                                                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                                                      | The ID for the meeting request in an external system. NOTE: This value is expected to be unique for each meeting request within an account. Consider adding the external system name as part of the ID. | sourceId12                                                                                                                                                                                              |
| `questions`                                                                                                                                                                                             | [components.RequestedMeetingRequestQuestionJson](../../models/components/requestedmeetingrequestquestionjson.md)[]                                                                                      | :heavy_check_mark:                                                                                                                                                                                      | Questions for the meeting request.                                                                                                                                                                      |                                                                                                                                                                                                         |