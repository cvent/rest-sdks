# SessionSpeakerJson

A session speaker


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `Id`                                                                 | *string*                                                             | :heavy_minus_sign:                                                   | A string that has to be a format matching the industry standard uuid | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                 |
| `Session`                                                            | [SessionLiteJson](../../Models/Components/SessionLiteJson.md)        | :heavy_minus_sign:                                                   | The unique identifier of a session.                                  |                                                                      |
| `Category`                                                           | [CategoryIdNameJson](../../Models/Components/CategoryIdNameJson.md)  | :heavy_minus_sign:                                                   | A defined speaker category.                                          |                                                                      |
| `Order`                                                              | *long*                                                               | :heavy_minus_sign:                                                   | The order of the speaker in a session.                               | 1                                                                    |