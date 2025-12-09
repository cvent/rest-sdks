# ExternalActivityInput

An external attendee activity.

## Example Usage

```typescript
import { ExternalActivityInput } from "@cvent/sdk/models/components";

let value: ExternalActivityInput = {
  attendee: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  event: {
    id: "d84855b0-eeda-41c4-8e7a-53e80364cb95",
  },
  name: "Registered for Event",
  type: "event.external",
  data: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    externalActivityDate: new Date("2019-08-24T14:15:22Z"),
    additionalFields: {
      "venue": "tokyo",
      "submitted": "true",
    },
  },
};
```

## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          | Example                                                                                              |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `attendee`                                                                                           | [components.UuidJson](../../models/components/uuidjson.md)                                           | :heavy_check_mark:                                                                                   | The reference to the related entity. Contains only the ID of the related entity.                     |                                                                                                      |
| `event`                                                                                              | [components.EventActivityDetailsJsonInput](../../models/components/eventactivitydetailsjsoninput.md) | :heavy_check_mark:                                                                                   | Details for an event activity.                                                                       |                                                                                                      |
| `name`                                                                                               | *string*                                                                                             | :heavy_check_mark:                                                                                   | Name for the external attendee activity.                                                             | Registered for Event                                                                                 |
| `type`                                                                                               | [components.ExternalActivityTypeJson](../../models/components/externalactivitytypejson.md)           | :heavy_check_mark:                                                                                   | This is used to denote the type of the external attendee activity.                                   | event.external                                                                                       |
| `data`                                                                                               | *components.ExternalActivityDataJson*                                                                | :heavy_check_mark:                                                                                   | This is used to denote the type of the external attendee activity.                                   |                                                                                                      |