# RegistrationTypeUpdateInput

Represents the details of an existing registration type.

## Example Usage

```typescript
import { RegistrationTypeUpdateInput } from "@cvent/sdk/models/components";

let value: RegistrationTypeUpdateInput = {
  openForRegistration: true,
  automaticOpenDate: new Date("2017-01-02T02:00:00Z"),
  automaticEndDate: new Date("2017-01-02T02:00:00Z"),
  capacity: {
    total: 100,
  },
};
```

## Fields

| Field                                                                                                  | Type                                                                                                   | Required                                                                                               | Description                                                                                            | Example                                                                                                |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `openForRegistration`                                                                                  | *boolean*                                                                                              | :heavy_check_mark:                                                                                     | True indicates the registration type can be chosen for registration.                                   | true                                                                                                   |
| `automaticOpenDate`                                                                                    | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)          | :heavy_minus_sign:                                                                                     | The ISO 8601 formatted date-time (in UTC) the registration type automatically opens for registration.  | 2017-01-02T02:00:00Z                                                                                   |
| `automaticEndDate`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)          | :heavy_minus_sign:                                                                                     | The ISO 8601 formatted date-time (in UTC) the registration type automatically closes for registration. | 2017-01-02T02:00:00Z                                                                                   |
| `capacity`                                                                                             | [components.CapacityJson1Input](../../models/components/capacityjson1input.md)                         | :heavy_minus_sign:                                                                                     | Represents capacity statistics of the registration type.                                               |                                                                                                        |