# PostExhibitorAdminRequest

## Example Usage

```typescript
import { PostExhibitorAdminRequest } from "@cvent/sdk/models/operations";

let value: PostExhibitorAdminRequest = {
  id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  exhibitorAdminRequest: {
    exhibitor: {
      id: "4888db54-db22-11eb-8d19-0242ac130003",
    },
    firstName: "John",
    lastName: "Eddy",
    email: "john.eddy@test.com",
  },
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          | Example                                                                              |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `id`                                                                                 | *string*                                                                             | :heavy_check_mark:                                                                   | ID of an event.                                                                      | 3db28cfc-db22-11eb-8d19-0242ac130003                                                 |
| `exhibitorId`                                                                        | *string*                                                                             | :heavy_check_mark:                                                                   | ID of an exhibitor.                                                                  | 4888db54-db22-11eb-8d19-0242ac130003                                                 |
| `exhibitorAdminRequest`                                                              | [components.ExhibitorAdminRequest](../../models/components/exhibitoradminrequest.md) | :heavy_check_mark:                                                                   | Exhibitor Admin details                                                              |                                                                                      |