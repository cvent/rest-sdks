# EventActivityDetailsJson

Details for an event activity.

## Example Usage

```typescript
import { EventActivityDetailsJson } from "@cvent/sdk/models/components";

let value: EventActivityDetailsJson = {
  id: "d84855b0-eeda-41c4-8e7a-53e80364cb95",
  title: "Cvent Connect 2020",
  code: "XRNGB4YY3CX",
  timezone: "America/New_York",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_minus_sign:                   | The identifier of the event.         | d84855b0-eeda-41c4-8e7a-53e80364cb95 |
| `title`                              | *string*                             | :heavy_minus_sign:                   | The title of the event.              | Cvent Connect 2020                   |
| `code`                               | *string*                             | :heavy_minus_sign:                   | The code of the event.               | XRNGB4YY3CX                          |
| `timezone`                           | *string*                             | :heavy_minus_sign:                   | The timezone of the event.           | America/New_York                     |