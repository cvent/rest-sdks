# BadgeInput

A JSON Schema for Badge object.


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `id`                                                  | *String*                                              | :heavy_check_mark:                                    | Id of a badge                                         | abc123                                                |
| `status`                                              | [BadgeStatus](../../models/components/BadgeStatus.md) | :heavy_check_mark:                                    | Badge status                                          | Active                                                |
| `type`                                                | [BadgeType](../../models/components/BadgeType.md)     | :heavy_check_mark:                                    | Badge type                                            | Epc                                                   |
| `attendee`                                            | [Attendee11](../../models/components/Attendee11.md)   | :heavy_check_mark:                                    | The associated Attendee.                              |                                                       |
| `event`                                               | [Event21](../../models/components/Event21.md)         | :heavy_check_mark:                                    | The Associated Event.                                 |                                                       |