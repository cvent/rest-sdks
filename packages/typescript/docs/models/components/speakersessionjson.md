# SpeakerSessionJson

A speaker to session relationship.

## Example Usage

```typescript
import { SpeakerSessionJson } from "@cvent/sdk/models/components";

let value: SpeakerSessionJson = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  category: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "Sample Object name",
  },
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                | Example                                                                    |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `id`                                                                       | *string*                                                                   | :heavy_minus_sign:                                                         | A string that has to be a format matching the industry standard uuid       | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                       |
| `speaker`                                                                  | [components.SpeakerLiteJson1](../../models/components/speakerlitejson1.md) | :heavy_minus_sign:                                                         | The unique identifier of a speaker.                                        |                                                                            |
| `category`                                                                 | [components.IdNameJson](../../models/components/idnamejson.md)             | :heavy_minus_sign:                                                         | A Named object                                                             |                                                                            |