# AttendeeTypeJson

Attendee type details.

## Example Usage

```typescript
import { AttendeeTypeJson } from "@cvent/sdk/models/components";

let value: AttendeeTypeJson = {
  id: 34549966,
  name: "Staff",
  codes: [
    "PEWATT0524317",
  ],
};
```

## Fields

| Field                               | Type                                | Required                            | Description                         | Example                             |
| ----------------------------------- | ----------------------------------- | ----------------------------------- | ----------------------------------- | ----------------------------------- |
| `id`                                | *number*                            | :heavy_check_mark:                  | The unique ID of the attendee type. | 34549966                            |
| `name`                              | *string*                            | :heavy_check_mark:                  | The name of the attendee type.      | Staff                               |
| `codes`                             | *string*[]                          | :heavy_check_mark:                  | A list of attendee type codes.      |                                     |