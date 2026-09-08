# AttachmentJson

A message attachment.

## Example Usage

```typescript
import { AttachmentJson } from "@cvent/sdk/models/components";

let value: AttachmentJson = {
  link: "https://foo.com/a/picture/of/a/cat.jpg",
};
```

## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `link`                                                | *string*                                              | :heavy_check_mark:                                    | A link to the attachment allowing it to be downloaded | https://foo.com/a/picture/of/a/cat.jpg                |