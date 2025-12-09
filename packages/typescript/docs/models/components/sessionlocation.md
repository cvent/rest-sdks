# SessionLocation

Used to denote a sessions location.

## Example Usage

```typescript
import { SessionLocation } from "@cvent/sdk/models/components";

let value: SessionLocation = {
  id: "38db6ae2-0dc3-487b-953e-86d6abbdf7d3",
  code: "ConfA",
  name: "Conference Room A",
};
```

## Fields

| Field                                          | Type                                           | Required                                       | Description                                    | Example                                        |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `id`                                           | *string*                                       | :heavy_minus_sign:                             | A string that represents a specified location. | 38db6ae2-0dc3-487b-953e-86d6abbdf7d3           |
| `code`                                         | *string*                                       | :heavy_check_mark:                             | Code / Abbreviation of the location.           | ConfA                                          |
| `name`                                         | *string*                                       | :heavy_check_mark:                             | Name of the location.                          | Conference Room A                              |