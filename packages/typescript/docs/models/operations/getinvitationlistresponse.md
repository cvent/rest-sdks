# GetInvitationListResponse

## Example Usage

```typescript
import { GetInvitationListResponse } from "@cvent/sdk/models/operations";

let value: GetInvitationListResponse = {
  result: {
    paging: {
      nextToken: "3b2359a7-4583-40ed-8afd-67e5f15373d3",
      currentToken: "90c5f062-76ad-4ea4-aa53-00eb698d9262",
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
        id: "a150f1ee-6c54-4b01-90e6-d701748f0851",
        name: "Invitation List",
        locale: "en-US",
        default: true,
      },
    ],
  },
};
```

## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `result`                                                                                                 | [components.InvitationListPaginatedResponse](../../models/components/invitationlistpaginatedresponse.md) | :heavy_check_mark:                                                                                       | N/A                                                                                                      |