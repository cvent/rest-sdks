# ChoiceTranslationJson

This is used to denote that the translation for the choice text of a custom field.

## Example Usage

```typescript
import { ChoiceTranslationJson } from "@cvent/sdk/models/components";

let value: ChoiceTranslationJson = {
  translatedText: "Departamento de Tecnología",
};
```

## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `choiceId`                                                     | *string*                                                       | :heavy_minus_sign:                                             | The ID of the choice that this translation is associated with. |                                                                |
| `translatedText`                                               | *string*                                                       | :heavy_minus_sign:                                             | Translation for the choice text of a custom field.             | Departamento de Tecnología                                     |