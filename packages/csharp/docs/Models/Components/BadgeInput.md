# BadgeInput

A JSON Schema for Badge object.


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `Id`                                                  | *string*                                              | :heavy_check_mark:                                    | Id of a badge                                         | abc123                                                |
| `Status`                                              | [BadgeStatus](../../Models/Components/BadgeStatus.md) | :heavy_check_mark:                                    | Badge status                                          | Active                                                |
| `Type`                                                | [BadgeType](../../Models/Components/BadgeType.md)     | :heavy_check_mark:                                    | Badge type                                            | Epc                                                   |
| `Attendee`                                            | [Attendee12](../../Models/Components/Attendee12.md)   | :heavy_check_mark:                                    | The associated Attendee.                              |                                                       |
| `Event`                                               | [Event4](../../Models/Components/Event4.md)           | :heavy_check_mark:                                    | The Associated Event.                                 |                                                       |