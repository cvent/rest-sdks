# RecipientsDataJson

Recipient data contains the recipient's details like ID, name and status of email sent to that recipient.

## Example Usage

```typescript
import { RecipientsDataJson } from "@cvent/sdk/models/components";

let value: RecipientsDataJson = {
  recipientId: "2A941E55-3367-4C50-B21B-B6A7613DFB23",
  recipientName: "User",
  status: "In-Progress",
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `recipientId`                                                                    | *string*                                                                         | :heavy_minus_sign:                                                               | Unique ID of a recipient.                                                        | 2A941E55-3367-4C50-B21B-B6A7613DFB23                                             |
| `recipientName`                                                                  | *string*                                                                         | :heavy_minus_sign:                                                               | Name of the recipient.                                                           | User                                                                             |
| `status`                                                                         | [components.SendEmailStatusJson](../../models/components/sendemailstatusjson.md) | :heavy_minus_sign:                                                               | It is used to denote the status of the sent email.                               | Accepted                                                                         |