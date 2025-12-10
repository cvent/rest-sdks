# EventRoleJson

An object that contains the event role ID. This is an **expandable** object and, if requested, will contain the name of the event role.

## Example Usage

```typescript
import { EventRoleJson } from "@cvent/sdk/models/components";

let value: EventRoleJson = {
  id: "2b1a3bba-84b2-46f4-bddb-4b4a44442dcc",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_minus_sign:                   | The ID of the event role.            | 2b1a3bba-84b2-46f4-bddb-4b4a44442dcc |