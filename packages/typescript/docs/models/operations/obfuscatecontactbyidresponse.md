# ObfuscateContactByIdResponse

## Example Usage

```typescript
import { ObfuscateContactByIdResponse } from "@cvent/sdk/models/operations";

let value: ObfuscateContactByIdResponse = {
  headers: {},
  result: {
    status: "INITIATED",
  },
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `headers`                                                                                  | Record<string, *string*[]>                                                                 | :heavy_check_mark:                                                                         | N/A                                                                                        |
| `result`                                                                                   | [components.ContactObfuscationStatus](../../models/components/contactobfuscationstatus.md) | :heavy_check_mark:                                                                         | N/A                                                                                        |