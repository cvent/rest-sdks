# UpdateHotelRoomRatesRequest

## Example Usage

```typescript
import { UpdateHotelRoomRatesRequest } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: UpdateHotelRoomRatesRequest = {
  hotelCode: "HOTELCODE",
  roomCode: "VLR",
  hotelRoomRatesRequest: {
    rateCode: "VIPRATE",
    startDate: new RFCDate("2025-03-25"),
    endDate: new RFCDate("2025-03-25"),
    roomRate: 150,
  },
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          | Example                                                                              |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `hotelCode`                                                                          | *string*                                                                             | :heavy_check_mark:                                                                   | The hotel code.                                                                      | HOTELCODE                                                                            |
| `roomCode`                                                                           | *string*                                                                             | :heavy_check_mark:                                                                   | The room code.                                                                       | VLR                                                                                  |
| `hotelRoomRatesRequest`                                                              | [components.HotelRoomRatesRequest](../../models/components/hotelroomratesrequest.md) | :heavy_check_mark:                                                                   | Hotel room rates request.                                                            |                                                                                      |