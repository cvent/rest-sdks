# Voucher

Represents a voucher configured for an event. Event-level vouchers are special codes that can be assigned to invitees or attendees, enabling benefits such as free registration, discounted pricing, or other promotional entitlements during the registration process.

## Example Usage

```typescript
import { Voucher } from "@cvent/sdk/models/components";

let value: Voucher = {
  id: "1800c9bd-b5f4-438a-a92c-ea1f59553a5c",
  code: "VIP-100",
  description: "VIP full-comp voucher for keynote attendees.",
  alertEmailAddress: "planner@example.com",
  capacity: {
    total: 100,
    redeemedCount: 42,
  },
  lastModifiedBy: "planner@example.com",
  lastModifiedDate: new Date("2026-04-08T02:05:12.000Z"),
};
```

## Fields

| Field                                                                                                                   | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             | Example                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *string*                                                                                                                | :heavy_check_mark:                                                                                                      | Voucher ID.                                                                                                             | 1800c9bd-b5f4-438a-a92c-ea1f59553a5c                                                                                    |
| `code`                                                                                                                  | *string*                                                                                                                | :heavy_check_mark:                                                                                                      | The unique planner-defined code that invitees enter during registration to redeem the voucher.                          | VIP-100                                                                                                                 |
| `description`                                                                                                           | *string*                                                                                                                | :heavy_minus_sign:                                                                                                      | A description of the voucher and its intended use.                                                                      | VIP full-comp voucher for keynote attendees.                                                                            |
| `alertEmailAddress`                                                                                                     | *string*                                                                                                                | :heavy_minus_sign:                                                                                                      | The email address that receives a notification whenever the voucher is redeemed.                                        | planner@example.com                                                                                                     |
| `capacity`                                                                                                              | [components.VoucherCapacity](../../models/components/vouchercapacity.md)                                                | :heavy_minus_sign:                                                                                                      | Represents the capacity details for a voucher, including the total allowed redemptions and the number already redeemed. |                                                                                                                         |
| `lastModifiedBy`                                                                                                        | *string*                                                                                                                | :heavy_minus_sign:                                                                                                      | The identity of the user or system that last modified the voucher.                                                      | planner@example.com                                                                                                     |
| `lastModifiedDate`                                                                                                      | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                           | :heavy_minus_sign:                                                                                                      | The ISO 8601 formatted date and time when the voucher was last modified, expressed in UTC.                              | 2026-04-08T02:05:12.000Z                                                                                                |