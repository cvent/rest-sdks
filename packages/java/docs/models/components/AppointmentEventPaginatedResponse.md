# AppointmentEventPaginatedResponse

The response from a request to get the list of appointment events, includes the paging object.


## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `paging`                                                               | [PagingJson](../../models/components/PagingJson.md)                    | :heavy_check_mark:                                                     | Represents pagination information for a collection of resources.       |
| `data`                                                                 | List\<[AppointmentEvent](../../models/components/AppointmentEvent.md)> | :heavy_check_mark:                                                     | Collection of appointment events and their related details.            |