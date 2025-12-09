# GetHousingEventHotelRequest

## Example Usage

```typescript
import { GetHousingEventHotelRequest } from "@cvent/sdk/models/operations";

let value: GetHousingEventHotelRequest = {
  housingEventId: 35325345,
  hotelId: 454345,
  locale: "en-US",
};
```

## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         | Example                                                                             |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `housingEventId`                                                                    | *number*                                                                            | :heavy_check_mark:                                                                  | ID for a Passkey housing event.                                                     | 35325345                                                                            |
| `hotelId`                                                                           | *number*                                                                            | :heavy_check_mark:                                                                  | The hotel's unique ID.                                                              | 454345                                                                              |
| `locale`                                                                            | *string*                                                                            | :heavy_minus_sign:                                                                  | Locale code in IETF Language tag format. Indicates desired locale of return values. | en-US                                                                               |