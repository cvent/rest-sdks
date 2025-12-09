# EventCheckedOut

An email-checked-out activity.


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `event`                                                                                   | [Optional\<ActivityDataJsonEvent3>](../../models/components/ActivityDataJsonEvent3.md)    | :heavy_minus_sign:                                                                        | The event in which this activity occurred.                                                |                                                                                           |
| `checkOut`                                                                                | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | ISO 8601 date and time when an attendee checked out from an event.                        | 2020-02-03T13:00:00.000Z                                                                  |