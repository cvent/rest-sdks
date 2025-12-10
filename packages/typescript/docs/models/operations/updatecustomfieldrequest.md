# UpdateCustomFieldRequest

## Example Usage

```typescript
import { UpdateCustomFieldRequest } from "@cvent/sdk/models/operations";

let value: UpdateCustomFieldRequest = {
  customFieldId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  existingCustomField: {
    category: "Contact",
    name: "What is a your favorite color?",
    code: "FAVORITE_COLOR_CODE",
    type: "Open Ended Text - One Line",
    details: {
      from: new Date("2021-01-02T02:00:00Z"),
      to: new Date("2021-02-02T02:00:00Z"),
      format: "DateOnlyMonthFirst",
      defaultToCurrentDate: false,
      displayPopUpCalendar: false,
    },
    helpText: "Enter your favorite color.",
    defaultTagText: "Your Division",
  },
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                | Example                                                                                    |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `customFieldId`                                                                            | *string*                                                                                   | :heavy_check_mark:                                                                         | The unique identifier of a custom field.                                                   | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                       |
| `existingCustomField`                                                                      | [components.ExistingCustomFieldInput](../../models/components/existingcustomfieldinput.md) | :heavy_check_mark:                                                                         | Custom field to be updated                                                                 |                                                                                            |