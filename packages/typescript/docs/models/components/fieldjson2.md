# FieldJson2

A survey field.

## Example Usage

```typescript
import { FieldJson2 } from "@cvent/sdk/models/components";

let value: FieldJson2 = {
  text: "Field value",
  shortText: "Category 1 Reporting value",
  type: "SingleChoice",
  choices: [
    {
      text: "Field value",
      shortText: "Category 1 Reporting value",
      label: "Choice A",
    },
  ],
  notApplicableAnswer: {
    text: "N/A or Other",
    shortText: "N/A or Other Reporting value",
  },
  otherAnswer: {
    text: "N/A or Other",
    shortText: "N/A or Other Reporting value",
  },
  required: true,
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          | Example                                                                              |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `id`                                                                                 | *string*                                                                             | :heavy_minus_sign:                                                                   | Text field ID.                                                                       |                                                                                      |
| `text`                                                                               | *string*                                                                             | :heavy_minus_sign:                                                                   | text Value of the Field                                                              | Field value                                                                          |
| `shortText`                                                                          | *string*                                                                             | :heavy_minus_sign:                                                                   | Reporting value of the Category, Its like a custom abbreviation                      | Category 1 Reporting value                                                           |
| `type`                                                                               | [components.FieldTypeJson2](../../models/components/fieldtypejson2.md)               | :heavy_minus_sign:                                                                   | Field Type                                                                           | SingleChoice                                                                         |
| `choices`                                                                            | [components.ChoiceJson2](../../models/components/choicejson2.md)[]                   | :heavy_minus_sign:                                                                   | List of choices for this field.                                                      |                                                                                      |
| `notApplicableAnswer`                                                                | [components.AdditionalChoiceJson1](../../models/components/additionalchoicejson1.md) | :heavy_minus_sign:                                                                   | Contains text of additional choice i.e N/A choice or otherAnswer choice              |                                                                                      |
| `otherAnswer`                                                                        | [components.AdditionalChoiceJson1](../../models/components/additionalchoicejson1.md) | :heavy_minus_sign:                                                                   | Contains text of additional choice i.e N/A choice or otherAnswer choice              |                                                                                      |
| `required`                                                                           | *boolean*                                                                            | :heavy_minus_sign:                                                                   | Is this a mandatory field                                                            | true                                                                                 |