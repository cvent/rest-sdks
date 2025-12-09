# GetSessionProgramSpeakerRequest

## Example Usage

```typescript
import { GetSessionProgramSpeakerRequest } from "@cvent/sdk/models/operations";

let value: GetSessionProgramSpeakerRequest = {
  programItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                    | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `programItemId`                          | *string*                                 | :heavy_check_mark:                       | The unique identifier of a program item. | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3     |
| `id`                                     | *string*                                 | :heavy_check_mark:                       | The unique identifier of a speaker.      | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3     |