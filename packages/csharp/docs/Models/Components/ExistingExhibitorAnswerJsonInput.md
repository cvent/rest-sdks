# ExistingExhibitorAnswerJsonInput

Existing Exhibitor Answer schema


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `Question`                                                                       | [UuidJson](../../Models/Components/UuidJson.md)                                  | :heavy_check_mark:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `Event`                                                                          | [EventJson6](../../Models/Components/EventJson6.md)                              | :heavy_check_mark:                                                               | The Associated Event.                                                            |
| `Exhibitor`                                                                      | [ExhibitorJson](../../Models/Components/ExhibitorJson.md)                        | :heavy_check_mark:                                                               | The Associated Exhibitor.                                                        |
| `Answers`                                                                        | List<[AnswerJson0](../../Models/Components/AnswerJson0.md)>                      | :heavy_check_mark:                                                               | List of answers                                                                  |