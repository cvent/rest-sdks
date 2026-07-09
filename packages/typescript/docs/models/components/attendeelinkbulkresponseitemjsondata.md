# AttendeeLinkBulkResponseItemJsonData


## Supported Types

### `components.ExistingAttendeeLink`

```typescript
const value: components.ExistingAttendeeLink = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  webcast: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  event: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  attendee: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  sourceId: "kBBBAAcccdddd8U==",
  join: {
    href: "https://cvent.zoom.us/j/7566652259",
    code: "1456ZS78",
  },
  id: "61120b74-0905-4aaf-9343-8fc2d7e0b430",
};
```

### `components.ErrorResponse`

```typescript
const value: components.ErrorResponse = {
  code: 400,
  message: "Bad Request",
  target: "example target",
  details: [
    {
      code: 400,
      message: "Bad Request",
      target: "example target",
    },
  ],
};
```

