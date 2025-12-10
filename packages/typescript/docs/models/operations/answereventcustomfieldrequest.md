# AnswerEventCustomFieldRequest

## Example Usage

```typescript
import { AnswerEventCustomFieldRequest } from "@cvent/sdk/models/operations";

let value: AnswerEventCustomFieldRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  customFieldId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  customField: {
    id: "1b66c479-861d-4de7-9666-fd5487bee091",
    type: "General",
    value: [
      "Choice C",
      "Choice A",
    ],
  },
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                | Example                                                                    |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `id`                                                                       | *string*                                                                   | :heavy_check_mark:                                                         | Unique ID of an event.                                                     | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                       |
| `customFieldId`                                                            | *string*                                                                   | :heavy_check_mark:                                                         | Unique ID of the custom field.                                             | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                       |
| `customField`                                                              | [components.CustomFieldInput](../../models/components/customfieldinput.md) | :heavy_check_mark:                                                         | Custom field answer you're updating.                                       |                                                                            |