# EmailBounced

An email-bounced activity.

## Example Usage

```typescript
import { EmailBounced } from "@cvent/sdk/models/components";

let value: EmailBounced = {
  type: "Invitation Reminder",
  reason: "5.x.x - delivery error",
  contact: {
    firstName: "Henry",
    lastName: "Potterfield",
    email: "h.potterfield@test.com",
  },
  bounced: new Date("2020-02-03T13:00:00.000Z"),
  smtpCode: 500,
  dsnDiagnostic: "smtp;500 ESS - global exclusion",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `type`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | Type of the email.                                                                            | Invitation Reminder                                                                           |
| `reason`                                                                                      | *string*                                                                                      | :heavy_minus_sign:                                                                            | Reason for the bounced email.                                                                 | 5.x.x - delivery error                                                                        |
| `contact`                                                                                     | [components.ActivityContactJson](../../models/components/activitycontactjson.md)              | :heavy_minus_sign:                                                                            | An activity contact.                                                                          |                                                                                               |
| `bounced`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | ISO 8601 date and time when an email bounced.                                                 | 2020-02-03T13:00:00.000Z                                                                      |
| `smtpCode`                                                                                    | *number*                                                                                      | :heavy_minus_sign:                                                                            | The Simple Mail Transfer Protocol (SMTP) response status code.                                | 500                                                                                           |
| `dsnDiagnostic`                                                                               | *string*                                                                                      | :heavy_minus_sign:                                                                            | Delivery Status Notification diagnostic details.                                              | smtp;500 ESS - global exclusion                                                               |
| `optOut`                                                                                      | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | Used to denote if a recipient has opted-out of receiving emails.                              | false                                                                                         |