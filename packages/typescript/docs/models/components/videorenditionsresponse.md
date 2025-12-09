# VideoRenditionsResponse

The response from a request to get the list of video renditions.

## Example Usage

```typescript
import { VideoRenditionsResponse } from "@cvent/sdk/models/components";

let value: VideoRenditionsResponse = {
  data: [
    {
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
      video: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      type: "Hls",
      location: {
        href:
          "https://example.com/M8/7f378243-2c62-49fa-82e9-90e5498d30c3?Policy=eyJTdGF0ZW1lbnUysx5cE4-KWfUQ__&Key-Pair-Id=K6XDZ8UJY4Q0X",
      },
      width: 300,
      height: 400,
    },
  ],
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `data`                                                                           | [components.VideoRenditionJson](../../models/components/videorenditionjson.md)[] | :heavy_minus_sign:                                                               | Collection of video renditions.                                                  |