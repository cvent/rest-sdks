# ~~ActivityBoothStaff~~

Booth staff for the lead.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

## Example Usage

```typescript
import { ActivityBoothStaff } from "@cvent/sdk/models/components";

let value: ActivityBoothStaff = {
  firstName: "John",
  lastName: "Doe",
  email: "h.potterfield@test.com",
};
```

## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `id`                                                         | *string*                                                     | :heavy_minus_sign:                                           | The unique identifier of the exhibitor booth staff.          |                                                              |
| `firstName`                                                  | *string*                                                     | :heavy_minus_sign:                                           | The first name of the booth staff that captured the lead.    | John                                                         |
| `lastName`                                                   | *string*                                                     | :heavy_minus_sign:                                           | The last name of the booth staff that captured the lead.     | Doe                                                          |
| `email`                                                      | *string*                                                     | :heavy_minus_sign:                                           | The email address of the booth staff that captured the lead. | h.potterfield@test.com                                       |