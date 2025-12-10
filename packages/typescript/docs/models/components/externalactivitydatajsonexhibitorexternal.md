# ExternalActivityDataJsonExhibitorExternal

Additional fields for external activities.

## Example Usage

```typescript
import { ExternalActivityDataJsonExhibitorExternal } from "@cvent/sdk/models/components";

let value: ExternalActivityDataJsonExhibitorExternal = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  externalActivityDate: new Date("2019-08-24T14:15:22Z"),
  additionalFields: {
    "venue": "tokyo",
    "submitted": "true",
  },
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `id`                                                                                          | *string*                                                                                      | :heavy_check_mark:                                                                            | The identifier to the related entity i.e. Event, Session, Appointment or Exhibitor            | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                          |
| `externalActivityDate`                                                                        | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_check_mark:                                                                            | The ISO 8601 zoned date time when the external activity was created.                          | 2019-08-24T14:15:22Z                                                                          |
| `additionalFields`                                                                            | Record<string, *string*>                                                                      | :heavy_minus_sign:                                                                            | Additional fields provided for the external attendee activity                                 | {<br/>"venue": "tokyo",<br/>"submitted": "true"<br/>}                                         |