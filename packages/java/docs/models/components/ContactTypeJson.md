# ContactTypeJson

This entity represents a contact type at contact level.


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `id`                                                  | *String*                                              | :heavy_check_mark:                                    | The ID of the contact type.                           |                                                       |
| `code`                                                | *String*                                              | :heavy_check_mark:                                    | The contact type code. Must be unique in the account. | VIP                                                   |
| `name`                                                | *String*                                              | :heavy_check_mark:                                    | Name of the contact type.                             | VIP Attendee                                          |
| `description`                                         | *Optional\<String>*                                   | :heavy_minus_sign:                                    | Description of the contact type.                      | Very important attendee.                              |