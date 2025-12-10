# MessageRecipientsResponseJsonAttendee

The attendee object

## Example Usage

```typescript
import { MessageRecipientsResponseJsonAttendee } from "@cvent/sdk/models/components";

let value: MessageRecipientsResponseJsonAttendee = {
  id: "0a459133-1f5e-43b2-8694-7da9541b3f58",
  active: false,
  leftChannelAt: new Date("2025-03-13T18:00:00.000Z"),
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `id`                                                                                          | *string*                                                                                      | :heavy_check_mark:                                                                            | Unique identifier for the attendee.                                                           | 0a459133-1f5e-43b2-8694-7da9541b3f58                                                          |
| `active`                                                                                      | *boolean*                                                                                     | :heavy_check_mark:                                                                            | True indicates the recipient is active in the channel.                                        | false                                                                                         |
| `leftChannelAt`                                                                               | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | ISO 8601 formatted timestamp when the attendee left the channel, if applicable.               | 2025-03-13T18:00:00.000Z                                                                      |