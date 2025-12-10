# DeleteExhibitorCategoryImageRequest

## Example Usage

```typescript
import { DeleteExhibitorCategoryImageRequest } from "@cvent/sdk/models/operations";

let value: DeleteExhibitorCategoryImageRequest = {
  id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  exhibitorCategoryId: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
  fileId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_check_mark:                   | ID of an event.                      | 3db28cfc-db22-11eb-8d19-0242ac130003 |
| `exhibitorCategoryId`                | *string*                             | :heavy_check_mark:                   | ID of an exhibitor category.         | 534a465b-b4cb-471d-9498-4bf3917ad8bf |
| `fileId`                             | *string*                             | :heavy_check_mark:                   | ID of a file.                        | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |