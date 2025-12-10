# CustomFieldsPaginatedResponse

The response from a request to get the list of custom fields metadata.  This includes the paging object as well as the collection of custom fields metadata.


## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `Paging`                                                                    | [PagingJson](../../Models/Components/PagingJson.md)                         | :heavy_check_mark:                                                          | Represents pagination information for a collection of resources.            |
| `Data`                                                                      | List<[ExistingCustomField](../../Models/Components/ExistingCustomField.md)> | :heavy_check_mark:                                                          | Collection of custom fields.                                                |