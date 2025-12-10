# Translation

This is used to denote the translation of the custom field, including its name, help text, and choice texts.

## Example Usage

```typescript
import { Translation } from "@cvent/sdk/models/components";

let value: Translation = {
  nameTranslation: "Departamento",
  helpTextTranslation: "El departamento donde trabaja.",
  choiceTranslations: [
    {
      translatedText: "Departamento de Tecnología",
    },
  ],
};
```

## Fields

| Field                                                                                                                 | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           | Example                                                                                                               |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `nameTranslation`                                                                                                     | *string*                                                                                                              | :heavy_minus_sign:                                                                                                    | Translation of the custom field's name.                                                                               | Departamento                                                                                                          |
| `helpTextTranslation`                                                                                                 | *string*                                                                                                              | :heavy_minus_sign:                                                                                                    | Translation for the help text of the custom field.                                                                    | El departamento donde trabaja.                                                                                        |
| `choiceTranslations`                                                                                                  | [components.ChoiceTranslationJson](../../models/components/choicetranslationjson.md)[]                                | :heavy_minus_sign:                                                                                                    | Translations for the choice texts of a custom field. This property is only applicable for custom fields with choices. |                                                                                                                       |