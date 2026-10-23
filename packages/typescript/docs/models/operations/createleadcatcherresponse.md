# CreateLeadCatcherResponse

## Example Usage

```typescript
import { CreateLeadCatcherResponse } from "@cvent/sdk/models/operations";

let value: CreateLeadCatcherResponse = {
  headers: {
    "key": [
      "<value 1>",
      "<value 2>",
      "<value 3>",
    ],
    "key1": [],
    "key2": [],
  },
  result: {
    created: new Date("2017-01-02T02:00:00Z"),
    createdBy: "hporter",
    lastModified: new Date("2019-02-12T03:00:00Z"),
    lastModifiedBy: "hporter",
    firstName: "Jane",
    lastName: "Smith",
    title: "Director of Sales",
    email: "jane.smith@example.com",
    phone: "+1-555-555-0101",
    fax: "+1-555-555-0101",
    address: {
      streetAddress1: "1234 Trap Road",
      streetAddress2: "Suite 100",
      city: "Vienna",
      zipPostalCode: "22182",
    },
    config: {
      supplierContactRole: "Sales Manager",
    },
    additionalInfo: "Preferred contact for APAC venues.",
    id: "7e5c2c23-b2bb-461a-adc9-025184988519",
  },
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `headers`                                                                        | Record<string, *string*[]>                                                       | :heavy_check_mark:                                                               | N/A                                                                              |
| `result`                                                                         | [components.ExistingLeadCatcher](../../models/components/existingleadcatcher.md) | :heavy_check_mark:                                                               | N/A                                                                              |