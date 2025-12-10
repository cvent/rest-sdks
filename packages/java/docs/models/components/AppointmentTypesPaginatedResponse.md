# AppointmentTypesPaginatedResponse

The response for a request of appointment types configured for scheduling appointments.


## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `paging`                                                                     | [Optional\<PagingJson>](../../models/components/PagingJson.md)               | :heavy_minus_sign:                                                           | Represents pagination information for a collection of resources.             |
| `data`                                                                       | List\<[AppointmentTypeJson](../../models/components/AppointmentTypeJson.md)> | :heavy_minus_sign:                                                           | The collection of appointment types object.                                  |