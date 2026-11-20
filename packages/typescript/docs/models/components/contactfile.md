# ContactFile

A contact's file, such as a profile image.

## Example Usage

```typescript
import { ContactFile } from "@cvent/sdk/models/components";

let value: ContactFile = {
  file: {},
  href: "https://example.com/files/profile.png",
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              | Example                                                                  |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `file`                                                                   | [components.ContactFileFile](../../models/components/contactfilefile.md) | :heavy_check_mark:                                                       | N/A                                                                      |                                                                          |
| `href`                                                                   | *string*                                                                 | :heavy_check_mark:                                                       | URL of the contact's file.                                               | https://example.com/files/profile.png                                    |