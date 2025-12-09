# RefundTypeJson

The type of refund policy for the fee. `RefundByFixedAmount`: Returns a fixed amount to the attendee as chosen by the planner. `RefundByCancellationAmount`: Refunds everything to the attendee minus an cancellation fee chosen by the planner. `RefundByPercentage`: Refunds a percentage of the amount as chosen by the planner.

## Example Usage

```typescript
import { RefundTypeJson } from "@cvent/sdk/models/components";

let value: RefundTypeJson = "RefundByPercentage";
```

## Values

```typescript
"RefundByFixedAmount" | "RefundByCancellationAmount" | "RefundByPercentage"
```