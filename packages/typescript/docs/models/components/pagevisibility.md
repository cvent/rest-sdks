# PageVisibility

Visibility of the custom field on various pages/forms.

## Example Usage

```typescript
import { PageVisibility } from "@cvent/sdk/models/components";

let value: PageVisibility = {};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `essentialEventCreationForm`                                             | *boolean*                                                                | :heavy_minus_sign:                                                       | True indicates it's visible on the event essentials event creation form. |
| `essentialEventDetailsForm`                                              | *boolean*                                                                | :heavy_minus_sign:                                                       | True indicates it's visible on the event essentials event details form.  |
| `webinarCreationForm`                                                    | *boolean*                                                                | :heavy_minus_sign:                                                       | True indicates it's visible on webinar creation form.                    |
| `webinarDetailsForm`                                                     | *boolean*                                                                | :heavy_minus_sign:                                                       | True indicates it's visible on the webinar details form.                 |