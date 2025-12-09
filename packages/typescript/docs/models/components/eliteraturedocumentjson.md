# EliteratureDocumentJson

A JSON schema representing an E-literature Document

## Example Usage

```typescript
import { EliteratureDocumentJson } from "@cvent/sdk/models/components";

let value: EliteratureDocumentJson = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  displayName: "Marketing Material",
  type: "FILE",
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `id`                                                                                             | *string*                                                                                         | :heavy_check_mark:                                                                               | Document identifier                                                                              | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                             |
| `displayName`                                                                                    | *string*                                                                                         | :heavy_check_mark:                                                                               | Document display name                                                                            | Marketing Material                                                                               |
| `type`                                                                                           | [components.EliteratureDocumentJsonType](../../models/components/eliteraturedocumentjsontype.md) | :heavy_check_mark:                                                                               | Type of eliterature document                                                                     | FILE                                                                                             |