## 2026-05-21 00:00:00
### Changes
Based on:
- OpenAPI Doc
- Speakeasy CLI 1.752.0 https://github.com/speakeasy-api/speakeasy
### SDK Changes
#### New Models
- `AttendeeAudienceSegmentAssociationJson` — represents a single active audience segment association for an attendee
- `AttendeeAudienceSegmentAssociationsPaginatedResponse` — paginated response for attendee audience segment association lists
#### Updated Models
- `EventFeatureJson` / `EventFeaturesResponse` — new `CreditsAndCertificates` enum value added to the feature type; allows planners to create credit rules, link them to events/sessions, award credits, create certificates, and link them to credit rules. Only one of `EventCredits` or `CreditsAndCertificates` can be active at a time
- `AudienceSegment`, `AudienceSegmentCreate`, `ExistingAudienceSegment`, `AudienceSegmentResponse` — `required` correction: `event` field is now correctly required (replaces incorrect `eventId`)
- Multiple models were renamed/consolidated by the generator to remove redundant `Json{N}` suffixes (e.g. `AttendeeJson3` → `Attendee`, `CapacityJson1` → `Capacity`) — 63–74 old model files removed, replaced by cleaner equivalents
### API Changes
#### New APIs
- Audience Segments: 'List Associated Segments' (GET /attendees/{attendeeId}/audience-segments)
- Audience Segments: 'List Associated Segments' (POST /attendees/{attendeeId}/audience-segments/filter)
- Events: 'List Membership Items' (POST /events/{id}/membership-items/filter)
#### Updates to APIs
- Event Role: 'List Event Role Assignments' (GET /event-roles/assignments) — added `after` and `before` query parameters
- Event Features: 'Update Event Feature' (PUT /events/{id}/features/{type}) — new `CreditsAndCertificates` value added to the feature type enum
- Meeting Request: 'Create MR (Bulk)' / 'Update MR (Bulk)' — description updated noting `event.id` may not be populated immediately on creation (event creation is async)
- Audience Segments: 'Create/Update Audience Segment' — `required` corrected from `eventId` to `event`
- RFP Management: 'Get RFP' — `name` removed from `required`; lead source description links updated
- Process Form: 'List Process Form Submissions' — `required` corrected from literal string `"id, event"` to separate entries
- Signatures: 'List Signatures' — `required` corrected from `stopCheckIn` to `stopCheckin`
#### Miscellaneous Changes
- Filter parameter descriptions for multiple endpoints reformatted from prose to markdown tables
### Generated
- [csharp v1.3.0] packages/csharp
### Releases
- [NuGet v1.3.0] https://www.nuget.org/packages/Cvent.SDK/1.3.0 - packages/csharp

## 2024-12-15 00:00:00
### Changes
Based on:
- OpenAPI Doc
- Speakeasy CLI 1.675.4 (2.779.2) https://github.com/speakeasy-api/speakeasy
### Added
- Type-safe methods and models for all API operations
- Automatic token management and refresh
- Configurable retry policies with exponential backoff
- Logging hooks for request/response tracking
- Pagination helpers for list operations
- Generated from Cvent OpenAPI specification
### Notes
- Early adopter release - breaking changes may occur
- Authorization Code Flow custom authentication not supported
### Generated
- [csharp v1.0.0] packages/csharp
### Releases
- [NuGet v1.0.0] https://www.nuget.org/packages/Cvent.SDK/1.0.0 - packages/csharp
