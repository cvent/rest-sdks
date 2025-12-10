# CategoryIdNameJson

A defined speaker category.

## Example Usage

```typescript
import { CategoryIdNameJson } from "@cvent/sdk/models/components";

let value: CategoryIdNameJson = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  name: "Presenters",
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `id`                                                                 | *string*                                                             | :heavy_check_mark:                                                   | A string that has to be a format matching the industry standard uuid | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                 |
| `name`                                                               | *string*                                                             | :heavy_minus_sign:                                                   | The name of the speaker category                                     | Presenters                                                           |