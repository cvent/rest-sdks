# UserGroupJson

A collection of account users which is used to help manage access and visibility to various other Cvent domain entities like events, surveys, account emails, and more. For example, a user group can be associated to specific events to allow the users within that group to view the events within Cvent's platform.

## Example Usage

```typescript
import { UserGroupJson } from "@cvent/sdk/models/components";

let value: UserGroupJson = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  id: "EBF2273A-35A5-BD67-A292-397539D13270",
  name: "MyUserGroup",
  description: "MyUserGroupDescription",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_check_mark:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_check_mark:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_check_mark:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_check_mark:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `id`                                                                                          | *string*                                                                                      | :heavy_check_mark:                                                                            | The unique identifier of the user group.                                                      | EBF2273A-35A5-BD67-A292-397539D13270                                                          |
| `name`                                                                                        | *string*                                                                                      | :heavy_check_mark:                                                                            | The name of the user group.                                                                   | MyUserGroup                                                                                   |
| `description`                                                                                 | *string*                                                                                      | :heavy_minus_sign:                                                                            | The description of the user group.                                                            | MyUserGroupDescription                                                                        |