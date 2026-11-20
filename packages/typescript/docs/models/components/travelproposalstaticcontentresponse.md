# TravelProposalStaticContentResponse

The static content of a travel proposal, as a list of field-value pairs in sequence order.

## Example Usage

```typescript
import { TravelProposalStaticContentResponse } from "@cvent/sdk/models/components";

let value: TravelProposalStaticContentResponse = {
  travelProposal: {
    id: "a91187db-d3c2-4035-b696-1d77fb1ab9d8",
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
};
```

## Fields

| Field                                                                                                                                        | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `travelProposal`                                                                                                                             | [components.TravelProposalStaticContentResponseTravelProposal](../../models/components/travelproposalstaticcontentresponsetravelproposal.md) | :heavy_check_mark:                                                                                                                           | The travel proposal that the static content belongs to.                                                                                      |
| `staticContents`                                                                                                                             | [components.StaticContentItem](../../models/components/staticcontentitem.md)[]                                                               | :heavy_check_mark:                                                                                                                           | The static content items of the travel proposal.                                                                                             |