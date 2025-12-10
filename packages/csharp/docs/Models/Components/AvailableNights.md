# AvailableNights

List of available room nights and the availabilities associated details.


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `Paging`                                                                  | [PagingJson](../../Models/Components/PagingJson.md)                       | :heavy_minus_sign:                                                        | Represents pagination information for a collection of resources.          |
| `Data`                                                                    | List<[AvailableNightJson](../../Models/Components/AvailableNightJson.md)> | :heavy_minus_sign:                                                        | List of available room nights and their associated details.               |