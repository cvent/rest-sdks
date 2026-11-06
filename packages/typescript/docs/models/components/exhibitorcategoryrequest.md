# ExhibitorCategoryRequest

Exhibitor category of an event.

## Example Usage

```typescript
import { ExhibitorCategoryRequest } from "@cvent/sdk/models/components";

let value: ExhibitorCategoryRequest = {
  event: {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  },
  name: "Automobile",
  description: "everything related to automobiles",
  order: 3,
  type: "LOGO",
};
```

## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `event`                                                                                            | [components.Event4](../../models/components/event4.md)                                             | :heavy_check_mark:                                                                                 | Associated event.                                                                                  |                                                                                                    |
| `name`                                                                                             | *string*                                                                                           | :heavy_check_mark:                                                                                 | Name of the exhibitor category.                                                                    | Automobile                                                                                         |
| `description`                                                                                      | *string*                                                                                           | :heavy_minus_sign:                                                                                 | Description of the exhibitor category.                                                             | everything related to automobiles                                                                  |
| `order`                                                                                            | *number*                                                                                           | :heavy_check_mark:                                                                                 | Display order of the exhibitor category.                                                           | 3                                                                                                  |
| `type`                                                                                             | [components.ExhibitorCategoryRequestType](../../models/components/exhibitorcategoryrequesttype.md) | :heavy_check_mark:                                                                                 | Type of the exhibitor category.                                                                    | LOGO                                                                                               |