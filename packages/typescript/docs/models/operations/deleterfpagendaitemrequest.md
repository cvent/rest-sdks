# DeleteRfpAgendaItemRequest

## Example Usage

```typescript
import { DeleteRfpAgendaItemRequest } from "@cvent/sdk/models/operations";

let value: DeleteRfpAgendaItemRequest = {
  rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  agendaItemId: "f56a51a4-84b0-46c9-a612-716dc95a1c96",
};
```

## Fields

| Field                                              | Type                                               | Required                                           | Description                                        | Example                                            |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `rfpId`                                            | *string*                                           | :heavy_check_mark:                                 | The unique identifier of the RFP we are requesting | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3               |
| `agendaItemId`                                     | *string*                                           | :heavy_check_mark:                                 | The unique identifier of the RFP agenda item.      | f56a51a4-84b0-46c9-a612-716dc95a1c96               |