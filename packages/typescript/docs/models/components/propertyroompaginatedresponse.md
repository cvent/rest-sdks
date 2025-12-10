# PropertyRoomPaginatedResponse

A list of property sleeping rooms.

## Example Usage

```typescript
import { PropertyRoomPaginatedResponse } from "@cvent/sdk/models/components";

let value: PropertyRoomPaginatedResponse = {
  paging: {
    previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
    nextToken: "1a2b3c4d5e6f7g8h9i10j11k",
    currentToken: "1a2b3c4d5e6f7g8h9i10j11k",
    limit: 100,
    totalCount: 2,
    links: {
      next: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      self: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      prev: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
    },
  },
  data: [
    {
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      name: "Standard",
      code: "std",
      property: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      bedTypeCode: "queen",
      numberOfBeds: 2,
      capacity: 6,
      description: "A standard room with two queen beds.",
      externalCodes: [
        {
          type: "galileo_gds",
          roomCode: "std887",
        },
      ],
    },
  ],
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [components.PagingJson](../../models/components/pagingjson.md)       | :heavy_minus_sign:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | [components.PropertyRoom](../../models/components/propertyroom.md)[] | :heavy_minus_sign:                                                   | Collection of property rooms and related details.                    |