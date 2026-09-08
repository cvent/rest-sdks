# AgendaItem2

Represents the associated agenda item of a discount.

## Example Usage

```typescript
import { AgendaItem2 } from "@cvent/sdk/models/components";

let value: AgendaItem2 = {
  id: "14ca6ae2-0dc3-487b-953e-86d6abbdf6d4",
  type: "Session",
  discount: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `id`                                                                             | *string*                                                                         | :heavy_minus_sign:                                                               | A unique identifier of the agenda item.                                          | 14ca6ae2-0dc3-487b-953e-86d6abbdf6d4                                             |
| `type`                                                                           | [components.EntityType1](../../models/components/entitytype1.md)                 | :heavy_minus_sign:                                                               | Specifies the type of agenda item that a discount is associated with.            | Session                                                                          |
| `discount`                                                                       | [components.Uuid](../../models/components/uuid.md)                               | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |                                                                                  |