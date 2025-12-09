# UpdateEventRequest

## Example Usage

```typescript
import { UpdateEventRequest } from "@cvent/sdk/models/operations";

let value: UpdateEventRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  eventUpdate: {
    title: "Cvent Connect 2020",
    format: "Virtual",
    description: "Cvent annual user conference.",
    start: new Date("2020-02-03T13:00:00.000Z"),
    end: new Date("2020-02-07T17:00:00.000Z"),
    closeAfter: new Date("2020-02-01T23:59:00.000Z"),
    archiveAfter: new Date("2020-05-07T12:00:00.000Z"),
    timezone: "America/New_York",
    venues: [
      {
        name: "Capital Convention Center",
        address: {
          address1: "Cvent Inc.",
          address2: "4001 West Parmer Lane",
          address3: "PO Box 123",
          city: "Austin",
          countryCode: "US",
          postalCode: "78727",
          regionCode: "TX",
        },
      },
    ],
    note: "This event will need some coordination with external systems.",
    languages: [
      "en-US",
    ],
    capacity: 50,
    planners: [
      {
        prefix: "Dr.",
        firstName: "Henry",
        lastName: "Smith",
        company: "Cvent Inc",
        title: "Event Planner",
        email: "hsmith@example.com",
      },
    ],
    type: "Conference",
  },
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                | Example                                                                    |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `id`                                                                       | *string*                                                                   | :heavy_check_mark:                                                         | Unique ID of an event.                                                     | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                       |
| `eventUpdate`                                                              | [components.EventUpdateInput](../../models/components/eventupdateinput.md) | :heavy_check_mark:                                                         | Event update details.                                                      |                                                                            |