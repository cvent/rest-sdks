# LeadCatcherConfigPatch

Notification and role configuration for the lead catcher contact. Only the config sub-fields supplied are updated; omitted sub-fields are left unchanged.

## Example Usage

```typescript
import { LeadCatcherConfigPatch } from "@cvent/sdk/models/components";

let value: LeadCatcherConfigPatch = {
  rfpEmailEnabled: true,
  pdfLinkEnabled: true,
  supplierContactRole: "roleName",
};
```

## Fields

| Field                                                                                                            | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      | Example                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `rfpEmailEnabled`                                                                                                | *boolean*                                                                                                        | :heavy_minus_sign:                                                                                               | True indicates this contact receives email notifications when an RFP is submitted.                               | true                                                                                                             |
| `pdfLinkEnabled`                                                                                                 | *boolean*                                                                                                        | :heavy_minus_sign:                                                                                               | True indicates the RFP notification email includes a PDF link. Only meaningful when `rfpEmailEnabled` is `true`. | true                                                                                                             |
| `supplierContactRole`                                                                                            | *string*                                                                                                         | :heavy_minus_sign:                                                                                               | Name of the supplier contact role assigned to this contact.                                                      | roleName                                                                                                         |