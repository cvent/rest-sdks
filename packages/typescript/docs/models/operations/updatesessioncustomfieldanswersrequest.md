# UpdateSessionCustomFieldAnswersRequest

## Example Usage

```typescript
import { UpdateSessionCustomFieldAnswersRequest } from "@cvent/sdk/models/operations";

let value: UpdateSessionCustomFieldAnswersRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  customFieldId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  customField1: {
    id: "fca6a3ef-96a5-40fe-a652-65eabffdde13",
    value: [
      "Choice C",
      "Choice A",
    ],
    type: "MultiSelect",
  },
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `id`                                                                         | *string*                                                                     | :heavy_check_mark:                                                           | Unique Id of a session                                                       | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                         |
| `customFieldId`                                                              | *string*                                                                     | :heavy_check_mark:                                                           | Unique Id of a custom field                                                  | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                         |
| `customField1`                                                               | [components.CustomField1Input](../../models/components/customfield1input.md) | :heavy_check_mark:                                                           | Contains the custom field you're updating, and the new answer.               |                                                                              |