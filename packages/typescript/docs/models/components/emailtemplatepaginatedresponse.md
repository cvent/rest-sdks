# EmailTemplatePaginatedResponse

The response from a request to get the list of email templates. This includes the paging object as well as the collection of email template.

## Example Usage

```typescript
import { EmailTemplatePaginatedResponse } from "@cvent/sdk/models/components";

let value: EmailTemplatePaginatedResponse = {
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
  data: [],
};
```

## Fields

| Field                                                                                                                   | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `paging`                                                                                                                | [components.PagingJson](../../models/components/pagingjson.md)                                                          | :heavy_check_mark:                                                                                                      | Represents pagination information for a collection of resources.                                                        |
| `data`                                                                                                                  | [components.EmailTemplateDataJson](../../models/components/emailtemplatedatajson.md)[]                                  | :heavy_check_mark:                                                                                                      | A list of all email templates data for an unique campaign that will help the planner to select specific email and send. |