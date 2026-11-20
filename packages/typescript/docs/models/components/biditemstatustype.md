# BidItemStatusType

The negotiation status of the bid item. For example, the corporation marks an item as `delete_requested`, and the hotel updates the item to `deleted` when it agrees. `not_offered`: The hotel does not offer the amenity. Applies only to the supply side.

## Example Usage

```typescript
import { BidItemStatusType } from "@cvent/sdk/models/components";

let value: BidItemStatusType = "requested";
```

## Values

```typescript
"requested" | "delete_requested" | "deleted" | "not_offered"
```