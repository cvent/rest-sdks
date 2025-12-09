# GetHubMembersResponse

## Example Usage

```typescript
import { GetHubMembersResponse } from "@cvent/sdk/models/operations";

let value: GetHubMembersResponse = {
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
        firstName: "Mateo",
        lastName: "Allende",
        prefix: "Dr.",
        designation: "White Wolf",
        jobTitle: "Director",
        companyName: "Cvent.inc",
        headline: "A visionary in the field of event planning.",
        pronouns: "she/her",
        socialMediaLinks: {
          facebookUrl: {
            href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
          },
          twitterUrl: {
            href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
          },
          linkedinUrl: {
            href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
          },
          websiteUrl: {
            href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
          },
        },
        profileImageUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        emailAddress: "abc@example.com",
        mobileNumber: "555-555-5555",
        workAddress: {
          city: "New York",
          state: "New York",
          country: "USA",
        },
        compliance: {
          creationTime: new Date("2021-03-08T17:30:01.727Z"),
          complianceScope: "CCPA",
          action: "DO_NOT_SELL",
          createdBy: "PLANNER",
        },
        locale: "en-US",
        registrationDate: new Date("2017-01-02T02:00:00Z"),
        lastLoginDate: new Date("2017-01-02T02:00:00Z"),
        id: "c764fb48-a62b-4c5f-b98f-01b5dae2c2ff",
      },
    ],
  },
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `result`                                                                                 | [components.PaginatedExistingMember](../../models/components/paginatedexistingmember.md) | :heavy_check_mark:                                                                       | N/A                                                                                      |