# AttendeeWebLinksJson

Web links for an attendee.

## Example Usage

```typescript
import { AttendeeWebLinksJson } from "@cvent/sdk/models/components";

let value: AttendeeWebLinksJson = {
  acceptRegistration: "https://example.com/123ABC?i=abcdefghijklmnopqrstuv",
  declineRegistration: "https://example.com/123ABC?i=abcdefghijklmnopqrstuv",
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `acceptRegistration`                                                   | *string*                                                               | :heavy_minus_sign:                                                     | This shortened URL, when used, allows you to accept the registration.  | https://example.com/123ABC?i=abcdefghijklmnopqrstuv                    |
| `declineRegistration`                                                  | *string*                                                               | :heavy_minus_sign:                                                     | This shortened URL, when used, allows you to decline the registration. | https://example.com/123ABC?i=abcdefghijklmnopqrstuv                    |