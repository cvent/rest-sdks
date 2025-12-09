# UserGroupJson1

Contains information about a user group associated with an event

## Example Usage

```typescript
import { UserGroupJson1 } from "@cvent/sdk/models/components";

let value: UserGroupJson1 = {
  id: "1a419665-8190-4915-ae35-36c2a002d6ac",
  name: "Event Administrators",
};
```

## Fields

| Field                                   | Type                                    | Required                                | Description                             | Example                                 |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `id`                                    | *string*                                | :heavy_check_mark:                      | The unique identifier of the user group | 1a419665-8190-4915-ae35-36c2a002d6ac    |
| `name`                                  | *string*                                | :heavy_check_mark:                      | The name of the user group              | Event Administrators                    |