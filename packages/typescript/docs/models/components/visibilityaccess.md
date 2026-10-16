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

```typescript
import { VisibilityAccess } from "@cvent/sdk/models/components";

let value: VisibilityAccess = "EVENT";
```

## Values

```typescript
"DOCUMENT" | "EMARKETING_CAMPAIGN" | "EVENT" | "MEETING_REQUEST" | "RFI" | "RFP" | "SURVEY"
```