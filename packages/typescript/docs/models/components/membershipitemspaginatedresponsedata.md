# MembershipItemsPaginatedResponseData


## Supported Types

### `components.AnniversaryMembershipItemJson`

```typescript
const value: components.AnniversaryMembershipItemJson = {
  registrantInformation: "Registrant Note.",
  id: "976d53c7-e7d6-43b0-9b6e-5422d59c54b1",
  type: "Gold Membership",
  item: "Annual Gold Membership Package",
  contactType: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d4",
  },
  price: 100,
  renewalPrice: 100,
  description:
    "Access to exclusive webinars and networking events for Gold members.",
  code: "R5NP4NJYB3D",
  registrationTypes: [
    "04ca6ae2-0dc3-487b-953e-86d6abbdf7d4",
  ],
  openForRegistration: false,
  automaticClosureDate: new RFCDate("2026-08-12"),
  generalLedger: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d5",
    name: "General Ledger",
    code: "General Ledger Code",
  },
  currency: "EUR",
  renewalType: "Anniversary",
  duration: "OneYear",
  customDuration: {
    days: 120,
  },
};
```

### `components.CalendarMembershipItemJson`

```typescript
const value: components.CalendarMembershipItemJson = {
  registrantInformation: "Registrant Note.",
  id: "976d53c7-e7d6-43b0-9b6e-5422d59c54b1",
  type: "Gold Membership",
  item: "Annual Gold Membership Package",
  contactType: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d4",
  },
  price: 100,
  renewalPrice: 100,
  description:
    "Access to exclusive webinars and networking events for Gold members.",
  code: "R5NP4NJYB3D",
  registrationTypes: [
    "04ca6ae2-0dc3-487b-953e-86d6abbdf7d4",
  ],
  openForRegistration: false,
  automaticClosureDate: new RFCDate("2026-08-12"),
  generalLedger: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d5",
    name: "General Ledger",
    code: "General Ledger Code",
  },
  currency: "EUR",
  renewalType: "Calendar",
  proRated: false,
};
```

