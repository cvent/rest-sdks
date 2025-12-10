# UpdateProgramItemRequest

## Example Usage

```typescript
import { UpdateProgramItemRequest } from "@cvent/sdk/models/operations";

let value: UpdateProgramItemRequest = {
  programItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  programItemUpdateRequest: {
    id: "38db6ae2-0dc3-487b-953e-86d6abbdf7d3",
    event: {
      id: "78842378-5d83-11ee-8c99-0242ac120002",
    },
    session: {
      id: "78842aee-5d83-11ee-8c99-0242ac120002",
    },
    name: "Day 1 Program Item.",
    duration: 30,
    description: "This is a sample description of the day 1 program item.",
    rteDescription:
      "{\"format\":\"draftjs-nucleus\",\"version\":1,\"content\":{\"blocks\":[{\"key\":\"cubve\",\"text\":\"Program Item Description\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}}",
  },
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                | Example                                                                                    |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `programItemId`                                                                            | *string*                                                                                   | :heavy_check_mark:                                                                         | Unique ID of a session program item.                                                       | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                       |
| `programItemUpdateRequest`                                                                 | [components.ProgramItemUpdateRequest](../../models/components/programitemupdaterequest.md) | :heavy_check_mark:                                                                         | Session program item to be updated.                                                        |                                                                                            |