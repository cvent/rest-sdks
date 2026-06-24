# AdditionalChoiceJson

Contains text of additional choice i.e N/A choice or otherAnswer choice

## Example Usage

```typescript
import { AdditionalChoiceJson } from "@cvent/sdk/models/components";

let value: AdditionalChoiceJson = {
  text: "N/A or Other",
  shortText: "N/A or Other Reporting value",
};
```

## Fields

| Field                                     | Type                                      | Required                                  | Description                               | Example                                   |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| `text`                                    | *string*                                  | :heavy_minus_sign:                        | Text Value of additional choice           | N/A or Other                              |
| `shortText`                               | *string*                                  | :heavy_minus_sign:                        | Reporting value of additional choice text | N/A or Other Reporting value              |