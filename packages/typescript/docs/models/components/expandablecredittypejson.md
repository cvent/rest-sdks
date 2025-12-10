# ExpandableCreditTypeJson

An object that contains the associated credit type ID.

This is an **expandable** object and if requested will contain the name of a credit type object.

## Example Usage

```typescript
import { ExpandableCreditTypeJson } from "@cvent/sdk/models/components";

let value: ExpandableCreditTypeJson = {
  id: "c15d600b-1363-413e-b00a-87d946903fe1",
};
```

## Fields

| Field                                   | Type                                    | Required                                | Description                             | Example                                 |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `id`                                    | *string*                                | :heavy_minus_sign:                      | A unique identifier of the credit type. | c15d600b-1363-413e-b00a-87d946903fe1    |