# PaginatedInternalDocuments

Paginated list of internal documents attached to an RFP.

## Example Usage

```typescript
import { PaginatedInternalDocuments } from "@cvent/sdk/models/components";

let value: PaginatedInternalDocuments = {
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
      id: "f56a51a4-84b0-46c9-a612-716dc95a1c96",
      created: new Date("2021-01-13T14:06:20.080Z"),
      name: "BudgetCostSavings",
      uniqueName: "183f9efaa4c14070985782ee31abbf3c.jpg",
      size: 777835,
      url:
        "https://custom.cvent.com/0B7DEF22676A4434982BDAD2D6EC591F/files/supplier/0713cef78d4e4d818899d4522022d5ad/73ab2e3054fd4321a5e0f846a7adb0d7.jpg",
      mimeType: "image/jpeg",
    },
  ],
};
```

## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `paging`                                                                                     | [components.PagingJson](../../models/components/pagingjson.md)                               | :heavy_minus_sign:                                                                           | Represents pagination information for a collection of resources.                             |
| `data`                                                                                       | [components.RfpInternalDocumentJson0](../../models/components/rfpinternaldocumentjson0.md)[] | :heavy_minus_sign:                                                                           | List of internal documents linked to an RFP.                                                 |