# UpdateSessionCustomFieldAnswersRequest


## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `id`                                                            | *String*                                                        | :heavy_check_mark:                                              | Unique Id of a session                                          | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                            |
| `customFieldId`                                                 | *String*                                                        | :heavy_check_mark:                                              | Unique Id of a custom field                                     | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                            |
| `customField`                                                   | [CustomFieldInput](../../models/components/CustomFieldInput.md) | :heavy_check_mark:                                              | Contains the custom field you're updating, and the new answer.  |                                                                 |