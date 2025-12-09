# UpdateExhibitorAnswersRequest

## Example Usage

```typescript
import { UpdateExhibitorAnswersRequest } from "@cvent/sdk/models/operations";

let value: UpdateExhibitorAnswersRequest = {
  id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  exhibitorAnswersRequest: {
    data: [
      {
        question: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        event: {
          id: "3db28cfc-db22-11eb-8d19-0242ac130003",
        },
        exhibitor: {
          id: "4888db54-db22-11eb-8d19-0242ac130003",
        },
        answers: [
          {
            type: "Choice",
            value: "Choice A",
          },
        ],
      },
    ],
  },
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              | Example                                                                                  |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `id`                                                                                     | *string*                                                                                 | :heavy_check_mark:                                                                       | ID of an event.                                                                          | 3db28cfc-db22-11eb-8d19-0242ac130003                                                     |
| `exhibitorId`                                                                            | *string*                                                                                 | :heavy_check_mark:                                                                       | ID of an exhibitor.                                                                      | 4888db54-db22-11eb-8d19-0242ac130003                                                     |
| `exhibitorAnswersRequest`                                                                | [components.ExhibitorAnswersRequest](../../models/components/exhibitoranswersrequest.md) | :heavy_check_mark:                                                                       | Exhibitor answers to be updated                                                          |                                                                                          |