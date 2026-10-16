# AccountUsers

A paginated result for a list of account users.

## Example Usage

```typescript
import { AccountUsers } from "@cvent/sdk/models/components";

let value: AccountUsers = {
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
      id: "501fbc6a-cfd4-468f-a2f7-14e521d33c71",
      platformUserId: "00ad83olslLwIeKcW1m8",
      username: "jsmith@example.com",
      federatedSsoLoginName: "jsmith@example.com",
      contact: {
        honorificPrefix: "Mr.",
        firstName: "Jack",
        middleName: "John",
        lastName: "Tripper",
        title: "Senior Software Engineer",
        organization: "Cvent",
        email: "jack.tripper@example.com",
        homePhone: "+17035551234",
        homeFax: "+17035551234",
        mobilePhone: "+17035551234",
        workPhone: "+17035551234",
        workFax: "+17035551234",
        pager: "+17035551234",
        address: {
          address1: "1765 Greensboro Station Pl",
          address2: "7th Floor",
          address3: "",
          city: "McLean",
          countryCode: "US",
          regionCode: "VA",
          postalCode: "22102",
        },
      },
      locale: "en-US",
      timezone: "America/New_York",
      active: false,
      usernameVerified: true,
      emailVerified: "VERIFIED",
      lockedOut: false,
      termsOfUseAccepted: true,
      failedLoginCount: 1,
      visibilityAccess: [],
      audit: {
        created: new Date("2017-01-02T02:00:00Z"),
        createdBy: "hporter",
        lastModified: new Date("2019-02-12T03:00:00Z"),
        lastModifiedBy: "hporter",
        lockedOutDate: new Date("2017-01-02T02:00:00Z"),
        termsOfUseAcceptedDate: new Date("2017-01-02T02:00:00Z"),
        lastLoginDate: new Date("2017-01-02T02:00:00Z"),
        passwordLastModifiedDate: new Date("2017-01-02T02:00:00Z"),
      },
      customFields: [
        {
          id: "a1b2c3d4-e5f6-7890-abcd-ef1234567890",
          name: "What is your favorite color?",
          type: "Choice - Multiple Answers",
          values: [
            "Choice C",
            "Choice A",
          ],
          order: 1,
        },
      ],
      role: {
        id: "946505f6-6b29-421a-bda2-0815fcdea73c",
      },
    },
  ],
};
```

## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `paging`                                                           | [components.Paging](../../models/components/paging.md)             | :heavy_check_mark:                                                 | Represents pagination information for a collection of resources.   |
| `data`                                                             | [components.AccountUser](../../models/components/accountuser.md)[] | :heavy_check_mark:                                                 | The list of Account Users retrieved for the specified page.        |