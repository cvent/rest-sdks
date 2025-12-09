# EmailUndelivered

An email-undelivered activity.

## Example Usage

```typescript
import { EmailUndelivered } from "@cvent/sdk/models/components";

let value: EmailUndelivered = {
  type: "Invitation Reminder",
  contact: {
    firstName: "Henry",
    lastName: "Potterfield",
    email: "h.potterfield@test.com",
  },
  undelivered: new Date("2020-02-03T13:00:00.000Z"),
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `type`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | Type of the email.                                                                            | Invitation Reminder                                                                           |
| `contact`                                                                                     | [components.ActivityContactJson](../../models/components/activitycontactjson.md)              | :heavy_minus_sign:                                                                            | An activity contact.                                                                          |                                                                                               |
| `undelivered`                                                                                 | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | ISO 8601 date and time when an email was undelivered.                                         | 2020-02-03T13:00:00.000Z                                                                      |