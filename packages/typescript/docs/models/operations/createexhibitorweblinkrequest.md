# CreateExhibitorWeblinkRequest

## Example Usage

```typescript
import { CreateExhibitorWeblinkRequest } from "@cvent/sdk/models/operations";

let value: CreateExhibitorWeblinkRequest = {
  id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
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
| `weblink`                                                | [components.Weblink](../../models/components/weblink.md) | :heavy_check_mark:                                       | Exhibitor content weblink details.                       |                                                          |