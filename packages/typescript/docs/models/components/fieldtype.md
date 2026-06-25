# FieldType

Determines the required format for a field. `DateTime`: Data is in date-time format. `MultiChoice`: Data is one or more options from a list. `Number`: Data is a number. `SingleChoice`: Data is a a single option from a list. `Text`: Data is free-text input.

## Example Usage

```typescript
import { FieldType } from "@cvent/sdk/models/components";

let value: FieldType = "SingleChoice";
```

## Values

```typescript
"DateTime" | "MultiChoice" | "Number" | "SingleChoice" | "Text"
```