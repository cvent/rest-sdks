# CategoryJson

A question category.

## Example Usage

```typescript
import { CategoryJson } from "@cvent/sdk/models/components";

let value: CategoryJson = {
  text:
    "Are you spending any significant time offsite and need transportation?",
  shortText: "Needs offsite transportation?",
  required: true,
};
```

## Fields

| Field                                                                                                                         | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   | Example                                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                          | *string*                                                                                                                      | :heavy_minus_sign:                                                                                                            | Text field ID.                                                                                                                |                                                                                                                               |
| `text`                                                                                                                        | *string*                                                                                                                      | :heavy_minus_sign:                                                                                                            | Text value of the field. Displays to users in the UI.                                                                         | Are you spending any significant time offsite and need transportation?                                                        |
| `shortText`                                                                                                                   | *string*                                                                                                                      | :heavy_minus_sign:                                                                                                            | Concise version or abbreviation of the question text. Set by the planner to simplify presentation of the question in reports. | Needs offsite transportation?                                                                                                 |
| `required`                                                                                                                    | *boolean*                                                                                                                     | :heavy_minus_sign:                                                                                                            | True indicates the category is mandatory for answer.                                                                          | true                                                                                                                          |