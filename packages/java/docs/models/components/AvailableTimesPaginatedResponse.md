# AvailableTimesPaginatedResponse

The response for a request of available time ranges for scheduling appointments.


## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `paging`                                                                 | [Optional\<PagingJson>](../../models/components/PagingJson.md)           | :heavy_minus_sign:                                                       | Represents pagination information for a collection of resources.         |
| `data`                                                                   | List\<[AvailableTimeJson](../../models/components/AvailableTimeJson.md)> | :heavy_minus_sign:                                                       | Collection of available time ranges and their associated details.        |