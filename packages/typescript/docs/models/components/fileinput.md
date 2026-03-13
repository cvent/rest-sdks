# FileInput

Content of exhibitor file.

## Example Usage

```typescript
import { FileInput } from "@cvent/sdk/models/components";

let value: FileInput = {
  event: {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  },
  exhibitor: {
    id: "4888db54-db22-11eb-8d19-0242ac130003",
  },
  displayName: "Marketing Page",
  order: 3,
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `event`                                                              | [components.EventJson6](../../models/components/eventjson6.md)       | :heavy_check_mark:                                                   | The Associated Event.                                                |                                                                      |
| `exhibitor`                                                          | [components.ExhibitorJson](../../models/components/exhibitorjson.md) | :heavy_check_mark:                                                   | The Associated Exhibitor.                                            |                                                                      |
| `displayName`                                                        | *string*                                                             | :heavy_check_mark:                                                   | Display name of the file.                                            | Marketing Page                                                       |
| `hidden`                                                             | *boolean*                                                            | :heavy_minus_sign:                                                   | True indicates the file is hidden from attendees.                    |                                                                      |
| `order`                                                              | *number*                                                             | :heavy_check_mark:                                                   | Display order for exhibitor file content.                            | 3                                                                    |