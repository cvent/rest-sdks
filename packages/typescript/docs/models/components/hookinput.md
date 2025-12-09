# HookInput

A hook with a callback URI.

## Example Usage

```typescript
import { HookInput } from "@cvent/sdk/models/components";

let value: HookInput = {
  name: "Attendee Identification",
  callback: "https://myserver.com/send/callback/here",
  security: {
    type: "apiKey",
    secret: "2b3cc2bf083ff11206ce6b2f3ee09591",
    authHeaderKey: "x-api-key",
    apiKeyPrefix: true,
  },
};
```

## Fields

| Field                                                                                                                                                                                  | Type                                                                                                                                                                                   | Required                                                                                                                                                                               | Description                                                                                                                                                                            | Example                                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                                                                                                 | *string*                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                     | Name of the contact hook.                                                                                                                                                              | Attendee Identification                                                                                                                                                                |
| `callback`                                                                                                                                                                             | *string*                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                     | A client hosted callback URI to which callback would be invoked. TLS is mandatory. Callback URL should not contain any confidential information such as API keys or login credentials. | https://myserver.com/send/callback/here                                                                                                                                                |
| `security`                                                                                                                                                                             | *components.HookSecurityJson*                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                     | Describe security for a web hook callback. Each option corresponds to an Authorization header variant.                                                                                 |                                                                                                                                                                                        |