# EmailSendStatus

The response from a request to get the list of recipients with email status.

## Example Usage

```typescript
import { EmailSendStatus } from "@cvent/sdk/models/components";

let value: EmailSendStatus = {
  emailRequestId: "3A541E55-3367-4C50-B21B-B6A7613DFB23",
  requestedDate: new Date("2017-01-02T02:00:00Z"),
  requestedBy: "Requester",
  recipientStatus: [],
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `emailRequestId`                                                                              | *string*                                                                                      | :heavy_check_mark:                                                                            | ID of the send email request.                                                                 | 3A541E55-3367-4C50-B21B-B6A7613DFB23                                                          |
| `requestedDate`                                                                               | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_check_mark:                                                                            | The ISO 8601 zoned date time (in UTC) when this request was made.                             | 2017-01-02T02:00:00Z                                                                          |
| `requestedBy`                                                                                 | *string*                                                                                      | :heavy_check_mark:                                                                            | The identifier of the user that requested this record.                                        | Requester                                                                                     |
| `recipientStatus`                                                                             | [components.RecipientsDataJson](../../models/components/recipientsdatajson.md)[]              | :heavy_check_mark:                                                                            | A list of recipients to whom emails were tried to send.                                       |                                                                                               |