# AttendeeAddBulkItemJson1

This entity is used to represent a single item that is returned as part of a bulk request call.

## Example Usage

```typescript
import { AttendeeAddBulkItemJson1 } from "@cvent/sdk/models/components";

let value: AttendeeAddBulkItemJson1 = {
  data: {
    code: 400,
    message: "Bad Request",
    target: "example target",
    details: [
      {
        code: 400,
        message: "Bad Request",
        target: "example target",
      },
    ],
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
};
```

## Fields

| Field                                                                                                                                                            | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      | Example                                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `data`                                                                                                                                                           | *components.AttendeeAddBulkItemJson1Data*                                                                                                                        | :heavy_check_mark:                                                                                                                                               | N/A                                                                                                                                                              |                                                                                                                                                                  |
| `status`                                                                                                                                                         | *number*                                                                                                                                                         | :heavy_check_mark:                                                                                                                                               | http status code representing processing status of a single item                                                                                                 | 400                                                                                                                                                              |
| `message`                                                                                                                                                        | *string*                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                               | Quick description of what happened with processing                                                                                                               | Example error message.                                                                                                                                           |
| `request`                                                                                                                                                        | Record<string, *any*>                                                                                                                                            | :heavy_minus_sign:                                                                                                                                               | The processed request tied to this response. This field is only sent when processing fails.                                                                      | {<br/>"operation": "PUT",<br/>"headers": {<br/>"header1": "header1Value",<br/>"header2": "header2Value"<br/>},<br/>"queryParams": {<br/>"param1": "param1Value",<br/>"param2": "param2Value"<br/>}<br/>} |