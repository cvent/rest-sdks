# DeleteRfpQuestionRequest

## Example Usage

```typescript
import { DeleteRfpQuestionRequest } from "@cvent/sdk/models/operations";

let value: DeleteRfpQuestionRequest = {
  rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  questionId: "a4ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                              | Type                                               | Required                                           | Description                                        | Example                                            |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `rfpId`                                            | *string*                                           | :heavy_check_mark:                                 | The unique identifier of the RFP we are requesting | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3               |
| `questionId`                                       | *string*                                           | :heavy_check_mark:                                 | The unique identifier of the Question.             | a4ca6ae2-0dc3-487b-953e-86d6abbdf7d3               |