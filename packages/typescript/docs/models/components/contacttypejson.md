# ContactTypeJson

This entity represents a contact type at contact level.

## Example Usage

```typescript
import { ContactTypeJson } from "@cvent/sdk/models/components";

let value: ContactTypeJson = {
  id: "9cae4b92-64c4-43c9-9ff0-6b61d0e77398",
  code: "VIP",
  name: "VIP Attendee",
  description: "Very important attendee.",
};
```

## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `id`                                                  | *string*                                              | :heavy_check_mark:                                    | The ID of the contact type.                           |                                                       |
| `code`                                                | *string*                                              | :heavy_check_mark:                                    | The contact type code. Must be unique in the account. | VIP                                                   |
| `name`                                                | *string*                                              | :heavy_check_mark:                                    | Name of the contact type.                             | VIP Attendee                                          |
| `description`                                         | *string*                                              | :heavy_minus_sign:                                    | Description of the contact type.                      | Very important attendee.                              |