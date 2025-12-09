# ExternalActivitiesAdditionalFieldsMetadataJson

Additional fields metadata for an external activity.

## Example Usage

```typescript
import { ExternalActivitiesAdditionalFieldsMetadataJson } from "@cvent/sdk/models/components";

let value: ExternalActivitiesAdditionalFieldsMetadataJson = {
  name: "facebook_social.media",
  description: "Contains data for facebook social media activity.",
};
```

## Fields

| Field                                             | Type                                              | Required                                          | Description                                       | Example                                           |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `name`                                            | *string*                                          | :heavy_check_mark:                                | The name of the additional field.                 | facebook_social.media                             |
| `description`                                     | *string*                                          | :heavy_minus_sign:                                | Description of the additional field.              | Contains data for facebook social media activity. |