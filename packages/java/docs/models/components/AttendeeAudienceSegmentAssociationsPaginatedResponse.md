# AttendeeAudienceSegmentAssociationsPaginatedResponse

The paginated response from a request to get the list of audience segments associated with an attendee.


## Fields

| Field                                                                                                      | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `paging`                                                                                                   | [Paging](../../models/components/Paging.md)                                                                | :heavy_check_mark:                                                                                         | Represents pagination information for a collection of resources.                                           |
| `data`                                                                                                     | List\<[AttendeeAudienceSegmentAssociation](../../models/components/AttendeeAudienceSegmentAssociation.md)> | :heavy_check_mark:                                                                                         | Collection of audience segment associations for the attendee.                                              |