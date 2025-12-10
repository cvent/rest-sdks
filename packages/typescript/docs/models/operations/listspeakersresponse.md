# ListSpeakersResponse

## Example Usage

```typescript
import { ListSpeakersResponse } from "@cvent/sdk/models/operations";

let value: ListSpeakersResponse = {
  result: {
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
        event: {},
        firstName: "Barbra",
        lastName: "Smith",
        code: "sbarbra",
        email: "barbrasmith@cvent.com",
        prefix: "Dr.",
        designation: "PhD",
        company: "Cvent",
        title: "Lead Engineer",
        category: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          name: "Presenters",
        },
        links: {
          twitterUrl: {
            href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
          },
          facebookUrl: {
            href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
          },
          linkedInUrl: {
            href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
          },
          profilePicture: {
            href: "https://cvent.com/picture123",
          },
        },
        visibility: false,
        biography:
          "Presentation and Speaking voice expert, Barbara is a highly regarded coach and facilitator",
        internalNote: "Barbara is multilingual",
        relevance: 2.3,
        order: 1,
        contact: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
      },
    ],
  },
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `result`                                                                                   | [components.SpeakerPaginatedResponse](../../models/components/speakerpaginatedresponse.md) | :heavy_check_mark:                                                                         | N/A                                                                                        |