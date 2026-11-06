# UpdateAccountUserCustomFieldAnswerRequest

## Example Usage

```typescript
import { UpdateAccountUserCustomFieldAnswerRequest } from "@cvent/sdk/models/operations";

let value: UpdateAccountUserCustomFieldAnswerRequest = {
  userId: "ff8af134-3505-4d67-aaea-1975d8e1327c",
  customFieldId: "497f6eca-6276-4993-bfeb-53cbbbba6f08",
  accountUserCustomField: {
    id: "a1b2c3d4-e5f6-7890-abcd-ef1234567890",
    values: [
      "Choice C",
      "Choice A",
    ],
  },
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `userId`                                                                                         | *string*                                                                                         | :heavy_check_mark:                                                                               | The account user's ID.<br/>                                                                      | ff8af134-3505-4d67-aaea-1975d8e1327c                                                             |
| `customFieldId`                                                                                  | *string*                                                                                         | :heavy_check_mark:                                                                               | The custom field's ID.<br/>                                                                      | 497f6eca-6276-4993-bfeb-53cbbbba6f08                                                             |
| `accountUserCustomField`                                                                         | [components.AccountUserCustomFieldInput](../../models/components/accountusercustomfieldinput.md) | :heavy_check_mark:                                                                               | The account user custom field answer request body.                                               |                                                                                                  |