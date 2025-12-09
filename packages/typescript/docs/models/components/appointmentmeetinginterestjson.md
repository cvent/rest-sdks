# AppointmentMeetingInterestJson

An individual meeting interest.

## Example Usage

```typescript
import { AppointmentMeetingInterestJson } from "@cvent/sdk/models/components";

let value: AppointmentMeetingInterestJson = {
  name: "Cvent",
  exhibitor: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  ranking: "5",
  meetingType: "Group Meeting",
  comment: "A 1:1 or group meeting works.",
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `name`                                                                           | *string*                                                                         | :heavy_minus_sign:                                                               | The name of the exhibitor in which interest is expressed.                        | Cvent                                                                            |
| `exhibitor`                                                                      | [components.UuidJson](../../models/components/uuidjson.md)                       | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |                                                                                  |
| `ranking`                                                                        | *string*                                                                         | :heavy_minus_sign:                                                               | The strength of the interest.                                                    | 5                                                                                |
| `meetingType`                                                                    | *string*                                                                         | :heavy_minus_sign:                                                               | The meeting type of interest.                                                    | Group Meeting                                                                    |
| `comment`                                                                        | *string*                                                                         | :heavy_minus_sign:                                                               | A comment about this interest.                                                   | A 1:1 or group meeting works.                                                    |