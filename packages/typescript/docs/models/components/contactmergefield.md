# ContactMergeField

A contact field name and contact ID pair.

## Example Usage

```typescript
import { ContactMergeField } from "@cvent/sdk/models/components";

let value: ContactMergeField = {
  fieldName: "firstName",
  contactId: "a45a3341-d30f-4bd9-bfd8-fbcdae37f0f2",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `fieldName`                          | *string*                             | :heavy_check_mark:                   | The name of a contact field.         | firstName                            |
| `contactId`                          | *string*                             | :heavy_check_mark:                   | ID of the contact.                   | a45a3341-d30f-4bd9-bfd8-fbcdae37f0f2 |