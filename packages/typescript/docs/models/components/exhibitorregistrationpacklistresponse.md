# ExhibitorRegistrationPackListResponse

The registration pack associated with an exhibitor. Each exhibitor has at most one registration pack per event.

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

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `data`                                                                                       | [components.RegistrationPackResponse](../../models/components/registrationpackresponse.md)[] | :heavy_minus_sign:                                                                           | The registration pack for an exhibitor. Contains at most one item.                           |