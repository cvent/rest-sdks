# TableAssignmentJson

The assignment of an attendee to a seat on a table for a given event seating

## Example Usage

```typescript
import { TableAssignmentJson } from "@cvent/sdk/models/components";

let value: TableAssignmentJson = {
  seating: {
    id: "ad6df5aa-f21f-47e6-9c48-8d3a7831ad5f",
  },
  table: {
    id: "c9763ce5-b965-44ed-9c2b-b5657dfab012",
  },
  seat: {
    id: "37ace026-f4ac-40e3-9144-e2c8399844be",
  },
  attendee: {
    id: "bdcb1fba-0fb3-46d2-b4e7-47ace9bc7907",
  },
};
```

## Fields

| Field                                                                                                                                                      | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `seating`                                                                                                                                                  | [components.ExpandableSeatingJson](../../models/components/expandableseatingjson.md)                                                                       | :heavy_minus_sign:                                                                                                                                         | An object that contains the associated seating ID.<br/><br/>This is an **expandable** object and if requested will contain all the properties of a seating object. |
| `table`                                                                                                                                                    | [components.ExpandableTableJson](../../models/components/expandabletablejson.md)                                                                           | :heavy_minus_sign:                                                                                                                                         | An object that contains the associated table ID.<br/><br/>This is an **expandable** object and if requested will contain all the properties of a table object. |
| `seat`                                                                                                                                                     | [components.ExpandableSeatJson](../../models/components/expandableseatjson.md)                                                                             | :heavy_minus_sign:                                                                                                                                         | An object that contains the associated seat ID.<br/><br/>This is an **expandable** object and if requested will contain all the properties of a seat object. |
| `attendee`                                                                                                                                                 | [components.TableAssignmentJsonAttendee](../../models/components/tableassignmentjsonattendee.md)                                                           | :heavy_minus_sign:                                                                                                                                         | The attendee object.                                                                                                                                       |