# SessionSpeakerJson

A session speaker

## Example Usage

```typescript
import { SessionSpeakerJson } from "@cvent/sdk/models/components";

let value: SessionSpeakerJson = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  session: {
    id: "832cb481-74c5-4859-ba21-bbb5be8b86e0",
  },
  category: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "Presenters",
  },
  order: 1,
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    | Example                                                                        |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `id`                                                                           | *string*                                                                       | :heavy_minus_sign:                                                             | A string that has to be a format matching the industry standard uuid           | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                           |
| `session`                                                                      | [components.SessionLiteJson](../../models/components/sessionlitejson.md)       | :heavy_minus_sign:                                                             | The unique identifier of a session.                                            |                                                                                |
| `category`                                                                     | [components.CategoryIdNameJson](../../models/components/categoryidnamejson.md) | :heavy_minus_sign:                                                             | A defined speaker category.                                                    |                                                                                |
| `order`                                                                        | *number*                                                                       | :heavy_minus_sign:                                                             | The order of the speaker in a session.                                         | 1                                                                              |