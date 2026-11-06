# SessionCategory

A session category with a name and an optional description.

## Example Usage

```typescript
import { SessionCategory } from "@cvent/sdk/models/components";

let value: SessionCategory = {
  id: "38db6ae2-0dc3-487b-953e-86d6abbdf7d3",
  name: "Networking",
  description:
    "During networking sessions, come meet fellow workers in your field.",
};
```

## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         | Example                                                             |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `id`                                                                | *string*                                                            | :heavy_minus_sign:                                                  | The ID of the session category.                                     | 38db6ae2-0dc3-487b-953e-86d6abbdf7d3                                |
| `name`                                                              | *string*                                                            | :heavy_check_mark:                                                  | The name of the session category.                                   | Networking                                                          |
| `description`                                                       | *string*                                                            | :heavy_minus_sign:                                                  | A description for the session category.                             | During networking sessions, come meet fellow workers in your field. |