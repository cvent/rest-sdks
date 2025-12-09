# EncodingProfileJson

Denotes the profile to use when encoding the video. Planner profile is for encoding high-quality event content, like session videos. Attendee profile is for encoding lower-quality content intended to go on attendee profiles and social feeds in the event.

## Example Usage

```typescript
import { EncodingProfileJson } from "@cvent/sdk/models/components";

let value: EncodingProfileJson = "Planner";
```

## Values

```typescript
"Planner" | "Attendee"
```