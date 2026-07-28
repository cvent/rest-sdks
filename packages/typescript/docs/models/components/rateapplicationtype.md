# RateApplicationType

How the rate is applied to the meeting room booking.

Values:
- `COMPLIMENTARY` — Complimentary
- `INCLUDED` — Included
- `ONETIME_FEE` — One-Time Fee
- `PER_DAY` — Per Day
- `PER_HOUR` — Per Hour
- `PER_SQ_FT` — Per Square Foot
- `PER_SQ_MTR` — Per Square Meter
- `TOTAL` — Total

## Example Usage

```typescript
import { RateApplicationType } from "@cvent/sdk/models/components";

let value: RateApplicationType = "PER_DAY";
```

## Values

```typescript
"COMPLIMENTARY" | "INCLUDED" | "ONETIME_FEE" | "PER_DAY" | "PER_HOUR" | "PER_SQ_FT" | "PER_SQ_MTR" | "TOTAL"
```