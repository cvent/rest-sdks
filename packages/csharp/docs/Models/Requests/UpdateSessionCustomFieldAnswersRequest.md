# UpdateSessionCustomFieldAnswersRequest


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       | Example                                                           |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `Id`                                                              | *string*                                                          | :heavy_check_mark:                                                | Unique Id of a session                                            | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                              |
| `CustomFieldId`                                                   | *string*                                                          | :heavy_check_mark:                                                | Unique Id of a custom field                                       | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                              |
| `CustomField1`                                                    | [CustomField1Input](../../Models/Components/CustomField1Input.md) | :heavy_check_mark:                                                | Contains the custom field you're updating, and the new answer.    |                                                                   |