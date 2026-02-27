# MeetingRequestFormPaginatedResponse

The response from a request to get the list of meeting request forms. This includes the paging object as well as the collection of meeting request forms.

## Example Usage

```typescript
import { MeetingRequestFormPaginatedResponse } from "@cvent/sdk/models/components";

let value: MeetingRequestFormPaginatedResponse = {
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
      id: "9c97eb50-9f88-4972-a603-f617fc3258dd",
      name: "Request for Medical Meetups",
      statuses: [
        "Declined",
      ],
      active: true,
      questions: [
        {
          id: "9fd6648c-76eb-4d3c-b4c8-321205a6437a",
          name: "What is a your favorite color?",
          type: "MultiSelect",
          value: [
            "Choice C",
            "Choice A",
          ],
          order: 1,
          hidden: false,
          required: true,
          minLength: 0,
          maxLength: 100,
          minChoice: 0,
          maxChoice: 10,
          minDate: "1970-12-23",
          maxDate: "2100-12-31",
        },
      ],
    },
  ],
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `paging`                                                                         | [components.PagingJson](../../models/components/pagingjson.md)                   | :heavy_check_mark:                                                               | Represents pagination information for a collection of resources.                 |
| `data`                                                                           | [components.MeetingRequestForm](../../models/components/meetingrequestform.md)[] | :heavy_check_mark:                                                               | Collection of meeting request form objects.                                      |