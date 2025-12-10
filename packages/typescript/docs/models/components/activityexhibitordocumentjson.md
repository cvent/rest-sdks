# ActivityExhibitorDocumentJson

Document for an activity exhibitor.

## Example Usage

```typescript
import { ActivityExhibitorDocumentJson } from "@cvent/sdk/models/components";

let value: ActivityExhibitorDocumentJson = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  title: "FAQs",
  format: "pdf",
  downloaded: true,
};
```

## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `id`                                                          | *string*                                                      | :heavy_minus_sign:                                            | The unique identifier of the document.                        | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                          |
| `title`                                                       | *string*                                                      | :heavy_minus_sign:                                            | The title of the document.                                    | FAQs                                                          |
| `format`                                                      | *string*                                                      | :heavy_minus_sign:                                            | The format of the document eg. doc, docx, gif, jpg, pdf, etc. | pdf                                                           |
| `downloaded`                                                  | *boolean*                                                     | :heavy_minus_sign:                                            | If the document is downloaded.                                | true                                                          |