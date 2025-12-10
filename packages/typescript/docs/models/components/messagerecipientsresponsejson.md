# MessageRecipientsResponseJson

Members of the channel who received a message.

## Example Usage

```typescript
import { MessageRecipientsResponseJson } from "@cvent/sdk/models/components";

let value: MessageRecipientsResponseJson = {
  attendee: {
    id: "0a459133-1f5e-43b2-8694-7da9541b3f58",
    active: false,
    leftChannelAt: new Date("2025-03-13T18:00:00.000Z"),
  },
  channel: {
    id: "production_group_0cb93bab-32d2-4f82-b430-e1911f2348ac",
  },
};
```

## Fields

| Field                                                                                                                | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `attendee`                                                                                                           | [components.MessageRecipientsResponseJsonAttendee](../../models/components/messagerecipientsresponsejsonattendee.md) | :heavy_check_mark:                                                                                                   | The attendee object                                                                                                  |
| `channel`                                                                                                            | [components.Channel](../../models/components/channel.md)                                                             | :heavy_check_mark:                                                                                                   | The channel object                                                                                                   |