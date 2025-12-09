# CustomFieldsPaginatedResponse

The response from a request to get the list of custom fields metadata.  This includes the paging object as well as the collection of custom fields metadata.

## Example Usage

```typescript
import { CustomFieldsPaginatedResponse } from "@cvent/sdk/models/components";

let value: CustomFieldsPaginatedResponse = {
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
      category: "Contact",
      name: "What is a your favorite color?",
      code: "FAVORITE_COLOR_CODE",
      type: "Open Ended Text - One Line",
      details: {
        choices: [
          {
            text: "What is your current designation?",
          },
        ],
      },
      order: 1,
      helpText: "Enter your favorite color.",
      defaultTagText: "Your Division",
    },
  ],
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `paging`                                                                           | [components.PagingJson](../../models/components/pagingjson.md)                     | :heavy_check_mark:                                                                 | Represents pagination information for a collection of resources.                   |
| `data`                                                                             | [components.ExistingCustomField](../../models/components/existingcustomfield.md)[] | :heavy_check_mark:                                                                 | Collection of custom fields.                                                       |