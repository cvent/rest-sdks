# BounceDetailsJson

Email bounce details.

## Example Usage

```typescript
import { BounceDetailsJson } from "@cvent/sdk/models/components";

let value: BounceDetailsJson = {
  recipient: {
    id: "2A941E55-3367-4C50-B21B-B6A7613DFB23",
    firstName: "Brett",
    lastName: "Lawler",
    emailAddress: "brett.lawler@example.com",
  },
  bounceReason: "5.7.1 (delivery not authorized)",
  bounceDateTime: new Date("2023-01-02T02:00:00Z"),
  smtpCode: 500,
  dsnDiagnostics: "smtp;500 5.7.1 (delivery not authorized)",
  optOut: true,
  subject: "Invitation to the event",
  productLine: "EVENT",
  productId: "2A941E55-3367-4C50-B21B-B6A7613DFB23",
  emailType: "Invitation",
  emailId: "2A941E55-3367-4C50-B21B-B6A7613DFB23",
  created: new Date("2023-01-01T02:00:00Z"),
};
```

## Fields

| Field                                                                                           | Type                                                                                            | Required                                                                                        | Description                                                                                     | Example                                                                                         |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `recipient`                                                                                     | [components.RecipientJson](../../models/components/recipientjson.md)                            | :heavy_minus_sign:                                                                              | Information of the recipient.                                                                   |                                                                                                 |
| `bounceReason`                                                                                  | *string*                                                                                        | :heavy_minus_sign:                                                                              | Reason of bounce.                                                                               | 5.7.1 (delivery not authorized)                                                                 |
| `bounceDateTime`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)   | :heavy_minus_sign:                                                                              | ISO 8601 formatted date time (in UTC) when the email bounced or there was an error.             | 2023-01-02T02:00:00Z                                                                            |
| `smtpCode`                                                                                      | *number*                                                                                        | :heavy_minus_sign:                                                                              | SMTP code returned by the server in response to an email, indicating the status of the message. | 500                                                                                             |
| `dsnDiagnostics`                                                                                | *string*                                                                                        | :heavy_minus_sign:                                                                              | Delivery Status Notification (DSN) diagnostic details for the email.                            | smtp;500 5.7.1 (delivery not authorized)                                                        |
| `optOut`                                                                                        | *boolean*                                                                                       | :heavy_minus_sign:                                                                              | True indicates the recipient has requested not to be sent emails.                               | true                                                                                            |
| `subject`                                                                                       | *string*                                                                                        | :heavy_minus_sign:                                                                              | Subject of email.                                                                               | Invitation to the event                                                                         |
| `productLine`                                                                                   | [components.ProductLineJson](../../models/components/productlinejson.md)                        | :heavy_minus_sign:                                                                              | Cvent product lines or additional features.                                                     | EVENT                                                                                           |
| `productId`                                                                                     | *string*                                                                                        | :heavy_minus_sign:                                                                              | Unique ID of the product.                                                                       | 2A941E55-3367-4C50-B21B-B6A7613DFB23                                                            |
| `emailType`                                                                                     | [components.EmailTypeJson3](../../models/components/emailtypejson3.md)                          | :heavy_minus_sign:                                                                              | Denotes the type of the email.                                                                  | Invitation                                                                                      |
| `emailId`                                                                                       | *string*                                                                                        | :heavy_minus_sign:                                                                              | Unique ID of the email.                                                                         | 2A941E55-3367-4C50-B21B-B6A7613DFB23                                                            |
| `created`                                                                                       | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)   | :heavy_minus_sign:                                                                              | The ISO 8601 formatted date time (in UTC) when the email was sent.                              | 2023-01-01T02:00:00Z                                                                            |