# PhoneNumber

Phone Number

## Example Usage

```typescript
import { PhoneNumber } from "@cvent/sdk/models/components";

let value: PhoneNumber = {
  type: "work",
  value: "+911234567890",
};
```

## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `type`                                                       | [components.PhoneType](../../models/components/phonetype.md) | :heavy_check_mark:                                           | The type of the phone number.                                | work                                                         |
| `value`                                                      | *string*                                                     | :heavy_check_mark:                                           | The phone number of the user.                                | +911234567890                                                |