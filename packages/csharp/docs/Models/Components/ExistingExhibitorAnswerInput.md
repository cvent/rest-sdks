# ExistingExhibitorAnswerInput

Existing Exhibitor Answer schema


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `Question`                                                                       | [Uuid](../../Models/Components/Uuid.md)                                          | :heavy_check_mark:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `Event`                                                                          | [Event3](../../Models/Components/Event3.md)                                      | :heavy_check_mark:                                                               | The Associated Event.                                                            |
| `Exhibitor`                                                                      | [Models.Components.Exhibitor](../../Models/Components/Exhibitor.md)              | :heavy_check_mark:                                                               | The Associated Exhibitor.                                                        |
| `Answers`                                                                        | List<[Answer22](../../Models/Components/Answer22.md)>                            | :heavy_check_mark:                                                               | List of answers                                                                  |