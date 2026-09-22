# PropertyExternalCodes

The external chain and property codes for the property

## Example Usage

```typescript
import { PropertyExternalCodes } from "@cvent/sdk/models/components";

let value: PropertyExternalCodes = {
  type: "worldspan_gds",
  chainCode: "NH",
  propertyCode: "GH1",
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                | Example                                                                    |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `type`                                                                     | [components.ExternalCodeType](../../models/components/externalcodetype.md) | :heavy_minus_sign:                                                         | Type of the external Code.                                                 | amadeus                                                                    |
| `chainCode`                                                                | *string*                                                                   | :heavy_minus_sign:                                                         | The code identifying the property's chain in the given external system.    | NH                                                                         |
| `propertyCode`                                                             | *string*                                                                   | :heavy_minus_sign:                                                         | The code identifying a property in the given external system.              | GH1                                                                        |