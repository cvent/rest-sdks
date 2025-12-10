# BulkJobWithDataInput

The model representing a bulk job that can load data asynchronously including the data

## Example Usage

```typescript
import { BulkJobWithDataInput } from "@cvent/sdk/models/components";

let value: BulkJobWithDataInput = {
  description: "Q1 Contact Import",
  url: "/contacts/{id}",
  operation: "PUT",
  headers: {
    "header1": "header1Value",
    "header2": "header2Value",
  },
  queryParams: {
    "param1": "param1Value",
    "param2": "param2Value",
  },
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

| Field                                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                                     | Required                                                                                                                                                                                                                                 | Description                                                                                                                                                                                                                              | Example                                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `description`                                                                                                                                                                                                                            | *string*                                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                       | Description of the bulk job.                                                                                                                                                                                                             | Q1 Contact Import                                                                                                                                                                                                                        |
| `url`                                                                                                                                                                                                                                    | *string*                                                                                                                                                                                                                                 | :heavy_check_mark:                                                                                                                                                                                                                       | URL of the destination public API being called. This can be the full path or the relative path to the entity. Variables in the URL should remain generic so that you can specify their value in each record with the `pathParams` field. | /contacts/{id}                                                                                                                                                                                                                           |
| `operation`                                                                                                                                                                                                                              | [components.BulkJobWithDataOperation](../../models/components/bulkjobwithdataoperation.md)                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                                       | Operation to be performed in the destination API.                                                                                                                                                                                        | PUT                                                                                                                                                                                                                                      |
| `headers`                                                                                                                                                                                                                                | Record<string, *string*>                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                       | Headers to be passed on the destination API. Values must NOT be null.                                                                                                                                                                    | {<br/>"header1": "header1Value",<br/>"header2": "header2Value"<br/>}                                                                                                                                                                     |
| `queryParams`                                                                                                                                                                                                                            | Record<string, *string*>                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                       | Query Params to be passed on to the destination API. Values must NOT be null.                                                                                                                                                            | {<br/>"param1": "param1Value",<br/>"param2": "param2Value"<br/>}                                                                                                                                                                         |
| `data`                                                                                                                                                                                                                                   | [components.BulkDataPropertyJson](../../models/components/bulkdatapropertyjson.md)[]                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                                                                                       | Collection of objects to be processed                                                                                                                                                                                                    |                                                                                                                                                                                                                                          |