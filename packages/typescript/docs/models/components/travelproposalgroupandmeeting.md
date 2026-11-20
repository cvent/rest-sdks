# TravelProposalGroupAndMeeting

The group and meeting information of the proposal.

## Example Usage

```typescript
import { TravelProposalGroupAndMeeting } from "@cvent/sdk/models/components";

let value: TravelProposalGroupAndMeeting = {
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
    whatCompanyProvidesAVEquipment: "Example AV Services",
  },
  breakOutRoom: {
    price10PersonRoom: 100,
    price25PersonRoom: 100,
  },
};
```

## Fields

| Field                                                                                                                                                      | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `runOfHouseRate`                                                                                                                                           | [components.TravelProposalGroupAndMeetingRunOfHouseRate](../../models/components/travelproposalgroupandmeetingrunofhouserate.md)                           | :heavy_minus_sign:                                                                                                                                         | The run of house rates of the proposal.                                                                                                                    |
| `dayDelegateRate`                                                                                                                                          | [components.TravelProposalGroupAndMeetingDayDelegateRate](../../models/components/travelproposalgroupandmeetingdaydelegaterate.md)                         | :heavy_minus_sign:                                                                                                                                         | The day delegate rates of the proposal. A day delegate rate is the cost to host a meeting at the venue for a half day or a full day.                       |
| `taxAndServiceCharge`                                                                                                                                      | [components.TravelProposalGroupAndMeetingTaxAndServiceCharge](../../models/components/travelproposalgroupandmeetingtaxandservicecharge.md)                 | :heavy_minus_sign:                                                                                                                                         | The tax and service charge information of the proposal.                                                                                                    |
| `meetingRoomBasicInformation`                                                                                                                              | [components.TravelProposalGroupAndMeetingMeetingRoomBasicInformation](../../models/components/travelproposalgroupandmeetingmeetingroombasicinformation.md) | :heavy_minus_sign:                                                                                                                                         | The basic information about the meeting rooms of the property.                                                                                             |
| `amenity`                                                                                                                                                  | [components.TravelProposalGroupAndMeetingAmenity](../../models/components/travelproposalgroupandmeetingamenity.md)                                         | :heavy_minus_sign:                                                                                                                                         | The group and meeting amenities of the proposal.                                                                                                           |
| `breakOutRoom`                                                                                                                                             | [components.TravelProposalGroupAndMeetingBreakOutRoom](../../models/components/travelproposalgroupandmeetingbreakoutroom.md)                               | :heavy_minus_sign:                                                                                                                                         | The break-out room information of the proposal.                                                                                                            |