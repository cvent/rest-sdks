# RfpSupplierLeadSource

Lead source: only `leadSource.section.id` is used; `leadSource.id` is ignored. If you omit the section, Cvent sets the default section. A caller can send only the default section. Another section is rejected with 400.

## Example Usage

```typescript
import { RfpSupplierLeadSource } from "@cvent/sdk/models/components";

let value: RfpSupplierLeadSource = {
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
| `section`                                                                                                                                                                          | [components.LeadSourceSection](../../models/components/leadsourcesection.md)                                                                                                       | :heavy_minus_sign:                                                                                                                                                                 | Represents lead source section details, which is a sub area of source generating the RFP.                                                                                          |                                                                                                                                                                                    |