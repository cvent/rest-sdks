# SpeakerFileDownloaded

A speaker file-downloaded activity.

## Example Usage

```typescript
import { SpeakerFileDownloaded } from "@cvent/sdk/models/components";

let value: SpeakerFileDownloaded = {
  browser: "firefox",
  operatingSystem: "windows",
  name: "Instructions",
  type: "docx",
  speaker: {
    name: "Henry Ford",
  },
};
```

## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      | Example                                                          |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `browser`                                                        | *string*                                                         | :heavy_minus_sign:                                               | The name of the web browser.                                     | firefox                                                          |
| `operatingSystem`                                                | *string*                                                         | :heavy_minus_sign:                                               | The name of the operating system.                                | windows                                                          |
| `name`                                                           | *string*                                                         | :heavy_minus_sign:                                               | The name of the file.                                            | Instructions                                                     |
| `type`                                                           | *string*                                                         | :heavy_minus_sign:                                               | The type of the file.                                            | docx                                                             |
| `speaker`                                                        | [components.SpeakerJson](../../models/components/speakerjson.md) | :heavy_minus_sign:                                               | An activity speaker.                                             |                                                                  |