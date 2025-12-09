# Two

This is used to denote the open ended comment box type of custom field.

## Example Usage

```typescript
import { Two } from "@cvent/sdk/models/components";

let value: Two = {
  minimum: 2,
  maximum: 8,
};
```

## Fields

| Field                              | Type                               | Required                           | Description                        | Example                            |
| ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- |
| `minimum`                          | *number*                           | :heavy_minus_sign:                 | Minimum number/characters allowed. | 2                                  |
| `maximum`                          | *number*                           | :heavy_minus_sign:                 | Maximum number/characters allowed. | 8                                  |