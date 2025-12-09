# ExistingSpeakerCategory

An existing speaker category.

## Example Usage

```typescript
import { ExistingSpeakerCategory } from "@cvent/sdk/models/components";

let value: ExistingSpeakerCategory = {
  name: "Presenters",
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `name`                                                               | *string*                                                             | :heavy_minus_sign:                                                   | The name of the speaker category                                     | Presenters                                                           |
| `id`                                                                 | *string*                                                             | :heavy_check_mark:                                                   | A string that has to be a format matching the industry standard uuid | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                 |
| `active`                                                             | *boolean*                                                            | :heavy_minus_sign:                                                   | The speaker category is active or not active                         |                                                                      |