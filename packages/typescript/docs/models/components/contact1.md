# Contact1

Contact details of planner.

## Example Usage

```typescript
import { Contact1 } from "@cvent/sdk/models/components";

let value: Contact1 = {
  firstName: "James",
  lastName: "West",
  email: "jwest@example.com",
  address: {
    countryCode: "US",
    city: "Austin",
    regionCode: "US-AL",
  },
  commissionRate: 10.75,
  commissionApplicableTypes: [
    {
      type: "FOOD_AND_BEVERAGE",
      value: "Food and Beverage",
    },
    {
      type: "OTHER",
      value: "Spa services",
    },
  ],
  phone: "555-555-5555",
  organizationName: "Five Star Planners Inc.",
  preferredContactMethods: [
    "CVENT",
  ],
};
```

## Fields

| Field                                                                                                           | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     | Example                                                                                                         |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `firstName`                                                                                                     | *string*                                                                                                        | :heavy_check_mark:                                                                                              | The first name of the planner.                                                                                  | James                                                                                                           |
| `lastName`                                                                                                      | *string*                                                                                                        | :heavy_check_mark:                                                                                              | The last name of the planner.                                                                                   | West                                                                                                            |
| `email`                                                                                                         | *string*                                                                                                        | :heavy_check_mark:                                                                                              | Email address of the planner.                                                                                   | jwest@example.com                                                                                               |
| `address`                                                                                                       | [components.Address1](../../models/components/address1.md)                                                      | :heavy_minus_sign:                                                                                              | Address details.                                                                                                |                                                                                                                 |
| `commissionRate`                                                                                                | *number*                                                                                                        | :heavy_minus_sign:                                                                                              | Rate of commission chargeable by the planner. Precision up to 2 decimal places is accepted.                     | 10.75                                                                                                           |
| `commissionable`                                                                                                | *boolean*                                                                                                       | :heavy_minus_sign:                                                                                              | True indicates commission is to be charged from supplier.                                                       |                                                                                                                 |
| `commissionApplicableTypes`                                                                                     | [components.CommissionApplicable1](../../models/components/commissionapplicable1.md)[]                          | :heavy_minus_sign:                                                                                              | The hotel or venue service categories to which the commission applies.                                          | [<br/>{<br/>"type": "FOOD_AND_BEVERAGE",<br/>"value": "Food and Beverage"<br/>},<br/>{<br/>"type": "OTHER",<br/>"value": "Spa services"<br/>}<br/>] |
| `phone`                                                                                                         | *string*                                                                                                        | :heavy_check_mark:                                                                                              | Phone number of the planner.                                                                                    | 555-555-5555                                                                                                    |
| `organizationName`                                                                                              | *string*                                                                                                        | :heavy_check_mark:                                                                                              | Name of the organization.                                                                                       | Five Star Planners Inc.                                                                                         |
| `thirdPartyPlanner`                                                                                             | *boolean*                                                                                                       | :heavy_minus_sign:                                                                                              | True indicates planner is a third party planner.                                                                |                                                                                                                 |
| `preferredContactMethods`                                                                                       | [components.ContactMethods](../../models/components/contactmethods.md)[]                                        | :heavy_minus_sign:                                                                                              | List of preferred contact methods for the planner.                                                              | [<br/>"CVENT"<br/>]                                                                                             |