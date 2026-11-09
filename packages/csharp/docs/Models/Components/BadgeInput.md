# BadgeInput

Badge of an attendee.


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `Id`                                                  | *string*                                              | :heavy_check_mark:                                    | Badge ID.                                             | abc123                                                |
| `Status`                                              | [BadgeStatus](../../Models/Components/BadgeStatus.md) | :heavy_check_mark:                                    | Status of the badge.                                  | Active                                                |
| `Type`                                                | [BadgeType](../../Models/Components/BadgeType.md)     | :heavy_check_mark:                                    | Type of the badge.                                    | Epc                                                   |
| `Attendee`                                            | [Attendee12](../../Models/Components/Attendee12.md)   | :heavy_check_mark:                                    | Associated attendee.                                  |                                                       |
| `Event`                                               | [Event4](../../Models/Components/Event4.md)           | :heavy_check_mark:                                    | Associated event.                                     |                                                       |