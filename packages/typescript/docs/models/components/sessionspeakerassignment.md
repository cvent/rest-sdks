# SessionSpeakerAssignment

Holds fields that can be applied to a session speaker assignment.

## Example Usage

```typescript
import { SessionSpeakerAssignment } from "@cvent/sdk/models/components";

let value: SessionSpeakerAssignment = {
  speakerCategory: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  order: 1,
};
```

## Fields

| Field                                                                                                                                                                                       | Type                                                                                                                                                                                        | Required                                                                                                                                                                                    | Description                                                                                                                                                                                 | Example                                                                                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `speakerCategory`                                                                                                                                                                           | [components.CategoryIdJson](../../models/components/categoryidjson.md)                                                                                                                      | :heavy_minus_sign:                                                                                                                                                                          | An object that holds the id for a category                                                                                                                                                  |                                                                                                                                                                                             |
| `order`                                                                                                                                                                                     | *number*                                                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                                          | Preferred position where the speaker will appear in an ordered list for a session. Smaller values indicate a higher position in the list with the value 1 being the first item in the list. | 1                                                                                                                                                                                           |