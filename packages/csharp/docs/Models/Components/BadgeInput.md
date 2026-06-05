# BadgeInput

A JSON Schema for Badge object.


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `Id`                                                  | *string*                                              | :heavy_check_mark:                                    | Id of a badge                                         | abc123                                                |
| `Status`                                              | [BadgeStatus](../../Models/Components/BadgeStatus.md) | :heavy_check_mark:                                    | Badge status                                          | Active                                                |
| `Type`                                                | [BadgeType](../../Models/Components/BadgeType.md)     | :heavy_check_mark:                                    | Badge type                                            | Epc                                                   |
| `Attendee`                                            | [Attendee11](../../Models/Components/Attendee11.md)   | :heavy_check_mark:                                    | The associated Attendee.                              |                                                       |
| `Event`                                               | [Event21](../../Models/Components/Event21.md)         | :heavy_check_mark:                                    | The Associated Event.                                 |                                                       |