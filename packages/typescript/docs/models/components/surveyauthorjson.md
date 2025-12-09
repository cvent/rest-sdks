# SurveyAuthorJson

Author of the survey

## Example Usage

```typescript
import { SurveyAuthorJson } from "@cvent/sdk/models/components";

let value: SurveyAuthorJson = {
  firstName: "Vivek",
  lastName: "Singh",
  company: "Cvent",
  title: "Sales Manager",
  email: "dummyemail@cvent.com",
};
```

## Fields

| Field                           | Type                            | Required                        | Description                     | Example                         |
| ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- |
| `firstName`                     | *string*                        | :heavy_minus_sign:              | First Name of Author            | Vivek                           |
| `lastName`                      | *string*                        | :heavy_minus_sign:              | Last Name of Author             | Singh                           |
| `company`                       | *string*                        | :heavy_minus_sign:              | Company Name                    | Cvent                           |
| `title`                         | *string*                        | :heavy_minus_sign:              | Designation                     | Sales Manager                   |
| `email`                         | *string*                        | :heavy_minus_sign:              | The email address of the author | dummyemail@cvent.com            |