# SendEmailEmarketingResponse

Response object containing a request ID and a list of all email responses sent to recipients.

## Example Usage

```typescript
import { SendEmailEmarketingResponse } from "@cvent/sdk/models/components";

let value: SendEmailEmarketingResponse = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  requestId: "3A541E55-3367-4C50-B21B-B6A7613DFB23",
  status: "ERROR",
  description: "Cannot send an email from deleted event.",
  templateId: "12345::2023-09-22T08:34:21.593Z",
  recipientResponse: [],
};
```

## Fields

| Field                                                                                                        | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  | Example                                                                                                      |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `created`                                                                                                    | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                | :heavy_minus_sign:                                                                                           | The ISO 8601 zoned date time when this record was created.                                                   | 2017-01-02T02:00:00Z                                                                                         |
| `createdBy`                                                                                                  | *string*                                                                                                     | :heavy_minus_sign:                                                                                           | The identifier of the user that created this record.                                                         | hporter                                                                                                      |
| `lastModified`                                                                                               | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                | :heavy_minus_sign:                                                                                           | The ISO 8601 zoned date time when this record was updated.                                                   | 2019-02-12T03:00:00Z                                                                                         |
| `lastModifiedBy`                                                                                             | *string*                                                                                                     | :heavy_minus_sign:                                                                                           | The identifier of the user that last updated this record.                                                    | hporter                                                                                                      |
| `requestId`                                                                                                  | *string*                                                                                                     | :heavy_check_mark:                                                                                           | The request ID for the email send request.                                                                   | 3A541E55-3367-4C50-B21B-B6A7613DFB23                                                                         |
| `status`                                                                                                     | [components.SendEmailRequestStatusJson](../../models/components/sendemailrequeststatusjson.md)               | :heavy_minus_sign:                                                                                           | Denotes the status of the send email request.                                                                | ERROR                                                                                                        |
| `description`                                                                                                | *string*                                                                                                     | :heavy_minus_sign:                                                                                           | The description of the response. If the `status` is `ERROR`, this field contains the reason for the failure. | Cannot send an email from deleted event.                                                                     |
| `templateId`                                                                                                 | *string*                                                                                                     | :heavy_check_mark:                                                                                           | The template ID of the eMarketing email.                                                                     | 12345::2023-09-22T08:34:21.593Z                                                                              |
| `recipientResponse`                                                                                          | [components.RecipientsResponseJson](../../models/components/recipientsresponsejson.md)[]                     | :heavy_check_mark:                                                                                           | List of responses specifying the status of email request for each recipient.                                 |                                                                                                              |