# ExternalActivity

An external attendee activity.

## Example Usage

```typescript
import { ExternalActivity } from "@cvent/sdk/models/components";

let value: ExternalActivity = {
  id: "9463c74e-18c6-401a-a710-ae0f485bf059",
  attendee: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  event: {
    id: "d84855b0-eeda-41c4-8e7a-53e80364cb95",
    title: "Cvent Connect 2020",
    code: "XRNGB4YY3CX",
    timezone: "America/New_York",
  },
  time: new Date("2019-08-24T14:15:22Z"),
  created: new Date("2019-08-24T14:15:22Z"),
  name: "Registered for Event",
  type: "event.external",
  data: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    externalActivityDate: new Date("2019-08-24T14:15:22Z"),
    additionalFields: {
      "venue": "tokyo",
      "submitted": "true",
    },
  },
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the attendee activity.                                                      | 9463c74e-18c6-401a-a710-ae0f485bf059                                                          |
| `attendee`                                                                                    | [components.UuidJson](../../models/components/uuidjson.md)                                    | :heavy_check_mark:                                                                            | The reference to the related entity. Contains only the ID of the related entity.              |                                                                                               |
| `event`                                                                                       | [components.EventActivityDetailsJson](../../models/components/eventactivitydetailsjson.md)    | :heavy_check_mark:                                                                            | Details for an event activity.                                                                |                                                                                               |
| `time`                                                                                        | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | ISO 8601 date and time when this attendee activity occurred.                                  | 2019-08-24T14:15:22Z                                                                          |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | ISO 8601 date and time when this record was created.                                          | 2019-08-24T14:15:22Z                                                                          |
| `name`                                                                                        | *string*                                                                                      | :heavy_check_mark:                                                                            | Name for the external attendee activity.                                                      | Registered for Event                                                                          |
| `type`                                                                                        | [components.ExternalActivityTypeJson](../../models/components/externalactivitytypejson.md)    | :heavy_check_mark:                                                                            | This is used to denote the type of the external attendee activity.                            | event.external                                                                                |
| `data`                                                                                        | *components.ExternalActivityDataJson*                                                         | :heavy_check_mark:                                                                            | This is used to denote the type of the external attendee activity.                            |                                                                                               |