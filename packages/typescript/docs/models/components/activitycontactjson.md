# ActivityContactJson

An activity contact.

## Example Usage

```typescript
import { ActivityContactJson } from "@cvent/sdk/models/components";

let value: ActivityContactJson = {
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