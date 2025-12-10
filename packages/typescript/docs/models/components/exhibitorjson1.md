# ExhibitorJson1

An exhibitor.

## Example Usage

```typescript
import { ExhibitorJson1 } from "@cvent/sdk/models/components";

let value: ExhibitorJson1 = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  name: "AutoExpo",
  featured: true,
  eventSponsor: true,
};
```

## Fields

| Field                                   | Type                                    | Required                                | Description                             | Example                                 |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `id`                                    | *string*                                | :heavy_minus_sign:                      | The unique identifier of the exhibitor. | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3    |
| `name`                                  | *string*                                | :heavy_minus_sign:                      | The Name of an exhibitor.               | AutoExpo                                |
| `featured`                              | *boolean*                               | :heavy_minus_sign:                      | If the exhibitor is featured.           | true                                    |
| `eventSponsor`                          | *boolean*                               | :heavy_minus_sign:                      | If the exhibitor is an event sponsor.   | true                                    |