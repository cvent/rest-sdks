# MeetingRoomExhibitCapacity

Maximum number of exhibits for a specific exhibit layout type in a meeting room.

## Example Usage

```typescript
import { MeetingRoomExhibitCapacity } from "@cvent/sdk/models/components";

let value: MeetingRoomExhibitCapacity = {
  layoutType: "BOOTH_10x10",
  maxExhibits: 50,
};
```

## Fields

| Field                                                                                                          | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    | Example                                                                                                        |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `layoutType`                                                                                                   | [components.ExhibitLayoutType](../../models/components/exhibitlayouttype.md)                                   | :heavy_check_mark:                                                                                             | The exhibit setup type for a meeting room. Values represent standard exhibit booth and display configurations. | BOOTH_10x10                                                                                                    |
| `maxExhibits`                                                                                                  | *number*                                                                                                       | :heavy_check_mark:                                                                                             | Maximum number of exhibits for this layout type.                                                               | 50                                                                                                             |