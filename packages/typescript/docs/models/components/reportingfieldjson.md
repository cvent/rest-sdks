# ReportingFieldJson

Reporting fields and values for a virtual card.

## Example Usage

```typescript
import { ReportingFieldJson } from "@cvent/sdk/models/components";

let value: ReportingFieldJson = {
  name: "Department Code",
  value: "12",
};
```

## Fields

| Field                       | Type                        | Required                    | Description                 | Example                     |
| --------------------------- | --------------------------- | --------------------------- | --------------------------- | --------------------------- |
| `name`                      | *string*                    | :heavy_minus_sign:          | The reporting field's name. | Department Code             |
| `value`                     | *string*                    | :heavy_minus_sign:          | The reporting field value.  | 12                          |