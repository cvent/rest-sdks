# BounceDetailsResponse

The response from a request to get the bounce details of an email. This includes paging object


## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `paging`                                                                    | [PagingNoTotalCountJson](../../models/components/PagingNoTotalCountJson.md) | :heavy_check_mark:                                                          | Represents pagination information for a collection of resources.            |
| `data`                                                                      | List\<[BounceDetailsJson](../../models/components/BounceDetailsJson.md)>    | :heavy_check_mark:                                                          | Bounce details.                                                             |