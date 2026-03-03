# CustomFieldInput

A Custom Field

## Example Usage

```typescript
import { CustomFieldInput } from "@cvent/sdk/models/components";

let value: CustomFieldInput = {
  id: "1953422f-0c90-4cfc-9d47-3ddac62e4d23",
  type: "MultiSelect",
  value: [
    "Choice C",
    "Choice A",
  ],
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    | Example                                                                                        |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `id`                                                                                           | *string*                                                                                       | :heavy_check_mark:                                                                             | The unique ID representing this custom field.                                                  |                                                                                                |
| `type`                                                                                         | [components.CustomFieldCustomFieldType](../../models/components/customfieldcustomfieldtype.md) | :heavy_minus_sign:                                                                             | The type of data collected by a custom field.                                                  | MultiSelect                                                                                    |
| `value`                                                                                        | *string*[]                                                                                     | :heavy_check_mark:                                                                             | The set of answers or possible answers to a question.                                          | [<br/>"Choice C",<br/>"Choice A"<br/>]                                                         |