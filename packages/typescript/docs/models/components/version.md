# Version

The identifier of the Budget version for an event.

## Example Usage

```typescript
import { Version } from "@cvent/sdk/models/components";

let value: Version = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  name: "Budget Version 2",
  default: true,
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `id`                                                                             | *string*                                                                         | :heavy_minus_sign:                                                               | A string that has to be a format matching the industry standard uuid             | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                             |
| `name`                                                                           | *string*                                                                         | :heavy_minus_sign:                                                               | Name of the budget version.                                                      | Budget Version 2                                                                 |
| `default`                                                                        | *boolean*                                                                        | :heavy_minus_sign:                                                               | True indicates the associated budget is the default budget version of the event. | true                                                                             |