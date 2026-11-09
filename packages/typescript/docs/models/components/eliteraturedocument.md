# ELiteratureDocument

E-literature document.

## Example Usage

```typescript
import { ELiteratureDocument } from "@cvent/sdk/models/components";

let value: ELiteratureDocument = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  displayName: "Marketing Material",
  type: "FILE",
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              | Example                                                                                  |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `id`                                                                                     | *string*                                                                                 | :heavy_check_mark:                                                                       | Document ID.                                                                             | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                     |
| `displayName`                                                                            | *string*                                                                                 | :heavy_check_mark:                                                                       | Display name of the document.                                                            | Marketing Material                                                                       |
| `type`                                                                                   | [components.ELiteratureDocumentType](../../models/components/eliteraturedocumenttype.md) | :heavy_check_mark:                                                                       | Type of the e-literature document.                                                       | FILE                                                                                     |