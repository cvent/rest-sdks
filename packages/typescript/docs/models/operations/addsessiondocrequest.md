# AddSessionDocRequest

## Example Usage

```typescript
import { AddSessionDocRequest } from "@cvent/sdk/models/operations";

let value: AddSessionDocRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  fileId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                | Example                                                                    |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `id`                                                                       | *string*                                                                   | :heavy_check_mark:                                                         | Unique ID of a session                                                     | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                       |
| `fileId`                                                                   | *string*                                                                   | :heavy_check_mark:                                                         | The unique ID of a file from [file upload](#operation/uploadFile) service. | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                       |