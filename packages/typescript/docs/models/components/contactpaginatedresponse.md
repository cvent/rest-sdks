# ContactPaginatedResponse

The response from a request to get the list of contacts.  This includes the paging object as well as the collection of contacts.

## Example Usage

```typescript
import { ContactPaginatedResponse } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: ContactPaginatedResponse = {
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
      firstName: "Henry",
      lastName: "Potterfield",
      middleName: "A",
      nickname: "Harry",
      email: "h.potterfield@test.com",
      ccEmail: "h.porter@tesing.com",
      gender: "Male",
      company: "Cvent Inc.",
      designation: "CPA",
      title: "Event Planner",
      type: {
        id: "861B51EC-AA7E-475F-B38D-4C8E35C47D63",
        name: "VIP Member",
      },
      membership: {
        type: "Corporate Sponsor",
        plan: "Gold Level",
        joined: new RFCDate("2017-02-10"),
        expiration: new RFCDate("2020-02-09"),
        lastRenewal: new RFCDate("2019-02-08"),
        amountDue: 50.5,
        listInDirectory: false,
      },
      primaryAddressType: "Home",
      homeAddress: {
        address1: "Cvent Inc.",
        address2: "4001 West Parmer Lane",
        address3: "PO Box 123",
        city: "Austin",
        countryCode: "US",
        postalCode: "78727",
        region: "Texas",
        regionCode: "TX",
        country: "United States of America",
      },
      homePhone: "555-555-5555",
      homeFax: "555-555-5555",
      workAddress: {
        address1: "Cvent Inc.",
        address2: "4001 West Parmer Lane",
        address3: "PO Box 123",
        city: "Austin",
        countryCode: "US",
        postalCode: "78727",
        region: "Texas",
        regionCode: "TX",
        country: "United States of America",
      },
      workPhone: "555-555-5555",
      workFax: "555-555-5555",
      customFields: [
        {
          id: "a3572698-a615-4f55-a7a1-b30b588e81fa",
          name: "What is a your favorite color?",
          type: "General",
          value: [
            "Choice C",
            "Choice A",
          ],
          order: 1,
        },
      ],
      sourceId: "system-a-00000000-0000-0000-0000-000000000000",
      mobilePhone: "555-555-5555",
      compliance: [
        {
          creationTime: new Date("2021-03-08T17:30:01.727Z"),
          complianceScope: "CCPA",
          action: "DO_NOT_SELL",
          createdBy: "PLANNER",
        },
      ],
      prefix: "Mr.",
      pager: "555-555-5555",
      optOut: {
        date: new Date("2019-02-12T03:00:00Z"),
        by: "Account User",
      },
      npi: "5555555555",
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
      dateOfBirth: new RFCDate("1990-01-01"),
      passport: {
        number: "123456789",
        country: "United Kingdom",
        countryCode: "GB",
      },
      socialSecurityNumber: "123-45-6789",
      nationalIdentificationNumber: "123456789",
      headline:
        "Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands",
      personalWebsite: "https://www.example.com",
      biography:
        "I am a marketing professional with experience in event planning and brand strategy.",
      pronouns: "he/him/she/her/they/them",
    },
  ],
};
```

## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [components.PagingJson](../../models/components/pagingjson.md)   | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | [components.ZeroAllOf7](../../models/components/zeroallof7.md)[] | :heavy_check_mark:                                               | Collection of contacts.                                          |