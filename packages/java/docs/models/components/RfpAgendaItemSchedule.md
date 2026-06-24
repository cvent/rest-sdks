# RfpAgendaItemSchedule

Schedule information for an RFP agenda item.


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     | Example                                                                         |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `dayNumber`                                                                     | *long*                                                                          | :heavy_check_mark:                                                              | Day number relative to start of event on which the agenda item occurs.          | 1                                                                               |
| `date`                                                                          | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html) | :heavy_minus_sign:                                                              | The ISO 8601 date of the agenda item.                                           | 2021-07-03                                                                      |