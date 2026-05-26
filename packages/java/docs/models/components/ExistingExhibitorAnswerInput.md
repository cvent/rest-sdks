# ExistingExhibitorAnswerInput

Existing Exhibitor Answer schema


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `question`                                                                       | [Uuid1](../../models/components/Uuid1.md)                                        | :heavy_check_mark:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `event`                                                                          | [Event1](../../models/components/Event1.md)                                      | :heavy_check_mark:                                                               | The Associated Event.                                                            |
| `exhibitor`                                                                      | [Exhibitor](../../models/components/Exhibitor.md)                                | :heavy_check_mark:                                                               | The Associated Exhibitor.                                                        |
| `answers`                                                                        | List\<[Answer2](../../models/components/Answer2.md)>                             | :heavy_check_mark:                                                               | List of answers                                                                  |