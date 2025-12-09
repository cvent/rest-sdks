# ChatMessageDetailsJson

Chat message details such as the ID of this message

## Example Usage

```typescript
import { ChatMessageDetailsJson } from "@cvent/sdk/models/components";

let value: ChatMessageDetailsJson = {
  id: "6dc0fe3d-4d1c-4bc6-af22-7d9126388388",
  textHtml: "Great presentation today!",
};
```

## Fields

| Field                                       | Type                                        | Required                                    | Description                                 | Example                                     |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| `id`                                        | *string*                                    | :heavy_check_mark:                          | The message ID within the messaging system. | 6dc0fe3d-4d1c-4bc6-af22-7d9126388388        |
| `textHtml`                                  | *string*                                    | :heavy_minus_sign:                          | The HTML content of the chat message.       | Great presentation today!                   |