# UpdateAttendeeLinksRequest

## Example Usage

```typescript
import { UpdateAttendeeLinksRequest } from "@cvent/sdk/models/operations";

let value: UpdateAttendeeLinksRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  requestBody: [],
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    | Example                                                                                        |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `id`                                                                                           | *string*                                                                                       | :heavy_check_mark:                                                                             | The identifier of the webcast.                                                                 | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                           |
| `requestBody`                                                                                  | [components.ExistingAttendeeLinkInput](../../models/components/existingattendeelinkinput.md)[] | :heavy_check_mark:                                                                             | Up to **100 attendee links** can be updated per call.                                          |                                                                                                |