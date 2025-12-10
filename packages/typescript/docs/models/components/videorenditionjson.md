# VideoRenditionJson

Video rendition

## Example Usage

```typescript
import { VideoRenditionJson } from "@cvent/sdk/models/components";

let value: VideoRenditionJson = {
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
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `video`                                                                                       | [components.VideoAssetIdJson](../../models/components/videoassetidjson.md)                    | :heavy_minus_sign:                                                                            | Video that this asset was created with.                                                       |                                                                                               |
| `type`                                                                                        | [components.VideoRenditionTypeJson](../../models/components/videorenditiontypejson.md)        | :heavy_minus_sign:                                                                            | Denotes the type of rendition.                                                                | Hls                                                                                           |
| `location`                                                                                    | [components.VideoRenditionJsonLink](../../models/components/videorenditionjsonlink.md)        | :heavy_minus_sign:                                                                            | Location where the rendition is stored.                                                       |                                                                                               |
| `width`                                                                                       | *number*                                                                                      | :heavy_minus_sign:                                                                            | The video's frame width in pixels.                                                            | 300                                                                                           |
| `height`                                                                                      | *number*                                                                                      | :heavy_minus_sign:                                                                            | The video's frame height in pixels.                                                           | 400                                                                                           |