# CopyEventResponse

## Example Usage

```typescript
import { CopyEventResponse } from "@cvent/sdk/models/operations";

let value: CopyEventResponse = {
  headers: {
    "key": [
      "<value 1>",
      "<value 2>",
      "<value 3>",
    ],
    "key1": [
      "<value 1>",
      "<value 2>",
      "<value 3>",
    ],
    "key2": [
      "<value 1>",
      "<value 2>",
      "<value 3>",
    ],
  },
  result: {
    id: "9163c74j-67c6-401c-k710-oe0f783bf022",
    status: "Processing",
  },
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `headers`                                                                      | Record<string, *string*[]>                                                     | :heavy_check_mark:                                                             | N/A                                                                            |
| `result`                                                                       | [components.EventAsyncResponse](../../models/components/eventasyncresponse.md) | :heavy_check_mark:                                                             | N/A                                                                            |