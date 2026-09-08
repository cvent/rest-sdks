# Choices1Input

Choices for a custom field.

## Example Usage

```typescript
import { Choices1Input } from "@cvent/sdk/models/components";

let value: Choices1Input = {
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
| `choices`                                                                                                                                                                                                                | [components.Choice3Input](../../models/components/choice3input.md)[]                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                                                                       | Choices of custom fields.                                                                                                                                                                                                |
| `displayType`                                                                                                                                                                                                            | [components.DisplayType1](../../models/components/displaytype1.md)                                                                                                                                                       | :heavy_minus_sign:                                                                                                                                                                                                       | Display type indicating how to display the choices on UI. For 'Choice - Single Answer' custom field type, this defaults to Dropdown. For 'Choice - Multiple Answers' custom field type, this defaults to MultiSelectBox. |