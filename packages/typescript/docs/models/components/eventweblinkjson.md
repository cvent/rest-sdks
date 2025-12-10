# EventWeblinkJson

Metadata for an event weblink.

## Example Usage

```typescript
import { EventWeblinkJson } from "@cvent/sdk/models/components";

let value: EventWeblinkJson = {
  name: "VIP Registration",
  url: "https://cvent.me/XX51b9",
  landingPage: "Registration",
  locale: "en-US",
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    | Example                                                                        |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `name`                                                                         | *string*                                                                       | :heavy_minus_sign:                                                             | Name of the weblink, used by planners to identify the weblinks in their event. | VIP Registration                                                               |
| `url`                                                                          | *string*                                                                       | :heavy_minus_sign:                                                             | Short URL of the webpage.                                                      | https://cvent.me/XX51b9                                                        |
| `landingPage`                                                                  | *string*                                                                       | :heavy_minus_sign:                                                             | The name of the webpage attendees will be directed to when using the weblink.  | Registration                                                                   |
| `locale`                                                                       | *string*                                                                       | :heavy_minus_sign:                                                             | Locale code                                                                    | en-US                                                                          |