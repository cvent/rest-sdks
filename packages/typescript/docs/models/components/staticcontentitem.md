# StaticContentItem

Represents a single static content field with its value and sequence order

## Example Usage

```typescript
import { StaticContentItem } from "@cvent/sdk/models/components";

let value: StaticContentItem = {
  fieldName: "propertyName",
  sequence: 1,
  value: "Grand Hotel Downtown",
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            | Example                                                                                |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `fieldName`                                                                            | *string*                                                                               | :heavy_check_mark:                                                                     | The name of the static content field (e.g., propertyName, numberOfRooms, extendedStay) | propertyName                                                                           |
| `sequence`                                                                             | *number*                                                                               | :heavy_check_mark:                                                                     | Sequence number for ordering the static content items                                  | 1                                                                                      |
| `value`                                                                                | *string*                                                                               | :heavy_minus_sign:                                                                     | The value of the static content field                                                  | Grand Hotel Downtown                                                                   |