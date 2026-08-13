# ContactInformation

Primary contact details associated with the entity.

## Example Usage

```typescript
import { ContactInformation } from "@cvent/sdk/models/components";

let value: ContactInformation = {
  firstName: "Rahul",
  lastName: "Sharma",
  title: "Operations Manager",
  phone: "+91-9876543210",
  fax: "+91-11-23456789",
  emailAddress: "rahul.sharma@example.com",
  additionalInformation:
    "Available only during business hours (9 AM – 6 PM IST).",
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                | Example                                                                                    |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `firstName`                                                                                | *string*                                                                                   | :heavy_minus_sign:                                                                         | First name of the contact person.                                                          | Rahul                                                                                      |
| `lastName`                                                                                 | *string*                                                                                   | :heavy_minus_sign:                                                                         | Last name of the contact person.                                                           | Sharma                                                                                     |
| `title`                                                                                    | *string*                                                                                   | :heavy_minus_sign:                                                                         | Professional title or designation of the contact person.                                   | Operations Manager                                                                         |
| `phone`                                                                                    | *string*                                                                                   | :heavy_minus_sign:                                                                         | Primary phone number of the contact person, including country and area code if applicable. | +91-9876543210                                                                             |
| `fax`                                                                                      | *string*                                                                                   | :heavy_minus_sign:                                                                         | Fax number of the contact person, if available.                                            | +91-11-23456789                                                                            |
| `emailAddress`                                                                             | *string*                                                                                   | :heavy_minus_sign:                                                                         | Email address of the contact person.                                                       | rahul.sharma@example.com                                                                   |
| `additionalInformation`                                                                    | *string*                                                                                   | :heavy_minus_sign:                                                                         | Any additional contact-related notes or instructions.                                      | Available only during business hours (9 AM – 6 PM IST).                                    |