# LegDetailJson

Representation of a leg detail in air request.

## Example Usage

```typescript
import { LegDetailJson } from "@cvent/sdk/models/components";

let value: LegDetailJson = {
  origin: "Delhi - Indira Gandhi Intl - (DEL)",
  destination: "Dubai - International (DXB)",
  date: new Date("2023-05-19T00:00:00"),
  time: "Morning",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `origin`                                                                                      | *string*                                                                                      | :heavy_minus_sign:                                                                            | Name of the airport where the flight of the passenger's journey originates.                   | Delhi - Indira Gandhi Intl - (DEL)                                                            |
| `destination`                                                                                 | *string*                                                                                      | :heavy_minus_sign:                                                                            | Name of the airport where the flight of the passenger's journey ends.                         | Dubai - International (DXB)                                                                   |
| `date`                                                                                        | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time (in UTC) of the flight origin.                                   | 2023-05-19T00:00:00                                                                           |
| `time`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | General time of day or specific time when the flight of the passenger's journey starts.       | Morning                                                                                       |