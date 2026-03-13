# RegistrationPackRequest

A registration pack containing event, exhibitor, and capacities information.

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

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `event`                                                              | [components.EventJson6](../../models/components/eventjson6.md)       | :heavy_check_mark:                                                   | The Associated Event.                                                |
| `exhibitor`                                                          | [components.ExhibitorJson](../../models/components/exhibitorjson.md) | :heavy_check_mark:                                                   | The Associated Exhibitor.                                            |
| `capacities`                                                         | [components.CapacityJson](../../models/components/capacityjson.md)[] | :heavy_check_mark:                                                   | An array of capacities for the registration pack.                    |