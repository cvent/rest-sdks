# ZeroAllOf5

A transaction reconciliation record.

## Example Usage

```typescript
import { ZeroAllOf5 } from "@cvent/sdk/models/components";

let value: ZeroAllOf5 = {
  status: "Reconciled",
  amount: 100.5,
  reconciledBy: "Test User",
  reconciledDate: new Date("2020-02-07T09:37:50Z"),
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `budgetItem`                                                                                  | [components.BudgetItemAllOf](../../models/components/budgetitemallof.md)                      | :heavy_minus_sign:                                                                            | The identifier of reconciled budget item.                                                     |                                                                                               |
| `status`                                                                                      | [components.ReconciliationStatusJson](../../models/components/reconciliationstatusjson.md)    | :heavy_minus_sign:                                                                            | This is used to denote the reconciliation status for a transaction.                           | Reconciled                                                                                    |
| `amount`                                                                                      | *number*                                                                                      | :heavy_minus_sign:                                                                            | Reconciliation amount.                                                                        | 100.5                                                                                         |
| `reconciledBy`                                                                                | *string*                                                                                      | :heavy_minus_sign:                                                                            | Reconciled by user.                                                                           | Test User                                                                                     |
| `reconciledDate`                                                                              | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date and time for Reconciled date.                                         | 2020-02-07T09:37:50Z                                                                          |