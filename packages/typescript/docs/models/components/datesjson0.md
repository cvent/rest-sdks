# DatesJson0

Dates on which event will occur.

## Example Usage

```typescript
import { DatesJson0 } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: DatesJson0 = {
  preferred: true,
  id: "50dc08af-24a9-4d01-84be-3d43133dc945",
  endDate: new RFCDate("2016-10-13"),
  startDate: new RFCDate("2016-10-15"),
  note: "Flexible dates",
};
```

## Fields

| Field                                            | Type                                             | Required                                         | Description                                      | Example                                          |
| ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ |
| `preferred`                                      | *boolean*                                        | :heavy_minus_sign:                               | True indicates these are preferred dates.        | true                                             |
| `id`                                             | *string*                                         | :heavy_minus_sign:                               | Unique identifier for dates.                     | 50dc08af-24a9-4d01-84be-3d43133dc945             |
| `endDate`                                        | [RFCDate](../../types/rfcdate.md)                | :heavy_minus_sign:                               | The ISO 8601 end date of the event.              | 2016-10-13                                       |
| `startDate`                                      | [RFCDate](../../types/rfcdate.md)                | :heavy_minus_sign:                               | The ISO 8601 start date of the event.            | 2016-10-15                                       |
| `note`                                           | *string*                                         | :heavy_minus_sign:                               | A note detailing the requirements for the dates. | Flexible dates                                   |