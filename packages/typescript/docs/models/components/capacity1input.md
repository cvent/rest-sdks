# Capacity1Input

Represents capacity statistics of the registration type.

## Example Usage

```typescript
import { Capacity1Input } from "@cvent/sdk/models/components";

let value: Capacity1Input = {
  total: 100,
};
```

## Fields

| Field                                                                                                     | Type                                                                                                      | Required                                                                                                  | Description                                                                                               | Example                                                                                                   |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `total`                                                                                                   | *number*                                                                                                  | :heavy_check_mark:                                                                                        | The total capacity of an event item, such as registration type. A value of -1 denotes unlimited capacity. | 100                                                                                                       |