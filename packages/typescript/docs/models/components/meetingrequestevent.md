# MeetingRequestEvent

The event the request is associated with.

## Example Usage

```typescript
import { MeetingRequestEvent } from "@cvent/sdk/models/components";

let value: MeetingRequestEvent = {};
```

## Fields

| Field                                                                                                                                                                                           | Type                                                                                                                                                                                            | Required                                                                                                                                                                                        | Description                                                                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                            | *string*                                                                                                                                                                                        | :heavy_minus_sign:                                                                                                                                                                              | Event ID. This field may be absent immediately after creation when the meeting request form is configured to auto-create an event on submission, as event creation is processed asynchronously. |