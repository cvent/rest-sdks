# TravelDetailsJson

Common object that holds travel details information.

## Example Usage

```typescript
import { TravelDetailsJson } from "@cvent/sdk/models/components";

let value: TravelDetailsJson = {
  arrival: {
    time: new Date("2024-12-01T00:00:00Z"),
    carrier: "JBU",
    carrierNumber: "12345",
  },
  departure: {
    time: new Date("2024-12-01T00:00:00Z"),
    carrier: "JBU",
    carrierNumber: "12345",
  },
  additionalInformation: "Additional Information",
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    | Example                                                                                        |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `arrival`                                                                                      | [components.TravelDepartureArrivalJson](../../models/components/traveldeparturearrivaljson.md) | :heavy_minus_sign:                                                                             | Common object that holds travel departure/arrival information.                                 |                                                                                                |
| `departure`                                                                                    | [components.TravelDepartureArrivalJson](../../models/components/traveldeparturearrivaljson.md) | :heavy_minus_sign:                                                                             | Common object that holds travel departure/arrival information.                                 |                                                                                                |
| `additionalInformation`                                                                        | *string*                                                                                       | :heavy_minus_sign:                                                                             | Additional information about travel.                                                           | Additional Information                                                                         |