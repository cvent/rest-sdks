# CreateSessionEnrollmentRequest

## Example Usage

```typescript
import { CreateSessionEnrollmentRequest } from "@cvent/sdk/models/operations";

let value: CreateSessionEnrollmentRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  attendeeId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_check_mark:                   | Unique ID of a session.              | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
| `attendeeId`                         | *string*                             | :heavy_check_mark:                   | Unique ID of an attendee.            | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |