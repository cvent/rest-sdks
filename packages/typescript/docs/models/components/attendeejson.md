# AttendeeJson

The reference to the attendee. Contains only the ID of the attendee.

## Example Usage

```typescript
import { AttendeeJson } from "@cvent/sdk/models/components";

let value: AttendeeJson = {
  id: "5b0e8d1f-8fd6-4ebe-977a-602b4a1f9c43",
};
```

## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       | Example                                                                           |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `id`                                                                              | *string*                                                                          | :heavy_check_mark:                                                                | Unique identifier of the primary invitee for the current attendee's registration. | 5b0e8d1f-8fd6-4ebe-977a-602b4a1f9c43                                              |