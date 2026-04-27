# AdditionalChoiceJson2

Contains text of additional choice i.e notApplicableAnswer choice or otherAnswer choice.

## Example Usage

```typescript
import { AdditionalChoiceJson2 } from "@cvent/sdk/models/components";

let value: AdditionalChoiceJson2 = {
  text: "Dietary Restriction - Other",
  shortText: "Dietary Preference - Other Allergies",
};
```

## Fields

| Field                                        | Type                                         | Required                                     | Description                                  | Example                                      |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| `text`                                       | *string*                                     | :heavy_minus_sign:                           | Display text of additional choice.           | Dietary Restriction - Other                  |
| `shortText`                                  | *string*                                     | :heavy_minus_sign:                           | Name of additional choice text in reporting. | Dietary Preference - Other Allergies         |