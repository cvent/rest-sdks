# HubsPaginatedResponse

The response from a request to get the list of Events+ hubs. This includes the paging object as well as the collection of Events+ hubs.

## Example Usage

```typescript
import { HubsPaginatedResponse } from "@cvent/sdk/models/components";

let value: HubsPaginatedResponse = {
  paging: {
    previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
    nextToken: "1a2b3c4d5e6f7g8h9i10j11k",
    currentToken: "1a2b3c4d5e6f7g8h9i10j11k",
    limit: 100,
    totalCount: 2,
    links: {
      next: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      self: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      prev: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
    },
  },
  data: [
    {
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
      title: "Future Technologies",
      owner: {
        firstName: "Achuthanandan",
        lastName: "Velikkakathu Sankaran",
        email: "owner@example.com",
      },
      customDomain: "example.com",
      url: "https://web.cvent.com/eventsplus",
      colors: {
        action: "#0F0F0F",
        background: "#0F0F0F",
        main: "#0F0F0F",
        mood: "#0F0F0F",
      },
      themeSafeMode: true,
      logo: {
        url:
          "https://images.cvent.com/ab5d5f790f6b4a90b29a3711d4ec381f/video-center/4833fde2-eedf-4751-92a5-f788cfa70674/43c5b520abf9635f4168a2ce37a89d89!_!6fbef1a131b81d4bed2b16c175ef57cd.jpeg",
        originalUrl:
          "https://custom.cvent.com/ab5d5f790f6b4a90b29a3711d4ec381f/video-center/4833fde2-eedf-4751-92a5-f788cfa70674/43c5b520abf9635f4168a2ce37a89d89.jpeg",
        altText: "A mostly empty conference room.",
      },
      background: {
        url:
          "https://images.cvent.com/ab5d5f790f6b4a90b29a3711d4ec381f/video-center/4833fde2-eedf-4751-92a5-f788cfa70674/43c5b520abf9635f4168a2ce37a89d89!_!6fbef1a131b81d4bed2b16c175ef57cd.jpeg",
        originalUrl:
          "https://custom.cvent.com/ab5d5f790f6b4a90b29a3711d4ec381f/video-center/4833fde2-eedf-4751-92a5-f788cfa70674/43c5b520abf9635f4168a2ce37a89d89.jpeg",
        altText: "A mostly empty conference room.",
      },
      locale: "en-GB",
      calendar: {
        id: "1e7e0f38-d73c-4326-9f93-422086b91304",
        layout: "List",
      },
      helpEmailAddress: "abc@example.com",
      autoDetectBrowserLocale: true,
      faviconUrl: "https://cvent.com/bucket/scope/logo.png",
      utmOverride: "use-custom-parameter",
      fonts: {
        headingId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        bodyId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      login: {
        organizationId: "OneloginforFlexGuestside",
        idpUrl:
          "https://login.cvent.com/redirect?redirectUrl=https://cvent-login.com/oauth2/oauth-redirect&productId=0oaztigu7sVcS4PHM0h7&identityProviderName=OneloginforFlexGuestside",
      },
      id: "1e7e0f38-d73c-4326-9f93-422086b91304",
    },
  ],
};
```

## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `paging`                                                           | [components.PagingJson](../../models/components/pagingjson.md)     | :heavy_check_mark:                                                 | Represents pagination information for a collection of resources.   |
| `data`                                                             | [components.ExistingHub](../../models/components/existinghub.md)[] | :heavy_check_mark:                                                 | List of Events+ hubs.                                              |