# SessionCategoryInput

This is used to denote the category of a session.

## Example Usage

```typescript
import { SessionCategoryInput } from "@cvent/sdk/models/components";

let value: SessionCategoryInput = {
  name: "Networking",
  description:
    "During networking sessions, come meet fellow workers in your field.",
};
```

## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         | Example                                                             |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `name`                                                              | *string*                                                            | :heavy_check_mark:                                                  | The name of the session category.                                   | Networking                                                          |
| `description`                                                       | *string*                                                            | :heavy_minus_sign:                                                  | A description for the session category.                             | During networking sessions, come meet fellow workers in your field. |