# ContactTransaction

A changeset of contact fields.

## Example Usage

```typescript
import { ContactTransaction } from "@cvent/sdk/models/components";

let value: ContactTransaction = {
  data: [
    {
      name: "Email Address",
      maximumLength: 80,
      type: "String",
      value: [
        "johndoe@cvent.com",
      ],
    },
  ],
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `data`                                                                                 | [components.ContactFieldJsonInput](../../models/components/contactfieldjsoninput.md)[] | :heavy_check_mark:                                                                     | Collection of standard contact fields.                                                 |