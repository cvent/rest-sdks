# ContactCommonJson

Details of a contact.

## Example Usage

```typescript
import { ContactCommonJson } from "@cvent/sdk/models/components";

let value: ContactCommonJson = {
  firstName: "Henry",
  lastName: "Potterfield",
  email: "h.potterfield@test.com",
};
```

## Fields

| Field                             | Type                              | Required                          | Description                       | Example                           |
| --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- |
| `id`                              | *string*                          | :heavy_minus_sign:                | Contact ID                        |                                   |
| `firstName`                       | *string*                          | :heavy_minus_sign:                | The first name of the contact.    | Henry                             |
| `lastName`                        | *string*                          | :heavy_minus_sign:                | The last name of the contact.     | Potterfield                       |
| `email`                           | *string*                          | :heavy_minus_sign:                | The email address of the contact. | h.potterfield@test.com            |