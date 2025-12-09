# EventRegistrationAbandoned

An event registration-abandoned activity.

## Example Usage

```typescript
import { EventRegistrationAbandoned } from "@cvent/sdk/models/components";

let value: EventRegistrationAbandoned = {
  lastSavedRegistrationPageName: "Personal Information",
  lastActivity: new Date("2020-02-03T13:00:00.000Z"),
};
```

## Fields

| Field                                                                                                                                     | Type                                                                                                                                      | Required                                                                                                                                  | Description                                                                                                                               | Example                                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| `lastSavedRegistrationPageName`                                                                                                           | *string*                                                                                                                                  | :heavy_minus_sign:                                                                                                                        | The last page where an invitee left during the registration.                                                                              | Personal Information                                                                                                                      |
| `lastActivity`                                                                                                                            | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                                             | :heavy_minus_sign:                                                                                                                        | ISO 8601 date and time when an invitee left the registration process.                                                                     | 2020-02-03T13:00:00.000Z                                                                                                                  |
| ~~`contact`~~                                                                                                                             | [components.ActivityContact](../../models/components/activitycontact.md)                                                                  | :heavy_minus_sign:                                                                                                                        | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible.<br/><br/>Related contact. |                                                                                                                                           |