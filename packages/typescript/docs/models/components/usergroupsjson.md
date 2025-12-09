# UserGroupsJson

A paginated result for a list of user groups.

## Example Usage

```typescript
import { UserGroupsJson } from "@cvent/sdk/models/components";

let value: UserGroupsJson = {
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
      id: "EBF2273A-35A5-BD67-A292-397539D13270",
      name: "MyUserGroup",
      description: "MyUserGroupDescription",
    },
  ],
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `paging`                                                               | [components.PagingJson](../../models/components/pagingjson.md)         | :heavy_check_mark:                                                     | Represents pagination information for a collection of resources.       |
| `data`                                                                 | [components.UserGroupJson](../../models/components/usergroupjson.md)[] | :heavy_check_mark:                                                     | The list of user groups retrieved for the specified page.              |