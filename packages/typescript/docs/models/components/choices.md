# Choices

Choices for a custom field.

## Example Usage

```typescript
import { Choices } from "@cvent/sdk/models/components";

let value: Choices = {
  choices: [
    {
      text: "What is your current designation?",
    },
  ],
};
```

## Fields

| Field                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                     | Required                                                                                                                                                                                                                 | Description                                                                                                                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `choices`                                                                                                                                                                                                                | [components.ChoiceJson4Input](../../models/components/choicejson4input.md)[]                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                       | Choices of custom fields.                                                                                                                                                                                                |
| `displayType`                                                                                                                                                                                                            | [components.ChoicesDisplayTypeJson](../../models/components/choicesdisplaytypejson.md)                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                                                       | Display type indicating how to display the choices on UI. For 'Choice - Single Answer' custom field type, this defaults to Dropdown. For 'Choice - Multiple Answers' custom field type, this defaults to MultiSelectBox. |