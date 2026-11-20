# RfpAttachmentRequest

Request body for creating an RFP attachment.

## Example Usage

```typescript
import { RfpAttachmentRequest } from "@cvent/sdk/models/components";

let value: RfpAttachmentRequest = {
  file: {
    id: "94a18afa-30ad-407e-87c2-526e1e871a82",
  },
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `file`                                                                   | [components.ReferenceToFile](../../models/components/referencetofile.md) | :heavy_minus_sign:                                                       | N/A                                                                      |