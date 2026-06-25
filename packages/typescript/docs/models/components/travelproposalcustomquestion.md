# TravelProposalCustomQuestion

Represents custom question associated with a travel proposal.

## Example Usage

```typescript
import { TravelProposalCustomQuestion } from "@cvent/sdk/models/components";

let value: TravelProposalCustomQuestion = {
  question: {
    id: "565ceabb-786a-4a6d-8c85-e2fccc867e88",
  },
  answer: "No.",
};
```

## Fields

| Field                                                                                                              | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        | Example                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `question`                                                                                                         | [components.TravelProposalCustomQuestionQuestion](../../models/components/travelproposalcustomquestionquestion.md) | :heavy_minus_sign:                                                                                                 | Travel account that the proposal is responding to.                                                                 |                                                                                                                    |
| `answer`                                                                                                           | *string*                                                                                                           | :heavy_minus_sign:                                                                                                 | Hotel's answer to the program's custom question.                                                                   | No.                                                                                                                |