# PassportJsonInput

This entity represents a contact's passport information.

## Example Usage

```typescript
import { PassportJsonInput } from "@cvent/sdk/models/components";

let value: PassportJsonInput = {
  number: "123456789",
  countryCode: "GB",
};
```

## Fields

| Field                                                                                                                                                                         | Type                                                                                                                                                                          | Required                                                                                                                                                                      | Description                                                                                                                                                                   | Example                                                                                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `number`                                                                                                                                                                      | *string*                                                                                                                                                                      | :heavy_minus_sign:                                                                                                                                                            | The passport number of the contact.<br/><br/> Reading and writing of this field require the `event/contacts:read-sensitive` and `event/contacts:write-sensitive` scopes respectively. | 123456789                                                                                                                                                                     |
| `countryCode`                                                                                                                                                                 | *string*                                                                                                                                                                      | :heavy_minus_sign:                                                                                                                                                            | The passport country code of the contact.                                                                                                                                     | GB                                                                                                                                                                            |