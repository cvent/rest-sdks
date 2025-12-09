# UploadBulkJobDataRequest

## Example Usage

```typescript
import { UploadBulkJobDataRequest } from "@cvent/sdk/models/operations";

let value: UploadBulkJobDataRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  bulkData: {
    data: [
      {
        pathParams: {
          "id": "11111111-0dc3-487b-953e-86d6abbdf7d3",
        },
        queryParams: {
          "param1": "param1Value",
          "param2": "param2Value",
        },
        headers: {
          "header1": "header1Value",
          "header2": "header2Value",
        },
        dataRecord: {
          "event": {},
          "title": {},
          "start": {},
          "end": {},
          "status": {},
        },
      },
    ],
  },
};
```

## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `id`                                                       | *string*                                                   | :heavy_check_mark:                                         | A uuid path parameter.                                     | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                       |
| `bulkData`                                                 | [components.BulkData](../../models/components/bulkdata.md) | :heavy_check_mark:                                         | N/A                                                        |                                                            |