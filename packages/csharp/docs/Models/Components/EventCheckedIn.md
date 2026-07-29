# EventCheckedIn

An email-checked-in activity.


## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           | Example                                                                               |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `Event`                                                                               | [ActivityDataEvent1](../../Models/Components/ActivityDataEvent1.md)                   | :heavy_minus_sign:                                                                    | The event in which this activity occurred.                                            |                                                                                       |
| `CheckedIn`                                                                           | [DateTime](https://learn.microsoft.com/en-us/dotnet/api/system.datetime?view=net-5.0) | :heavy_minus_sign:                                                                    | ISO 8601 date and time when an attendee checked in to an event.                       | 2020-02-03T13:00:00.000Z                                                              |