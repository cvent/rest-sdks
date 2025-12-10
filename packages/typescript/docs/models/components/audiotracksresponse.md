# AudioTracksResponse

The response from a request to get the list of audio tracks.

## Example Usage

```typescript
import { AudioTracksResponse } from "@cvent/sdk/models/components";

let value: AudioTracksResponse = {
  data: [
    {
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
      video: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      type: "mp3",
      language: "en-US",
      duration: 3600000,
      status: "Started",
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      url: {
        href:
          "https://ap-southeast-2.example.com/sign2-bucket-hchq3nwuo8ns/sign-demo.json?X-Exa-Date=20170125T044127Z&X-Exa-Expires=60&X-Exa-Signature=24db05",
      },
    },
  ],
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `data`                                                                           | [components.ExistingAudioTrack](../../models/components/existingaudiotrack.md)[] | :heavy_minus_sign:                                                               | Collection of audio tracks.                                                      |