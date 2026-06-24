# WeddingPartner

Represents wedding partner.

## Example Usage

```typescript
import { WeddingPartner } from "@cvent/sdk/models/components";

let value: WeddingPartner = {
  name: "John Doe",
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `type`                                                                 | [components.BrideGroomType](../../models/components/bridegroomtype.md) | :heavy_minus_sign:                                                     | BrideGroomType                                                         |                                                                        |
| `name`                                                                 | *string*                                                               | :heavy_minus_sign:                                                     | Name of the partner of the wedding couple.                             | John Doe                                                               |