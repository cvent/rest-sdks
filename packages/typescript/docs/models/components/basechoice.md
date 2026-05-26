# BaseChoice

A JSON schema representing a base choice object

## Example Usage

```typescript
import { BaseChoice } from "@cvent/sdk/models/components";

let value: BaseChoice = {
  text: "Choice 1",
};
```

## Fields

| Field                            | Type                             | Required                         | Description                      | Example                          |
| -------------------------------- | -------------------------------- | -------------------------------- | -------------------------------- | -------------------------------- |
| `id`                             | *string*                         | :heavy_minus_sign:               | Unique identifier for the choice |                                  |
| `text`                           | *string*                         | :heavy_minus_sign:               | Text value of the field          | Choice 1                         |