# DeleteExhibitorWeblinkRequest

## Example Usage

```typescript
import { DeleteExhibitorWeblinkRequest } from "@cvent/sdk/models/operations";

let value: DeleteExhibitorWeblinkRequest = {
  id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  weblinkId: "4d44b9e4-8c1a-403d-a20a-0b981f539935",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_check_mark:                   | ID of an event.                      | 3db28cfc-db22-11eb-8d19-0242ac130003 |
| `exhibitorId`                        | *string*                             | :heavy_check_mark:                   | ID of an exhibitor.                  | 4888db54-db22-11eb-8d19-0242ac130003 |
| `weblinkId`                          | *string*                             | :heavy_check_mark:                   | ID of an exhibitor weblink.          | 4d44b9e4-8c1a-403d-a20a-0b981f539935 |