# EventContactIdJson

A pair of event and contact id.

## Example Usage

```typescript
import { EventContactIdJson } from "@cvent/sdk/models/components";

let value: EventContactIdJson = {
  eventId: "e549e33d-88a0-4c92-ab6b-f9fbd0b81d32",
  contactId: "a3d0f6f1-6ed7-4c66-ac4b-738fcaeae4e1",
};
```

## Fields

| Field              | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `eventId`          | *string*           | :heavy_check_mark: | ID of the event.   |
| `contactId`        | *string*           | :heavy_check_mark: | ID of the contact. |