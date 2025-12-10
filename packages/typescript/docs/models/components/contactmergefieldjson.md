# ContactMergeFieldJson

A pair of a contact field name and a contact id.

## Example Usage

```typescript
import { ContactMergeFieldJson } from "@cvent/sdk/models/components";

let value: ContactMergeFieldJson = {
  fieldName: "firstName",
  contactId: "a45a3341-d30f-4bd9-bfd8-fbcdae37f0f2",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `fieldName`                          | *string*                             | :heavy_check_mark:                   | The name of a contact field.         | firstName                            |
| `contactId`                          | *string*                             | :heavy_check_mark:                   | ID of the contact.                   | a45a3341-d30f-4bd9-bfd8-fbcdae37f0f2 |