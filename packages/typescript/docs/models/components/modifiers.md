# Modifiers

Specifies reservation options for customizing reservation behavior.

## Example Usage

```typescript
import { Modifiers } from "@cvent/sdk/models/components";

let value: Modifiers = {
  allowWaitList: true,
};
```

## Fields

| Field                                       | Type                                        | Required                                    | Description                                 | Example                                     |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| `allowWaitList`                             | *boolean*                                   | :heavy_minus_sign:                          | Indicates if waitlisted nights are allowed. | true                                        |