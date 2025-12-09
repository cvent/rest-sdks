# MeetingRequestBulkResponseItemJson

Represents a single meeting request that's returned as part of a bulk request call.

## Example Usage

```typescript
import { MeetingRequestBulkResponseItemJson } from "@cvent/sdk/models/components";

let value: MeetingRequestBulkResponseItemJson = {
  data: {
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
        compositeValue: [],
      },
    ],
    sourceId: "sourceId12",
    code: "VPNH3JGMTND",
    archiveDate: "2017-01-02T02:00:00Z",
  },
  status: 200,
  message: "Successful",
  request: "Example request information.",
};
```

## Fields

| Field                                                                                       | Type                                                                                        | Required                                                                                    | Description                                                                                 | Example                                                                                     |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `data`                                                                                      | [components.MeetingRequest](../../models/components/meetingrequest.md)                      | :heavy_check_mark:                                                                          | A meeting request.                                                                          |                                                                                             |
| `status`                                                                                    | *number*                                                                                    | :heavy_check_mark:                                                                          | HTTP status code representing the processing status of a single item.                       | 200                                                                                         |
| `message`                                                                                   | *string*                                                                                    | :heavy_minus_sign:                                                                          | Quick description of what happened during processing.                                       | Successful                                                                                  |
| `request`                                                                                   | *components.RequestT*                                                                       | :heavy_minus_sign:                                                                          | The processed request tied to this response. This field is only sent when processing fails. | Example request information.                                                                |