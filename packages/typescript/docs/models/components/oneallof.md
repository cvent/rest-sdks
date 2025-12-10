# OneAllOf

Represents a link to a related resource.

## Example Usage

```typescript
import { OneAllOf } from "@cvent/sdk/models/components";

let value: OneAllOf = {
  href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
};
```

## Fields

| Field                                           | Type                                            | Required                                        | Description                                     | Example                                         |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `href`                                          | *string*                                        | :heavy_check_mark:                              | A url provided that can be followed for linking | ?token=90c5f062-76ad-4ea4-aa53-00eb698d9262     |