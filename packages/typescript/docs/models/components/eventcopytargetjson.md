# EventCopyTargetJson

Represents the target event information for an event copy operation.

## Example Usage

```typescript
import { EventCopyTargetJson } from "@cvent/sdk/models/components";

let value: EventCopyTargetJson = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                                                                                                               | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         | Example                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                | *string*                                                                                                                            | :heavy_minus_sign:                                                                                                                  | The ID of an existing event that you want to copy the source event data into. If this value is not present, a new event is created. | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                                                                |