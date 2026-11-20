# TransactionReconciliation

A transaction reconciliation record.

## Example Usage

```typescript
import { TransactionReconciliation } from "@cvent/sdk/models/components";

let value: TransactionReconciliation = {
  status: "Reconciled",
  amount: 100.5,
  reconciledBy: "Test User",
  reconciledDate: new Date("2020-02-07T09:37:50Z"),
};
```

## Fields

| Field                                                                                                            | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      | Example                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `budgetItem`                                                                                                     | [components.TransactionReconciliationBudgetItem](../../models/components/transactionreconciliationbudgetitem.md) | :heavy_minus_sign:                                                                                               | Reconciled budget item ID.                                                                                       |                                                                                                                  |
| `status`                                                                                                         | [components.ReconciliationStatus](../../models/components/reconciliationstatus.md)                               | :heavy_minus_sign:                                                                                               | Reconciliation status of the transaction: Reconciled or Not Reconciled.                                          | Reconciled                                                                                                       |
| `amount`                                                                                                         | *number*                                                                                                         | :heavy_minus_sign:                                                                                               | Reconciliation amount.                                                                                           | 100.5                                                                                                            |
| `reconciledBy`                                                                                                   | *string*                                                                                                         | :heavy_minus_sign:                                                                                               | Reconciled by user.                                                                                              | Test User                                                                                                        |
| `reconciledDate`                                                                                                 | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                    | :heavy_minus_sign:                                                                                               | The ISO 8601 zoned date and time for Reconciled date.                                                            | 2020-02-07T09:37:50Z                                                                                             |