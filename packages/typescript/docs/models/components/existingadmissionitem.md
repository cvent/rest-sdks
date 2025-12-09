# ExistingAdmissionItem

Represents an existing event admission item.

## Example Usage

```typescript
import { ExistingAdmissionItem } from "@cvent/sdk/models/components";

let value: ExistingAdmissionItem = {
  name: "General Admission",
  code: "General Admission",
  description: "General admission to the event. Includes all basic sessions.",
  allowOptionalSessions: false,
  event: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `name`                                                                             | *string*                                                                           | :heavy_minus_sign:                                                                 | Title of the admission item.                                                       | General Admission                                                                  |
| `code`                                                                             | *string*                                                                           | :heavy_minus_sign:                                                                 | A planner-specified code for the admission item. By default, it matches the title. | General Admission                                                                  |
| `description`                                                                      | *string*                                                                           | :heavy_minus_sign:                                                                 | Description of the admission item.                                                 | General admission to the event. Includes all basic sessions.                       |
| `allowOptionalSessions`                                                            | *boolean*                                                                          | :heavy_minus_sign:                                                                 | True indicates the feature to restrict available sessions is active.               | false                                                                              |
| `id`                                                                               | *string*                                                                           | :heavy_minus_sign:                                                                 | A unique identifier of the admission item.                                         |                                                                                    |
| `event`                                                                            | [components.UuidJson](../../models/components/uuidjson.md)                         | :heavy_minus_sign:                                                                 | The reference to the related entity. Contains only the ID of the related entity.   |                                                                                    |