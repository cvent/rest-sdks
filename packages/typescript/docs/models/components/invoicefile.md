# InvoiceFile

An invoice attached to the payment.

## Example Usage

```typescript
import { InvoiceFile } from "@cvent/sdk/models/components";

let value: InvoiceFile = {
  file: {},
  href:
    "https://custom.cvent.com/a5154f85f71a4cf2464e037feb75b308/00000000000000000000000000000000/files/universal-file/tmp/e209d73d845746b7a6deda4da9d91b2c.png",
};
```

## Fields

| Field                                                                                                                                                    | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              | Example                                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `file`                                                                                                                                                   | [components.InvoiceFileFile](../../models/components/invoicefilefile.md)                                                                                 | :heavy_check_mark:                                                                                                                                       | N/A                                                                                                                                                      |                                                                                                                                                          |
| `href`                                                                                                                                                   | *string*                                                                                                                                                 | :heavy_check_mark:                                                                                                                                       | URL of the attached invoice.                                                                                                                             | https://custom.cvent.com/a5154f85f71a4cf2464e037feb75b308/00000000000000000000000000000000/files/universal-file/tmp/e209d73d845746b7a6deda4da9d91b2c.png |