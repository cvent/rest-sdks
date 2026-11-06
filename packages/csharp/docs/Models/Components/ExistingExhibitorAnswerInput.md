# ExistingExhibitorAnswerInput

Exhibitor answer with an ID.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `Question`                                                                       | [Uuid](../../Models/Components/Uuid.md)                                          | :heavy_check_mark:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `Event`                                                                          | [Event4](../../Models/Components/Event4.md)                                      | :heavy_check_mark:                                                               | Associated event.                                                                |
| `Exhibitor`                                                                      | [Models.Components.Exhibitor](../../Models/Components/Exhibitor.md)              | :heavy_check_mark:                                                               | Associated exhibitor.                                                            |
| `Answers`                                                                        | List<[Answer2](../../Models/Components/Answer2.md)>                              | :heavy_check_mark:                                                               | List of answers.                                                                 |