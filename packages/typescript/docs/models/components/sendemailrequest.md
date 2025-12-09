# SendEmailRequest

Request object to send an email to one or more eMarketing campaign recipients.

## Example Usage

```typescript
import { SendEmailRequest } from "@cvent/sdk/models/components";

let value: SendEmailRequest = {
  templateId: "12345",
  recipients: [],
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            | Example                                                                                |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `templateId`                                                                           | *string*                                                                               | :heavy_check_mark:                                                                     | The template ID of the eMarketing email to be sent.                                    | 12345                                                                                  |
| `recipients`                                                                           | [components.RecipientsRequestJson](../../models/components/recipientsrequestjson.md)[] | :heavy_check_mark:                                                                     | Array of one or more recipients whom emails need to be sent.                           |                                                                                        |