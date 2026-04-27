# RfpAgendaItemScheduleWithIdJson

Contains RFP specific agenda items schedule information with agenda item id.


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     | Example                                                                         |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `dayNumber`                                                                     | *long*                                                                          | :heavy_check_mark:                                                              | Day number relative to start of event on which the agenda item occurs.          | 1                                                                               |
| `date`                                                                          | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html) | :heavy_minus_sign:                                                              | The ISO 8601 date of the agenda item.                                           | 2021-07-03                                                                      |
| `id`                                                                            | *Optional\<String>*                                                             | :heavy_minus_sign:                                                              | Unique ID of the agenda item.                                                   | 50dc08af-24a9-4d01-84be-3d43133dc945                                            |