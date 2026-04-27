# FieldTypeJson

Determines the required format for a field. `DateTime`: Data is in date-time format. `MultiChoice`: Data is one or more options from a list. `Number`: Data is a number. `SingleChoice`: Data is a a single option from a list. `Text`: Data is free-text input.

## Example Usage

```typescript
import { FieldTypeJson } from "@cvent/sdk/models/components";

let value: FieldTypeJson = "MultiChoice";
```

## Values

```typescript
"DateTime" | "MultiChoice" | "Number" | "SingleChoice" | "Text"
```