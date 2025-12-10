# CategoryJson2

A survey category.

## Example Usage

```typescript
import { CategoryJson2 } from "@cvent/sdk/models/components";

let value: CategoryJson2 = {
  text: "Field value",
  shortText: "Category 1 Reporting value",
  required: true,
};
```

## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `id`                                                            | *string*                                                        | :heavy_minus_sign:                                              | Text field ID.                                                  |                                                                 |
| `text`                                                          | *string*                                                        | :heavy_minus_sign:                                              | text Value of the Field                                         | Field value                                                     |
| `shortText`                                                     | *string*                                                        | :heavy_minus_sign:                                              | Reporting value of the Category, Its like a custom abbreviation | Category 1 Reporting value                                      |
| `required`                                                      | *boolean*                                                       | :heavy_minus_sign:                                              | is the category mandatory for answer                            | true                                                            |