# ExistingExhibitorAnswerJsonInput

Existing Exhibitor Answer schema


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `question`                                                                       | [UuidJson](../../models/components/UuidJson.md)                                  | :heavy_check_mark:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `event`                                                                          | [EventJson6](../../models/components/EventJson6.md)                              | :heavy_check_mark:                                                               | The Associated Event.                                                            |
| `exhibitor`                                                                      | [ExhibitorJson](../../models/components/ExhibitorJson.md)                        | :heavy_check_mark:                                                               | The Associated Exhibitor.                                                        |
| `answers`                                                                        | List\<[AnswerJson0](../../models/components/AnswerJson0.md)>                     | :heavy_check_mark:                                                               | List of answers                                                                  |