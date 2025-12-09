# AssignSpeakerProfileImageRequest

## Example Usage

```typescript
import { AssignSpeakerProfileImageRequest } from "@cvent/sdk/models/operations";

let value: AssignSpeakerProfileImageRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  speakerFile: {
    file: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
  },
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            | Example                                                                                |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `id`                                                                                   | *string*                                                                               | :heavy_check_mark:                                                                     | The unique identifier of a speaker.                                                    | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                   |
| `speakerFile`                                                                          | [components.SpeakerFileInput](../../models/components/speakerfileinput.md)             | :heavy_check_mark:                                                                     | The file id provided by the <a href="#operation/uploadFile">file upload</a> endpoint.<br/> |                                                                                        |