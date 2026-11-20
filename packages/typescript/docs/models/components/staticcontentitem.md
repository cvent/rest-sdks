# StaticContentItem

A static content field with its value and its sequence order.

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

| Field                                                                                                 | Type                                                                                                  | Required                                                                                              | Description                                                                                           | Example                                                                                               |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `fieldName`                                                                                           | *string*                                                                                              | :heavy_check_mark:                                                                                    | The name of the static content field, for example `propertyName`, `numberOfRooms`, or `extendedStay`. | propertyName                                                                                          |
| `sequence`                                                                                            | *number*                                                                                              | :heavy_check_mark:                                                                                    | The position of the item in the order of the static content items.                                    | 1                                                                                                     |
| `value`                                                                                               | *string*                                                                                              | :heavy_minus_sign:                                                                                    | The value of the static content field.                                                                | Grand Hotel Downtown                                                                                  |