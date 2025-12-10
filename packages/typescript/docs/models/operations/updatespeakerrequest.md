# UpdateSpeakerRequest

## Example Usage

```typescript
import { UpdateSpeakerRequest } from "@cvent/sdk/models/operations";

let value: UpdateSpeakerRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  existingSpeaker: {
    event: {},
    firstName: "Barbra",
    lastName: "Smith",
    code: "sbarbra",
    email: "barbrasmith@cvent.com",
    prefix: "Dr.",
    designation: "PhD",
    company: "Cvent",
    title: "Lead Engineer",
    category: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      name: "Presenters",
    },
    links: {
      twitterUrl: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      facebookUrl: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      linkedInUrl: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
    },
    visibility: false,
    biography:
      "Presentation and Speaking voice expert, Barbara is a highly regarded coach and facilitator",
    internalNote: "Barbara is multilingual",
    relevance: 2.3,
  },
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `id`                                                                               | *string*                                                                           | :heavy_check_mark:                                                                 | The unique identifier of a speaker.                                                | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                               |
| `existingSpeaker`                                                                  | [components.ExistingSpeakerInput](../../models/components/existingspeakerinput.md) | :heavy_check_mark:                                                                 | Speaker to be updated                                                              |                                                                                    |