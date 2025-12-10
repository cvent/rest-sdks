# EmailClicked

An email-clicked activity.

## Example Usage

```typescript
import { EmailClicked } from "@cvent/sdk/models/components";

let value: EmailClicked = {
  type: "Invitation Reminder",
  clicked: new Date("2020-02-03T13:00:00.000Z"),
  url: "http://www.cvent.com",
  urlText: "Click Here",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `type`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | Type of the email.                                                                            | Invitation Reminder                                                                           |
| `clicked`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | ISO 8601 date and time when an email link was clicked.                                        | 2020-02-03T13:00:00.000Z                                                                      |
| `url`                                                                                         | *string*                                                                                      | :heavy_minus_sign:                                                                            | The URL clicked in the email.                                                                 | http://www.cvent.com                                                                          |
| `urlText`                                                                                     | *string*                                                                                      | :heavy_minus_sign:                                                                            | The URL text of the link.                                                                     | Click Here                                                                                    |