# ChatMessage

A chat message

## Example Usage

```typescript
import { ChatMessage } from "@cvent/sdk/models/components";

let value: ChatMessage = {
  actionType: "message.created",
  chatType: "session",
  attendee: {
    id: "6dc0fe3d-4d1c-4bc6-af22-7d9126388388",
  },
  message: {
    id: "6dc0fe3d-4d1c-4bc6-af22-7d9126388388",
    textHtml: "Great presentation today!",
  },
  parentMessage: {
    id: "6dc0fe3d-4d1c-4bc6-af22-7d9126388388",
    textHtml: "Great presentation today!",
  },
  reaction: {
    type: "lol",
  },
  channel: {
    id: "!members-l_YMstmzbS4lmlS0rQ3XexWJSdQwyEfsCHP1zrSd4uM",
  },
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            | Example                                                                                |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `actionType`                                                                           | [components.ChatActionTypeJson](../../models/components/chatactiontypejson.md)         | :heavy_check_mark:                                                                     | The user action that just occurred                                                     | message.created                                                                        |
| `chatType`                                                                             | [components.ChatTypeJson](../../models/components/chattypejson.md)                     | :heavy_check_mark:                                                                     | The chat type                                                                          | session                                                                                |
| `attendee`                                                                             | [components.AttendeeJson2](../../models/components/attendeejson2.md)                   | :heavy_check_mark:                                                                     | Attendee details                                                                       |                                                                                        |
| `message`                                                                              | [components.ChatMessageDetailsJson](../../models/components/chatmessagedetailsjson.md) | :heavy_check_mark:                                                                     | Chat message details such as the ID of this message                                    |                                                                                        |
| `parentMessage`                                                                        | [components.ChatMessageDetailsJson](../../models/components/chatmessagedetailsjson.md) | :heavy_minus_sign:                                                                     | Chat message details such as the ID of this message                                    |                                                                                        |
| `reaction`                                                                             | [components.ChatReactionJson](../../models/components/chatreactionjson.md)             | :heavy_minus_sign:                                                                     | A reaction to a message                                                                |                                                                                        |
| `channel`                                                                              | [components.ChannelJson](../../models/components/channeljson.md)                       | :heavy_minus_sign:                                                                     | The channel details associated with the chat.                                          |                                                                                        |