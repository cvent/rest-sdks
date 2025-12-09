# RecipientsDataJson

Recipient data contains the recipient's details like ID, name and status of email sent to that recipient.


## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           | Example                                                               |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `RecipientId`                                                         | *string*                                                              | :heavy_minus_sign:                                                    | Unique ID of a recipient.                                             | 2A941E55-3367-4C50-B21B-B6A7613DFB23                                  |
| `RecipientName`                                                       | *string*                                                              | :heavy_minus_sign:                                                    | Name of the recipient.                                                | User                                                                  |
| `Status`                                                              | [SendEmailStatusJson](../../Models/Components/SendEmailStatusJson.md) | :heavy_minus_sign:                                                    | It is used to denote the status of the sent email.                    | Accepted                                                              |