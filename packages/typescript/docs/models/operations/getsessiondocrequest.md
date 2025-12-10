# GetSessionDocRequest

## Example Usage

```typescript
import { GetSessionDocRequest } from "@cvent/sdk/models/operations";

let value: GetSessionDocRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  fileId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `id`                                                                                          | *string*                                                                                      | :heavy_check_mark:                                                                            | Unique Id of a session                                                                        | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                          |
| `fileId`                                                                                      | *string*                                                                                      | :heavy_check_mark:                                                                            | The unique identifier of a file from <a href="#operation/uploadFile">file upload</a> service. | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                          |