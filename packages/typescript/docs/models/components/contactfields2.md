# ContactFields2

An array of standard contact fields supported by Cvent.

## Example Usage

```typescript
import { ContactFields2 } from "@cvent/sdk/models/components";

let value: ContactFields2 = {
  data: [],
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `data`                                                                       | [components.ContactFieldJson](../../models/components/contactfieldjson.md)[] | :heavy_check_mark:                                                           | Collection of standard contact fields.                                       |