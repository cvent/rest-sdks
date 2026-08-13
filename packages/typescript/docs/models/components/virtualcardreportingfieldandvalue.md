# VirtualCardReportingFieldAndValue

Reporting fields and values for a virtual card.

## Example Usage

```typescript
import { VirtualCardReportingFieldAndValue } from "@cvent/sdk/models/components";

let value: VirtualCardReportingFieldAndValue = {
  name: "Department Code",
  value: "12",
};
```

## Fields

| Field                       | Type                        | Required                    | Description                 | Example                     |
| --------------------------- | --------------------------- | --------------------------- | --------------------------- | --------------------------- |
| `name`                      | *string*                    | :heavy_minus_sign:          | The reporting field's name. | Department Code             |
| `value`                     | *string*                    | :heavy_minus_sign:          | The reporting field value.  | 12                          |