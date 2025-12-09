# ~~ActivityContact~~

Related contact.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

## Example Usage

```typescript
import { ActivityContact } from "@cvent/sdk/models/components";

let value: ActivityContact = {
  firstName: "Henry",
  lastName: "Potterfield",
  email: "h.potterfield@test.com",
};
```

## Fields

| Field                              | Type                               | Required                           | Description                        | Example                            |
| ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- |
| `firstName`                        | *string*                           | :heavy_minus_sign:                 | The first name of the attendee.    | Henry                              |
| `lastName`                         | *string*                           | :heavy_minus_sign:                 | The last name of the attendee.     | Potterfield                        |
| `email`                            | *string*                           | :heavy_minus_sign:                 | The email address of the attendee. | h.potterfield@test.com             |