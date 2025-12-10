# GetLeadQualificationAnswersRequest

## Example Usage

```typescript
import { GetLeadQualificationAnswersRequest } from "@cvent/sdk/models/operations";

let value: GetLeadQualificationAnswersRequest = {
  id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  leadId: "cdd0d110-3a84-4bc5-a420-37c007716c73",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_check_mark:                   | ID of an event.                      | 3db28cfc-db22-11eb-8d19-0242ac130003 |
| `exhibitorId`                        | *string*                             | :heavy_check_mark:                   | ID of an exhibitor.                  | 4888db54-db22-11eb-8d19-0242ac130003 |
| `leadId`                             | *string*                             | :heavy_check_mark:                   | ID of a lead.                        | cdd0d110-3a84-4bc5-a420-37c007716c73 |