# ExistingSeat

The response from a request to get the event seat for the event.

## Example Usage

```typescript
import { ExistingSeat } from "@cvent/sdk/models/components";

let value: ExistingSeat = {
  name: "Management seat",
  sourceId: "Id5874",
  id: "37ace026-f4ac-40e3-9144-e2c8399844be",
};
```

## Fields

| Field                                                                                                        | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  | Example                                                                                                      |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `name`                                                                                                       | *string*                                                                                                     | :heavy_check_mark:                                                                                           | Seat's plain name.                                                                                           | Management seat                                                                                              |
| `sourceId`                                                                                                   | *string*                                                                                                     | :heavy_minus_sign:                                                                                           | This is a ID for the seat in an external system. Use this field to supply your own ID for tracking purposes. | Id5874                                                                                                       |
| `id`                                                                                                         | *string*                                                                                                     | :heavy_minus_sign:                                                                                           | The unique ID of the seat.                                                                                   | 37ace026-f4ac-40e3-9144-e2c8399844be                                                                         |