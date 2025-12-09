# ExistingWebcastInput

An existing webcast.

## Example Usage

```typescript
import { ExistingWebcastInput } from "@cvent/sdk/models/components";

let value: ExistingWebcastInput = {
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
| `event`                                                                           | [components.UuidJson](../../models/components/uuidjson.md)                        | :heavy_minus_sign:                                                                | The reference to the related entity. Contains only the ID of the related entity.  |                                                                                   |
| `session`                                                                         | [components.UuidJson](../../models/components/uuidjson.md)                        | :heavy_minus_sign:                                                                | The reference to the related entity. Contains only the ID of the related entity.  |                                                                                   |
| `appointment`                                                                     | [components.UuidJson](../../models/components/uuidjson.md)                        | :heavy_minus_sign:                                                                | The reference to the related entity. Contains only the ID of the related entity.  |                                                                                   |
| `exhibitor`                                                                       | [components.UuidJson](../../models/components/uuidjson.md)                        | :heavy_minus_sign:                                                                | The reference to the related entity. Contains only the ID of the related entity.  |                                                                                   |
| `format`                                                                          | [components.FormatJson](../../models/components/formatjson.md)                    | :heavy_minus_sign:                                                                | This is used to denote the format of a webcast                                    | Pre-recorded                                                                      |
| `type`                                                                            | [components.WebcastTypeJson](../../models/components/webcasttypejson.md)          | :heavy_minus_sign:                                                                | This is used to denote the type of a webcast                                      | Meeting                                                                           |
| `provider`                                                                        | [components.WebcastProviderJson](../../models/components/webcastproviderjson.md)  | :heavy_minus_sign:                                                                | Name of the webcast provider.                                                     | Zoom                                                                              |
| `status`                                                                          | [components.WebcastStatusJson](../../models/components/webcaststatusjson.md)      | :heavy_minus_sign:                                                                | This is used to denote the status of a webcast                                    | Started                                                                           |
| `playerType`                                                                      | [components.PlayerTypeJson](../../models/components/playertypejson.md)            | :heavy_minus_sign:                                                                | This is used to denote the type of a video player                                 | Cvent Video Player                                                                |
| `simulatedLive`                                                                   | *boolean*                                                                         | :heavy_minus_sign:                                                                | Indicates if the webcast is simulated live or not                                 | false                                                                             |
| `recordLiveStream`                                                                | *boolean*                                                                         | :heavy_minus_sign:                                                                | Indicates if the live stream recording is enabled                                 | false                                                                             |
| `autoAddToLibrary`                                                                | *boolean*                                                                         | :heavy_minus_sign:                                                                | Indicates if the live stream recording will be added to the library automatically | false                                                                             |
| `onDemandVideo`                                                                   | *boolean*                                                                         | :heavy_minus_sign:                                                                | Indicates if the on demand video is available                                     | false                                                                             |
| `sourceId`                                                                        | *string*                                                                          | :heavy_minus_sign:                                                                | Source Id of the webcast provider                                                 | kBBBAAcccdddd8U==                                                                 |
| `title`                                                                           | *string*                                                                          | :heavy_minus_sign:                                                                | Title of the webcast                                                              | Webinar Connect Event                                                             |
| `meetingId`                                                                       | *string*                                                                          | :heavy_minus_sign:                                                                | Id of meeting within a webcast.                                                   | 123ERt                                                                            |
| `links`                                                                           | [components.WebcastLinksJson](../../models/components/webcastlinksjson.md)        | :heavy_minus_sign:                                                                | webcast link references                                                           |                                                                                   |
| `details`                                                                         | *string*                                                                          | :heavy_minus_sign:                                                                | Additional information related to the webcast                                     | This is free of cost event                                                        |