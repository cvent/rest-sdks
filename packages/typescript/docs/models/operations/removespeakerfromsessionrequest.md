# RemoveSpeakerFromSessionRequest

## Example Usage

```typescript
import { RemoveSpeakerFromSessionRequest } from "@cvent/sdk/models/operations";

let value: RemoveSpeakerFromSessionRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  speakerId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_check_mark:                   | Unique Id of a session               | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
| `speakerId`                          | *string*                             | :heavy_check_mark:                   | Unique Id of a speaker               | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |