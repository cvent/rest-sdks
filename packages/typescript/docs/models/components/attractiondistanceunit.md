# AttractionDistanceUnit

Unit of measurement for distance from venue to attraction.<br><br>Values:<br>- `BLANK` — Indicates no selection, leaves the field blank<br>- `MILES` — Miles<br>- `KILOMETERS` — Kilometers<br>- `BLOCKS` — Blocks<br>- `MINUTES` — Minutes<br>- `HOURS` — Hours

## Example Usage

```typescript
import { AttractionDistanceUnit } from "@cvent/sdk/models/components";

let value: AttractionDistanceUnit = "MINUTES";
```

## Values

```typescript
"BLANK" | "MILES" | "KILOMETERS" | "BLOCKS" | "MINUTES" | "HOURS"
```