# RecipientsResponseJson

Response object indicating the status of send email request for a particular recipient.


## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           | Example                                                               |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `Id`                                                                  | *string*                                                              | :heavy_check_mark:                                                    | The ID of the recipient you're emailing.                              | 9A641E55-3367-4C50-B21B-B6A7613DFB23                                  |
| `Status`                                                              | [SendEmailStatusJson](../../Models/Components/SendEmailStatusJson.md) | :heavy_check_mark:                                                    | It is used to denote the status of the sent email.                    | Accepted                                                              |
| `ErrorMessage`                                                        | *string*                                                              | :heavy_minus_sign:                                                    | The error description describes the reason of a failed email.         | Recipient does not exist.                                             |