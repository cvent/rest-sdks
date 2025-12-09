# ~~StakeholderJsonContactOptOut~~

Details of an opt-out for a Contact.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

## Example Usage

```typescript
import { StakeholderJsonContactOptOut } from "@cvent/sdk/models/components";

let value: StakeholderJsonContactOptOut = {
  date: new Date("2019-02-12T03:00:00Z"),
  by: "Account User",
};
```

## Fields

| Field                                                                                                                       | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 | Example                                                                                                                     |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `optedOut`                                                                                                                  | *boolean*                                                                                                                   | :heavy_minus_sign:                                                                                                          | Used to denote if a contact has opted-out of receiving system generated emails.                                             | false                                                                                                                       |
| `date`                                                                                                                      | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                               | :heavy_minus_sign:                                                                                                          | The ISO 8601 zoned date time when this contact was opted-out. This value can change if the contact opts out multiple times. | 2019-02-12T03:00:00Z                                                                                                        |
| `by`                                                                                                                        | [components.OptoutByJson](../../models/components/optoutbyjson.md)                                                          | :heavy_minus_sign:                                                                                                          | This is used to denote how a contact is opt'd out of Cvent system.                                                          | Account User                                                                                                                |