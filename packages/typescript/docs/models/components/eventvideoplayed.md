# EventVideoPlayed

An event video-played activity.

## Example Usage

```typescript
import { EventVideoPlayed } from "@cvent/sdk/models/components";

let value: EventVideoPlayed = {
  browser: "firefox",
  operatingSystem: "windows",
  title: "We are Cvent!",
  pageName: "Agenda",
};
```

## Fields

| Field                             | Type                              | Required                          | Description                       | Example                           |
| --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- |
| `browser`                         | *string*                          | :heavy_minus_sign:                | The name of the web browser.      | firefox                           |
| `operatingSystem`                 | *string*                          | :heavy_minus_sign:                | The name of the operating system. | windows                           |
| `title`                           | *string*                          | :heavy_minus_sign:                | The title of video.               | We are Cvent!                     |
| `pageName`                        | *string*                          | :heavy_minus_sign:                | The name of the page.             | Agenda                            |