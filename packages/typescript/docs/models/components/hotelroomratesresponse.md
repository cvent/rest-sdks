# HotelRoomRatesResponse

Represents hotel room rates response.

## Example Usage

```typescript
import { HotelRoomRatesResponse } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: HotelRoomRatesResponse = {
  rateCode: "VIPRATE",
  startDate: new RFCDate("2025-03-25"),
  endDate: new RFCDate("2025-03-25"),
  roomRate: 150,
  hotelCode: "HOTELCODE",
  roomCode: "VLR",
};
```

## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               | Example                                                                   |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `rateCode`                                                                | *string*                                                                  | :heavy_minus_sign:                                                        | The rate code.                                                            | VIPRATE                                                                   |
| `startDate`                                                               | [RFCDate](../../types/rfcdate.md)                                         | :heavy_check_mark:                                                        | The start of the date range the rate applies. Date is in ISO 8601 format. | 2025-03-25                                                                |
| `endDate`                                                                 | [RFCDate](../../types/rfcdate.md)                                         | :heavy_check_mark:                                                        | The end of the date range the rate applies. Date is in ISO 8601 format.   | 2025-03-25                                                                |
| `roomRate`                                                                | *number*                                                                  | :heavy_check_mark:                                                        | Cost of room per night.                                                   | 150                                                                       |
| `currencyCode`                                                            | *string*                                                                  | :heavy_minus_sign:                                                        | ISO 4217 currency code.                                                   | USD                                                                       |
| `hotelCode`                                                               | *string*                                                                  | :heavy_check_mark:                                                        | The hotel code.                                                           | HOTELCODE                                                                 |
| `roomCode`                                                                | *string*                                                                  | :heavy_check_mark:                                                        | The room code.                                                            | VLR                                                                       |