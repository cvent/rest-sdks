# EventCheckInRequest

## Example Usage

```typescript
import { EventCheckInRequest } from "@cvent/sdk/models/operations";

let value: EventCheckInRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  requestBody: [],
};
```

## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     | Example                                                                         |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `id`                                                                            | *string*                                                                        | :heavy_check_mark:                                                              | Unique ID of an event.                                                          | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                            |
| `requestBody`                                                                   | [components.CheckinJson](../../models/components/checkinjson.md)[]              | :heavy_check_mark:                                                              | Attendees to be checked-in. Up to **100 attendees** can be checked-in per call. |                                                                                 |