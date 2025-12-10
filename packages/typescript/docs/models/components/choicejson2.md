# ChoiceJson2

A schema representing a choice object

## Example Usage

```typescript
import { ChoiceJson2 } from "@cvent/sdk/models/components";

let value: ChoiceJson2 = {
  text: "Choice 1",
  label: "Choice A",
};
```

## Fields

| Field                            | Type                             | Required                         | Description                      | Example                          |
| -------------------------------- | -------------------------------- | -------------------------------- | -------------------------------- | -------------------------------- |
| `id`                             | *string*                         | :heavy_minus_sign:               | Unique identifier for the choice |                                  |
| `text`                           | *string*                         | :heavy_minus_sign:               | Text value of the field          | Choice 1                         |
| `label`                          | *string*                         | :heavy_minus_sign:               | Label of choice                  | Choice A                         |