# EventJson8

An event reference used in attendee insights to identify the event context for engagement data

## Example Usage

```typescript
import { EventJson8 } from "@cvent/sdk/models/components";

let value: EventJson8 = {
  id: "04cb6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 | Example                                                                     |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `id`                                                                        | *string*                                                                    | :heavy_check_mark:                                                          | A unique identifier (UUID) for the event where the engagement score applies | 04cb6ae2-0dc3-487b-953e-86d6abbdf7d3                                        |