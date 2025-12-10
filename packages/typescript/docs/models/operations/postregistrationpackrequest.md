# PostRegistrationPackRequest

## Example Usage

```typescript
import { PostRegistrationPackRequest } from "@cvent/sdk/models/operations";

let value: PostRegistrationPackRequest = {
  id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
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
| `registrationPackRequest`                                                                | [components.RegistrationPackRequest](../../models/components/registrationpackrequest.md) | :heavy_check_mark:                                                                       | Registration pack details                                                                |                                                                                          |