# Bulk

Config details for bulk operations.

## Example Usage

```typescript
import { Bulk } from "@cvent/sdk/models/components";

let value: Bulk = {
  supported: false,
  maxOperations: 1,
  maxPayloadSize: 1048576,
};
```

## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `supported`                                                    | *boolean*                                                      | :heavy_minus_sign:                                             | Indicates if the bulk operation is supported.                  | false                                                          |
| `maxOperations`                                                | *number*                                                       | :heavy_minus_sign:                                             | An integer value specifying the maximum number of operations.  | 1                                                              |
| `maxPayloadSize`                                               | *number*                                                       | :heavy_minus_sign:                                             | An integer value specifying the maximum payload size in bytes. | 1048576                                                        |