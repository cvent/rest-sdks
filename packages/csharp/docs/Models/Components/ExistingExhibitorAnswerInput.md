# ExistingExhibitorAnswerInput

Existing Exhibitor Answer schema


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `Question`                                                                       | [Uuid1](../../Models/Components/Uuid1.md)                                        | :heavy_check_mark:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `Event`                                                                          | [Event1](../../Models/Components/Event1.md)                                      | :heavy_check_mark:                                                               | The Associated Event.                                                            |
| `Exhibitor`                                                                      | [Models.Components.Exhibitor](../../Models/Components/Exhibitor.md)              | :heavy_check_mark:                                                               | The Associated Exhibitor.                                                        |
| `Answers`                                                                        | List<[Answer2](../../Models/Components/Answer2.md)>                              | :heavy_check_mark:                                                               | List of answers                                                                  |