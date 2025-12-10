# ContactFieldJsonInput

Contains contact data. For example, a User's email address.

## Example Usage

```typescript
import { ContactFieldJsonInput } from "@cvent/sdk/models/components";

let value: ContactFieldJsonInput = {
  name: "Email Address",
  maximumLength: 80,
  type: "String",
  value: [
    "johndoe@cvent.com",
  ],
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `name`                                                                             | *string*                                                                           | :heavy_check_mark:                                                                 | The name of the field.                                                             | Email Address                                                                      |
| `maximumLength`                                                                    | *number*                                                                           | :heavy_check_mark:                                                                 | The maximum length allowed for a value.                                            | 80                                                                                 |
| `type`                                                                             | [components.ContactFieldJsonType](../../models/components/contactfieldjsontype.md) | :heavy_check_mark:                                                                 | The type of the field.                                                             | String                                                                             |
| `value`                                                                            | *string*[]                                                                         | :heavy_minus_sign:                                                                 | The value(s) of the field.                                                         |                                                                                    |