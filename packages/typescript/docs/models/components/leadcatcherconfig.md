# LeadCatcherConfig

Notification and role configuration for a lead catcher contact.

## Example Usage

```typescript
import { LeadCatcherConfig } from "@cvent/sdk/models/components";

let value: LeadCatcherConfig = {
  supplierContactRole: "Sales Manager",
};
```

## Fields

| Field                                                                                                            | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      | Example                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `rfpEmailEnabled`                                                                                                | *boolean*                                                                                                        | :heavy_minus_sign:                                                                                               | True indicates this contact receives email notifications when an RFP is submitted.                               | true                                                                                                             |
| `pdfLinkEnabled`                                                                                                 | *boolean*                                                                                                        | :heavy_minus_sign:                                                                                               | True indicates the RFP notification email includes a PDF link. Only meaningful when `rfpEmailEnabled` is `true`. | true                                                                                                             |
| `supplierContactRole`                                                                                            | *string*                                                                                                         | :heavy_minus_sign:                                                                                               | Name of the supplier contact role assigned to this contact.                                                      | Sales Manager                                                                                                    |