# CreateCustomFieldTranslationRequest

## Example Usage

```typescript
import { CreateCustomFieldTranslationRequest } from "@cvent/sdk/models/operations";

let value: CreateCustomFieldTranslationRequest = {
  customFieldId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  translation1: {
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
  },
};
```

## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        | Example                                                            |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `customFieldId`                                                    | *string*                                                           | :heavy_check_mark:                                                 | The unique identifier of a custom field.                           | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                               |
| `translation1`                                                     | [components.Translation1](../../models/components/translation1.md) | :heavy_check_mark:                                                 | Translation details to be created for the custom field.            |                                                                    |