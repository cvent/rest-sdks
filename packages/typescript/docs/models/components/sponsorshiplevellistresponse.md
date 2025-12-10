# SponsorshipLevelListResponse

This schema describes the response for a list of sponsorship levels.

## Example Usage

```typescript
import { SponsorshipLevelListResponse } from "@cvent/sdk/models/components";

let value: SponsorshipLevelListResponse = {
  data: [
    {
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
      event: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
      name: "Silver",
      id: "1765848c-2a7f-48d2-85a2-6668b8e64ffb",
      rank: 3,
    },
  ],
};
```

## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `data`                                                                                       | [components.ExistingSponsorshipLevel](../../models/components/existingsponsorshiplevel.md)[] | :heavy_minus_sign:                                                                           | List of sponsorship level.                                                                   |