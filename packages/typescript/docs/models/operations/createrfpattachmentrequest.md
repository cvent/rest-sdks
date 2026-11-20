# CreateRfpAttachmentRequest

## Example Usage

```typescript
import { CreateRfpAttachmentRequest } from "@cvent/sdk/models/operations";

let value: CreateRfpAttachmentRequest = {
  rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  rfpAttachmentRequest: {
    file: {
      id: "94a18afa-30ad-407e-87c2-526e1e871a82",
    },
  },
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `rfpId`                                                                            | *string*                                                                           | :heavy_check_mark:                                                                 | The unique identifier of the RFP we are requesting                                 | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                               |
| `rfpAttachmentRequest`                                                             | [components.RfpAttachmentRequest](../../models/components/rfpattachmentrequest.md) | :heavy_check_mark:                                                                 | Request body for creating an RFP attachment.                                       |                                                                                    |