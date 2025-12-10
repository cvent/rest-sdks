# CardTokenRequest

Generate a card token for a credit card.

## Example Usage

```typescript
import { CardTokenRequest } from "@cvent/sdk/models/components";

let value: CardTokenRequest = {
  creditCard: {
    accountHolderName: "John Doe",
    expMonth: 11,
    expYear: 2026,
    cvv: "123",
    addressLine1: "123 Main Street",
    addressLine2: "First Floor",
    addressLine3: "Apt 101",
    addressCity: "McLean",
    addressStateProvince: "VA",
    addressPostalCode: "12345",
    addressCountry: "USA",
    addressCountryAlpha2: "US",
    contactPhone: "910-999-9999",
    email: "jdoe@example.com",
    number: "4111111111111111",
  },
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `creditCard`                                                                         | [components.CreditCardRequestJson](../../models/components/creditcardrequestjson.md) | :heavy_check_mark:                                                                   | Credit Card Request Object                                                           |