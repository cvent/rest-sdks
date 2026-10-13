# ContactField

Contains contact data. For example, a User's email address.

## Example Usage

```typescript
import { ContactField } from "@cvent/sdk/models/components";

let value: ContactField = {
  id: "bd93a1cf-3d84-442b-b023-f86f0e22af92",
  name: "Email Address",
  maximumLength: 80,
  type: "String",
  value: [
    "johndoe@cvent.com",
  ],
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                | Example                                                                    |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `id`                                                                       | *string*                                                                   | :heavy_check_mark:                                                         | The unique ID of the field supported by Cvent.                             |                                                                            |
| `name`                                                                     | *string*                                                                   | :heavy_check_mark:                                                         | The name of the field.                                                     | Email Address                                                              |
| `maximumLength`                                                            | *number*                                                                   | :heavy_check_mark:                                                         | The maximum length allowed for a value.                                    | 80                                                                         |
| `type`                                                                     | [components.ContactFieldType](../../models/components/contactfieldtype.md) | :heavy_check_mark:                                                         | The type of the field.                                                     | String                                                                     |
| `value`                                                                    | *string*[]                                                                 | :heavy_minus_sign:                                                         | The value(s) of the field.                                                 |                                                                            |