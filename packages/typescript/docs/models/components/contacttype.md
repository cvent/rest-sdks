# ContactType

This entity represents a contact type at contact level.

## Example Usage

```typescript
import { ContactType } from "@cvent/sdk/models/components";

let value: ContactType = {
  id: "48915621-1b82-4bdc-916c-5d665da3372f",
  code: "VIP",
  name: "VIP Attendee",
  description: "Very important attendee.",
  active: true,
};
```

## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `id`                                                  | *string*                                              | :heavy_check_mark:                                    | The ID of the contact type.                           |                                                       |
| `code`                                                | *string*                                              | :heavy_check_mark:                                    | The contact type code. Must be unique in the account. | VIP                                                   |
| `name`                                                | *string*                                              | :heavy_check_mark:                                    | Name of the contact type.                             | VIP Attendee                                          |
| `description`                                         | *string*                                              | :heavy_minus_sign:                                    | Description of the contact type.                      | Very important attendee.                              |
| `active`                                              | *boolean*                                             | :heavy_minus_sign:                                    | Indicates whether the contact type is active.         | true                                                  |