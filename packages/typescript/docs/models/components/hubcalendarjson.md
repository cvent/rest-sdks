# HubCalendarJson

The event calendar associated with this Events+ hub. The event calendar allows you to share multiple events and sessions in a list or calendar format.

## Example Usage

```typescript
import { HubCalendarJson } from "@cvent/sdk/models/components";

let value: HubCalendarJson = {
  id: "1e7e0f38-d73c-4326-9f93-422086b91304",
  layout: "List",
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    | Example                                                                        |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `id`                                                                           | *string*                                                                       | :heavy_minus_sign:                                                             | The ID of the calendar associated to an Events+ hub.                           | 1e7e0f38-d73c-4326-9f93-422086b91304                                           |
| `layout`                                                                       | [components.Layout](../../models/components/layout.md)                         | :heavy_minus_sign:                                                             | The initial layout style used by front-ends to render the associated calendar. | List                                                                           |