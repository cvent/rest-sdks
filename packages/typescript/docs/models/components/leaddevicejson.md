# LeadDeviceJson

A JSON object representing an electronic device used to capture leads.

## Example Usage

```typescript
import { LeadDeviceJson } from "@cvent/sdk/models/components";

let value: LeadDeviceJson = {
  id: "EKEK993IF9F",
  name: "North Gate",
};
```

## Fields

| Field                                   | Type                                    | Required                                | Description                             | Example                                 |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `id`                                    | *string*                                | :heavy_minus_sign:                      | The id of device used to capture lead   | EKEK993IF9F                             |
| `name`                                  | *string*                                | :heavy_minus_sign:                      | The name of device used to capture lead | North Gate                              |