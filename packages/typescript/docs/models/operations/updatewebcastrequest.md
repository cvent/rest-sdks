# UpdateWebcastRequest

## Example Usage

```typescript
import { UpdateWebcastRequest } from "@cvent/sdk/models/operations";

let value: UpdateWebcastRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  existingWebcast: {
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
  },
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `id`                                                                               | *string*                                                                           | :heavy_check_mark:                                                                 | The identifier of the webcast.                                                     | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                               |
| `existingWebcast`                                                                  | [components.ExistingWebcastInput](../../models/components/existingwebcastinput.md) | :heavy_check_mark:                                                                 | N/A                                                                                |                                                                                    |