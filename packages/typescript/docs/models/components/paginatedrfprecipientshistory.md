# PaginatedRfpRecipientsHistory

Paginated response containing logs of all the recipients that were copied on an RFP.

## Example Usage

```typescript
import { PaginatedRfpRecipientsHistory } from "@cvent/sdk/models/components";

let value: PaginatedRfpRecipientsHistory = {
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
      supplier: {
        id: "d024cc04-adf1-443c-854a-97ab9f5a14b2",
      },
      recipientIdentifier: "jwest@example.com",
      active: true,
      addedByNso: false,
      targetType: "PUBLIC_NSO",
      sendDateTime: new Date("2024-08-20T00:00:01Z"),
      message: {
        id: "a1c776ab-51ee-44a7-8720-b3dfc44d689b",
      },
    },
  ],
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `paging`                                                                             | [components.Paging](../../models/components/paging.md)                               | :heavy_check_mark:                                                                   | Represents pagination information for a collection of resources.                     |
| `data`                                                                               | [components.RfpRecipientLogEntry](../../models/components/rfprecipientlogentry.md)[] | :heavy_check_mark:                                                                   | List of RFP recipient logs.                                                          |