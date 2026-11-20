# InvoiceFile

An invoice attached to the payment.

## Example Usage

```typescript
import { InvoiceFile } from "@cvent/sdk/models/components";

let value: InvoiceFile = {
  file: {},
  href: "https://www.example.com/invoice.png",
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              | Example                                                                  |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `file`                                                                   | [components.InvoiceFileFile](../../models/components/invoicefilefile.md) | :heavy_check_mark:                                                       | N/A                                                                      |                                                                          |
| `href`                                                                   | *string*                                                                 | :heavy_check_mark:                                                       | URL of the attached invoice.                                             | https://www.example.com/invoice.png                                      |