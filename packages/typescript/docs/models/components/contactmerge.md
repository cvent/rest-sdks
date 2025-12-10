# ContactMerge

This entity represents a request to merge one or two contacts with another 'main' contact.

## Example Usage

```typescript
import { ContactMerge } from "@cvent/sdk/models/components";

let value: ContactMerge = {
  secondaryContacts: [
    "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  ],
  conflictResolution: {
    contactFields: [
      {
        fieldName: "firstName",
        contactId: "a45a3341-d30f-4bd9-bfd8-fbcdae37f0f2",
      },
    ],
  },
};
```

## Fields

| Field                                                                                                                                                                | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `secondaryContacts`                                                                                                                                                  | *string*[]                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                   | Id of the contact(s) to be merged to the main contact.                                                                                                               |
| `conflictResolution`                                                                                                                                                 | [components.ConflictResolution](../../models/components/conflictresolution.md)                                                                                       | :heavy_minus_sign:                                                                                                                                                   | Represents choices in resolving conflicts in the contacts to be merged or to optionally select fields to keep from a secondary contact, overriding default behavior. |