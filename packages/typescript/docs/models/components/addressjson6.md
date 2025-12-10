# AddressJson6

Address

## Example Usage

```typescript
import { AddressJson6 } from "@cvent/sdk/models/components";

let value: AddressJson6 = {
  type: "work",
  streetAddress: "100 Universal City Plaza",
  locality: "Hollywood",
  region: "CA",
  postalCode: "91608",
  country: "USA",
  primary: true,
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                | Example                                                                    |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `type`                                                                     | [components.AddressTypeJson1](../../models/components/addresstypejson1.md) | :heavy_check_mark:                                                         | The type of the address.                                                   | work                                                                       |
| `streetAddress`                                                            | *string*                                                                   | :heavy_minus_sign:                                                         | The street address of the user.                                            | 100 Universal City Plaza                                                   |
| `locality`                                                                 | *string*                                                                   | :heavy_minus_sign:                                                         | The locality/city of the user.                                             | Hollywood                                                                  |
| `region`                                                                   | *string*                                                                   | :heavy_minus_sign:                                                         | The region/state/province of the user.                                     | CA                                                                         |
| `postalCode`                                                               | *string*                                                                   | :heavy_minus_sign:                                                         | Postal code (also known as zipcode) of the user.                           | 91608                                                                      |
| `country`                                                                  | *string*                                                                   | :heavy_minus_sign:                                                         | The country of the user.                                                   | USA                                                                        |
| `primary`                                                                  | *boolean*                                                                  | :heavy_minus_sign:                                                         | True indicates the address is primary.                                     | true                                                                       |