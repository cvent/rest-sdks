# VenueDetailsOverview

An overview of venue details containing key identifiers and display properties.

## Example Usage

```typescript
import { VenueDetailsOverview } from "@cvent/sdk/models/components";

let value: VenueDetailsOverview = {
  id: "b2c3d4e5-f6a7-8901-bcde-f12345678901",
  name: "Vienna Wolf Trap Hotel",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_check_mark:                   | Venue ID.                            | b2c3d4e5-f6a7-8901-bcde-f12345678901 |
| `name`                               | *string*                             | :heavy_check_mark:                   | Venue name.                          | Vienna Wolf Trap Hotel               |