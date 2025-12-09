# ExhibitorSocialLinkOpened

An exhibitor social-link-opened activity.

## Example Usage

```typescript
import { ExhibitorSocialLinkOpened } from "@cvent/sdk/models/components";

let value: ExhibitorSocialLinkOpened = {
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
  socialNetwork: "LinkedIn",
  url: "https://www.linkedin.com/company/cvent/mycompany/",
};
```

## Fields

| Field                                                                                                                | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          | Example                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `exhibitor`                                                                                                          | [components.ExhibitorJson1](../../models/components/exhibitorjson1.md)                                               | :heavy_minus_sign:                                                                                                   | An exhibitor.                                                                                                        |                                                                                                                      |
| `platform`                                                                                                           | *string*                                                                                                             | :heavy_minus_sign:                                                                                                   | The platform used by the user.                                                                                       | Attendee Hub                                                                                                         |
| `sponsorshipLevel`                                                                                                   | [components.ActivityExhibitorSponsorshipLevelJson](../../models/components/activityexhibitorsponsorshipleveljson.md) | :heavy_minus_sign:                                                                                                   | Sponsorship level for an activity exhibitor.                                                                         |                                                                                                                      |
| `socialNetwork`                                                                                                      | *string*                                                                                                             | :heavy_minus_sign:                                                                                                   | The name of the social network.                                                                                      | LinkedIn                                                                                                             |
| `url`                                                                                                                | *string*                                                                                                             | :heavy_minus_sign:                                                                                                   | The link opened by the attendee.                                                                                     | https://www.linkedin.com/company/cvent/mycompany/                                                                    |