# InventoryDetailsList

List of inventory details for room type by night.


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `Paging`                                                                | [PagingJson](../../Models/Components/PagingJson.md)                     | :heavy_minus_sign:                                                      | Represents pagination information for a collection of resources.        |
| `Data`                                                                  | List<[RoomInventoryJson](../../Models/Components/RoomInventoryJson.md)> | :heavy_minus_sign:                                                      | List of inventory details by night.                                     |