# SendEmailRequest

Request object to send an email to one or more eMarketing campaign recipients.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `templateId`                                                                     | *String*                                                                         | :heavy_check_mark:                                                               | The template ID of the eMarketing email to be sent.                              | 12345                                                                            |
| `recipients`                                                                     | List\<[RecipientsRequestJson](../../models/components/RecipientsRequestJson.md)> | :heavy_check_mark:                                                               | Array of one or more recipients whom emails need to be sent.                     |                                                                                  |