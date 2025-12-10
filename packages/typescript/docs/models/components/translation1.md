# Translation1

A custom-field translation for a particular language.

## Example Usage

```typescript
import { Translation1 } from "@cvent/sdk/models/components";

let value: Translation1 = {
  translation: {
    nameTranslation: "Departamento",
    helpTextTranslation: "El departamento donde trabaja.",
    choiceTranslations: [
      {
        translatedText: "Departamento de Tecnología",
      },
    ],
  },
  language: "es-ES",
};
```

## Fields

| Field                                                                                                        | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  | Example                                                                                                      |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `translation`                                                                                                | [components.Translation](../../models/components/translation.md)                                             | :heavy_check_mark:                                                                                           | This is used to denote the translation of the custom field, including its name, help text, and choice texts. |                                                                                                              |
| `language`                                                                                                   | [components.LanguageJson](../../models/components/languagejson.md)                                           | :heavy_check_mark:                                                                                           | IETF language code used to specify a target language for the translation.                                    | es-ES                                                                                                        |