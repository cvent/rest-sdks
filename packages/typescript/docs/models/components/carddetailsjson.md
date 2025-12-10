# CardDetailsJson

Card details associated with an event.

## Example Usage

```typescript
import { CardDetailsJson } from "@cvent/sdk/models/components";

let value: CardDetailsJson = {
  event: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  id: "9463c74e-18c6-401a-a710-ae0f485bf959",
  first6: "435278",
  last4: "4352",
  type: "Virtual",
  status: "Pending",
  issuer: "Financial Institution",
  spendLimit: 1000.87,
  totalTransactionAmount: 99.5,
  availableBalance: 900.37,
  description: "virtual card for annual event",
  company: "Cvent Inc",
  purchaseTemplate: "Annual Template",
  start: new Date("2020-02-07T00:00:00.00Z"),
  end: new Date("2022-02-07T00:00:00.00Z"),
  billingAccountId: "132907",
  fullName: "Steve Smith",
  reportingFields: [
    {
      name: "Department Code",
      value: "12",
    },
  ],
  cardHolderName: "Shivam Verma",
  last7: "4352587",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `event`                                                                                       | [components.CardDetailsJsonEvent](../../models/components/carddetailsjsonevent.md)            | :heavy_minus_sign:                                                                            | The identifier of the Event.                                                                  |                                                                                               |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the Card.                                                                   | 9463c74e-18c6-401a-a710-ae0f485bf959                                                          |
| `first6`                                                                                      | *string*                                                                                      | :heavy_minus_sign:                                                                            | Card's first six digits.                                                                      | 435278                                                                                        |
| `last4`                                                                                       | *string*                                                                                      | :heavy_minus_sign:                                                                            | Card's last four digits.                                                                      | 4352                                                                                          |
| `type`                                                                                        | [components.CardTypeJson1](../../models/components/cardtypejson1.md)                          | :heavy_minus_sign:                                                                            | This is used to denote the card type for a card.                                              | Virtual                                                                                       |
| `status`                                                                                      | [components.CardStatusJson](../../models/components/cardstatusjson.md)                        | :heavy_minus_sign:                                                                            | This is used to denote the card status for a card.                                            | Pending                                                                                       |
| `issuer`                                                                                      | *string*                                                                                      | :heavy_minus_sign:                                                                            | Card issuer name.                                                                             | Financial Institution                                                                         |
| `spendLimit`                                                                                  | *number*                                                                                      | :heavy_minus_sign:                                                                            | Card spending limit.                                                                          | 1000.87                                                                                       |
| `totalTransactionAmount`                                                                      | *number*                                                                                      | :heavy_minus_sign:                                                                            | Total cleared transaction amount.                                                             | 99.5                                                                                          |
| `availableBalance`                                                                            | *number*                                                                                      | :heavy_minus_sign:                                                                            | Card available balance.                                                                       | 900.37                                                                                        |
| `description`                                                                                 | *string*                                                                                      | :heavy_minus_sign:                                                                            | Description of the card.                                                                      | virtual card for annual event                                                                 |
| `company`                                                                                     | *string*                                                                                      | :heavy_minus_sign:                                                                            | The company/organization the contact belongs to.                                              | Cvent Inc                                                                                     |
| `purchaseTemplate`                                                                            | *string*                                                                                      | :heavy_minus_sign:                                                                            | Name of the purchase template.                                                                | Annual Template                                                                               |
| `start`                                                                                       | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date and time for card start date.                                         | 2020-02-07T00:00:00.00Z                                                                       |
| `end`                                                                                         | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date and time for card end date.                                           | 2022-02-07T00:00:00.00Z                                                                       |
| `billingAccountId`                                                                            | *string*                                                                                      | :heavy_minus_sign:                                                                            | The billing account id for the virtual card.                                                  | 132907                                                                                        |
| `fullName`                                                                                    | *string*                                                                                      | :heavy_minus_sign:                                                                            | First and last name of the user who requested the card.                                       | Steve Smith                                                                                   |
| `reportingFields`                                                                             | [components.ReportingFieldJson](../../models/components/reportingfieldjson.md)[]              | :heavy_minus_sign:                                                                            | The list of report fields and their values for a virtual card.                                |                                                                                               |
| `cardHolderName`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | Name as it appears on card.                                                                   | Shivam Verma                                                                                  |
| `last7`                                                                                       | *string*                                                                                      | :heavy_minus_sign:                                                                            | Card's last seven digits.                                                                     | 4352587                                                                                       |