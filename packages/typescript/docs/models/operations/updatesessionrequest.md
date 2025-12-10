# UpdateSessionRequest

## Example Usage

```typescript
import { UpdateSessionRequest } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: UpdateSessionRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  sessionUpdate: {
    event: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    title: "Day 1 Keynote Session",
    code: "R5NP4NJYB3D",
    category: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      name: "Sample Object name",
    },
    type: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      code: "MU",
      name: "Meet up",
    },
    location: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    description:
      "Keynote session to kick off the event. The dynamic and energetic Dr. Smith will be speaking about the industry.",
    start: new Date("2020-02-03T13:00:00.000Z"),
    end: new Date("2020-02-07T17:00:00.000Z"),
    status: "Active",
    automaticallyOpensOn: new RFCDate("2022-08-01"),
    automaticallyClosesOn: new RFCDate("2022-08-12"),
    enableWaitlist: false,
    waitlistCapacity: 100,
    enableWaitlistVirtual: true,
    capacity: 150,
    capacityUnlimited: false,
    capacityVirtual: 150,
    virtualCapacityUnlimited: false,
    waitlistCapacityVirtual: 150,
    featured: true,
    group: "b0cd3bac-0565-4593-be6e-5333753a6c25",
    admissionItems: [
      "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    ],
    openForRegistration: false,
    openForAttendeeHub: true,
    registrationTypes: [
      "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    ],
    presentationType: "Power Point",
    dataTagCode: "Optional Session",
    order: 1,
  },
};
```

## Fields

| Field                                                                                                                                                                                                | Type                                                                                                                                                                                                 | Required                                                                                                                                                                                             | Description                                                                                                                                                                                          | Example                                                                                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                 | *string*                                                                                                                                                                                             | :heavy_check_mark:                                                                                                                                                                                   | Unique Id of a session                                                                                                                                                                               | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                                                                                                                                 |
| `sessionUpdate`                                                                                                                                                                                      | [components.SessionUpdate](../../models/components/sessionupdate.md)                                                                                                                                 | :heavy_check_mark:                                                                                                                                                                                   | Contains values that you'll update the session with.<br/>Passing a null value in a field renders the field blank.<br/>Omitting a field from the request body renders the field blank<br/>on the session record.<br/> |                                                                                                                                                                                                      |