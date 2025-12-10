# UpdateSessionCustomFieldAnswersRequest

## Example Usage

```typescript
import { UpdateSessionCustomFieldAnswersRequest } from "@cvent/sdk/models/operations";

let value: UpdateSessionCustomFieldAnswersRequest = {
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
| `id`                                                                       | *string*                                                                   | :heavy_check_mark:                                                         | Unique Id of a session                                                     | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                       |
| `customFieldId`                                                            | *string*                                                                   | :heavy_check_mark:                                                         | Unique Id of a custom field                                                | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                       |
| `customField`                                                              | [components.CustomFieldInput](../../models/components/customfieldinput.md) | :heavy_check_mark:                                                         | Contains the custom field you're updating, and the new answer.             |                                                                            |