# ExistingExhibitorAnswerInput

Exhibitor answer with an ID.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `question`                                                                       | [Uuid](../../models/components/Uuid.md)                                          | :heavy_check_mark:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `event`                                                                          | [Event4](../../models/components/Event4.md)                                      | :heavy_check_mark:                                                               | Associated event.                                                                |
| `exhibitor`                                                                      | [Exhibitor](../../models/components/Exhibitor.md)                                | :heavy_check_mark:                                                               | Associated exhibitor.                                                            |
| `answers`                                                                        | List\<[Answer2](../../models/components/Answer2.md)>                             | :heavy_check_mark:                                                               | List of answers.                                                                 |