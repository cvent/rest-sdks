# CommunicationLogMessageJson

A communication log message.

## Example Usage

```typescript
import { CommunicationLogMessageJson } from "@cvent/sdk/models/components";

let value: CommunicationLogMessageJson = {
  id: "ed36e3de-7b34-4c38-91f6-ecb9c24a3dcd",
  type: "chat",
  created: new Date("2019-07-15T09:00:39Z"),
  tags: {
    "eventId": "11111111-0dc3-487b-953e-86d6abbdf7d3",
  },
  message: {
    actionType: "question.asked",
    attendee: {
      id: "6dc0fe3d-4d1c-4bc6-af22-7d9126388388",
    },
    question: {
      id: "2385098a-ab4e-4e06-b3b7-487cad288587",
      text: "Sample question?",
      status: "approved",
      anonymous: true,
      answer: "Sample answer.",
    },
  },
  attachments: [
    {
      link: "https://foo.com/a/picture/of/a/cat.jpg",
    },
  ],
};
```

## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              | Example                                                                                                  |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                     | *string*                                                                                                 | :heavy_check_mark:                                                                                       | The unique ID of the communication log message.                                                          | ed36e3de-7b34-4c38-91f6-ecb9c24a3dcd                                                                     |
| `type`                                                                                                   | [components.CommunicationLogMessageTypeJson](../../models/components/communicationlogmessagetypejson.md) | :heavy_check_mark:                                                                                       | The type of communication log message.                                                                   |                                                                                                          |
| `created`                                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)            | :heavy_check_mark:                                                                                       | The ISO 8601 zoned date time when this record was created.                                               | 2019-07-15T09:00:39Z                                                                                     |
| `tags`                                                                                                   | Record<string, *string*>                                                                                 | :heavy_minus_sign:                                                                                       | Key/value pairs used for searching/filtering messages.                                                   | {<br/>"eventId": "11111111-0dc3-487b-953e-86d6abbdf7d3"<br/>}                                            |
| `message`                                                                                                | *components.Message*                                                                                     | :heavy_check_mark:                                                                                       | An object that contains the message itself or a link to the message allowing it to be downloaded         |                                                                                                          |
| `attachments`                                                                                            | [components.AttachmentJson1](../../models/components/attachmentjson1.md)[]                               | :heavy_minus_sign:                                                                                       | A collection of attachments that are associated with this message.                                       |                                                                                                          |