# MeetingRequestForm

A meeting request form.

## Example Usage

```typescript
import { MeetingRequestForm } from "@cvent/sdk/models/components";

let value: MeetingRequestForm = {
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
      type: "General",
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
};
```

## Fields

| Field                                                                                                                                                                                                              | Type                                                                                                                                                                                                               | Required                                                                                                                                                                                                           | Description                                                                                                                                                                                                        | Example                                                                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                                                                                                               | *string*                                                                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                                                 | The ID of the meeting request form.                                                                                                                                                                                | 9c97eb50-9f88-4972-a603-f617fc3258dd                                                                                                                                                                               |
| `name`                                                                                                                                                                                                             | *string*                                                                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                                                 | User-defined name of the meeting request form.                                                                                                                                                                     | Request for Medical Meetups                                                                                                                                                                                        |
| `statuses`                                                                                                                                                                                                         | *string*[]                                                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                 | User-defined list of statuses for the meeting request form.                                                                                                                                                        |                                                                                                                                                                                                                    |
| `active`                                                                                                                                                                                                           | *boolean*                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                 | A boolean indicating a meeting request form's active status. When true, the meeting request form is available for new request submissions. When false, only updates can be made to existing requests for this form | true                                                                                                                                                                                                               |
| `questions`                                                                                                                                                                                                        | [components.MeetingRequestCustomFieldJson](../../models/components/meetingrequestcustomfieldjson.md)[]                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                 | The list of questions that will need to be answered by someone creating a meeting request from this form.                                                                                                          |                                                                                                                                                                                                                    |