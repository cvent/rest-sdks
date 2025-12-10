# DiscountAudienceTypeJson

Audiences which are eligible for the discount.`PRIMARY`: All attendees. Includes primary registrants and their guests. `GUEST`: Any attendee invited to the event. `ALL`: An attendee who's the guest of a primary registrant.

## Example Usage

```typescript
import { DiscountAudienceTypeJson } from "@cvent/sdk/models/components";

let value: DiscountAudienceTypeJson = "ALL";
```

## Values

```typescript
"PRIMARY" | "GUEST" | "ALL"
```