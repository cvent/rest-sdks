# GetEventEmailStatusRequest

## Example Usage

```typescript
import { GetEventEmailStatusRequest } from "@cvent/sdk/models/operations";

let value: GetEventEmailStatusRequest = {
  emailRequestId: "2A941E55-3367-4C50-B21B-B6A7613DFB23",
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              | Example                                                                  |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `emailRequestId`                                                         | *string*                                                                 | :heavy_check_mark:                                                       | Used to get status of emails which were sent with this email request ID. | 2A941E55-3367-4C50-B21B-B6A7613DFB23                                     |