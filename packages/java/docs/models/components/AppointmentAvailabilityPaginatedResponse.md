# AppointmentAvailabilityPaginatedResponse

The response for a request for appointment availability times, including paging information.


## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `paging`                                                                             | [Optional\<PagingJson>](../../models/components/PagingJson.md)                       | :heavy_minus_sign:                                                                   | Represents pagination information for a collection of resources.                     |
| `data`                                                                               | List\<[AppointmentAvailability](../../models/components/AppointmentAvailability.md)> | :heavy_minus_sign:                                                                   | The collection of appointment availability times and their related details.          |