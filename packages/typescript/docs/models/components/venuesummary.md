# VenueSummary

Represents a summary of venue information associated with current proposal.

## Example Usage

```typescript
import { VenueSummary } from "@cvent/sdk/models/components";

let value: VenueSummary = {
  type: "VENUE",
  id: "bedc1f8e-f68b-40cf-b901-487e407f637a",
  name: "Hotel Grand San Francisco.",
};
```

## Fields

| Field                                                                                                      | Type                                                                                                       | Required                                                                                                   | Description                                                                                                | Example                                                                                                    |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `type`                                                                                                     | *"VENUE"*                                                                                                  | :heavy_check_mark:                                                                                         | The supplier's type. VENUE: A hotel, convention and visitors bureau (CVB), or other location for an event. |                                                                                                            |
| `id`                                                                                                       | *string*                                                                                                   | :heavy_minus_sign:                                                                                         | The unique ID of the venue.                                                                                | bedc1f8e-f68b-40cf-b901-487e407f637a                                                                       |
| `name`                                                                                                     | *string*                                                                                                   | :heavy_minus_sign:                                                                                         | The name of the venue.                                                                                     | Hotel Grand San Francisco.                                                                                 |