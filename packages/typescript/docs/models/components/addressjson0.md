# AddressJson0

Address details.

## Example Usage

```typescript
import { AddressJson0 } from "@cvent/sdk/models/components";

let value: AddressJson0 = {
  countryCode: "US",
  city: "Austin",
  regionCode: "US-AL",
};
```

## Fields

| Field                                          | Type                                           | Required                                       | Description                                    | Example                                        |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `countryCode`                                  | *string*                                       | :heavy_check_mark:                             | ISO 3166 code for the country.                 | US                                             |
| `city`                                         | *string*                                       | :heavy_check_mark:                             | The name of the city.                          | Austin                                         |
| `regionCode`                                   | *string*                                       | :heavy_minus_sign:                             | ISO 3166-2 code for the state/province/region. | US-AL                                          |