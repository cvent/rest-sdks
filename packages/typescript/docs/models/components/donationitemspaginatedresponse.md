# DonationItemsPaginatedResponse

A paginated response of donation items objects.

## Example Usage

```typescript
import { DonationItemsPaginatedResponse } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: DonationItemsPaginatedResponse = {
  paging: {
    previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
    nextToken: "1a2b3c4d5e6f7g8h9i10j11k",
    currentToken: "1a2b3c4d5e6f7g8h9i10j11k",
    limit: 100,
    totalCount: 2,
    links: {
      next: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      self: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      prev: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
    },
  },
  data: [
    {
      registrantInformation: "Registrant Note.",
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      name: "General Donation Item",
      description: "Some description of the donation item.",
      code: "R5NP4NJYB3D",
      minimumAmountAllowedPerInvitee: 1,
      maximumAmountAllowedPerInvitee: 5,
      generalLedger: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d5",
        name: "General Ledger",
        code: "General Ledger Code",
      },
      registrationTypes: [
        "04ca6ae2-0dc3-487b-953e-86d6abbdf7d4",
      ],
      openForRegistration: false,
      automaticallyClosesOn: new RFCDate("2022-08-12"),
    },
  ],
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `paging`                                                                       | [components.PagingJson](../../models/components/pagingjson.md)                 | :heavy_check_mark:                                                             | Represents pagination information for a collection of resources.               |
| `data`                                                                         | [components.DonationItemJson1](../../models/components/donationitemjson1.md)[] | :heavy_check_mark:                                                             | Collection of donation items.                                                  |