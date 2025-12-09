# VolumeDiscountThresholdTypeJson

Specifies who will receive the discount once the threshold for the number of ordered items is met or exceeded, depending on the type. `ALL`: All registrations receive the discount once the threshold is exceeded. `AFTER_THRESHOLD_LIMIT`: Every registration beyond the threshold receives the discount. `BEFORE_THRESHOLD_LIMIT:` Every registration, including those at the threshold, are discounted. Further registrations are at full price. If primaryRegistrant is not included then the first registrant is full price. Every registration afterward, up to and including the threshold, are discounted. Any additional registrations are at full price. `EVERY_NTH_REGISTRANT`: After reaching the threshold, every Nth registration counting from the threshold recieves a discount, where N is defined by the `interval` field.

## Example Usage

```typescript
import { VolumeDiscountThresholdTypeJson } from "@cvent/sdk/models/components";

let value: VolumeDiscountThresholdTypeJson = "ALL";
```

## Values

```typescript
"ALL" | "AFTER_THRESHOLD_LIMIT" | "BEFORE_THRESHOLD_LIMIT" | "EVERY_NTH_REGISTRANT"
```