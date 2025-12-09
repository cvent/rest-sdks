# RecipientsResponseJson

Response object indicating the status of send email request for a particular recipient.

## Example Usage

```typescript
import { RecipientsResponseJson } from "@cvent/sdk/models/components";

let value: RecipientsResponseJson = {
  id: "9A641E55-3367-4C50-B21B-B6A7613DFB23",
  status: "In-Progress",
  errorMessage: "Recipient does not exist.",
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `id`                                                                             | *string*                                                                         | :heavy_check_mark:                                                               | The ID of the recipient you're emailing.                                         | 9A641E55-3367-4C50-B21B-B6A7613DFB23                                             |
| `status`                                                                         | [components.SendEmailStatusJson](../../models/components/sendemailstatusjson.md) | :heavy_check_mark:                                                               | It is used to denote the status of the sent email.                               | Accepted                                                                         |
| `errorMessage`                                                                   | *string*                                                                         | :heavy_minus_sign:                                                               | The error description describes the reason of a failed email.                    | Recipient does not exist.                                                        |