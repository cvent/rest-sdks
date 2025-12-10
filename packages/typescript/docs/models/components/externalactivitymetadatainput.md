# ExternalActivityMetadataInput

Metadata for an activity.

## Example Usage

```typescript
import { ExternalActivityMetadataInput } from "@cvent/sdk/models/components";

let value: ExternalActivityMetadataInput = {
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
};
```

## Fields

| Field                                                                                                                                    | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              | Example                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `type`                                                                                                                                   | [components.ExternalActivityTypeJson](../../models/components/externalactivitytypejson.md)                                               | :heavy_check_mark:                                                                                                                       | This is used to denote the type of the external attendee activity.                                                                       | event.external                                                                                                                           |
| `name`                                                                                                                                   | *string*                                                                                                                                 | :heavy_check_mark:                                                                                                                       | Name of an external attendee activity.                                                                                                   | social.media                                                                                                                             |
| `description`                                                                                                                            | *string*                                                                                                                                 | :heavy_minus_sign:                                                                                                                       | Description of an external attendee activity.                                                                                            | This external activity contains data of social activities for an attendee.                                                               |
| `fields`                                                                                                                                 | [components.ExternalActivitiesAdditionalFieldsMetadataJson](../../models/components/externalactivitiesadditionalfieldsmetadatajson.md)[] | :heavy_minus_sign:                                                                                                                       | Metadata for the fields.                                                                                                                 |                                                                                                                                          |