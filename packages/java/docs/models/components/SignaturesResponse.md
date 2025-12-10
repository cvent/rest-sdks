# SignaturesResponse

Paginated Response of Attendee Signatures.


## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `paging`                                                                                         | [Optional\<PagingJson>](../../models/components/PagingJson.md)                                   | :heavy_minus_sign:                                                                               | Represents pagination information for a collection of resources.                                 |
| `data`                                                                                           | List\<[AttendeeSignatureResponseJson](../../models/components/AttendeeSignatureResponseJson.md)> | :heavy_minus_sign:                                                                               | Collection of signatures.                                                                        |