# EventAdViewed

Viewed an Event Ad.

## Example Usage

```typescript
import { EventAdViewed } from "@cvent/sdk/models/components";

let value: EventAdViewed = {
  platform: "UserPlatform",
  ad: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "New Year Sale",
    product: "ATTENDEE_HUB",
    location: "Home Page",
    attribution: {
      type: "CUSTOM",
    },
  },
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    | Example                                                                        |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `event`                                                                        | [components.ActivityDataEvent7](../../models/components/activitydataevent7.md) | :heavy_minus_sign:                                                             | The event in which this activity occurred.                                     |                                                                                |
| `platform`                                                                     | *string*                                                                       | :heavy_minus_sign:                                                             | The platform used by the user.                                                 | UserPlatform                                                                   |
| `ad`                                                                           | [components.ActivityAd](../../models/components/activityad.md)                 | :heavy_minus_sign:                                                             | The details of the advertisement.                                              |                                                                                |