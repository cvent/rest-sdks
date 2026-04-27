# RfpAgendaItemScheduleJson

Schedule information for an RFP agenda item.


## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           | Example                                                                               |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `DayNumber`                                                                           | *long*                                                                                | :heavy_check_mark:                                                                    | Day number relative to start of event on which the agenda item occurs.                | 1                                                                                     |
| `Date`                                                                                | [DateOnly](https://learn.microsoft.com/en-us/dotnet/api/system.dateonly?view=net-6.0) | :heavy_minus_sign:                                                                    | The ISO 8601 date of the agenda item.                                                 | 2021-07-03                                                                            |