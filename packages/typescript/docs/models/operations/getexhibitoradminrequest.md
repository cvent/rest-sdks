# GetExhibitorAdminRequest

## Example Usage

```typescript
import { GetExhibitorAdminRequest } from "@cvent/sdk/models/operations";

let value: GetExhibitorAdminRequest = {
  id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  adminId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_check_mark:                   | ID of an event.                      | 3db28cfc-db22-11eb-8d19-0242ac130003 |
| `exhibitorId`                        | *string*                             | :heavy_check_mark:                   | ID of an exhibitor.                  | 4888db54-db22-11eb-8d19-0242ac130003 |
| `adminId`                            | *string*                             | :heavy_check_mark:                   | ID of an exhibitor admin.            | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |