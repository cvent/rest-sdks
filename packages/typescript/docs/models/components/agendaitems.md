# AgendaItems

The agenda items with all agenda items and additional details

## Example Usage

```typescript
import { AgendaItems } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: AgendaItems = {
  items: [
    {
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
    },
  ],
  roomRequirementsMet: true,
  responseNotes: "We cannot accommodate agenda items starting before 8am.",
};
```

## Fields

| Field                                                                                                           | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     | Example                                                                                                         |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `items`                                                                                                         | [components.AgendaItem](../../models/components/agendaitem.md)[]                                                | :heavy_minus_sign:                                                                                              | The list of agenda items.                                                                                       |                                                                                                                 |
| `requiredRoomSizeUnits`                                                                                         | [components.MeasurementUnit](../../models/components/measurementunit.md)                                        | :heavy_minus_sign:                                                                                              | Unit of measurement for area or space.<br/><br/>Values:<br/>- `SQUARE_FEET` — Square Feet<br/>- `SQUARE_METERS` — Square Meters |                                                                                                                 |
| `roomRequirementsMet`                                                                                           | *boolean*                                                                                                       | :heavy_minus_sign:                                                                                              | True indicates room requirements are met.                                                                       | true                                                                                                            |
| `responseNotes`                                                                                                 | *string*                                                                                                        | :heavy_minus_sign:                                                                                              | Response notes from the venue.                                                                                  | We cannot accommodate agenda items starting before 8am.                                                         |