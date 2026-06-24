# RegistrationPackResponse

Schema for existing registration pack object

## Example Usage

```typescript
import { RegistrationPackResponse } from "@cvent/sdk/models/components";

let value: RegistrationPackResponse = {
  id: "50f4f0df-0c2d-4e6b-8e68-e1413b6917f5",
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

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `id`                                                                               | *string*                                                                           | :heavy_check_mark:                                                                 | Registration pack id                                                               | 50f4f0df-0c2d-4e6b-8e68-e1413b6917f5                                               |
| `event`                                                                            | [components.Event3](../../models/components/event3.md)                             | :heavy_check_mark:                                                                 | The Associated Event.                                                              |                                                                                    |
| `exhibitor`                                                                        | [components.Exhibitor](../../models/components/exhibitor.md)                       | :heavy_check_mark:                                                                 | The Associated Exhibitor.                                                          |                                                                                    |
| `capacities`                                                                       | [components.ExistingCapacity](../../models/components/existingcapacity.md)[]       | :heavy_check_mark:                                                                 | Capacities allocated per registration type for this exhibitor's registration pack. |                                                                                    |