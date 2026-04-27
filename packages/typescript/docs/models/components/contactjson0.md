# ContactJson0

Contact details of planner.

## Example Usage

```typescript
import { ContactJson0 } from "@cvent/sdk/models/components";

let value: ContactJson0 = {
  firstName: "James",
  lastName: "West",
  email: "jwest@example.com",
  address: {
    countryCode: "US",
    city: "Austin",
    regionCode: "US-AL",
  },
  commissionRate: 10.75,
  phone: "555-555-5555",
  organizationName: "Five Star Planners Inc.",
  preferredContactMethods: [
    "CVENT",
  ],
};
```

## Fields

| Field                                                                                       | Type                                                                                        | Required                                                                                    | Description                                                                                 | Example                                                                                     |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `firstName`                                                                                 | *string*                                                                                    | :heavy_check_mark:                                                                          | The first name of the planner.                                                              | James                                                                                       |
| `lastName`                                                                                  | *string*                                                                                    | :heavy_check_mark:                                                                          | The last name of the planner.                                                               | West                                                                                        |
| `email`                                                                                     | *string*                                                                                    | :heavy_check_mark:                                                                          | Email address of the planner.                                                               | jwest@example.com                                                                           |
| `address`                                                                                   | [components.AddressJson0](../../models/components/addressjson0.md)                          | :heavy_minus_sign:                                                                          | Address details.                                                                            |                                                                                             |
| `commissionRate`                                                                            | *number*                                                                                    | :heavy_minus_sign:                                                                          | Rate of commission chargeable by the planner. Precision up to 2 decimal places is accepted. | 10.75                                                                                       |
| `commissionable`                                                                            | *boolean*                                                                                   | :heavy_minus_sign:                                                                          | True indicates commission is to be charged from supplier.                                   |                                                                                             |
| `phone`                                                                                     | *string*                                                                                    | :heavy_check_mark:                                                                          | Phone number of the planner.                                                                | 555-555-5555                                                                                |
| `organizationName`                                                                          | *string*                                                                                    | :heavy_check_mark:                                                                          | Name of the organization.                                                                   | Five Star Planners Inc.                                                                     |
| `thirdPartyPlanner`                                                                         | *boolean*                                                                                   | :heavy_minus_sign:                                                                          | True indicates planner is a third party planner.                                            |                                                                                             |
| `preferredContactMethods`                                                                   | [components.ContactMethodsJson](../../models/components/contactmethodsjson.md)[]            | :heavy_minus_sign:                                                                          | List of preferred contact methods for the planner.                                          | [<br/>"CVENT"<br/>]                                                                         |