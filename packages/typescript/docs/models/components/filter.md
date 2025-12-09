# Filter

A filter which is sent through the body of the request.

## Example Usage

```typescript
import { Filter } from "@cvent/sdk/models/components";

let value: Filter = {
  filter: "property eq 'value'",
};
```

## Fields

| Field                           | Type                            | Required                        | Description                     | Example                         |
| ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- |
| `filter`                        | *string*                        | :heavy_minus_sign:              | Filter included in the request. | property eq 'value'             |