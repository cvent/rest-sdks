# ExhibitorVirtualBoothJoined

An exhibitor virtual-booth-joined activity.

## Example Usage

```typescript
import { ExhibitorVirtualBoothJoined } from "@cvent/sdk/models/components";

let value: ExhibitorVirtualBoothJoined = {
  exhibitor: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "AutoExpo",
    featured: true,
    eventSponsor: true,
  },
  platform: "Attendee Hub",
  sponsorshipLevel: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "Gold",
  },
  solutionType: "CVC",
};
```

## Fields

| Field                                                                                                                | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          | Example                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `exhibitor`                                                                                                          | [components.ExhibitorJson1](../../models/components/exhibitorjson1.md)                                               | :heavy_minus_sign:                                                                                                   | An exhibitor.                                                                                                        |                                                                                                                      |
| `platform`                                                                                                           | *string*                                                                                                             | :heavy_minus_sign:                                                                                                   | The platform used by the user.                                                                                       | Attendee Hub                                                                                                         |
| `sponsorshipLevel`                                                                                                   | [components.ActivityExhibitorSponsorshipLevelJson](../../models/components/activityexhibitorsponsorshipleveljson.md) | :heavy_minus_sign:                                                                                                   | Sponsorship level for an activity exhibitor.                                                                         |                                                                                                                      |
| `solutionType`                                                                                                       | *string*                                                                                                             | :heavy_minus_sign:                                                                                                   | The solution type used for the virtual booth.                                                                        | CVC                                                                                                                  |