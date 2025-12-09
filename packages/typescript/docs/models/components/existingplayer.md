# ExistingPlayer

An existing webcast player.

## Example Usage

```typescript
import { ExistingPlayer } from "@cvent/sdk/models/components";

let value: ExistingPlayer = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  webcast: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  videoId: "123ERt",
  videoUrl:
    "https://80a8541ebf4d.us-east-1.playback.live-video.net/api/video/v1/us-east-1.572724207364.channel.L7FiQgC4MUt6.m3u8",
  password: "123ERt",
  stream: {
    id: "stream1256wet",
    url: "https://cvent.zoom.us/j/7566652259",
    key: "145asa16ZS78",
    status: "Standby",
    session: {
      id: "st-1A2b3c4D5e6F78ghij9Klmn",
    },
    page: "https://cvent.zoom.aspx/j/7566652259",
    recording: {
      id: "62989518f9294e19b2f7e184e8141d72",
      status: "finished",
    },
  },
  region: "Oregon",
  duration: 3600000,
  schedule: {
    scheduledExecution: new Date("2024-03-05T09:00:00Z"),
    action: "activate",
  },
  playerTypeProvider: "Amazon IVS",
  simuliveOffset: 300,
};
```

## Fields

| Field                                                                                                                | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          | Example                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `created`                                                                                                            | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                        | :heavy_minus_sign:                                                                                                   | The ISO 8601 zoned date time when this record was created.                                                           | 2017-01-02T02:00:00Z                                                                                                 |
| `createdBy`                                                                                                          | *string*                                                                                                             | :heavy_minus_sign:                                                                                                   | The identifier of the user that created this record.                                                                 | hporter                                                                                                              |
| `lastModified`                                                                                                       | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                        | :heavy_minus_sign:                                                                                                   | The ISO 8601 zoned date time when this record was updated.                                                           | 2019-02-12T03:00:00Z                                                                                                 |
| `lastModifiedBy`                                                                                                     | *string*                                                                                                             | :heavy_minus_sign:                                                                                                   | The identifier of the user that last updated this record.                                                            | hporter                                                                                                              |
| `webcast`                                                                                                            | [components.UuidJson](../../models/components/uuidjson.md)                                                           | :heavy_minus_sign:                                                                                                   | The reference to the related entity. Contains only the ID of the related entity.                                     |                                                                                                                      |
| `videoId`                                                                                                            | *string*                                                                                                             | :heavy_minus_sign:                                                                                                   | ID of the video to be played.                                                                                        | 123ERt                                                                                                               |
| `videoUrl`                                                                                                           | *string*                                                                                                             | :heavy_minus_sign:                                                                                                   | URL to play video                                                                                                    | https://80a8541ebf4d.us-east-1.playback.live-video.net/api/video/v1/us-east-1.572724207364.channel.L7FiQgC4MUt6.m3u8 |
| `password`                                                                                                           | *string*                                                                                                             | :heavy_minus_sign:                                                                                                   | Password to access the video.                                                                                        | 123ERt                                                                                                               |
| `stream`                                                                                                             | [components.LiveStreamJson](../../models/components/livestreamjson.md)                                               | :heavy_minus_sign:                                                                                                   | A webcast Live Stream.                                                                                               |                                                                                                                      |
| `region`                                                                                                             | [components.RegionJson1](../../models/components/regionjson1.md)                                                     | :heavy_minus_sign:                                                                                                   | Region where the live stream originates (These regions are only for Brightcove player)                               | Oregon                                                                                                               |
| `duration`                                                                                                           | *number*                                                                                                             | :heavy_minus_sign:                                                                                                   | Video duration (milliseconds)                                                                                        | 3600000                                                                                                              |
| `schedule`                                                                                                           | [components.ScheduleJson](../../models/components/schedulejson.md)                                                   | :heavy_minus_sign:                                                                                                   | A scheduled action.                                                                                                  |                                                                                                                      |
| `playerTypeProvider`                                                                                                 | [components.PlayerTypeProviderJson](../../models/components/playertypeproviderjson.md)                               | :heavy_minus_sign:                                                                                                   | This is used to denote the type of a video player used for the Cvent Video Player                                    | Amazon IVS                                                                                                           |
| `simuliveOffset`                                                                                                     | *number*                                                                                                             | :heavy_minus_sign:                                                                                                   | Offset (seconds) to determine start date for simulated live video.                                                   | 300                                                                                                                  |
| `id`                                                                                                                 | *string*                                                                                                             | :heavy_minus_sign:                                                                                                   | Player ID                                                                                                            |                                                                                                                      |