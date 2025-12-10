# ExpandableSeatJson

An object that contains the associated seat ID.

This is an **expandable** object and if requested will contain all the properties of a seat object.

## Example Usage

```typescript
import { ExpandableSeatJson } from "@cvent/sdk/models/components";

let value: ExpandableSeatJson = {
  id: "37ace026-f4ac-40e3-9144-e2c8399844be",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_minus_sign:                   | The unique ID of the seat.           | 37ace026-f4ac-40e3-9144-e2c8399844be |