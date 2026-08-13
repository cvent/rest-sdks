# CardDetailsPaginatedResponse

The response from a request to get the list of Card Details for the event.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [Paging](../../Models/Components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[CardDetails](../../Models/Components/CardDetails.md)>      | :heavy_check_mark:                                               | Collection of Card Details.                                      |