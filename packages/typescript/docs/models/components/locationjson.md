# LocationJson

Details of a location.

## Example Usage

```typescript
import { LocationJson } from "@cvent/sdk/models/components";

let value: LocationJson = {
  id: "0046e875-79a5-4851-8332-da105d58088a",
  name: "Conference Room B",
  parentLocation: {
    id: "0046e875-79a5-4851-8332-da105d58088a",
    name: "Conference Room B",
  },
  capacity: 5,
};
```

## Fields

| Field                                                                                               | Type                                                                                                | Required                                                                                            | Description                                                                                         | Example                                                                                             |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `id`                                                                                                | *string*                                                                                            | :heavy_check_mark:                                                                                  | The unique ID representing the location.                                                            | 0046e875-79a5-4851-8332-da105d58088a                                                                |
| `name`                                                                                              | *string*                                                                                            | :heavy_check_mark:                                                                                  | The name of the location.                                                                           | Conference Room B                                                                                   |
| `parentLocation`                                                                                    | [components.ZeroAllOf2](../../models/components/zeroallof2.md)                                      | :heavy_minus_sign:                                                                                  | Details of a location.                                                                              |                                                                                                     |
| `capacity`                                                                                          | *number*                                                                                            | :heavy_minus_sign:                                                                                  | The number of attendees that can be accommodated in this location. -1 indicates unlimited capacity. | 5                                                                                                   |