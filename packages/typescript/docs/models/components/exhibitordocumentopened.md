# ExhibitorDocumentOpened

An exhibitor document-opened activity.

## Example Usage

```typescript
import { ExhibitorDocumentOpened } from "@cvent/sdk/models/components";

let value: ExhibitorDocumentOpened = {
  exhibitor: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "AutoExpo",
    featured: true,
    eventSponsor: true,
  },
  platform: "Attendee Hub",
  document: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "FAQs",
    format: "pdf",
    downloaded: true,
  },
};
```

## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          | Example                                                                                              |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `exhibitor`                                                                                          | [components.ExhibitorJson1](../../models/components/exhibitorjson1.md)                               | :heavy_minus_sign:                                                                                   | An exhibitor.                                                                                        |                                                                                                      |
| `platform`                                                                                           | *string*                                                                                             | :heavy_minus_sign:                                                                                   | The platform used by the user.                                                                       | Attendee Hub                                                                                         |
| `document`                                                                                           | [components.ActivityExhibitorDocumentJson](../../models/components/activityexhibitordocumentjson.md) | :heavy_minus_sign:                                                                                   | Document for an activity exhibitor.                                                                  |                                                                                                      |