# ExhibitorCategoryRequest

JSON schema representing an Exhibitor Category object

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
| `event`                                                                                            | [components.EventJson5](../../models/components/eventjson5.md)                                     | :heavy_check_mark:                                                                                 | The Associated Event.                                                                              |                                                                                                    |
| `name`                                                                                             | *string*                                                                                           | :heavy_check_mark:                                                                                 | Name of the exhibitor category                                                                     | Automobile                                                                                         |
| `description`                                                                                      | *string*                                                                                           | :heavy_minus_sign:                                                                                 | Exhibitor Category description                                                                     | everything related to automobiles                                                                  |
| `order`                                                                                            | *number*                                                                                           | :heavy_check_mark:                                                                                 | order for exhibitor category                                                                       | 3                                                                                                  |
| `type`                                                                                             | [components.ExhibitorCategoryRequestType](../../models/components/exhibitorcategoryrequesttype.md) | :heavy_check_mark:                                                                                 | Type of exhibitor category                                                                         | LOGO                                                                                               |