# PlannerJson

Represents a planner for an appointment event and the planner's related details.

## Example Usage

```typescript
import { PlannerJson } from "@cvent/sdk/models/components";

let value: PlannerJson = {
  firstName: "Henry",
  lastName: "Potterfield",
  email: "h.potterfield@test.com",
  company: "Cvent Inc.",
  title: "Event Planner",
  prefix: "Mr.",
};
```

## Fields

| Field                                                   | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `firstName`                                             | *string*                                                | :heavy_minus_sign:                                      | The first name of the planner.                          | Henry                                                   |
| `lastName`                                              | *string*                                                | :heavy_minus_sign:                                      | The last name of the planner.                           | Potterfield                                             |
| `email`                                                 | *string*                                                | :heavy_minus_sign:                                      | The email address of the planner.                       | h.potterfield@test.com                                  |
| `company`                                               | *string*                                                | :heavy_minus_sign:                                      | The company/organization the planner belongs to.        | Cvent Inc.                                              |
| `title`                                                 | *string*                                                | :heavy_minus_sign:                                      | The job title of the planner.                           | Event Planner                                           |
| `prefix`                                                | *string*                                                | :heavy_minus_sign:                                      | Denotes what is traditionally a title of an individual. | Mr.                                                     |