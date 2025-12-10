# CustomFieldTypeJson1

This is used to denote the type of data collected by a custom field. Auto-Increment custom fields are read only.

## Example Usage

```typescript
import { CustomFieldTypeJson1 } from "@cvent/sdk/models/components";

let value: CustomFieldTypeJson1 = "Open Ended Text - One Line";
```

## Values

```typescript
"Open Ended Text - Date/Time" | "Open Ended Text - One Line" | "Open Ended Text - Comment Box" | "Choice - Single Answer" | "Choice - Multiple Answers" | "Auto-Increment"
```