# AdvancedLogicChoices

This is used to denote which custom field choices to display when a source custom field choice is selected.

## Example Usage

```typescript
import { AdvancedLogicChoices } from "@cvent/sdk/models/components";

let value: AdvancedLogicChoices = {
  sourceCustomFieldChoice: "3d1a68ef-4dac-43a3-8884-9be7f90b6f11",
};
```

## Fields

| Field                                                                                                                      | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `sourceCustomFieldChoice`                                                                                                  | *string*                                                                                                                   | :heavy_check_mark:                                                                                                         | The ID of a choice of the source custom field.                                                                             |
| `choices`                                                                                                                  | *string*[]                                                                                                                 | :heavy_minus_sign:                                                                                                         | The choices to display if the associated source custom field choice is selected. Leave empty to have no choices displayed. |