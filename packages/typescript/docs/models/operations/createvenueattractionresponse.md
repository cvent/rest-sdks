# CreateVenueAttractionResponse

## Example Usage

```typescript
import { CreateVenueAttractionResponse } from "@cvent/sdk/models/operations";

let value: CreateVenueAttractionResponse = {
  headers: {
    "key": [
      "<value 1>",
      "<value 2>",
      "<value 3>",
    ],
    "key1": [
      "<value 1>",
    ],
  },
  result: {
    created: new Date("2017-01-02T02:00:00Z"),
    createdBy: "hporter",
    lastModified: new Date("2019-02-12T03:00:00Z"),
    lastModifiedBy: "hporter",
    name: "Golden Gate Bridge",
    description: "Iconic suspension bridge, 10 minutes from the venue.",
    url: "https://www.example.com",
    distance: {
      value: 2,
    },
    address: {
      streetAddress1: "Golden Gate Bridge",
      streetAddress2: "Suite 100",
      city: "San Francisco",
      zipPostalCode: "94129",
    },
    id: "7e5c2c23-b2bb-461a-adc9-025184988519",
  },
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `headers`                                                                                | Record<string, *string*[]>                                                               | :heavy_check_mark:                                                                       | N/A                                                                                      |
| `result`                                                                                 | [components.ExistingVenueAttraction](../../models/components/existingvenueattraction.md) | :heavy_check_mark:                                                                       | N/A                                                                                      |