# PaymentTypeCreateJson

Denotes the type of transaction you're creating. Offline Charge: The transaction is a payment made to the attendee's order electronically in another system of record, or paid in physical currency. To create an offline charge, the attendee must have a balance owing. Offline Refund: The transaction is a refund issued to the attendee electronically in another system of record, or paid in physical currency. To create an offline refund, the attendee must have a balance due.

## Example Usage

```typescript
import { PaymentTypeCreateJson } from "@cvent/sdk/models/components";

let value: PaymentTypeCreateJson = "Offline Charge";
```

## Values

```typescript
"Offline Charge" | "Offline Refund"
```