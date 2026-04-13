# UpdateMeetingRequestRequest

## Example Usage

```typescript
import { UpdateMeetingRequestRequest } from "@cvent/sdk/models/operations";

let value: UpdateMeetingRequestRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  requestBody: [
    {
      id: "017f1149-0f3a-4531-b1aa-6f66a6cb04f3",
      name: "Limited MR",
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
      status: "Submitted to Accounting",
      sourceId: "sourceId12",
      statusNote:
        "The status indicates that the request is submitted to accounting",
    },
  ],
};
```

## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  | Example                                                                                      |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `id`                                                                                         | *string*                                                                                     | :heavy_check_mark:                                                                           | Meeting request form ID.                                                                     | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                         |
| `skipRequiredQuestionValidation`                                                             | *boolean*                                                                                    | :heavy_minus_sign:                                                                           | Flag `true` to skip required field validation.                                               |                                                                                              |
| `requestBody`                                                                                | [components.MeetingRequestUpdateJson](../../models/components/meetingrequestupdatejson.md)[] | :heavy_check_mark:                                                                           | Up to **5 meeting requests** can be updated per call.                                        |                                                                                              |