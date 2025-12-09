# VideosPaginatedResponse

The response from a request to get the list of videos.  This includes the paging object as well as the collection of videos.

## Example Usage

```typescript
import { VideosPaginatedResponse } from "@cvent/sdk/models/components";

let value: VideosPaginatedResponse = {
  paging: {
    previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
    nextToken: "1a2b3c4d5e6f7g8h9i10j11k",
    currentToken: "1a2b3c4d5e6f7g8h9i10j11k",
    limit: 100,
    totalCount: 2,
    links: {
      next: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      self: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      prev: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
    },
  },
  data: [
    {
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
      title: "Cvent 2020 Keynote",
      description:
        "The video recording of the Cvent 2020 keynote by James Gordon",
      filename: "Cvent Keynote Version 5.mp4",
      events: [
        "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      ],
      duration: 3600000,
      thumbnail: {
        url: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        size: 4098675830,
        height: 400,
        width: 300,
        type: "png",
        status: "Started",
      },
      generatedThumbnail: {
        url: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        size: 4098675830,
        height: 400,
        width: 300,
        type: "png",
        status: "Started",
      },
      status: "Started",
      source: {
        id: "VD134567",
        status: "Active",
      },
      tags: [
        "edited",
        "exhibitor",
      ],
      type: "mp4",
      hlsInputsWithClips: [
        {
          hlsInput: "s3://bucket/path/to/recording/video.m3u8",
          clips: [
            {
              start: "00:01:01:00",
              end: "00:05:00:00",
            },
          ],
        },
      ],
      recording: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      url: {
        href:
          "https://ap-southeast-2.example.com/sign2-bucket-hchq3nwuo8ns/sign-demo.json?X-Exa-Date=20170125T044127Z&X-Exa-Expires=60&X-Exa-Signature=24db05",
      },
      size: 32768,
      sessions: [
        "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      ],
      exhibitors: [
        "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      ],
      speakers: [
        "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      ],
      uploadStarted: new Date("2024-01-05T15:30:00Z"),
      uploadCompleted: new Date("2024-01-05T15:35:00Z"),
      errors: [
        {
          code: 601,
          message: "Transcoding failed due to an unsupported video codec.",
        },
      ],
      warnings: [
        {
          code: 700,
          message: "Input video is scaled down to 1080p resolution.",
        },
      ],
    },
  ],
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `paging`                                                                               | [components.PagingJson](../../models/components/pagingjson.md)                         | :heavy_check_mark:                                                                     | Represents pagination information for a collection of resources.                       |
| `data`                                                                                 | [components.ExistingVideoResponse](../../models/components/existingvideoresponse.md)[] | :heavy_check_mark:                                                                     | Collection of videos.                                                                  |