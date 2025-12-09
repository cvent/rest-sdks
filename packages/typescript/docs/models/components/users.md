# Users

A page in a paginated list of SCIM users. This would return the list of users.

## Example Usage

```typescript
import { Users } from "@cvent/sdk/models/components";

let value: Users = {
  schemas: [
    "urn:ietf:params:scim:schemas:core:2.0:User",
  ],
  itemsPerPage: 50,
  startIndex: 1,
  totalResults: 5,
  resources: [
    {
      schemas: [
        "urn:ietf:params:scim:api:messages:2.0:ListResponse",
      ],
      id: "3b2359a7-4583-40ed-8afd-67e5f15373d3",
      name: {
        givenName: "Mike",
        familyName: "Stuart",
        middleName: "A",
        honorificPrefix: "Mr.",
      },
      userName: "aMike@test.com",
      emails: [],
      title: "Vice President",
      phoneNumbers: [
        {
          type: "work",
          value: "+911234567890",
        },
      ],
      addresses: [
        {
          type: "work",
          streetAddress: "100 Universal City Plaza",
          locality: "Hollywood",
          region: "CA",
          postalCode: "91608",
          country: "USA",
          primary: true,
        },
      ],
      userType: "Planner Account User",
      locale: "en-US",
      groups: [
        {
          value: "3b2359a7-4583-40ed-8afd-67e5f15373d3",
          display: "Admin",
        },
      ],
      urnIetfParamsScimSchemasExtensionEnterprise20User: {
        federatedId: "AKJU783UP",
        company: "Cvent",
        workFax: "+1123456",
        homeFax: "+1123456",
        pager: "+1123456",
      },
      meta: {
        resourceType: "user",
        location: "https://<account>/scim/v2/Users/2",
        created: new Date("2021-12-16T00:59:14.570Z"),
        lastModified: new Date("2021-12-16T00:59:14.570Z"),
      },
    },
  ],
};
```

## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `schemas`                                                    | *string*[]                                                   | :heavy_minus_sign:                                           | The collection of user schemas.                              |                                                              |
| `itemsPerPage`                                               | *number*                                                     | :heavy_minus_sign:                                           | The number of users per page.                                | 50                                                           |
| `startIndex`                                                 | *number*                                                     | :heavy_minus_sign:                                           | Starting index of the response.                              | 1                                                            |
| `totalResults`                                               | *number*                                                     | :heavy_minus_sign:                                           | The total count of users.                                    | 5                                                            |
| `resources`                                                  | [components.UserJson](../../models/components/userjson.md)[] | :heavy_minus_sign:                                           | The collection of user resources.                            |                                                              |