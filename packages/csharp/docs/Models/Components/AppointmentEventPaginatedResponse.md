# AppointmentEventPaginatedResponse

The response from a request to get the list of appointment events, includes the paging object.


## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `Paging`                                                              | [PagingJson](../../Models/Components/PagingJson.md)                   | :heavy_check_mark:                                                    | Represents pagination information for a collection of resources.      |
| `Data`                                                                | List<[AppointmentEvent](../../Models/Components/AppointmentEvent.md)> | :heavy_check_mark:                                                    | Collection of appointment events and their related details.           |