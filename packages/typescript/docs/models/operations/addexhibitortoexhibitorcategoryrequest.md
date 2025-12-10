# AddExhibitorToExhibitorCategoryRequest

## Example Usage

```typescript
import { AddExhibitorToExhibitorCategoryRequest } from "@cvent/sdk/models/operations";

let value: AddExhibitorToExhibitorCategoryRequest = {
  id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  exhibitorCategoryId: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
  exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_check_mark:                   | ID of an event.                      | 3db28cfc-db22-11eb-8d19-0242ac130003 |
| `exhibitorCategoryId`                | *string*                             | :heavy_check_mark:                   | ID of an exhibitor category.         | 534a465b-b4cb-471d-9498-4bf3917ad8bf |
| `exhibitorId`                        | *string*                             | :heavy_check_mark:                   | ID of an exhibitor.                  | 4888db54-db22-11eb-8d19-0242ac130003 |