# ChoiceJson3

A survey choice.

## Example Usage

```typescript
import { ChoiceJson3 } from "@cvent/sdk/models/components";

let value: ChoiceJson3 = {
  text: "Field value",
  shortText: "Category 1 Reporting value",
  label: "Choice A",
};
```

## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `id`                                                            | *string*                                                        | :heavy_minus_sign:                                              | Text field ID.                                                  |                                                                 |
| `text`                                                          | *string*                                                        | :heavy_minus_sign:                                              | text Value of the Field                                         | Field value                                                     |
| `shortText`                                                     | *string*                                                        | :heavy_minus_sign:                                              | Reporting value of the Category, Its like a custom abbreviation | Category 1 Reporting value                                      |
| `label`                                                         | *string*                                                        | :heavy_minus_sign:                                              | Label of choice                                                 | Choice A                                                        |