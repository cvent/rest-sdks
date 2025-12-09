# UsageJson

A usage object represents the usage of a resource on a given day

## Example Usage

```typescript
import { UsageJson } from "@cvent/sdk/models/components";

let value: UsageJson = {
  used: 40000,
  remaining: 260000,
  total: 300000,
  date: "2020-01-01",
};
```

## Fields

| Field                                                                                                                  | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            | Example                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `used`                                                                                                                 | *number*                                                                                                               | :heavy_check_mark:                                                                                                     | The number of API requests that have been made in the current usage period. Usage periods reset daily at midnight UTC. | 40000                                                                                                                  |
| `remaining`                                                                                                            | *number*                                                                                                               | :heavy_check_mark:                                                                                                     | The number of API requests remaining in the current usage period. Usage periods reset daily at midnight UTC.           | 260000                                                                                                                 |
| `total`                                                                                                                | *number*                                                                                                               | :heavy_check_mark:                                                                                                     | The total number of API requests allowed in the current usage period. Usage periods reset daily at midnight UTC.       | 300000                                                                                                                 |
| `date`                                                                                                                 | *string*                                                                                                               | :heavy_check_mark:                                                                                                     | The date the usage occurred, as an ISO8601 date                                                                        | 2020-01-01                                                                                                             |