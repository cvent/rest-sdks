# ExpandableTableJson

An object that contains the associated table ID.

This is an **expandable** object and if requested will contain all the properties of a table object.

## Example Usage

```typescript
import { ExpandableTableJson } from "@cvent/sdk/models/components";

let value: ExpandableTableJson = {
  id: "c9763ce5-b965-44ed-9c2b-b5657dfab012",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_minus_sign:                   | The unique ID of the table.          | c9763ce5-b965-44ed-9c2b-b5657dfab012 |