# DeleteProgramItemSessionDocumentRequest

## Example Usage

```typescript
import { DeleteProgramItemSessionDocumentRequest } from "@cvent/sdk/models/operations";

let value: DeleteProgramItemSessionDocumentRequest = {
  programItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  fileId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `programItemId`                                                                               | *string*                                                                                      | :heavy_check_mark:                                                                            | Unique ID of a session program item.                                                          | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                          |
| `fileId`                                                                                      | *string*                                                                                      | :heavy_check_mark:                                                                            | The unique identifier of a file from <a href="#operation/uploadFile">file upload</a> service. | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                          |