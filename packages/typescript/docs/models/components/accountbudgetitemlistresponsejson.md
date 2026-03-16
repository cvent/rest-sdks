# AccountBudgetItemListResponseJson

The response from a request to retrieve list of budget items across all events linked to the account.

## Example Usage

```typescript
import { AccountBudgetItemListResponseJson } from "@cvent/sdk/models/components";

let value: AccountBudgetItemListResponseJson = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  event: {
    id: "3d808ee8-94f8-4f3a-9ad1-6b23f4e4c329",
  },
  rfp: {
    id: "3d808ee8-94f8-4f3a-9ad1-6b23f4e4c329",
  },
  budgetVersion: {
    id: "3d808ee8-94f8-4f3a-9ad1-6b23f4e4c329",
  },
  id: "9463c74e-18c6-401a-a710-ae0f485bf959",
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

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `event`                                                                                       | [components.EventJson4](../../models/components/eventjson4.md)                                | :heavy_minus_sign:                                                                            | Event ID Information.                                                                         |                                                                                               |
| `rfp`                                                                                         | [components.RfpIdJson1](../../models/components/rfpidjson1.md)                                | :heavy_minus_sign:                                                                            | RFP ID Information.                                                                           |                                                                                               |
| `budgetVersion`                                                                               | [components.BudgetVersionIdJson](../../models/components/budgetversionidjson.md)              | :heavy_minus_sign:                                                                            | Budget Version ID Information.                                                                |                                                                                               |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the budget item.                                                            | 9463c74e-18c6-401a-a710-ae0f485bf959                                                          |
| `name`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | Name of the budget item.                                                                      | Airport Transportation                                                                        |
| `code`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | User defined code of the budget item.                                                         | AIRTRP                                                                                        |
| `category`                                                                                    | [components.BudgetCategoryJson](../../models/components/budgetcategoryjson.md)                | :heavy_minus_sign:                                                                            | Denotes the category assigned to the budget item.                                             |                                                                                               |
| `subCategory`                                                                                 | [components.BudgetSubCategoryJson](../../models/components/budgetsubcategoryjson.md)          | :heavy_minus_sign:                                                                            | This is used to denote the sub category for a budget.                                         |                                                                                               |
| `deleted`                                                                                     | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates the event budget item is deleted.                                              | false                                                                                         |