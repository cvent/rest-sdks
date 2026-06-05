# TaxSchedule

A tax schedule used for location-based tax calculation.


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `Id`                                                          | *string*                                                      | :heavy_check_mark:                                            | Tax schedule ID.                                              |                                                               |
| `Name`                                                        | *string*                                                      | :heavy_check_mark:                                            | Name of the tax schedule.                                     | New York State Tax Schedule                                   |
| `DefaultRate`                                                 | *double*                                                      | :heavy_minus_sign:                                            | Default tax rate for the schedule, expressed as a percentage. | 8.875                                                         |