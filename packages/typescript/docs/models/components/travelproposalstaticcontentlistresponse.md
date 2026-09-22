# TravelProposalStaticContentListResponse

Paginated response containing a list of proposal static content across multiple proposals

## Example Usage

```typescript
import { TravelProposalStaticContentListResponse } from "@cvent/sdk/models/components";

let value: TravelProposalStaticContentListResponse = {
  data: [
    {
      travelProposal: {
        id: "123e4567-e89b-12d3-a456-426614174000",
      },
      staticContents: [
        {
          fieldName: "Property Code",
          sequence: 1,
          value: "Hotel Property Code One",
        },
        {
          fieldName: "Internal Hotel Reference Code",
          sequence: 2,
          value: "Internal Reference One",
        },
      ],
    },
    {
      travelProposal: {
        id: "223e4567-e89b-12d3-a456-426614174001",
      },
      staticContents: [
        {
          fieldName: "Property Code",
          sequence: 1,
          value: "Hotel Property Code Two",
        },
        {
          fieldName: "Internal Hotel Reference Code",
          sequence: 2,
          value: "Internal Reference Two",
        },
      ],
    },
  ],
  paging: {
    previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
    nextToken: "2b3c4d5e6f7g8h9i10j11k12l",
    currentToken: "0a1b2c3d4e5f6g7h8i9j10k11l",
    limit: 100,
    totalCount: 2,
    links: {
      next: {
        href: "?token=2b3c4d5e6f7g8h9i10j11k12l",
      },
      self: {
        href: "?token=0a1b2c3d4e5f6g7h8i9j10k11l",
      },
      prev: {
        href: "?token=1a2b3c4d5e6f7g8h9i10j11k",
      },
    },
  },
};
```

## Fields

| Field                                                                                                              | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `data`                                                                                                             | [components.TravelProposalStaticContentResponse](../../models/components/travelproposalstaticcontentresponse.md)[] | :heavy_check_mark:                                                                                                 | Array of proposal static content responses                                                                         |
| `paging`                                                                                                           | [components.Paging](../../models/components/paging.md)                                                             | :heavy_check_mark:                                                                                                 | Represents pagination information for a collection of resources.                                                   |