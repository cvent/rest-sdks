# EventCustomCardOpened

This is used to denote the attendee activity fetched when a custom card is opened by an attendee.

## Example Usage

```typescript
import { EventCustomCardOpened } from "@cvent/sdk/models/components";

let value: EventCustomCardOpened = {
  name: "Join our mailing list.",
  url: "https://cvent.com",
  type: "Video",
  multipleLinks: false,
};
```

## Fields

| Field                                                                                                              | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        | Example                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `name`                                                                                                             | *string*                                                                                                           | :heavy_minus_sign:                                                                                                 | The name of the custom card.                                                                                       | Join our mailing list.                                                                                             |
| `url`                                                                                                              | *string*                                                                                                           | :heavy_minus_sign:                                                                                                 | The URL associated with the custom card.                                                                           | https://cvent.com                                                                                                  |
| `type`                                                                                                             | *string*                                                                                                           | :heavy_minus_sign:                                                                                                 | The type of the custom card. This value can be Link, Video, Appointment etc.                                       | Video                                                                                                              |
| `multipleLinks`                                                                                                    | *boolean*                                                                                                          | :heavy_minus_sign:                                                                                                 | True indicates the custom card contains multiple links. An attendee uses only one link at a time in a custom card. | false                                                                                                              |