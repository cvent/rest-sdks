# ExistingAttendeeLinkInput

An existing attendee link.

## Example Usage

```typescript
import { ExistingAttendeeLinkInput } from "@cvent/sdk/models/components";

let value: ExistingAttendeeLinkInput = {
  webcast: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  event: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  attendee: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  sourceId: "kBBBAAcccdddd8U==",
  join: {
    href: "https://cvent.zoom.us/j/7566652259",
    code: "1456ZS78",
  },
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `webcast`                                                                        | [components.UuidJson](../../models/components/uuidjson.md)                       | :heavy_check_mark:                                                               | The reference to the related entity. Contains only the ID of the related entity. |                                                                                  |
| `event`                                                                          | [components.UuidJson](../../models/components/uuidjson.md)                       | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |                                                                                  |
| `session`                                                                        | [components.UuidJson](../../models/components/uuidjson.md)                       | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |                                                                                  |
| `attendee`                                                                       | [components.UuidJson](../../models/components/uuidjson.md)                       | :heavy_check_mark:                                                               | The reference to the related entity. Contains only the ID of the related entity. |                                                                                  |
| `sourceId`                                                                       | *string*                                                                         | :heavy_minus_sign:                                                               | Source Id of the webcast provider                                                | kBBBAAcccdddd8U==                                                                |
| `join`                                                                           | [components.WebcastLinkJson](../../models/components/webcastlinkjson.md)         | :heavy_minus_sign:                                                               | Link details for a webcast.                                                      |                                                                                  |