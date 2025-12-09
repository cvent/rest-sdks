# ExistingSeating

The response from a request to get the event seating for the event.

## Example Usage

```typescript
import { ExistingSeating } from "@cvent/sdk/models/components";

let value: ExistingSeating = {
  name: "Awards Dinner",
  code: "1VCAPITRAN18012023",
  readOnly: false,
  sourceId: "Id2854",
  id: "ad6df5aa-f21f-47e6-9c48-8d3a7831ad5f",
};
```

## Fields

| Field                                                                                                           | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     | Example                                                                                                         |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                          | *string*                                                                                                        | :heavy_check_mark:                                                                                              | Seating's plain name.                                                                                           | Awards Dinner                                                                                                   |
| `code`                                                                                                          | *string*                                                                                                        | :heavy_minus_sign:                                                                                              | Seating's code set by the planner. Must be unique in the event.                                                 | 1VCAPITRAN18012023                                                                                              |
| `readOnly`                                                                                                      | *boolean*                                                                                                       | :heavy_minus_sign:                                                                                              | True indicates the seating data is coming from outside Cvent and should not be editable in the event.           | false                                                                                                           |
| `sourceId`                                                                                                      | *string*                                                                                                        | :heavy_minus_sign:                                                                                              | This is a ID for the seating in an external system. Use this field to supply your own ID for tracking purposes. | Id2854                                                                                                          |
| `id`                                                                                                            | *string*                                                                                                        | :heavy_minus_sign:                                                                                              | The unique ID of the seating.                                                                                   | ad6df5aa-f21f-47e6-9c48-8d3a7831ad5f                                                                            |