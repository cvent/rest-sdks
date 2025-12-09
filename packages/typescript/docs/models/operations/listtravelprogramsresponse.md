# ListTravelProgramsResponse

## Example Usage

```typescript
import { ListTravelProgramsResponse } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: ListTravelProgramsResponse = {
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
        created: new Date("2017-01-02T02:00:00Z"),
        createdBy: "hporter",
        lastModified: new Date("2019-02-12T03:00:00Z"),
        lastModifiedBy: "hporter",
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        name: "Test Program",
        contractPeriod: 2023,
        type: "corporate",
        format: "gbta2013",
        status: "complete",
        travelAccount: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        stayType: "daily",
        startDate: new RFCDate("2024-01-01"),
        endDate: new RFCDate("2024-12-31"),
        dueDate: new RFCDate("2023-11-13"),
        closeoutDate: new RFCDate("2023-11-13"),
        questions: [
          {
            questionId: "76c461cb-77f6-40b3-acc8-db44452f11c4",
            section: "program_client",
            required: true,
            sequence: 1,
          },
        ],
      },
    ],
  },
};
```

## Fields

| Field                                                                                                  | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `result`                                                                                               | [components.TravelProgramPaginatedResponse](../../models/components/travelprogrampaginatedresponse.md) | :heavy_check_mark:                                                                                     | N/A                                                                                                    |