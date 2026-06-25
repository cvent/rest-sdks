# RfpEvent

RFP event details.

## Example Usage

```typescript
import { RfpEvent } from "@cvent/sdk/models/components";

let value: RfpEvent = {
  event: {
    id: "50dc08af-24a9-4d01-84be-3d43133dc945",
  },
  name: "friday event",
  contractSignatureLocation: "Atlanta",
  destinationsUnderConsideration: "New York",
  externalMeetingRequest: true,
  audioVisualNeeds: "Need a projector in each meeting room.",
  peakMeetingRooms: 14,
  attendeesPerDay: 500,
  referenceNumber: "XVYMP8970S",
  meetingRequestId: "50dc08af-24a9-4d01-84be-3d43133dc945",
  virtualAttendeesPerDay: 2000,
  budget: 10000,
  roomRateBudget: 200,
  foodBeverageBudget: 1000,
};
```

## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   | Example                                                                       |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `event`                                                                       | [components.Event12](../../models/components/event12.md)                      | :heavy_minus_sign:                                                            | Event details.                                                                |                                                                               |
| `name`                                                                        | *string*                                                                      | :heavy_minus_sign:                                                            | Name of the event linked with the RFP.                                        | friday event                                                                  |
| `contractSignatureLocation`                                                   | *string*                                                                      | :heavy_minus_sign:                                                            | Location where the contract will be signed.                                   | Atlanta                                                                       |
| `destinationsUnderConsideration`                                              | *string*                                                                      | :heavy_minus_sign:                                                            | Destinations under consideration for the event.                               | New York                                                                      |
| `externalMeetingRequest`                                                      | *boolean*                                                                     | :heavy_minus_sign:                                                            | True indicates that the event is associated with an external meeting request. | true                                                                          |
| `type`                                                                        | [components.EventType1](../../models/components/eventtype1.md)                | :heavy_minus_sign:                                                            | Event type.                                                                   |                                                                               |
| `totalMeetingSpaceRequired`                                                   | [components.SpaceArea](../../models/components/spacearea.md)                  | :heavy_minus_sign:                                                            | Space area divisons.                                                          |                                                                               |
| `audioVisualNeeds`                                                            | *string*                                                                      | :heavy_minus_sign:                                                            | Audio visual requirements.                                                    | Need a projector in each meeting room.                                        |
| `peakMeetingRooms`                                                            | *number*                                                                      | :heavy_minus_sign:                                                            | Maximum number of meeting rooms required during the event.                    | 14                                                                            |
| `flexibleDates`                                                               | *boolean*                                                                     | :heavy_minus_sign:                                                            | True indicates the event dates are flexible.                                  |                                                                               |
| `repeat`                                                                      | *boolean*                                                                     | :heavy_minus_sign:                                                            | True indicates event is a repeat occurrence.                                  |                                                                               |
| `attendeesPerDay`                                                             | *number*                                                                      | :heavy_minus_sign:                                                            | Number of in-person attendees per day.                                        | 500                                                                           |
| `referenceNumber`                                                             | *string*                                                                      | :heavy_minus_sign:                                                            | Reference number for the event.                                               | XVYMP8970S                                                                    |
| `largestMeetingSpaceRequired`                                                 | [components.SpaceArea](../../models/components/spacearea.md)                  | :heavy_minus_sign:                                                            | Space area divisons.                                                          |                                                                               |
| `meetingRequestId`                                                            | *string*                                                                      | :heavy_minus_sign:                                                            | Unique identifier for meeting request associated with the event.              | 50dc08af-24a9-4d01-84be-3d43133dc945                                          |
| `formatType`                                                                  | [components.EventFormatType](../../models/components/eventformattype.md)      | :heavy_minus_sign:                                                            | Event format type.                                                            |                                                                               |
| `virtualAttendeesPerDay`                                                      | *number*                                                                      | :heavy_minus_sign:                                                            | Number of virtual attendees per day.                                          | 2000                                                                          |
| `budget`                                                                      | *number*                                                                      | :heavy_minus_sign:                                                            | Total budget amount.                                                          | 10000                                                                         |
| `roomRateBudget`                                                              | *number*                                                                      | :heavy_minus_sign:                                                            | Budget for rooms rates.                                                       | 200                                                                           |
| `foodBeverageBudget`                                                          | *number*                                                                      | :heavy_minus_sign:                                                            | Budget for food and beverage.                                                 | 1000                                                                          |