# GetRoomTypeDetailsRequest

## Example Usage

```typescript
import { GetRoomTypeDetailsRequest } from "@cvent/sdk/models/operations";

let value: GetRoomTypeDetailsRequest = {
  housingEventId: 35325345,
  hotelId: 454345,
  roomTypeId: 4,
  locale: "en-US",
};
```

## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         | Example                                                                             |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `housingEventId`                                                                    | *number*                                                                            | :heavy_check_mark:                                                                  | ID for a Passkey housing event.                                                     | 35325345                                                                            |
| `hotelId`                                                                           | *number*                                                                            | :heavy_check_mark:                                                                  | The hotel's unique ID.                                                              | 454345                                                                              |
| `roomTypeId`                                                                        | *number*                                                                            | :heavy_check_mark:                                                                  | Room Type ID.                                                                       | 4                                                                                   |
| `locale`                                                                            | *string*                                                                            | :heavy_minus_sign:                                                                  | Locale code in IETF Language tag format. Indicates desired locale of return values. | en-US                                                                               |