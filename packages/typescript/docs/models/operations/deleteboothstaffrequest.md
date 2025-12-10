# DeleteBoothStaffRequest

## Example Usage

```typescript
import { DeleteBoothStaffRequest } from "@cvent/sdk/models/operations";

let value: DeleteBoothStaffRequest = {
  id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  boothstaffId: "4e0f5152-515e-11ee-be56-0242ac120002",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_check_mark:                   | ID of an event.                      | 3db28cfc-db22-11eb-8d19-0242ac130003 |
| `exhibitorId`                        | *string*                             | :heavy_check_mark:                   | ID of an exhibitor.                  | 4888db54-db22-11eb-8d19-0242ac130003 |
| `boothstaffId`                       | *string*                             | :heavy_check_mark:                   | ID of a booth staff member.          | 4e0f5152-515e-11ee-be56-0242ac120002 |