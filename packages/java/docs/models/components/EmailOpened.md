# EmailOpened

An email-opened activity.


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `type`                                                                                    | *Optional\<String>*                                                                       | :heavy_minus_sign:                                                                        | Type of the email.                                                                        | Invitation Reminder                                                                       |
| `opened`                                                                                  | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | ISO 8601 date and time when an email was opened.                                          | 2020-02-03T13:00:00.000Z                                                                  |