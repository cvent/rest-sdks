# SurveyContactIdJson

A pair of survey and contact id.

## Example Usage

```typescript
import { SurveyContactIdJson } from "@cvent/sdk/models/components";

let value: SurveyContactIdJson = {
  surveyId: "7f986e32-b18a-4cf4-9ad6-cadd58fd0e18",
  contactId: "a9a5ee5f-656d-4c2f-885f-556852819a5e",
};
```

## Fields

| Field              | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `surveyId`         | *string*           | :heavy_check_mark: | ID of the survey   |
| `contactId`        | *string*           | :heavy_check_mark: | ID of the contact  |