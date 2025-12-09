# PhoneNumberJson1

Phone Number

## Example Usage

```typescript
import { PhoneNumberJson1 } from "@cvent/sdk/models/components";

let value: PhoneNumberJson1 = {
  type: "work",
  value: "+911234567890",
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `type`                                                               | [components.PhoneTypeJson](../../models/components/phonetypejson.md) | :heavy_check_mark:                                                   | The type of the phone number.                                        | work                                                                 |
| `value`                                                              | *string*                                                             | :heavy_check_mark:                                                   | The phone number of the user.                                        | +911234567890                                                        |