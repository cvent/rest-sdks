# BadgeInput

A JSON Schema for Badge object.


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `Id`                                                  | *string*                                              | :heavy_check_mark:                                    | Id of a badge                                         | abc123                                                |
| `Status`                                              | [BadgeStatus](../../Models/Components/BadgeStatus.md) | :heavy_check_mark:                                    | Badge status                                          | Active                                                |
| `Type`                                                | [BadgeType](../../Models/Components/BadgeType.md)     | :heavy_check_mark:                                    | Badge type                                            | Epc                                                   |
| `Attendee`                                            | [Attendee2](../../Models/Components/Attendee2.md)     | :heavy_check_mark:                                    | The associated Attendee.                              |                                                       |
| `Event`                                               | [Event1](../../Models/Components/Event1.md)           | :heavy_check_mark:                                    | The Associated Event.                                 |                                                       |