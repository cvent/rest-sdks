# ExistingExhibitorAnswerInput

Existing Exhibitor Answer schema


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `question`                                                                       | [Uuid](../../models/components/Uuid.md)                                          | :heavy_check_mark:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `event`                                                                          | [Event4](../../models/components/Event4.md)                                      | :heavy_check_mark:                                                               | The Associated Event.                                                            |
| `exhibitor`                                                                      | [Exhibitor](../../models/components/Exhibitor.md)                                | :heavy_check_mark:                                                               | The Associated Exhibitor.                                                        |
| `answers`                                                                        | List\<[Answer22](../../models/components/Answer22.md)>                           | :heavy_check_mark:                                                               | List of answers                                                                  |