# TransactionJson1

The latest transaction that took place on a given proposal

## Example Usage

```typescript
import { TransactionJson1 } from "@cvent/sdk/models/components";

let value: TransactionJson1 = {
  id: "cf5fd2cc-3d09-11ee-be56-0242ac120002",
  time: new Date("2023-02-12T03:00:00Z"),
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | The unique ID of a specific transaction.                                                      | cf5fd2cc-3d09-11ee-be56-0242ac120002                                                          |
| `type`                                                                                        | [components.TransactionTypeJson](../../models/components/transactiontypejson.md)              | :heavy_minus_sign:                                                                            | The proposal transaction type                                                                 |                                                                                               |
| `time`                                                                                        | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2023-02-12T03:00:00Z                                                                          |