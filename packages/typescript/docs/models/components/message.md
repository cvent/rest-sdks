# Message

An object that contains the message itself or a link to the message allowing it to be downloaded


## Supported Types

### `components.EmailMessage`

```typescript
const value: components.EmailMessage = {
  link: "https://compliance.cvent.com/link/to/an/email",
};
```

### `components.ChatMessage`

```typescript
const value: components.ChatMessage = {
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

### `components.SessionQaMessage`

```typescript
const value: components.SessionQaMessage = {
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
};
```

