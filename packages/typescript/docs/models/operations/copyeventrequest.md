# CopyEventRequest

## Example Usage

```typescript
import { CopyEventRequest } from "@cvent/sdk/models/operations";

let value: CopyEventRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  eventCopy: {
    event: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    registration: {},
    planning: {},
    agenda: {},
    travel: {},
    surveys: {},
    speakers: {},
    exhibitors: {},
  },
};
```

## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `id`                                                         | *string*                                                     | :heavy_check_mark:                                           | Unique ID of an event.                                       | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                         |
| `eventCopy`                                                  | [components.EventCopy](../../models/components/eventcopy.md) | :heavy_check_mark:                                           | Event copy details.                                          |                                                              |