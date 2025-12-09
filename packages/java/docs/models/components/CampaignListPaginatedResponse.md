# CampaignListPaginatedResponse

The response from a request to get the list of campaign. This includes the paging object as well as the collection of campaign data.


## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `paging`                                                               | [PagingJson](../../models/components/PagingJson.md)                    | :heavy_check_mark:                                                     | Represents pagination information for a collection of resources.       |
| `data`                                                                 | List\<[CampaignDataJson](../../models/components/CampaignDataJson.md)> | :heavy_check_mark:                                                     | A list of all campaigns.                                               |