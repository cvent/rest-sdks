# UpdateCustomFieldAdvancedLogicRequest

## Example Usage

```typescript
import { UpdateCustomFieldAdvancedLogicRequest } from "@cvent/sdk/models/operations";

let value: UpdateCustomFieldAdvancedLogicRequest = {
  customFieldId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  advancedLogic: {
    sourceCustomFieldId: "7f2f05ec-7df2-4322-9daf-7fe6fd8951e6",
  },
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `customFieldId`                                                      | *string*                                                             | :heavy_check_mark:                                                   | The unique identifier of a custom field.                             | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                 |
| `advancedLogic`                                                      | [components.AdvancedLogic](../../models/components/advancedlogic.md) | :heavy_check_mark:                                                   | Advanced logic rules to apply to the given custom field.             |                                                                      |