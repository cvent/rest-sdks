# ExistingTableWithSeats

The response from a request to get the event table for the event.

## Example Usage

```typescript
import { ExistingTableWithSeats } from "@cvent/sdk/models/components";

let value: ExistingTableWithSeats = {
  name: "CVENT table",
  code: "CAETABLE1",
  capacity: 10,
  description: "This table is for VIP attendees.",
  sourceId: "Id1255",
  id: "c9763ce5-b965-44ed-9c2b-b5657dfab012",
  seats: [
    {
      id: "37ace026-f4ac-40e3-9144-e2c8399844be",
    },
  ],
};
```

## Fields

| Field                                                                                                                           | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     | Example                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                                          | *string*                                                                                                                        | :heavy_minus_sign:                                                                                                              | Table's plain name.                                                                                                             | CVENT table                                                                                                                     |
| `code`                                                                                                                          | *string*                                                                                                                        | :heavy_minus_sign:                                                                                                              | Table's code set by the planner.                                                                                                | CAETABLE1                                                                                                                       |
| `capacity`                                                                                                                      | *number*                                                                                                                        | :heavy_check_mark:                                                                                                              | Table's seat capacity.                                                                                                          | 10                                                                                                                              |
| `description`                                                                                                                   | *string*                                                                                                                        | :heavy_minus_sign:                                                                                                              | Description assigned to table.                                                                                                  | This table is for VIP attendees.                                                                                                |
| `sourceId`                                                                                                                      | *string*                                                                                                                        | :heavy_minus_sign:                                                                                                              | This is a ID for the table in an external system. Use this field to supply your own ID for tracking purposes.                   | Id1255                                                                                                                          |
| `id`                                                                                                                            | *string*                                                                                                                        | :heavy_minus_sign:                                                                                                              | The unique ID of the table.                                                                                                     | c9763ce5-b965-44ed-9c2b-b5657dfab012                                                                                            |
| `seats`                                                                                                                         | [components.ExpandableSeatJson](../../models/components/expandableseatjson.md)[]                                                | :heavy_minus_sign:                                                                                                              | The seat IDs at the table.<br/><br/>This is an **expandable** object and if requested will contain all the properties of a seat object. |                                                                                                                                 |