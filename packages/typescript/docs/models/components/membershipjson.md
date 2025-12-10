# MembershipJson

Contact Membership information

## Example Usage

```typescript
import { MembershipJson } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: MembershipJson = {
  type: "Corporate Sponsor",
  plan: "Gold Level",
  joined: new RFCDate("2017-02-10"),
  expiration: new RFCDate("2020-02-09"),
  lastRenewal: new RFCDate("2019-02-08"),
  amountDue: 50.5,
  listInDirectory: false,
};
```

## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 | Example                                                                     |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `type`                                                                      | *string*                                                                    | :heavy_minus_sign:                                                          | The type of membership the contact has signed up for.                       | Corporate Sponsor                                                           |
| `plan`                                                                      | *string*                                                                    | :heavy_minus_sign:                                                          | Describes the specific plan the contact has signed up for.                  | Gold Level                                                                  |
| `joined`                                                                    | [RFCDate](../../types/rfcdate.md)                                           | :heavy_minus_sign:                                                          | The ISO-8601 formatted date the contact began their membership.             | 2017-02-10                                                                  |
| `expiration`                                                                | [RFCDate](../../types/rfcdate.md)                                           | :heavy_minus_sign:                                                          | The ISO-8601 formatted date the contact's membership will expire.           | 2020-02-09                                                                  |
| `lastRenewal`                                                               | [RFCDate](../../types/rfcdate.md)                                           | :heavy_minus_sign:                                                          | The ISO-8601 formatted date the contact last renewed their membership.      | 2019-02-08                                                                  |
| `amountDue`                                                                 | *number*                                                                    | :heavy_minus_sign:                                                          | The amount currently due for this membership.                               | 50.5                                                                        |
| `listInDirectory`                                                           | *boolean*                                                                   | :heavy_minus_sign:                                                          | Indicates if the member details should be included in the member directory. | false                                                                       |