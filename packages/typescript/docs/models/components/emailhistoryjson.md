# EmailHistoryJson

Email History record.

## Example Usage

```typescript
import { EmailHistoryJson } from "@cvent/sdk/models/components";

let value: EmailHistoryJson = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  id: "kn4rznpgm2cx43-qx47948p",
  event: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  contact: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  attendee: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  subject: "Event Invitation",
  from: "example@example.com",
  to: "example@example.com",
  type: "Invitation",
  sent: new Date("2017-01-02T02:30:00Z"),
  status: "Sent",
  undeliverable: false,
  opened: false,
  firstOpened: new Date("2017-01-02T02:30:00Z"),
  clicked: false,
  firstClicked: new Date("2017-01-02T02:30:00Z"),
  bounced: false,
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | Unique Id of an email history record.                                                         | kn4rznpgm2cx43-qx47948p                                                                       |
| `event`                                                                                       | [components.EmailHistoryJsonEvent](../../models/components/emailhistoryjsonevent.md)          | :heavy_minus_sign:                                                                            | Event Id for email history record.                                                            |                                                                                               |
| `contact`                                                                                     | [components.EmailHistoryJsonContact](../../models/components/emailhistoryjsoncontact.md)      | :heavy_minus_sign:                                                                            | Contact Id for email history record.                                                          |                                                                                               |
| `attendee`                                                                                    | [components.EmailHistoryJsonAttendee](../../models/components/emailhistoryjsonattendee.md)    | :heavy_minus_sign:                                                                            | Attendee Id for email history record.                                                         |                                                                                               |
| `subject`                                                                                     | *string*                                                                                      | :heavy_minus_sign:                                                                            | Subject of the email.                                                                         | Event Invitation                                                                              |
| `from`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | From email address of the email.                                                              | example@example.com                                                                           |
| `to`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | Recipient address of the email.                                                               | example@example.com                                                                           |
| `type`                                                                                        | [components.EmailTypeJson3](../../models/components/emailtypejson3.md)                        | :heavy_minus_sign:                                                                            | Denotes the type of the email.                                                                | Invitation                                                                                    |
| `sent`                                                                                        | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this email was sent.                                        | 2017-01-02T02:30:00Z                                                                          |
| `status`                                                                                      | [components.EmailStatusJson](../../models/components/emailstatusjson.md)                      | :heavy_minus_sign:                                                                            | This is used to denote the status of the email sending                                        | Sent                                                                                          |
| `undeliverable`                                                                               | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | Flag to indicate if email was undelivered.                                                    | false                                                                                         |
| `opened`                                                                                      | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | Flag to indicate if email was opened.                                                         | false                                                                                         |
| `firstOpened`                                                                                 | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when the email was first opened.                                 | 2017-01-02T02:30:00Z                                                                          |
| `clicked`                                                                                     | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | Flag to indicate if any link in the email was clicked.                                        | false                                                                                         |
| `firstClicked`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when any link in the email was first clicked.                    | 2017-01-02T02:30:00Z                                                                          |
| `bounced`                                                                                     | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | Flag to indicate if the email was bounced.                                                    | false                                                                                         |