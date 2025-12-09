# UpdateTextTrackRequest

## Example Usage

```typescript
import { UpdateTextTrackRequest } from "@cvent/sdk/models/operations";

let value: UpdateTextTrackRequest = {
  videoId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  textTrackId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  existingVideoTextTrack: {
    video: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    label: "English",
    language: "en-US",
    kind: "subtitles",
    status: "Started",
    errorMessage: "Input file was empty",
  },
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `videoId`                                                                                        | *string*                                                                                         | :heavy_check_mark:                                                                               | The identifier of a video.                                                                       | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                             |
| `textTrackId`                                                                                    | *string*                                                                                         | :heavy_check_mark:                                                                               | The identifier of a video text track.                                                            | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                             |
| `existingVideoTextTrack`                                                                         | [components.ExistingVideoTextTrackInput](../../models/components/existingvideotexttrackinput.md) | :heavy_check_mark:                                                                               | N/A                                                                                              |                                                                                                  |