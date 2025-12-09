# SolutionTypeJson

This is used to denote the solution type to be used for webcast. The 'Cvent Video Conferencing' refers to the video experience which links out the Attendee hub whereas 'Embedded Cvent Video Conferencing' refers to the video experience within the Attendee hub.

## Example Usage

```typescript
import { SolutionTypeJson } from "@cvent/sdk/models/components";

let value: SolutionTypeJson = "External Platform";
```

## Values

```typescript
"Cvent Video Conferencing" | "External Platform" | "Cvent Studio" | "Embedded Cvent Video Conferencing" | "Cvent Studio Lite" | "Embedded Cvent Studio"
```