# AirActualDetail

The response from a request to get the list of air actual for the attendees.  This includes the paging object as well as the collection of air actual details.


## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `paging`                                                                                     | [PagingJson](../../models/components/PagingJson.md)                                          | :heavy_check_mark:                                                                           | Represents pagination information for a collection of resources.                             |
| `data`                                                                                       | List\<[AirActualDetailResponseJson](../../models/components/AirActualDetailResponseJson.md)> | :heavy_check_mark:                                                                           | Collection of air actuals for attendees.                                                     |