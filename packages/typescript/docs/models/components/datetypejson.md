# DateTypeJson

The date types used for the proposal, 'PREFERRED' have the highest priority. Values prefixed with 'ALTERNATE_' are decreasing in priority (e.g., ALTERNATE_1 has higher priority than 'ALTERNATE_2 and so on).

## Example Usage

```typescript
import { DateTypeJson } from "@cvent/sdk/models/components";

let value: DateTypeJson = "ALTERNATE_8";
```

## Values

```typescript
"PREFERRED" | "ALTERNATE_1" | "ALTERNATE_2" | "ALTERNATE_3" | "ALTERNATE_4" | "ALTERNATE_5" | "ALTERNATE_6" | "ALTERNATE_7" | "ALTERNATE_8" | "ALTERNATE_9" | "ALTERNATE_10" | "ALTERNATE_11" | "ALTERNATE_12"
```