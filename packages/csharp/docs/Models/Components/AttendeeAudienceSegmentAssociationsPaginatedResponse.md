# AttendeeAudienceSegmentAssociationsPaginatedResponse

The paginated response from a request to get the list of audience segments associated with an attendee.


## Fields

| Field                                                                                                     | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `Paging`                                                                                                  | [Paging](../../Models/Components/Paging.md)                                                               | :heavy_check_mark:                                                                                        | Represents pagination information for a collection of resources.                                          |
| `Data`                                                                                                    | List<[AttendeeAudienceSegmentAssociation](../../Models/Components/AttendeeAudienceSegmentAssociation.md)> | :heavy_check_mark:                                                                                        | Collection of audience segment associations for the attendee.                                             |