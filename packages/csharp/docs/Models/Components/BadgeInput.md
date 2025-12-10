# BadgeInput

A JSON Schema for Badge object.


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `Id`                                                          | *string*                                                      | :heavy_check_mark:                                            | Id of a badge                                                 | abc123                                                        |
| `Status`                                                      | [BadgeStatusJson](../../Models/Components/BadgeStatusJson.md) | :heavy_check_mark:                                            | Badge status                                                  | Active                                                        |
| `Type`                                                        | [BadgeTypeJson](../../Models/Components/BadgeTypeJson.md)     | :heavy_check_mark:                                            | Badge type                                                    | Epc                                                           |
| `Attendee`                                                    | [AttendeeJson3](../../Models/Components/AttendeeJson3.md)     | :heavy_check_mark:                                            | A JSON Schema for an Attendee object                          |                                                               |
| `Event`                                                       | [EventJson5](../../Models/Components/EventJson5.md)           | :heavy_check_mark:                                            | The Associated Event.                                         |                                                               |