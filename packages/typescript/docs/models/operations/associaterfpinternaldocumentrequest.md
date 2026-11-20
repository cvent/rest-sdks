# AssociateRfpInternalDocumentRequest

## Example Usage

```typescript
import { AssociateRfpInternalDocumentRequest } from "@cvent/sdk/models/operations";

let value: AssociateRfpInternalDocumentRequest = {
  rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  documentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                              | Type                                               | Required                                           | Description                                        | Example                                            |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `rfpId`                                            | *string*                                           | :heavy_check_mark:                                 | The unique identifier of the RFP we are requesting | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3               |
| `documentId`                                       | *string*                                           | :heavy_check_mark:                                 | The unique identifier of a file.                   | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3               |