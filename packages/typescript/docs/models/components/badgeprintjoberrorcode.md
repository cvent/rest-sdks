# BadgePrintJobErrorCode

This is used to indicate the error code returned from a badge printer.

## Example Usage

```typescript
import { BadgePrintJobErrorCode } from "@cvent/sdk/models/components";

let value: BadgePrintJobErrorCode = "Connection";
```

## Values

```typescript
"BadgeNotFound" | "BadgeRenderIssue" | "Connection" | "PrinterError" | "AttendeeDataMissing" | "Unknown"
```