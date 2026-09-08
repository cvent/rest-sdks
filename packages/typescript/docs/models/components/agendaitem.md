# AgendaItem

The agenda item

## Example Usage

```typescript
import { AgendaItem } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: AgendaItem = {
  name: "Cvent Connect Intro",
  number: 1,
  startTime: new Date("2021-01-13T14:06:20.080Z"),
  endTime: new Date("2021-01-13T14:06:20.080Z"),
  requiredRoomSize: 100,
  expectedNumberOfPeople: 500,
  roomInfoRequired: true,
  roomHoldRequired: true,
  twentyFourHourHoldRequired: true,
  locatedAtPrimeEventVenue: true,
  days: [
    {
      dayNumber: 1,
      date: new RFCDate("2021-07-03"),
    },
  ],
  roomOptedOut: true,
  audioVideoNeeds: "Audio",
  notes: "Video is good to have for this event.",
  meetingRoom: [
    {
      name: "Conference Room A",
      notes: "This meeting room has the best audio quality.",
    },
  ],
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `name`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | The name of the agenda item.                                                                  | Cvent Connect Intro                                                                           |
| `number`                                                                                      | *number*                                                                                      | :heavy_minus_sign:                                                                            | Sequence of the agenda item.                                                                  | 1                                                                                             |
| `type`                                                                                        | [components.AgendaItemType1](../../models/components/agendaitemtype1.md)                      | :heavy_minus_sign:                                                                            | The type of Agenda                                                                            |                                                                                               |
| `setup`                                                                                       | [components.AgendaItemSetup1](../../models/components/agendaitemsetup1.md)                    | :heavy_minus_sign:                                                                            | The setup of the Agenda                                                                       |                                                                                               |
| `sessionType`                                                                                 | [components.SessionType](../../models/components/sessiontype.md)                              | :heavy_minus_sign:                                                                            | The session type.                                                                             |                                                                                               |
| `startTime`                                                                                   | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The start time of the event.                                                                  | 2021-01-13T14:06:20.080Z                                                                      |
| `endTime`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The end time of the event.                                                                    | 2021-01-13T14:06:20.080Z                                                                      |
| `requiredRoomSize`                                                                            | *number*                                                                                      | :heavy_minus_sign:                                                                            | Required size of the room.                                                                    | 100                                                                                           |
| `expectedNumberOfPeople`                                                                      | *number*                                                                                      | :heavy_minus_sign:                                                                            | The expected number of people attending this agenda item.                                     | 500                                                                                           |
| `roomInfoRequired`                                                                            | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates room information is required.                                                  | true                                                                                          |
| `roomHoldRequired`                                                                            | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates room hold is required.                                                         | true                                                                                          |
| `twentyFourHourHoldRequired`                                                                  | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates room hold is required for twenty four hours.                                   | true                                                                                          |
| `locatedAtPrimeEventVenue`                                                                    | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates it is located at prime event venue.                                            | true                                                                                          |
| `meal`                                                                                        | [components.RfpMealType](../../models/components/rfpmealtype.md)                              | :heavy_minus_sign:                                                                            | The meal types offered through an RFP                                                         |                                                                                               |
| `days`                                                                                        | [components.Day](../../models/components/day.md)[]                                            | :heavy_minus_sign:                                                                            | Number of days for agenda.                                                                    |                                                                                               |
| `roomOptedOut`                                                                                | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates room is opted out.                                                             | true                                                                                          |
| `audioVideoNeeds`                                                                             | *string*                                                                                      | :heavy_minus_sign:                                                                            | The audio video requirement for the agenda item.                                              | Audio                                                                                         |
| `notes`                                                                                       | *string*                                                                                      | :heavy_minus_sign:                                                                            | Additional note for the agenda item.                                                          | Video is good to have for this event.                                                         |
| `meetingRoom`                                                                                 | [components.MeetingRoom](../../models/components/meetingroom.md)[]                            | :heavy_minus_sign:                                                                            | List of meeting rooms.                                                                        |                                                                                               |