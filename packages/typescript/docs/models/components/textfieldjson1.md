# TextFieldJson1

A survey text field.

## Example Usage

```typescript
import { TextFieldJson1 } from "@cvent/sdk/models/components";

let value: TextFieldJson1 = {
  text: "Field value",
  shortText: "Category 1 Reporting value",
};
```

## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `id`                                                            | *string*                                                        | :heavy_minus_sign:                                              | Text field ID.                                                  |                                                                 |
| `text`                                                          | *string*                                                        | :heavy_minus_sign:                                              | text Value of the Field                                         | Field value                                                     |
| `shortText`                                                     | *string*                                                        | :heavy_minus_sign:                                              | Reporting value of the Category, Its like a custom abbreviation | Category 1 Reporting value                                      |