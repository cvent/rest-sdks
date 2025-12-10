# UpdateExhibitorCategoryRequest

## Example Usage

```typescript
import { UpdateExhibitorCategoryRequest } from "@cvent/sdk/models/operations";

let value: UpdateExhibitorCategoryRequest = {
  id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  exhibitorCategoryId: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
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
| `exhibitorCategoryId`                                                                      | *string*                                                                                   | :heavy_check_mark:                                                                         | ID of an exhibitor category.                                                               | 534a465b-b4cb-471d-9498-4bf3917ad8bf                                                       |
| `exhibitorCategoryRequest`                                                                 | [components.ExhibitorCategoryRequest](../../models/components/exhibitorcategoryrequest.md) | :heavy_check_mark:                                                                         | Exhibitor Category details                                                                 |                                                                                            |