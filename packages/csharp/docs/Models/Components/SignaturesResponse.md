# SignaturesResponse

Paginated Response of Attendee Signatures.


## Fields

| Field                                                                                   | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `Paging`                                                                                | [Paging](../../Models/Components/Paging.md)                                             | :heavy_minus_sign:                                                                      | Represents pagination information for a collection of resources.                        |
| `Data`                                                                                  | List<[AttendeeSignatureResponse](../../Models/Components/AttendeeSignatureResponse.md)> | :heavy_minus_sign:                                                                      | Collection of signatures.                                                               |