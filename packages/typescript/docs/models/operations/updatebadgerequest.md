# UpdateBadgeRequest

## Example Usage

```typescript
import { UpdateBadgeRequest } from "@cvent/sdk/models/operations";

let value: UpdateBadgeRequest = {
  id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  badgeId: "abc123",
  badge: {
    id: "abc123",
    status: "Active",
    type: "Epc",
    attendee: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    event: {
      id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    },
  },
};
```

## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `id`                                                           | *string*                                                       | :heavy_check_mark:                                             | ID of an event.                                                | 3db28cfc-db22-11eb-8d19-0242ac130003                           |
| `badgeId`                                                      | *string*                                                       | :heavy_check_mark:                                             | ID of a badge.                                                 | abc123                                                         |
| `badge`                                                        | [components.BadgeInput](../../models/components/badgeinput.md) | :heavy_check_mark:                                             | Badge details                                                  |                                                                |