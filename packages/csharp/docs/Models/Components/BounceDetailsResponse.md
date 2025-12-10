# BounceDetailsResponse

The response from a request to get the bounce details of an email. This includes paging object


## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `Paging`                                                                      | [PagingNoTotalCountJson1](../../Models/Components/PagingNoTotalCountJson1.md) | :heavy_check_mark:                                                            | Represents pagination information for a collection of resources.              |
| `Data`                                                                        | List<[BounceDetailsJson](../../Models/Components/BounceDetailsJson.md)>       | :heavy_check_mark:                                                            | Bounce details.                                                               |