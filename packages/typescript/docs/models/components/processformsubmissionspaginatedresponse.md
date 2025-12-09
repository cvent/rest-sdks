# ProcessFormSubmissionsPaginatedResponse

The response from a request to get the list of process form submissions. This includes the paging object as well as the collection of process form submissions.

## Example Usage

```typescript
import { ProcessFormSubmissionsPaginatedResponse } from "@cvent/sdk/models/components";

let value: ProcessFormSubmissionsPaginatedResponse = {
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
      id: "f66a6cb0-4531-0f3a-cb1a-64f3017f1149",
      event: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      processForm: {
        id: "9c97eb50-9f88-4972-a603-f617fc3258dd",
      },
      status: "initialized",
      questions: [
        {
          id: "f1ea56cd-6860-4f1a-baf7-973118384384",
          name: "What is your favorite color?",
          type: "Currency",
          value: [
            "Green",
          ],
        },
      ],
    },
  ],
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `paging`                                                                                       | [components.PagingJson](../../models/components/pagingjson.md)                                 | :heavy_check_mark:                                                                             | Represents pagination information for a collection of resources.                               |
| `data`                                                                                         | [components.ProcessFormSubmissionJson](../../models/components/processformsubmissionjson.md)[] | :heavy_check_mark:                                                                             | Collection of process form submission objects.                                                 |