# BadgeInput

Badge of an attendee.


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `id`                                                  | *String*                                              | :heavy_check_mark:                                    | Badge ID.                                             | abc123                                                |
| `status`                                              | [BadgeStatus](../../models/components/BadgeStatus.md) | :heavy_check_mark:                                    | Status of the badge.                                  | Active                                                |
| `type`                                                | [BadgeType](../../models/components/BadgeType.md)     | :heavy_check_mark:                                    | Type of the badge.                                    | Epc                                                   |
| `attendee`                                            | [Attendee12](../../models/components/Attendee12.md)   | :heavy_check_mark:                                    | Associated attendee.                                  |                                                       |
| `event`                                               | [Event4](../../models/components/Event4.md)           | :heavy_check_mark:                                    | Associated event.                                     |                                                       |