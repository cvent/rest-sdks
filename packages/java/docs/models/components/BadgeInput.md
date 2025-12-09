# BadgeInput

A JSON Schema for Badge object.


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `id`                                                          | *String*                                                      | :heavy_check_mark:                                            | Id of a badge                                                 | abc123                                                        |
| `status`                                                      | [BadgeStatusJson](../../models/components/BadgeStatusJson.md) | :heavy_check_mark:                                            | Badge status                                                  | Active                                                        |
| `type`                                                        | [BadgeTypeJson](../../models/components/BadgeTypeJson.md)     | :heavy_check_mark:                                            | Badge type                                                    | Epc                                                           |
| `attendee`                                                    | [AttendeeJson3](../../models/components/AttendeeJson3.md)     | :heavy_check_mark:                                            | A JSON Schema for an Attendee object                          |                                                               |
| `event`                                                       | [EventJson5](../../models/components/EventJson5.md)           | :heavy_check_mark:                                            | The Associated Event.                                         |                                                               |