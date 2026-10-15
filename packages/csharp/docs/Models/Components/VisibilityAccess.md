# VisibilityAccess

Enumerated type to outline what the user has access to.

 `DOCUMENT` - The user has the ability to view all documents uploaded within their account.

 `EMARKETING_CAMPAIGN` - The user has the ability to view all eMarketing campaigns within their account.

 `EVENT` - The user has the ability to view all Events within their account.

 `MEETING_REQUEST` - The user has the ability to view all meeting requests within their account.

 `RFI` - The user has the ability to view all RFIs within their account.

 `RFP` - The user has the ability to view all RFPs within their account.

 `SURVEY` - The user has the ability to view all Surveys within their account.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = VisibilityAccess.Document;
```


## Values

| Name                 | Value                |
| -------------------- | -------------------- |
| `Document`           | DOCUMENT             |
| `EmarketingCampaign` | EMARKETING_CAMPAIGN  |
| `Event`              | EVENT                |
| `MeetingRequest`     | MEETING_REQUEST      |
| `Rfi`                | RFI                  |
| `Rfp`                | RFP                  |
| `Survey`             | SURVEY               |