# AgendaItem2

Represents the associated agenda item of a discount.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `Id`                                                                             | *string*                                                                         | :heavy_minus_sign:                                                               | A unique identifier of the agenda item.                                          | 14ca6ae2-0dc3-487b-953e-86d6abbdf6d4                                             |
| `Type`                                                                           | [EntityType1](../../Models/Components/EntityType1.md)                            | :heavy_minus_sign:                                                               | Specifies the type of agenda item that a discount is associated with.            | Session                                                                          |
| `Discount`                                                                       | [Uuid](../../Models/Components/Uuid.md)                                          | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |                                                                                  |