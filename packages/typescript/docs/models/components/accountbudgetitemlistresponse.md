# AccountBudgetItemListResponse

The response from a request to retrieve list of budget items across all events linked to the account.

## Example Usage

```typescript
import { AccountBudgetItemListResponse } from "@cvent/sdk/models/components";

let value: AccountBudgetItemListResponse = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  event: {
    id: "6c1d1dd2-e805-4c52-949b-d1b8b0703138",
  },
  rfp: {
    id: "a7f3d29e-1b4c-4e8a-9c2d-6f0e7b3a1d5c",
  },
  budgetVersion: {
    id: "b2e8f1a4-7c3d-4b9e-8f6a-2d1c5e0b7a9f",
    default: true,
  },
  id: "f4913a55-434f-4e9c-8cac-b7a484ab3c2c",
  name: "Airport Transportation",
  code: "AIRTRP",
  category: {
    id: 3,
    name: "Travel",
  },
  subCategory: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "utilities",
  },
  deleted: false,
};
```

## Fields

| Field                                                                                                      | Type                                                                                                       | Required                                                                                                   | Description                                                                                                | Example                                                                                                    |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `created`                                                                                                  | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)              | :heavy_minus_sign:                                                                                         | The ISO 8601 zoned date time when this record was created.                                                 | 2017-01-02T02:00:00Z                                                                                       |
| `createdBy`                                                                                                | *string*                                                                                                   | :heavy_minus_sign:                                                                                         | The identifier of the user that created this record.                                                       | hporter                                                                                                    |
| `lastModified`                                                                                             | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)              | :heavy_minus_sign:                                                                                         | The ISO 8601 zoned date time when this record was updated.                                                 | 2019-02-12T03:00:00Z                                                                                       |
| `lastModifiedBy`                                                                                           | *string*                                                                                                   | :heavy_minus_sign:                                                                                         | The identifier of the user that last updated this record.                                                  | hporter                                                                                                    |
| `event`                                                                                                    | [components.Event1](../../models/components/event1.md)                                                     | :heavy_minus_sign:                                                                                         | Contains the ID of the event associated with the budget item.                                              |                                                                                                            |
| `rfp`                                                                                                      | [components.Rfp1](../../models/components/rfp1.md)                                                         | :heavy_minus_sign:                                                                                         | Represents the RFP associated with a budget item.                                                          |                                                                                                            |
| `budgetVersion`                                                                                            | [components.AccountBudgetVersion](../../models/components/accountbudgetversion.md)                         | :heavy_minus_sign:                                                                                         | Budget version of a budget item in the account-wide list, including whether it's a default budget version. |                                                                                                            |
| `id`                                                                                                       | *string*                                                                                                   | :heavy_minus_sign:                                                                                         | Budget item ID.                                                                                            | f4913a55-434f-4e9c-8cac-b7a484ab3c2c                                                                       |
| `name`                                                                                                     | *string*                                                                                                   | :heavy_minus_sign:                                                                                         | Name of the budget item.                                                                                   | Airport Transportation                                                                                     |
| `code`                                                                                                     | *string*                                                                                                   | :heavy_minus_sign:                                                                                         | User defined code of the budget item.                                                                      | AIRTRP                                                                                                     |
| `category`                                                                                                 | [components.BudgetCategory](../../models/components/budgetcategory.md)                                     | :heavy_minus_sign:                                                                                         | Denotes the category assigned to the budget item.                                                          |                                                                                                            |
| `subCategory`                                                                                              | [components.BudgetSubCategory](../../models/components/budgetsubcategory.md)                               | :heavy_minus_sign:                                                                                         | Subcategory assigned to a budget item.                                                                     |                                                                                                            |
| `deleted`                                                                                                  | *boolean*                                                                                                  | :heavy_minus_sign:                                                                                         | True indicates the event budget item is deleted.                                                           | false                                                                                                      |