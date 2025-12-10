# GetEmailsHistoryResponse

## Example Usage

```typescript
import { GetEmailsHistoryResponse } from "@cvent/sdk/models/operations";

let value: GetEmailsHistoryResponse = {
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
        id: "kn4rznpgm2cx43-qx47948p",
        event: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        contact: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        attendee: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        subject: "Event Invitation",
        from: "example@example.com",
        to: "example@example.com",
        type: "Invitation",
        sent: new Date("2017-01-02T02:30:00Z"),
        status: "Sent",
        undeliverable: false,
        opened: false,
        firstOpened: new Date("2017-01-02T02:30:00Z"),
        clicked: false,
        firstClicked: new Date("2017-01-02T02:30:00Z"),
        bounced: false,
      },
    ],
  },
};
```

## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `result`                                                                                             | [components.EmailHistoryPaginatedResponse](../../models/components/emailhistorypaginatedresponse.md) | :heavy_check_mark:                                                                                   | N/A                                                                                                  |