# SleepingRoomRequirementJson

The requirements of a sleeping room on the specified date.


## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              | Example                                                  |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `Date`                                                   | *string*                                                 | :heavy_check_mark:                                       | The date for the sleeping room, in format of YYYY-MM-DD. | 2099-12-11                                               |
| `Any`                                                    | *long*                                                   | :heavy_minus_sign:                                       | The number of any sleeping rooms.                        | 10                                                       |
| `Single`                                                 | *long*                                                   | :heavy_minus_sign:                                       | The number of 1 bed sleeping rooms.                      | 10                                                       |
| `Suite`                                                  | *long*                                                   | :heavy_minus_sign:                                       | The number of suite sleeping rooms.                      | 10                                                       |
| `Staff`                                                  | *long*                                                   | :heavy_minus_sign:                                       | The number of sleeping rooms for staff.                  | 10                                                       |
| `DoubleBeds`                                             | *long*                                                   | :heavy_minus_sign:                                       | The number of 2 beds sleeping rooms.                     | 10                                                       |