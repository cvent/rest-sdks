# Webcast

A webcast

## Example Usage

```typescript
import { Webcast } from "@cvent/sdk/models/components";

let value: Webcast = {
  event: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  appointment: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  exhibitor: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  format: "Pre-recorded",
  type: "Meeting",
  provider: "Zoom",
  status: "Started",
  playerType: "Cvent Video Player",
  simulatedLive: false,
  recordLiveStream: false,
  onDemandVideo: false,
  sourceId: "kBBBAAcccdddd8U==",
  title: "Webinar Connect Event",
  meetingId: "123ERt",
  links: {
    join: {
      href: "https://cvent.zoom.us/j/7566652259",
      code: "1456ZS78",
    },
    speaker: {
      href: "https://cvent.zoom.us/j/7566652259",
      code: "1456ZS78",
    },
    host: {
      href: "https://cvent.zoom.us/j/7566652259",
      code: "1456ZS78",
      key: "abcd1234",
    },
    recording: {
      href: "https://cvent.zoom.us/j/7566652259",
      code: "1456ZS78",
    },
  },
  details: "This is free of cost event",
};
```

## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       | Example                                                                           |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `event`                                                                           | [components.Uuid](../../models/components/uuid.md)                                | :heavy_minus_sign:                                                                | The reference to the related entity. Contains only the ID of the related entity.  |                                                                                   |
| `session`                                                                         | [components.Uuid](../../models/components/uuid.md)                                | :heavy_minus_sign:                                                                | The reference to the related entity. Contains only the ID of the related entity.  |                                                                                   |
| `appointment`                                                                     | [components.Uuid](../../models/components/uuid.md)                                | :heavy_minus_sign:                                                                | The reference to the related entity. Contains only the ID of the related entity.  |                                                                                   |
| `exhibitor`                                                                       | [components.Uuid](../../models/components/uuid.md)                                | :heavy_minus_sign:                                                                | The reference to the related entity. Contains only the ID of the related entity.  |                                                                                   |
| `format`                                                                          | [components.Format](../../models/components/format.md)                            | :heavy_minus_sign:                                                                | This is used to denote the format of a webcast                                    | Pre-recorded                                                                      |
| `type`                                                                            | [components.WebcastType](../../models/components/webcasttype.md)                  | :heavy_minus_sign:                                                                | This is used to denote the type of a webcast                                      | Meeting                                                                           |
| `provider`                                                                        | [components.WebcastProvider](../../models/components/webcastprovider.md)          | :heavy_minus_sign:                                                                | Name of the webcast provider.                                                     | Zoom                                                                              |
| `status`                                                                          | [components.WebcastStatus](../../models/components/webcaststatus.md)              | :heavy_minus_sign:                                                                | This is used to denote the status of a webcast                                    | Started                                                                           |
| `playerType`                                                                      | [components.PlayerType](../../models/components/playertype.md)                    | :heavy_minus_sign:                                                                | This is used to denote the type of a video player                                 | Cvent Video Player                                                                |
| `simulatedLive`                                                                   | *boolean*                                                                         | :heavy_minus_sign:                                                                | Indicates if the webcast is simulated live or not                                 | false                                                                             |
| `recordLiveStream`                                                                | *boolean*                                                                         | :heavy_minus_sign:                                                                | Indicates if the live stream recording is enabled                                 | false                                                                             |
| `autoAddToLibrary`                                                                | *boolean*                                                                         | :heavy_minus_sign:                                                                | Indicates if the live stream recording will be added to the library automatically | false                                                                             |
| `onDemandVideo`                                                                   | *boolean*                                                                         | :heavy_minus_sign:                                                                | Indicates if the on demand video is available                                     | false                                                                             |
| `sourceId`                                                                        | *string*                                                                          | :heavy_minus_sign:                                                                | Source Id of the webcast provider                                                 | kBBBAAcccdddd8U==                                                                 |
| `title`                                                                           | *string*                                                                          | :heavy_minus_sign:                                                                | Title of the webcast                                                              | Webinar Connect Event                                                             |
| `meetingId`                                                                       | *string*                                                                          | :heavy_minus_sign:                                                                | Id of meeting within a webcast.                                                   | 123ERt                                                                            |
| `links`                                                                           | [components.WebcastLinks](../../models/components/webcastlinks.md)                | :heavy_minus_sign:                                                                | webcast link references                                                           |                                                                                   |
| `details`                                                                         | *string*                                                                          | :heavy_minus_sign:                                                                | Additional information related to the webcast                                     | This is free of cost event                                                        |