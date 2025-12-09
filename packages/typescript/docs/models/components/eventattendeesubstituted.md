# EventAttendeeSubstituted

An attendee-substituted activity.

## Example Usage

```typescript
import { EventAttendeeSubstituted } from "@cvent/sdk/models/components";

let value: EventAttendeeSubstituted = {
  oldContact: {
    firstName: "Henry",
    lastName: "Potterfield",
    email: "h.potterfield@test.com",
  },
  newContact: {
    firstName: "Henry",
    lastName: "Potterfield",
    email: "h.potterfield@test.com",
  },
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `event`                                                                                | [components.ActivityDataJsonEvent1](../../models/components/activitydatajsonevent1.md) | :heavy_minus_sign:                                                                     | The event in which this activity occurred.                                             |
| `oldContact`                                                                           | [components.ContactCommonJson](../../models/components/contactcommonjson.md)           | :heavy_minus_sign:                                                                     | Details of a contact.                                                                  |
| `newContact`                                                                           | [components.ContactCommonJson](../../models/components/contactcommonjson.md)           | :heavy_minus_sign:                                                                     | Details of a contact.                                                                  |