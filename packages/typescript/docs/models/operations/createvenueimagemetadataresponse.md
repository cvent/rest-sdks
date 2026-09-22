# CreateVenueImageMetadataResponse

## Example Usage

```typescript
import { CreateVenueImageMetadataResponse } from "@cvent/sdk/models/operations";

let value: CreateVenueImageMetadataResponse = {
  headers: {},
  result: {
    created: new Date("2017-01-02T02:00:00Z"),
    createdBy: "hporter",
    lastModified: new Date("2019-02-12T03:00:00Z"),
    lastModifiedBy: "hporter",
    name: "Grand Ballroom Exterior",
    description: "Main exterior view of the venue showing the grand entrance.",
    imageGroup: "EXTERIOR",
    id: "286e2866-b443-4d09-ab0f-0fac45cc026f",
  },
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `headers`                                                                      | Record<string, *string*[]>                                                     | :heavy_check_mark:                                                             | N/A                                                                            |
| `result`                                                                       | [components.ExistingVenueImage](../../models/components/existingvenueimage.md) | :heavy_check_mark:                                                             | N/A                                                                            |