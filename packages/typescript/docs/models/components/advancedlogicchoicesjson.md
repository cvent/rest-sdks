# AdvancedLogicChoicesJson

This is used to denote which custom field choices to display when a source custom field choice is selected.

## Example Usage

```typescript
import { AdvancedLogicChoicesJson } from "@cvent/sdk/models/components";

let value: AdvancedLogicChoicesJson = {
  sourceCustomFieldChoice: "d8d7203e-ba6a-4de5-9bc2-542bf0639215",
};
```

## Fields

| Field                                                                                                                      | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `sourceCustomFieldChoice`                                                                                                  | *string*                                                                                                                   | :heavy_check_mark:                                                                                                         | The ID of a choice of the source custom field.                                                                             |
| `choices`                                                                                                                  | *string*[]                                                                                                                 | :heavy_minus_sign:                                                                                                         | The choices to display if the associated source custom field choice is selected. Leave empty to have no choices displayed. |