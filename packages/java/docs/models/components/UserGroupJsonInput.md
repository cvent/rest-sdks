# UserGroupJsonInput

A collection of account users which is used to help manage access and visibility to various other Cvent domain entities like events, surveys, account emails, and more. For example, a user group can be associated to specific events to allow the users within that group to view the events within Cvent's platform.


## Fields

| Field                              | Type                               | Required                           | Description                        | Example                            |
| ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- |
| `name`                             | *String*                           | :heavy_check_mark:                 | The name of the user group.        | MyUserGroup                        |
| `description`                      | *Optional\<String>*                | :heavy_minus_sign:                 | The description of the user group. | MyUserGroupDescription             |