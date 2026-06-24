# IdOnlyEntity

An entity which only has an id.

## Example Usage

```typescript
import { IdOnlyEntity } from "@cvent/sdk/models/components";

let value: IdOnlyEntity = {
  id: "abc-123",
};
```

## Fields

| Field                  | Type                   | Required               | Description            | Example                |
| ---------------------- | ---------------------- | ---------------------- | ---------------------- | ---------------------- |
| `id`                   | *string*               | :heavy_check_mark:     | The entity's id value. | abc-123                |