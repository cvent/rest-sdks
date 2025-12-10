# SleepingRoomRequirementJson

The requirements of a sleeping room on the specified date.

## Example Usage

```typescript
import { SleepingRoomRequirementJson } from "@cvent/sdk/models/components";

let value: SleepingRoomRequirementJson = {
  date: "2099-12-11",
  any: 10,
  single: 10,
  suite: 10,
  staff: 10,
  doubleBeds: 10,
};
```

## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              | Example                                                  |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `date`                                                   | *string*                                                 | :heavy_check_mark:                                       | The date for the sleeping room, in format of YYYY-MM-DD. | 2099-12-11                                               |
| `any`                                                    | *number*                                                 | :heavy_minus_sign:                                       | The number of any sleeping rooms.                        | 10                                                       |
| `single`                                                 | *number*                                                 | :heavy_minus_sign:                                       | The number of 1 bed sleeping rooms.                      | 10                                                       |
| `suite`                                                  | *number*                                                 | :heavy_minus_sign:                                       | The number of suite sleeping rooms.                      | 10                                                       |
| `staff`                                                  | *number*                                                 | :heavy_minus_sign:                                       | The number of sleeping rooms for staff.                  | 10                                                       |
| `doubleBeds`                                             | *number*                                                 | :heavy_minus_sign:                                       | The number of 2 beds sleeping rooms.                     | 10                                                       |