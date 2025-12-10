# AudioTrackVariantJson

Denotes the variant of an audio track. Main is the primary audio track for this video. Alternate is a possible alternative to the main track. Commentary is a commentary on the primary audio or video track, e.g. a director's commentary. Dub is a translated version of the main audio track. Descriptive is an audio description of a video track.

## Example Usage

```typescript
import { AudioTrackVariantJson } from "@cvent/sdk/models/components";

let value: AudioTrackVariantJson = "Alternate";
```

## Values

```typescript
"Main" | "Alternate" | "Commentary" | "Dub" | "Descriptive"
```