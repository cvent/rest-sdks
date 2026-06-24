# SurveyContactId

A pair of survey and contact id.

## Example Usage

```typescript
import { SurveyContactId } from "@cvent/sdk/models/components";

let value: SurveyContactId = {
  surveyId: "4e0726b6-77b8-443e-a7c8-a06d889b0ed1",
  contactId: "5a6d071e-14b5-4b10-8494-67701dd388c7",
};
```

## Fields

| Field              | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `surveyId`         | *string*           | :heavy_check_mark: | ID of the survey   |
| `contactId`        | *string*           | :heavy_check_mark: | ID of the contact  |