# LeadSource

Lead source details.

## Example Usage

```typescript
import { LeadSource } from "@cvent/sdk/models/components";

let value: LeadSource = {
  id: "50dc08af-24a9-4d01-84be-3d43133dc945",
  section: {
    id: "40dc08af-24a9-4d01-84be-3d43133dc945",
  },
};
```

## Fields

| Field                                                                                                                                                                              | Type                                                                                                                                                                               | Required                                                                                                                                                                           | Description                                                                                                                                                                        | Example                                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                               | *string*                                                                                                                                                                           | :heavy_minus_sign:                                                                                                                                                                 | Unique identifier for source generating the RFP. Details about this lead source can be fetched using <a href="#tag/RFP-Management/operation/getRfpLeadSource">lead source API.</a> | 50dc08af-24a9-4d01-84be-3d43133dc945                                                                                                                                               |
| `section`                                                                                                                                                                          | [components.LeadSourceSectionJson](../../models/components/leadsourcesectionjson.md)                                                                                               | :heavy_minus_sign:                                                                                                                                                                 | Represents lead source section details, which is a sub area of source generating the RFP.                                                                                          |                                                                                                                                                                                    |