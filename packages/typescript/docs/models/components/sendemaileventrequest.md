# SendEmailEventRequest

Request object to send an email to one or more event attendees.

## Example Usage

```typescript
import { SendEmailEventRequest } from "@cvent/sdk/models/components";

let value: SendEmailEventRequest = {
  event: {
    id: "a150f1ee-6c54-4b01-90e6-d701748f0851",
  },
  email: {
    id: "a150f1ee-6c54-4b01-90e6-d701748f0851",
  },
  resendToPreviousRecipients: true,
  attendees: [
    "9A641E55-3367-4C50-B21B-B6A7613DFB23",
  ],
};
```

## Fields

| Field                                                                                                   | Type                                                                                                    | Required                                                                                                | Description                                                                                             | Example                                                                                                 |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `event`                                                                                                 | [components.EventJson10](../../models/components/eventjson10.md)                                        | :heavy_check_mark:                                                                                      | Details of the event.                                                                                   |                                                                                                         |
| `email`                                                                                                 | [components.EmailJson2](../../models/components/emailjson2.md)                                          | :heavy_check_mark:                                                                                      | Details of an email to be send.                                                                         |                                                                                                         |
| `resendToPreviousRecipients`                                                                            | *boolean*                                                                                               | :heavy_check_mark:                                                                                      | True indicates this email should be resent to attendees who had already received this email previously. | true                                                                                                    |
| `attendees`                                                                                             | *string*[]                                                                                              | :heavy_check_mark:                                                                                      | Array of attendee identifiers to whom email is to be sent.                                              |                                                                                                         |