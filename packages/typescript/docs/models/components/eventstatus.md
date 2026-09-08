# EventStatus

Event status denotes if the event is in the past, present or future. Also can denote if the event was cancelled or deleted. 

## Example Usage

```typescript
import { EventStatus } from "@cvent/sdk/models/components";

let value: EventStatus = "Upcoming";
```

## Values

```typescript
"Upcoming" | "Ongoing" | "Completed" | "Cancelled" | "Deleted" | "Processing" | "Archived"
```