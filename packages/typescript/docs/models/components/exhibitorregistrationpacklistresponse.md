# ExhibitorRegistrationPackListResponse

This entity is used to represent registration packs list response.

## Example Usage

```typescript
import { ExhibitorRegistrationPackListResponse } from "@cvent/sdk/models/components";

let value: ExhibitorRegistrationPackListResponse = {
  data: [
    {
      id: "50f4f0df-0c2d-4e6b-8e68-e1413b6917f5",
      event: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
      exhibitor: {
        id: "4888db54-db22-11eb-8d19-0242ac130003",
      },
      capacities: [],
    },
  ],
};
```

## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `data`                                                                                               | [components.ExistingRegistrationPackJson](../../models/components/existingregistrationpackjson.md)[] | :heavy_minus_sign:                                                                                   | List of registration packs for an exhibitor.                                                         |