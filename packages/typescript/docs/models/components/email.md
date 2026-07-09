# Email

Email

## Example Usage

```typescript
import { Email } from "@cvent/sdk/models/components";

let value: Email = {
  value: "support@cvent.com",
  primary: true,
};
```

## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `type`                                                         | [components.EmailType1](../../models/components/emailtype1.md) | :heavy_minus_sign:                                             | The type of the email.                                         | work                                                           |
| `value`                                                        | *string*                                                       | :heavy_check_mark:                                             | The email of the user.                                         | support@cvent.com                                              |
| `primary`                                                      | *boolean*                                                      | :heavy_minus_sign:                                             | True indicates the email is primary.                           | true                                                           |