# ActivityExhibitorNavigationSourceJson

Navigation source for an activity exhibitor.

## Example Usage

```typescript
import { ActivityExhibitorNavigationSourceJson } from "@cvent/sdk/models/components";

let value: ActivityExhibitorNavigationSourceJson = {
  type: "Sponsored Session",
  name: "Session name",
};
```

## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `type`                                                                                    | *string*                                                                                  | :heavy_minus_sign:                                                                        | The source type in the attendee hub from where the user navigated to the exhibitor booth. | Sponsored Session                                                                         |
| `name`                                                                                    | *string*                                                                                  | :heavy_minus_sign:                                                                        | The source name in the attendee hub from where the user navigated to the exhibitor booth. | Session name                                                                              |