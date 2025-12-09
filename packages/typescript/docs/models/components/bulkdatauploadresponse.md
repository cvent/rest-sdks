# BulkDataUploadResponse

The model representing the results of a bulk data upload

## Example Usage

```typescript
import { BulkDataUploadResponse } from "@cvent/sdk/models/components";

let value: BulkDataUploadResponse = {
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
  count: 100,
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          | Example                                                                              |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `data`                                                                               | [components.BulkDataPropertyJson](../../models/components/bulkdatapropertyjson.md)[] | :heavy_minus_sign:                                                                   | Collection of objects to be processed                                                |                                                                                      |
| `count`                                                                              | *number*                                                                             | :heavy_minus_sign:                                                                   | The number of successfully uploaded data records                                     | 100                                                                                  |