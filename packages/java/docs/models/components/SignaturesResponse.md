# SignaturesResponse

Paginated Response of Attendee Signatures.


## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `paging`                                                                                 | [Optional\<Paging>](../../models/components/Paging.md)                                   | :heavy_minus_sign:                                                                       | Represents pagination information for a collection of resources.                         |
| `data`                                                                                   | List\<[AttendeeSignatureResponse](../../models/components/AttendeeSignatureResponse.md)> | :heavy_minus_sign:                                                                       | Collection of signatures.                                                                |