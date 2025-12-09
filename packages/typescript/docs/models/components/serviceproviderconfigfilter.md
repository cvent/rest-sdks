# ServiceProviderConfigFilter

Config details for filter operations.

## Example Usage

```typescript
import { ServiceProviderConfigFilter } from "@cvent/sdk/models/components";

let value: ServiceProviderConfigFilter = {
  supported: false,
  maxResults: 100,
};
```

## Fields

| Field                                          | Type                                           | Required                                       | Description                                    | Example                                        |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `supported`                                    | *boolean*                                      | :heavy_minus_sign:                             | Indicates if the filteration is supported.     | false                                          |
| `maxResults`                                   | *number*                                       | :heavy_minus_sign:                             | The maximum number of results in the response. | 100                                            |