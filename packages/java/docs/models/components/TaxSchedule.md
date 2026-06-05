# TaxSchedule

A tax schedule used for location-based tax calculation.


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `id`                                                          | *String*                                                      | :heavy_check_mark:                                            | Tax schedule ID.                                              |                                                               |
| `name`                                                        | *String*                                                      | :heavy_check_mark:                                            | Name of the tax schedule.                                     | New York State Tax Schedule                                   |
| `defaultRate`                                                 | *Optional\<Double>*                                           | :heavy_minus_sign:                                            | Default tax rate for the schedule, expressed as a percentage. | 8.875                                                         |