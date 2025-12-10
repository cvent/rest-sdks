# BasicAuthenticationOutput

HTTP Basic Authentication via Authorization header.

## Example Usage

```typescript
import { BasicAuthenticationOutput } from "@cvent/sdk/models/components";

let value: BasicAuthenticationOutput = {
  type: "apiKey",
};
```

## Fields

| Field                                                                                                                                                                                                  | Type                                                                                                                                                                                                   | Required                                                                                                                                                                                               | Description                                                                                                                                                                                            | Example                                                                                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `type`                                                                                                                                                                                                 | [components.AuthorizationHeaderType2](../../models/components/authorizationheadertype2.md)                                                                                                             | :heavy_check_mark:                                                                                                                                                                                     | Authorization header support characterizing the authentication type to be used for callbacks to the client system. API Key, or HTTP Basic Authentication, each configured with a corresponding option. | apiKey                                                                                                                                                                                                 |