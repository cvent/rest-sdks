# RegistrationPackRequest

A registration pack defining the registration type capacity allocations for an exhibitor at an event.

## Example Usage

```typescript
import { RegistrationPackRequest } from "@cvent/sdk/models/components";

let value: RegistrationPackRequest = {
  event: {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  },
  exhibitor: {
    id: "4888db54-db22-11eb-8d19-0242ac130003",
  },
  capacities: [],
};
```

## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `event`                                                      | [components.Event4](../../models/components/event4.md)       | :heavy_check_mark:                                           | Associated event.                                            |
| `exhibitor`                                                  | [components.Exhibitor](../../models/components/exhibitor.md) | :heavy_check_mark:                                           | Associated exhibitor.                                        |
| `capacities`                                                 | [components.Capacity](../../models/components/capacity.md)[] | :heavy_check_mark:                                           | List of the capacities of the registration pack.             |