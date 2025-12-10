# GetChangeHistoryForASpecificContactResponse

## Example Usage

```typescript
import { GetChangeHistoryForASpecificContactResponse } from "@cvent/sdk/models/operations";

let value: GetChangeHistoryForASpecificContactResponse = {
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
        updatedFieldName: "Last Name",
        oldValue: "Wilson",
        newValue: "James",
        updatedThroughName: "Address Book Profile",
        updatedDate: new Date("2023-08-03T14:51:00.777Z"),
        updatedBy: "John Doe",
      },
    ],
  },
};
```

## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `result`                                                                                                 | [components.ContactHistoryPaginatedResponse](../../models/components/contacthistorypaginatedresponse.md) | :heavy_check_mark:                                                                                       | N/A                                                                                                      |