# ExpandableSeatingJson

An object that contains the associated seating ID.

This is an **expandable** object and if requested will contain all the properties of a seating object.

## Example Usage

```typescript
import { ExpandableSeatingJson } from "@cvent/sdk/models/components";

let value: ExpandableSeatingJson = {
  id: "ad6df5aa-f21f-47e6-9c48-8d3a7831ad5f",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_minus_sign:                   | The unique ID of the seating.        | ad6df5aa-f21f-47e6-9c48-8d3a7831ad5f |