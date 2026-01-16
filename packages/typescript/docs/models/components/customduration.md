# CustomDuration

Represents a custom membership duration. Required when the duration property is set to 'Custom'.

## Example Usage

```typescript
import { CustomDuration } from "@cvent/sdk/models/components";

let value: CustomDuration = {
  days: 120,
};
```

## Fields

| Field                                           | Type                                            | Required                                        | Description                                     | Example                                         |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `days`                                          | *number*                                        | :heavy_minus_sign:                              | The custom duration in days for the membership. | 120                                             |