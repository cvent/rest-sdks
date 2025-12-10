# AgendaEventCopyOverride

Determines if agenda feature data should be copied over from the source event.

## Example Usage

```typescript
import { AgendaEventCopyOverride } from "@cvent/sdk/models/components";

let value: AgendaEventCopyOverride = {};
```

## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             | Example                                                                 |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `featureData`                                                           | *boolean*                                                               | :heavy_minus_sign:                                                      | True indicates the feature data should be copied from the source event. | true                                                                    |