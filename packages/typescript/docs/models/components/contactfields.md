# ContactFields

An array of standard contact fields supported by Cvent.

## Example Usage

```typescript
import { ContactFields } from "@cvent/sdk/models/components";

let value: ContactFields = {
  data: [
    {
      id: "2bdf796c-be98-454b-b8cc-0b63abf4b300",
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

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `data`                                                                       | [components.ContactFieldJson](../../models/components/contactfieldjson.md)[] | :heavy_check_mark:                                                           | Collection of standard contact fields.                                       |