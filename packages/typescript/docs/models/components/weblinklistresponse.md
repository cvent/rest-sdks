# WeblinkListResponse

A response object containing a list of weblinks associated with an exhibitor.

## Example Usage

```typescript
import { WeblinkListResponse } from "@cvent/sdk/models/components";

let value: WeblinkListResponse = {
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
      name: "Marketing Page",
      url: "http://www.example.com",
      order: 3,
      id: "4d44b9e4-8c1a-403d-a20a-0b981f539935",
    },
  ],
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `data`                                                                     | [components.ExistingWeblink](../../models/components/existingweblink.md)[] | :heavy_minus_sign:                                                         | List of weblinks associated with an exhibitor.                             |