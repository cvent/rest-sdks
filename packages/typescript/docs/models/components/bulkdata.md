# BulkData

The model representing an arbitrary list of JSON data loaded to bulk job.

## Example Usage

```typescript
import { BulkData } from "@cvent/sdk/models/components";

let value: BulkData = {
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
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `data`                                                                               | [components.BulkDataPropertyJson](../../models/components/bulkdatapropertyjson.md)[] | :heavy_minus_sign:                                                                   | Collection of objects to be processed                                                |