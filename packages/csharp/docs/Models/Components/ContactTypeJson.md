# ContactTypeJson

This entity represents a contact type at contact level.


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `Id`                                                  | *string*                                              | :heavy_check_mark:                                    | The ID of the contact type.                           |                                                       |
| `Code`                                                | *string*                                              | :heavy_check_mark:                                    | The contact type code. Must be unique in the account. | VIP                                                   |
| `Name`                                                | *string*                                              | :heavy_check_mark:                                    | Name of the contact type.                             | VIP Attendee                                          |
| `Description`                                         | *string*                                              | :heavy_minus_sign:                                    | Description of the contact type.                      | Very important attendee.                              |