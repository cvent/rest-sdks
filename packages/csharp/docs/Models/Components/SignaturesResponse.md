# SignaturesResponse

Paginated Response of Attendee Signatures.


## Fields

| Field                                                                                           | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `Paging`                                                                                        | [PagingJson](../../Models/Components/PagingJson.md)                                             | :heavy_minus_sign:                                                                              | Represents pagination information for a collection of resources.                                |
| `Data`                                                                                          | List<[AttendeeSignatureResponseJson](../../Models/Components/AttendeeSignatureResponseJson.md)> | :heavy_minus_sign:                                                                              | Collection of signatures.                                                                       |