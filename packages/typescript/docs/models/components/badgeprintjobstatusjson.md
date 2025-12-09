# BadgePrintJobStatusJson

This is used to indicate the status of the badge print job.

## Example Usage

```typescript
import { BadgePrintJobStatusJson } from "@cvent/sdk/models/components";

let value: BadgePrintJobStatusJson = "Scheduled";
```

## Values

```typescript
"Scheduled" | "Rescheduled" | "Assigned" | "Failed" | "Done" | "Canceled"
```