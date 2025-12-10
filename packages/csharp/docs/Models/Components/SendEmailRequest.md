# SendEmailRequest

Request object to send an email to one or more eMarketing campaign recipients.


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     | Example                                                                         |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `TemplateId`                                                                    | *string*                                                                        | :heavy_check_mark:                                                              | The template ID of the eMarketing email to be sent.                             | 12345                                                                           |
| `Recipients`                                                                    | List<[RecipientsRequestJson](../../Models/Components/RecipientsRequestJson.md)> | :heavy_check_mark:                                                              | Array of one or more recipients whom emails need to be sent.                    |                                                                                 |