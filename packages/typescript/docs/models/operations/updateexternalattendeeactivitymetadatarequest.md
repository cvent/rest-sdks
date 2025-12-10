# UpdateExternalAttendeeActivityMetadataRequest

## Example Usage

```typescript
import { UpdateExternalAttendeeActivityMetadataRequest } from "@cvent/sdk/models/operations";

let value: UpdateExternalAttendeeActivityMetadataRequest = {
  id: "9463c74e-18c6-401a-a710-ae0f485bf059",
  externalActivityMetadata: {
    type: "event.external",
    name: "social.media",
    description:
      "This external activity contains data of social activities for an attendee.",
    fields: [
      {
        name: "facebook_social.media",
        description: "Contains data for facebook social media activity.",
      },
    ],
  },
};
```

## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          | Example                                                                                              |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `id`                                                                                                 | *string*                                                                                             | :heavy_check_mark:                                                                                   | ID of the activity metadata.                                                                         | 9463c74e-18c6-401a-a710-ae0f485bf059                                                                 |
| `externalActivityMetadata`                                                                           | [components.ExternalActivityMetadataInput](../../models/components/externalactivitymetadatainput.md) | :heavy_check_mark:                                                                                   | N/A                                                                                                  |                                                                                                      |