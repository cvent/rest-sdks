# HubStatusProperty

The current Events+ Hub status. Inactive: The Events+ Hub is inactive and unavailable to members. Active: Members can access the Events+ Hub. Deleted: The Events+ Hub has been deleted and is unavailable to members or planners.

## Example Usage

```typescript
import { HubStatusProperty } from "@cvent/sdk/models/components";

let value: HubStatusProperty = "Deleted";
```

## Values

```typescript
"Inactive" | "Active" | "Deleted"
```