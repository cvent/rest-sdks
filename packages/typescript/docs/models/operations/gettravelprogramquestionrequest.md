# GetTravelProgramQuestionRequest

## Example Usage

```typescript
import { GetTravelProgramQuestionRequest } from "@cvent/sdk/models/operations";

let value: GetTravelProgramQuestionRequest = {
  programId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  questionId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                         | Type                                          | Required                                      | Description                                   | Example                                       |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `programId`                                   | *string*                                      | :heavy_check_mark:                            | A uuid used to uniquely identify the program. | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3          |
| `questionId`                                  | *string*                                      | :heavy_check_mark:                            | Unique ID for a question                      | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3          |