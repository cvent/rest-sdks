# AttendeeAddJsonAdmissionItem

The ID of the attendee's admission item. Required when registering or cancelling an attendee.

## Example Usage

```typescript
import { AttendeeAddJsonAdmissionItem } from "@cvent/sdk/models/components";

let value: AttendeeAddJsonAdmissionItem = {
  id: "7949c335-b5b2-46cf-8f5d-f6b21795df51",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_minus_sign:                   | The admission item ID.               | 7949c335-b5b2-46cf-8f5d-f6b21795df51 |