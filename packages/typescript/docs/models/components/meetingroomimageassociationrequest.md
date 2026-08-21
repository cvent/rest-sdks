# MeetingRoomImageAssociationRequest

Request body for associating an uploaded image file with a meeting room.

## Example Usage

```typescript
import { MeetingRoomImageAssociationRequest } from "@cvent/sdk/models/components";

let value: MeetingRoomImageAssociationRequest = {
  file: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
};
```

## Fields

| Field                                                                                                                  | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `file`                                                                                                                 | [components.MeetingRoomImageAssociationRequestFile](../../models/components/meetingroomimageassociationrequestfile.md) | :heavy_check_mark:                                                                                                     | The previously uploaded image file to associate with the meeting room.                                                 |