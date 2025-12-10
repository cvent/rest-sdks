# CreateExhibitorCategoryRequest

## Example Usage

```typescript
import { CreateExhibitorCategoryRequest } from "@cvent/sdk/models/operations";

let value: CreateExhibitorCategoryRequest = {
  id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  exhibitorCategoryRequest: {
    event: {
      id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    },
    name: "Automobile",
    description: "everything related to automobiles",
    order: 3,
    type: "LOGO",
  },
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                | Example                                                                                    |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `id`                                                                                       | *string*                                                                                   | :heavy_check_mark:                                                                         | ID of an event.                                                                            | 3db28cfc-db22-11eb-8d19-0242ac130003                                                       |
| `exhibitorCategoryRequest`                                                                 | [components.ExhibitorCategoryRequest](../../models/components/exhibitorcategoryrequest.md) | :heavy_check_mark:                                                                         | Exhibitor Category details                                                                 |                                                                                            |