# UpdateExhibitorFileRequest

## Example Usage

```typescript
import { UpdateExhibitorFileRequest } from "@cvent/sdk/models/operations";

let value: UpdateExhibitorFileRequest = {
  id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  fileId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  file: {
    event: {
      id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    },
    exhibitor: {
      id: "4888db54-db22-11eb-8d19-0242ac130003",
    },
    displayName: "Marketing Page",
    order: 3,
  },
};
```

## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `id`                                                         | *string*                                                     | :heavy_check_mark:                                           | ID of an event.                                              | 3db28cfc-db22-11eb-8d19-0242ac130003                         |
| `exhibitorId`                                                | *string*                                                     | :heavy_check_mark:                                           | ID of an exhibitor.                                          | 4888db54-db22-11eb-8d19-0242ac130003                         |
| `fileId`                                                     | *string*                                                     | :heavy_check_mark:                                           | ID of a file.                                                | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                         |
| `file`                                                       | [components.FileInput](../../models/components/fileinput.md) | :heavy_check_mark:                                           | Exhibitor file content to be updated.                        |                                                              |