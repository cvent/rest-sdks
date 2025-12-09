# CreateAttendeeLinksRequest

## Example Usage

```typescript
import { CreateAttendeeLinksRequest } from "@cvent/sdk/models/operations";

let value: CreateAttendeeLinksRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  requestBody: [],
};
```

## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `id`                                                           | *string*                                                       | :heavy_check_mark:                                             | The identifier of the webcast.                                 | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                           |
| `requestBody`                                                  | [components.ZeroInput](../../models/components/zeroinput.md)[] | :heavy_check_mark:                                             | Up to **100 attendee links** can be created per call.          |                                                                |