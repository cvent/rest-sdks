# TravelDepartureArrivalJson

Common object that holds travel departure/arrival information.

## Example Usage

```typescript
import { TravelDepartureArrivalJson } from "@cvent/sdk/models/components";

let value: TravelDepartureArrivalJson = {
  time: new Date("2024-12-01T00:00:00Z"),
  carrier: "JBU",
  carrierNumber: "12345",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `time`                                                                                        | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 formatted date.                                                                  | 2024-12-01T00:00:00Z                                                                          |
| `carrier`                                                                                     | *string*                                                                                      | :heavy_minus_sign:                                                                            | ICAO code.                                                                                    | JBU                                                                                           |
| `carrierNumber`                                                                               | *string*                                                                                      | :heavy_minus_sign:                                                                            | Carrier number.                                                                               | 12345                                                                                         |