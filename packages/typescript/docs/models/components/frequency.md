# Frequency

Defines how often the tax or fee is applied.
- per_guest: Applied per guest.
- per_room: Applied per room.
- per_night: Applied per night.
- per_stay: Applied per stay.

## Example Usage

```typescript
import { Frequency } from "@cvent/sdk/models/components";

let value: Frequency = "per_room";
```

## Values

```typescript
"per_guest" | "per_room" | "per_night" | "per_stay"
```