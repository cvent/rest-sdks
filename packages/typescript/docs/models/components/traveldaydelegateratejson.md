# TravelDayDelegateRateJson

Day delegate rate information. This represents the costs for hosting meeting at the venue for a half or full day.

## Example Usage

```typescript
import { TravelDayDelegateRateJson } from "@cvent/sdk/models/components";

let value: TravelDayDelegateRateJson = {
  fullDay10To50People: 100,
  fullDay51To100People: 200,
  halfDay10To50People: 50,
  halfDay51To100People: 100,
};
```

## Fields

| Field                                        | Type                                         | Required                                     | Description                                  | Example                                      |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| `fullDay10To50People`                        | *number*                                     | :heavy_minus_sign:                           | Full day delegate rate for 10 to 50 people.  | 100                                          |
| `fullDay51To100People`                       | *number*                                     | :heavy_minus_sign:                           | Full day delegate rate for 51 to 100 people. | 200                                          |
| `halfDay10To50People`                        | *number*                                     | :heavy_minus_sign:                           | Half day delegate rate for 10 to 50 people.  | 50                                           |
| `halfDay51To100People`                       | *number*                                     | :heavy_minus_sign:                           | Half day delegate rate for 51 to 100 people. | 100                                          |