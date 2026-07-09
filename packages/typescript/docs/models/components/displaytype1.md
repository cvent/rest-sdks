# DisplayType1

Display type indicating how to display the choices on UI. For 'Choice - Single Answer' custom field type, this defaults to Dropdown. For 'Choice - Multiple Answers' custom field type, this defaults to MultiSelectBox.

## Example Usage

```typescript
import { DisplayType1 } from "@cvent/sdk/models/components";

let value: DisplayType1 = "Vertical";
```

## Values

```typescript
"Dropdown" | "Vertical" | "Horizontal" | "MultiSelectBox"
```