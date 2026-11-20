# ExistingAudienceSegmentCreationType

How the audience segment's membership is determined. MANUAL: a planner adds and removes attendees individually. RULE_BASED: attendees are added automatically when they match the segment's criteria rules.

## Example Usage

```typescript
import { ExistingAudienceSegmentCreationType } from "@cvent/sdk/models/components";

let value: ExistingAudienceSegmentCreationType = "MANUAL";
```

## Values

```typescript
"MANUAL" | "RULE_BASED"
```