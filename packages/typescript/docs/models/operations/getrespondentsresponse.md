# GetRespondentsResponse

## Example Usage

```typescript
import { GetRespondentsResponse } from "@cvent/sdk/models/operations";

let value: GetRespondentsResponse = {
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
        responseCode: "92OM10RO",
        responseDuration: 1035,
        localeId: "en-US",
        respondedThrough: "API",
        referenceId: "facebook",
        score: 70,
        maxPossibleScore: 100,
        percentageScore: 70,
        links: {
          surveyUrl: {
            href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
          },
        },
        sourceId: "IN4IDS1",
        event: {
          id: "9463c74e-18c6-401a-a710-ae0f485bf059",
        },
        contact: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        attendee: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        survey: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        status: "No Response",
        unsubscribed: false,
        unsubscribedBy: "Respondent",
        chapters: [
          {
            status: "In Progress",
            score: 70,
            maxPossibleScore: 100,
            percentageScore: 70,
            loopingChoice: {
              id: "9463c74e-18c6-401a-a710-ae0f485bf059",
            },
            evaluationResult: "Passed",
            attempt: 2,
          },
        ],
        invitationList: {
          id: "9463c74e-18c6-401a-a710-ae0f485bf059",
        },
        transactionId: "TR5IDS4",
      },
    ],
  },
};
```

## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `result`                                                                                           | [components.RespondentsPaginatedResponse](../../models/components/respondentspaginatedresponse.md) | :heavy_check_mark:                                                                                 | N/A                                                                                                |