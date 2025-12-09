# TravelGroupAndMeetingJson

Group and meeting information.

## Example Usage

```typescript
import { TravelGroupAndMeetingJson } from "@cvent/sdk/models/components";

let value: TravelGroupAndMeetingJson = {
  runOfHouseRate: {
    seasonOne10To50People: 100,
    seasonOne51To100People: 200,
    seasonTwo10To50People: 300,
    seasonTwo51To100People: 400,
    seasonThree10To50People: 500,
    seasonThree51To100People: 600,
    seasonFour10To50People: 700,
    seasonFour51To100People: 800,
    seasonFive10To50People: 900,
    seasonFive51To100People: 1000,
  },
  dayDelegateRate: {
    fullDay10To50People: 100,
    fullDay51To100People: 200,
    halfDay10To50People: 50,
    halfDay51To100People: 100,
  },
  taxAndServiceCharge: {
    taxAmount: 0,
    serviceChargeAmount: 1,
  },
  meetingRoomBasicInformation: {
    largestMeetingRoom: 1000,
    unitOfMeasurement: "sq.ft.",
    meetingRooms: 10,
  },
  amenity: {
    lcdPrice: 100,
    screenPrice: 100,
    hsiaPrice: 100,
    whatCompanyProvidesAVEquipment: "Some company",
  },
  breakOutRoom: {
    price10PersonRoom: 100,
    price25PersonRoom: 100,
  },
};
```

## Fields

| Field                                                                                                             | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `runOfHouseRate`                                                                                                  | [components.TravelRunOfHouseRateJson](../../models/components/travelrunofhouseratejson.md)                        | :heavy_minus_sign:                                                                                                | Run of house rate information.                                                                                    |
| `dayDelegateRate`                                                                                                 | [components.TravelDayDelegateRateJson](../../models/components/traveldaydelegateratejson.md)                      | :heavy_minus_sign:                                                                                                | Day delegate rate information. This represents the costs for hosting meeting at the venue for a half or full day. |
| `taxAndServiceCharge`                                                                                             | [components.TravelTaxAndServiceChargeJson](../../models/components/traveltaxandservicechargejson.md)              | :heavy_minus_sign:                                                                                                | Tax and service charge information.                                                                               |
| `meetingRoomBasicInformation`                                                                                     | [components.TravelMeetingRoomBasicInfoJson](../../models/components/travelmeetingroombasicinfojson.md)            | :heavy_minus_sign:                                                                                                | Meeting room basic information.                                                                                   |
| `amenity`                                                                                                         | [components.TravelAmenityJson](../../models/components/travelamenityjson.md)                                      | :heavy_minus_sign:                                                                                                | Group and meeting amenity info.                                                                                   |
| `breakOutRoom`                                                                                                    | [components.TravelBreakOutRoomJson](../../models/components/travelbreakoutroomjson.md)                            | :heavy_minus_sign:                                                                                                | Break-out room information.                                                                                       |