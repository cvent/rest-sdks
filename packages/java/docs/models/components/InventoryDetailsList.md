# InventoryDetailsList

List of inventory details for room type by night.


## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `paging`                                                                 | [Optional\<PagingJson>](../../models/components/PagingJson.md)           | :heavy_minus_sign:                                                       | Represents pagination information for a collection of resources.         |
| `data`                                                                   | List\<[RoomInventoryJson](../../models/components/RoomInventoryJson.md)> | :heavy_minus_sign:                                                       | List of inventory details by night.                                      |