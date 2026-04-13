# MeetingRequestPaginatedResponse

Paginated collection of meeting requests.

## Example Usage

```typescript
import { MeetingRequestPaginatedResponse } from "@cvent/sdk/models/components";

let value: MeetingRequestPaginatedResponse = {
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
      id: "017f1149-0f3a-4531-b1aa-6f66a6cb04f3",
      name: "Limited MR",
      status: "Submitted to Accounting",
      statusNote:
        "The status indicates that the request is submitted to accounting",
      meetingRequestForm: {
        name: "Annual Sales Meeting Request Form",
      },
      questions: [
        {
          id: "f1ea56cd-6860-4f1a-baf7-973118384384",
          name: "What is your favorite color?",
          type: "SingleSelect",
          value: [
            "Green",
          ],
          answerType: "Other",
          secondaryValue: "The other answer for the question.",
          compositeValue: [],
        },
      ],
      sourceId: "sourceId12",
      code: "VPNH3JGMTND",
      archiveDate: "2017-01-02T02:00:00Z",
    },
  ],
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `paging`                                                                 | [components.PagingJson](../../models/components/pagingjson.md)           | :heavy_check_mark:                                                       | Represents pagination information for a collection of resources.         |
| `data`                                                                   | [components.MeetingRequest](../../models/components/meetingrequest.md)[] | :heavy_check_mark:                                                       | Collection of meeting request objects.                                   |