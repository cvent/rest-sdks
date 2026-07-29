# BidItemStatusType

The status of the item in negotiation. e.g. The corporation might mark an item as delete_requested, and the hotel, if they agree, can update the item to deleted. not_offered indicates the hotel does not offer this amenity (supply side only).

## Example Usage

```typescript
import { BidItemStatusType } from "@cvent/sdk/models/components";

let value: BidItemStatusType = "requested";
```

## Values

```typescript
"requested" | "delete_requested" | "deleted" | "not_offered"
```