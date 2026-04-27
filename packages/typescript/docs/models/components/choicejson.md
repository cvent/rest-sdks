# ChoiceJson

A question choice.

## Example Usage

```typescript
import { ChoiceJson } from "@cvent/sdk/models/components";

let value: ChoiceJson = {
  text:
    "Are you spending any significant time offsite and need transportation?",
  shortText: "Needs offsite transportation?",
  label: "Choice A",
};
```

## Fields

| Field                                                                                                                         | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   | Example                                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                          | *string*                                                                                                                      | :heavy_minus_sign:                                                                                                            | Text field ID.                                                                                                                |                                                                                                                               |
| `text`                                                                                                                        | *string*                                                                                                                      | :heavy_minus_sign:                                                                                                            | Text value of the field. Displays to users in the UI.                                                                         | Are you spending any significant time offsite and need transportation?                                                        |
| `shortText`                                                                                                                   | *string*                                                                                                                      | :heavy_minus_sign:                                                                                                            | Concise version or abbreviation of the question text. Set by the planner to simplify presentation of the question in reports. | Needs offsite transportation?                                                                                                 |
| `label`                                                                                                                       | *string*                                                                                                                      | :heavy_minus_sign:                                                                                                            | Label of choice.                                                                                                              | Choice A                                                                                                                      |