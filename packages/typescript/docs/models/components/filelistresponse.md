# FileListResponse

A JSON object containing a list of files associated with an exhibitor.

## Example Usage

```typescript
import { FileListResponse } from "@cvent/sdk/models/components";

let value: FileListResponse = {
  data: [
    {
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
      event: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
      exhibitor: {
        id: "4888db54-db22-11eb-8d19-0242ac130003",
      },
      displayName: "Marketing Page",
      order: 3,
      id: "3d44b9e4-8c1a-403d-a20a-0b981f539935",
    },
  ],
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `data`                                                               | [components.ExistingFile](../../models/components/existingfile.md)[] | :heavy_minus_sign:                                                   | List of files associated with an exhibitor.                          |