# EmailSent

An email-sent activity.

## Example Usage

```typescript
import { EmailSent } from "@cvent/sdk/models/components";

let value: EmailSent = {
  type: "Invitation Reminder",
  sent: new Date("2020-02-03T13:00:00.000Z"),
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `type`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | Type of the email.                                                                            | Invitation Reminder                                                                           |
| `sent`                                                                                        | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | ISO 8601 date and time when an email was sent.                                                | 2020-02-03T13:00:00.000Z                                                                      |