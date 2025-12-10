# LookupJson

Lookup response object

## Example Usage

```typescript
import { LookupJson } from "@cvent/sdk/models/components";

let value: LookupJson = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  code: "MU",
  name: "Meet up",
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `id`                                                                 | *string*                                                             | :heavy_minus_sign:                                                   | A string that has to be a format matching the industry standard uuid | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                 |
| `code`                                                               | *string*                                                             | :heavy_minus_sign:                                                   | Code / Abbreviation of the lookup item.                              | MU                                                                   |
| `name`                                                               | *string*                                                             | :heavy_minus_sign:                                                   | Name of the lookup item.                                             | Meet up                                                              |