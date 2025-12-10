# HousingEventHotelsList

List of hotels associated with a particular housing event.


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `Paging`                                                                | [PagingJson](../../Models/Components/PagingJson.md)                     | :heavy_check_mark:                                                      | Represents pagination information for a collection of resources.        |
| `Data`                                                                  | List<[HousingEventHotel](../../Models/Components/HousingEventHotel.md)> | :heavy_check_mark:                                                      | List of hotels associated with a particular housing event.              |