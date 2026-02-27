# CustomField1Input

A Custom Field

## Example Usage

```typescript
import { CustomField1Input } from "@cvent/sdk/models/components";

let value: CustomField1Input = {
  id: "8a73bee1-213f-4682-a1ea-832455f26968",
  value: [
    "Choice C",
    "Choice A",
  ],
  type: "MultiSelect",
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `id`                                                                                             | *string*                                                                                         | :heavy_check_mark:                                                                               | The unique ID representing this custom field.                                                    |                                                                                                  |
| `value`                                                                                          | *string*[]                                                                                       | :heavy_check_mark:                                                                               | The set of answers or possible answers to a question.                                            | [<br/>"Choice C",<br/>"Choice A"<br/>]                                                           |
| `type`                                                                                           | [components.CustomField1CustomFieldType](../../models/components/customfield1customfieldtype.md) | :heavy_minus_sign:                                                                               | The type of data collected by a custom field.                                                    | MultiSelect                                                                                      |