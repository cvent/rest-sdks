# RfpStatus

Status of the RFP. Returned as ACTIVE when no approval is required, or PENDING when approval is configured.

## Example Usage

```typescript
import { RfpStatus } from "@cvent/sdk/models/components";

let value: RfpStatus = "ACTIVE";
```

## Values

```typescript
"PENDING" | "ACTIVE" | "AWARDED" | "DRAFT" | "HISTORIC" | "CANCELLED" | "DELETED"
```