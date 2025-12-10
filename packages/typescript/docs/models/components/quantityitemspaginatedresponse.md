# QuantityItemsPaginatedResponse

A paginated response of quantity items objects.

## Example Usage

```typescript
import { QuantityItemsPaginatedResponse } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: QuantityItemsPaginatedResponse = {
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
      name: "General Quantity Item",
      description: "Some description of the quantity item.",
      code: "R5NP4NJYB3D",
      maximumItemsPerInvitee: 10,
      registrationTypes: [
        "04ca6ae2-0dc3-487b-953e-86d6abbdf7d4",
      ],
      openForRegistration: false,
      automaticallyClosesOn: new RFCDate("2022-08-12"),
      capacity: 150,
      closeEventOnCapacityFull: false,
    },
  ],
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [components.PagingJson](../../models/components/pagingjson.md)       | :heavy_check_mark:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | [components.QuantityItem](../../models/components/quantityitem.md)[] | :heavy_check_mark:                                                   | Collection of quantity items.                                        |