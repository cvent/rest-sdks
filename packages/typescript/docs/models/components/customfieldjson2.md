# CustomFieldJson2

A survey custom field.

## Example Usage

```typescript
import { CustomFieldJson2 } from "@cvent/sdk/models/components";

let value: CustomFieldJson2 = {
  id: "bd57aeda-3483-4bcf-886e-c976e9f4454a",
  name: "What is a your favorite color?",
  code: "FAVORITE_COLOR_CODE",
  type: "Open Ended Text - One Line",
  values: [
    "Green",
    "Blue",
  ],
};
```

## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              | Example                                                                                                  |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                     | *string*                                                                                                 | :heavy_check_mark:                                                                                       | The unique id representing this custom field.                                                            | bd57aeda-3483-4bcf-886e-c976e9f4454a                                                                     |
| `name`                                                                                                   | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | The actual text of the custom field.                                                                     | What is a your favorite color?                                                                           |
| `code`                                                                                                   | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | Code to uniquely identify custom field.                                                                  | FAVORITE_COLOR_CODE                                                                                      |
| `type`                                                                                                   | [components.CustomFieldJson2CustomFieldType](../../models/components/customfieldjson2customfieldtype.md) | :heavy_minus_sign:                                                                                       | N/A                                                                                                      | Open Ended Text - One Line                                                                               |
| `values`                                                                                                 | *string*[]                                                                                               | :heavy_check_mark:                                                                                       | The set of values or possible values to a custom field.                                                  | [<br/>"Green",<br/>"Blue"<br/>]                                                                          |