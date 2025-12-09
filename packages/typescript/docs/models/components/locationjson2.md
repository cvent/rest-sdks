# LocationJson2

Used to denote a locations name and abbreviation.

## Example Usage

```typescript
import { LocationJson2 } from "@cvent/sdk/models/components";

let value: LocationJson2 = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  code: "ConfA",
  name: "Conference Room A",
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `id`                                                                 | *string*                                                             | :heavy_minus_sign:                                                   | A string that has to be a format matching the industry standard uuid | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                 |
| `code`                                                               | *string*                                                             | :heavy_minus_sign:                                                   | Code / Abbreviation of the location.                                 | ConfA                                                                |
| `name`                                                               | *string*                                                             | :heavy_minus_sign:                                                   | Name of the location.                                                | Conference Room A                                                    |