# SpeakerSession

A speaker to session relationship.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `Id`                                                                 | *string*                                                             | :heavy_minus_sign:                                                   | A string that has to be a format matching the industry standard uuid | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                 |
| `Speaker`                                                            | [SpeakerLite1](../../Models/Components/SpeakerLite1.md)              | :heavy_minus_sign:                                                   | The unique identifier of a speaker.                                  |                                                                      |
| `Category`                                                           | [NamedObject](../../Models/Components/NamedObject.md)                | :heavy_minus_sign:                                                   | A Named object                                                       |                                                                      |