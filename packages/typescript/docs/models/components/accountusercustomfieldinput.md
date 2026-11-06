# AccountUserCustomFieldInput

Represents an account user's answer to a custom field.

## Example Usage

```typescript
import { AccountUserCustomFieldInput } from "@cvent/sdk/models/components";

let value: AccountUserCustomFieldInput = {
  id: "a1b2c3d4-e5f6-7890-abcd-ef1234567890",
  values: [
    "Choice C",
    "Choice A",
  ],
};
```

## Fields

| Field                                                                                                                                                                         | Type                                                                                                                                                                          | Required                                                                                                                                                                      | Description                                                                                                                                                                   | Example                                                                                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                          | *string*                                                                                                                                                                      | :heavy_check_mark:                                                                                                                                                            | The custom field's ID.                                                                                                                                                        | a1b2c3d4-e5f6-7890-abcd-ef1234567890                                                                                                                                          |
| `values`                                                                                                                                                                      | *string*[]                                                                                                                                                                    | :heavy_check_mark:                                                                                                                                                            | The custom field answer or answers, represented as an array of strings. Single-answer or text fields contain one string; multiple-answer fields may contain multiple strings. | [<br/>"Choice C",<br/>"Choice A"<br/>]                                                                                                                                        |