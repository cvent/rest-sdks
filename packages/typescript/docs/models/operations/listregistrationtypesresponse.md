# ListRegistrationTypesResponse

## Example Usage

```typescript
import { ListRegistrationTypesResponse } from "@cvent/sdk/models/operations";

let value: ListRegistrationTypesResponse = {
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
        name: "Member",
        code: "MemberCode",
        description: "Registration type assigned to invitees who are members",
        virtual: true,
        openForRegistration: true,
        automaticOpenDate: new Date("2017-01-02T02:00:00Z"),
        automaticEndDate: new Date("2017-01-02T02:00:00Z"),
        event: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        capacity: {
          remaining: 100,
          consumed: 100,
          total: 100,
        },
        registrationPath: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
      },
    ],
  },
};
```

## Fields

| Field                                                                                                        | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `result`                                                                                                     | [components.RegistrationTypePaginatedResponse](../../models/components/registrationtypepaginatedresponse.md) | :heavy_check_mark:                                                                                           | N/A                                                                                                          |