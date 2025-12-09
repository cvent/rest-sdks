# BulkResultJson

This entity is used to represent a single item that is returned as part of a Bulk Job Result call.

## Example Usage

```typescript
import { BulkResultJson } from "@cvent/sdk/models/components";

let value: BulkResultJson = {
  data: {
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
  status: 400,
  message: "Example error message.",
  request: {
    "operation": "PUT",
    "headers": {
      "header1": "header1Value",
      "header2": "header2Value",
    },
    "queryParams": {
      "param1": "param1Value",
      "param2": "param2Value",
    },
  },
  id: 1234,
  job: {
    id: "766d1986-9aaa-454f-86f5-d605c45b3131",
  },
  failed: true,
};
```

## Fields

| Field                                                                                                                                                            | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      | Example                                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `data`                                                                                                                                                           | [components.BulkDataProperty](../../models/components/bulkdataproperty.md)                                                                                       | :heavy_check_mark:                                                                                                                                               | The response data for the bulk operation.                                                                                                                        |                                                                                                                                                                  |
| `status`                                                                                                                                                         | *number*                                                                                                                                                         | :heavy_check_mark:                                                                                                                                               | http status code representing processing status of a single item                                                                                                 | 400                                                                                                                                                              |
| `message`                                                                                                                                                        | *string*                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                               | Quick description of what happened with processing                                                                                                               | Example error message.                                                                                                                                           |
| `request`                                                                                                                                                        | Record<string, *any*>                                                                                                                                            | :heavy_minus_sign:                                                                                                                                               | The processed request tied to this response. This field is only sent when processing fails.                                                                      | {<br/>"operation": "PUT",<br/>"headers": {<br/>"header1": "header1Value",<br/>"header2": "header2Value"<br/>},<br/>"queryParams": {<br/>"param1": "param1Value",<br/>"param2": "param2Value"<br/>}<br/>} |
| `id`                                                                                                                                                             | *number*                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                               | The bulk result identifier.                                                                                                                                      | 1234                                                                                                                                                             |
| `job`                                                                                                                                                            | [components.Job](../../models/components/job.md)                                                                                                                 | :heavy_minus_sign:                                                                                                                                               | Unique identifier of the bulk job linked to this result.                                                                                                         | {<br/>"id": "766d1986-9aaa-454f-86f5-d605c45b3131"<br/>}                                                                                                         |
| `failed`                                                                                                                                                         | *boolean*                                                                                                                                                        | :heavy_minus_sign:                                                                                                                                               | Indicator that specifies if the bulk result failed.                                                                                                              | true                                                                                                                                                             |