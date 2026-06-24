# EventContactId

A pair of event and contact id.

## Example Usage

```typescript
import { EventContactId } from "@cvent/sdk/models/components";

let value: EventContactId = {
  eventId: "5ed83e8c-7476-4a6a-8553-4dc91889dab5",
  contactId: "5d8913d8-630e-4a79-ba34-9d500b6aaa92",
};
```

## Fields

| Field              | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `eventId`          | *string*           | :heavy_check_mark: | ID of the event.   |
| `contactId`        | *string*           | :heavy_check_mark: | ID of the contact. |