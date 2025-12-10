# UpdateExhibitorWeblinkRequest

## Example Usage

```typescript
import { UpdateExhibitorWeblinkRequest } from "@cvent/sdk/models/operations";

let value: UpdateExhibitorWeblinkRequest = {
  id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  weblinkId: "4d44b9e4-8c1a-403d-a20a-0b981f539935",
  weblink: {
    event: {
      id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    },
    exhibitor: {
      id: "4888db54-db22-11eb-8d19-0242ac130003",
    },
    name: "Marketing Page",
    url: "http://www.example.com",
    order: 3,
  },
};
```

## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              | Example                                                  |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `id`                                                     | *string*                                                 | :heavy_check_mark:                                       | ID of an event.                                          | 3db28cfc-db22-11eb-8d19-0242ac130003                     |
| `exhibitorId`                                            | *string*                                                 | :heavy_check_mark:                                       | ID of an exhibitor.                                      | 4888db54-db22-11eb-8d19-0242ac130003                     |
| `weblinkId`                                              | *string*                                                 | :heavy_check_mark:                                       | ID of an exhibitor weblink.                              | 4d44b9e4-8c1a-403d-a20a-0b981f539935                     |
| `weblink`                                                | [components.Weblink](../../models/components/weblink.md) | :heavy_check_mark:                                       | Exhibitor content to be updated.                         |                                                          |