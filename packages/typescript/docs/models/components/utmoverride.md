# UTMOverride

Specifies how UTM (urchin tracking module: a key and value that is attached to URLs for the purpose of identifying and tracking traffic) settings will override passed in items.

## Example Usage

```typescript
import { UTMOverride } from "@cvent/sdk/models/components";

let value: UTMOverride = "use-custom-parameter";
```

## Values

```typescript
"use-existing-parameter" | "use-custom-parameter"
```