# ExternalActivityMetadataPaginatedResponse

The response from a request to get the list of activities metadata in an account.  This includes the paging object as well as the collection of activities metadata in an account.


## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `Paging`                                                                              | [PagingJson](../../Models/Components/PagingJson.md)                                   | :heavy_check_mark:                                                                    | Represents pagination information for a collection of resources.                      |
| `Data`                                                                                | List<[ExternalActivityMetadata](../../Models/Components/ExternalActivityMetadata.md)> | :heavy_check_mark:                                                                    | Collection of external attendee activities metadata in an account.                    |