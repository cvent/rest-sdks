# ListMeetingRequestDocumentsResponse

## Example Usage

```typescript
import { ListMeetingRequestDocumentsResponse } from "@cvent/sdk/models/operations";

let value: ListMeetingRequestDocumentsResponse = {
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
        id: "675b5db9-a3ac-474d-b9dc-cfc2c7b2ff7f",
        name: "Agenda",
        size: 204800,
        uploaded: new Date("2024-06-15T13:45:30Z"),
        uploadedBy: "John Doe",
        lastModified: new Date("2024-10-12T03:00:00Z"),
        lastModifiedBy: "John Doe",
        mimeType: "application/pdf",
        referenceLink: {
          url:
            "https://custom.cvent.com/4B31940730B6475A8D6A7785748A67EE/files/smm/8cfc2168a00342f5ba9e13f7a808df8e/78ce60fbf1da4cf5af139a65f59aed60.pdf",
          expiration: new Date("2025-12-31T23:59:59Z"),
        },
      },
    ],
  },
};
```

## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `result`                                                                                                                 | [components.MeetingRequestDocumentPaginatedResponse](../../models/components/meetingrequestdocumentpaginatedresponse.md) | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |