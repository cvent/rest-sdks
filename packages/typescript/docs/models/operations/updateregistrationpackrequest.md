# UpdateRegistrationPackRequest

## Example Usage

```typescript
import { UpdateRegistrationPackRequest } from "@cvent/sdk/models/operations";

let value: UpdateRegistrationPackRequest = {
  id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  registrationPackId: "50f4f0df-0c2d-4e6b-8e68-e1413b6917f5",
  registrationPackRequest: {
    event: {
      id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    },
    exhibitor: {
      id: "4888db54-db22-11eb-8d19-0242ac130003",
    },
    capacities: [],
  },
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              | Example                                                                                  |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `id`                                                                                     | *string*                                                                                 | :heavy_check_mark:                                                                       | ID of an event.                                                                          | 3db28cfc-db22-11eb-8d19-0242ac130003                                                     |
| `exhibitorId`                                                                            | *string*                                                                                 | :heavy_check_mark:                                                                       | ID of an exhibitor.                                                                      | 4888db54-db22-11eb-8d19-0242ac130003                                                     |
| `registrationPackId`                                                                     | *string*                                                                                 | :heavy_check_mark:                                                                       | ID of a registration pack.                                                               | 50f4f0df-0c2d-4e6b-8e68-e1413b6917f5                                                     |
| `registrationPackRequest`                                                                | [components.RegistrationPackRequest](../../models/components/registrationpackrequest.md) | :heavy_check_mark:                                                                       | Registration pack details                                                                |                                                                                          |