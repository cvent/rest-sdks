# EventCheckedIn

An email-checked-in activity.


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `event`                                                                                   | [Optional\<ActivityDataJsonEvent2>](../../models/components/ActivityDataJsonEvent2.md)    | :heavy_minus_sign:                                                                        | The event in which this activity occurred.                                                |                                                                                           |
| `checkedIn`                                                                               | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | ISO 8601 date and time when an attendee checked in to an event.                           | 2020-02-03T13:00:00.000Z                                                                  |