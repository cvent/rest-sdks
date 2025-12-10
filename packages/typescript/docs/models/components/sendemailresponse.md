# SendEmailResponse

Response object containing a request ID and a list of all email responses sent to recipients.

## Example Usage

```typescript
import { SendEmailResponse } from "@cvent/sdk/models/components";

let value: SendEmailResponse = {
  requestId: "3A541E55-3367-4C50-B21B-B6A7613DFB23",
  templateId: "12345",
  recipientResponse: [
    {
      id: "9A641E55-3367-4C50-B21B-B6A7613DFB23",
      status: "In-Progress",
      errorMessage: "Recipient does not exist.",
    },
  ],
  status: "ERROR",
  description: "Cannot send an email to inactive campaign(s).",
};
```

## Fields

| Field                                                                                                              | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        | Example                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `requestId`                                                                                                        | *string*                                                                                                           | :heavy_check_mark:                                                                                                 | The request ID for the eMarketing email send request.                                                              | 3A541E55-3367-4C50-B21B-B6A7613DFB23                                                                               |
| `templateId`                                                                                                       | *string*                                                                                                           | :heavy_check_mark:                                                                                                 | The template ID of the eMarketing email.                                                                           | 12345                                                                                                              |
| `recipientResponse`                                                                                                | [components.RecipientsResponseJson](../../models/components/recipientsresponsejson.md)[]                           | :heavy_check_mark:                                                                                                 | List of responses specifying the status of email request for each recipient.                                       |                                                                                                                    |
| `status`                                                                                                           | [components.SendEmailRequestStatusJson](../../models/components/sendemailrequeststatusjson.md)                     | :heavy_minus_sign:                                                                                                 | Denotes the status of the send email request.                                                                      | ERROR                                                                                                              |
| `description`                                                                                                      | *string*                                                                                                           | :heavy_minus_sign:                                                                                                 | The description of the request status. If the `status` is `ERROR`, this field contains the reason for the failure. | Cannot send an email to inactive campaign(s).                                                                      |