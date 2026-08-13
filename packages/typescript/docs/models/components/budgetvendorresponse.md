# BudgetVendorResponse

Represents an account-level budget vendor configured in Admin > Budget > Vendors.

## Example Usage

```typescript
import { BudgetVendorResponse } from "@cvent/sdk/models/components";

let value: BudgetVendorResponse = {
  id: "9463c74e-18c6-401a-a710-ae0f485bf959",
  name: "Global Event Supplies Pvt Ltd",
  code: "GES-IND-01",
  active: true,
  description: "Preferred logistics and on-ground support vendor.",
  url: "https://www.example.com",
  contactInformation: {
    firstName: "Rahul",
    lastName: "Sharma",
    title: "Operations Manager",
    phone: "+91-9876543210",
    fax: "+91-11-23456789",
    emailAddress: "rahul.sharma@example.com",
    additionalInformation:
      "Available only during business hours (9 AM – 6 PM IST).",
  },
  addressInformation: {
    address1: "Cvent Inc.",
    address2: "4001 West Parmer Lane",
    address3: "PO Box 123",
    city: "Austin",
    countryCode: "US",
    postalCode: "78727",
  },
  created: new Date("2024-01-01T12:00:00Z"),
  createdBy: "john.doe@cvent.com",
  lastModified: new Date("2024-01-01T12:00:00Z"),
  lastModifiedBy: "jane.smith@cvent.com",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `id`                                                                                          | *string*                                                                                      | :heavy_check_mark:                                                                            | The unique identifier for the budget vendor.                                                  | 9463c74e-18c6-401a-a710-ae0f485bf959                                                          |
| `name`                                                                                        | *string*                                                                                      | :heavy_check_mark:                                                                            | The display name of the budget vendor.                                                        | Global Event Supplies Pvt Ltd                                                                 |
| `code`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | Internal vendor code for tracking and reference.                                              | GES-IND-01                                                                                    |
| `active`                                                                                      | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates the vendor is active and available for budget item assignments.                | true                                                                                          |
| `description`                                                                                 | *string*                                                                                      | :heavy_minus_sign:                                                                            | Additional information or notes about the vendor.                                             | Preferred logistics and on-ground support vendor.                                             |
| `url`                                                                                         | *string*                                                                                      | :heavy_minus_sign:                                                                            | Official website URL for the vendor organization.                                             | https://www.example.com                                                                       |
| `contactInformation`                                                                          | [components.ContactInformation](../../models/components/contactinformation.md)                | :heavy_minus_sign:                                                                            | Primary contact details associated with the entity.                                           |                                                                                               |
| `addressInformation`                                                                          | [components.BaseAddress](../../models/components/baseaddress.md)                              | :heavy_minus_sign:                                                                            | Base Address Model                                                                            |                                                                                               |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | Date and time when the vendor was created, in ISO 8601 UTC (Zulu) format.                     | 2024-01-01T12:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | User who created the vendor record.                                                           | john.doe@cvent.com                                                                            |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | Date and time when the vendor was last modified, in ISO 8601 UTC (Zulu) format.               | 2024-01-01T12:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | User who last modified the vendor record.                                                     | jane.smith@cvent.com                                                                          |