# UpdateInternalInfoAnswersRequest

## Example Usage

```typescript
import { UpdateInternalInfoAnswersRequest } from "@cvent/sdk/models/operations";

let value: UpdateInternalInfoAnswersRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  attendeeInternalInfo: {
    question: {
      id: "adcc4376-4560-4fb3-8594-2fdbb637c07c",
      code: "DIETARY",
    },
    value: [
      "1234",
    ],
  },
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `id`                                                                               | *string*                                                                           | :heavy_check_mark:                                                                 | The unique ID of an attendee.                                                      | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                               |
| `attendeeInternalInfo`                                                             | [components.AttendeeInternalInfo](../../models/components/attendeeinternalinfo.md) | :heavy_check_mark:                                                                 | N/A                                                                                |                                                                                    |