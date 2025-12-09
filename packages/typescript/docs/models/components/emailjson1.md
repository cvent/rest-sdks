# EmailJson1

Email

## Example Usage

```typescript
import { EmailJson1 } from "@cvent/sdk/models/components";

let value: EmailJson1 = {
  value: "support@cvent.com",
  primary: true,
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `type`                                                                 | [components.EmailTypeJson1](../../models/components/emailtypejson1.md) | :heavy_minus_sign:                                                     | The type of the email.                                                 | work                                                                   |
| `value`                                                                | *string*                                                               | :heavy_check_mark:                                                     | The email of the user.                                                 | support@cvent.com                                                      |
| `primary`                                                              | *boolean*                                                              | :heavy_minus_sign:                                                     | True indicates the email is primary.                                   | true                                                                   |