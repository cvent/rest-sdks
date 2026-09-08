# AgendaItem2

Represents the associated agenda item of a discount.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `id`                                                                             | *Optional\<String>*                                                              | :heavy_minus_sign:                                                               | A unique identifier of the agenda item.                                          | 14ca6ae2-0dc3-487b-953e-86d6abbdf6d4                                             |
| `type`                                                                           | [Optional\<EntityType1>](../../models/components/EntityType1.md)                 | :heavy_minus_sign:                                                               | Specifies the type of agenda item that a discount is associated with.            | Session                                                                          |
| `discount`                                                                       | [Optional\<Uuid>](../../models/components/Uuid.md)                               | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |                                                                                  |