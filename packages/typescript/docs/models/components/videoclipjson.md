# VideoClipJson

Video clip details.

## Example Usage

```typescript
import { VideoClipJson } from "@cvent/sdk/models/components";

let value: VideoClipJson = {
  start: "00:01:01:00",
  end: "00:05:00:00",
};
```

## Fields

| Field                                                | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `start`                                              | *string*                                             | :heavy_minus_sign:                                   | The timecode to start the clip in HH:MM:SS:FF format | 00:01:01:00                                          |
| `end`                                                | *string*                                             | :heavy_minus_sign:                                   | The timecode to end the clip in HH:MM:SS:FF format.  | 00:05:00:00                                          |