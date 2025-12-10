# RegistrationTypeUpdate

Represents the details of an existing registration type.

## Example Usage

```typescript
import { RegistrationTypeUpdate } from "@cvent/sdk/models/components";

let value: RegistrationTypeUpdate = {
  name: "Member",
  code: "MemberCode",
  description: "Registration type assigned to invitees who are members",
  virtual: true,
  openForRegistration: true,
  automaticOpenDate: new Date("2017-01-02T02:00:00Z"),
  automaticEndDate: new Date("2017-01-02T02:00:00Z"),
  event: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  capacity: {
    remaining: 100,
    consumed: 100,
    total: 100,
  },
};
```

## Fields

| Field                                                                                                  | Type                                                                                                   | Required                                                                                               | Description                                                                                            | Example                                                                                                |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `name`                                                                                                 | *string*                                                                                               | :heavy_minus_sign:                                                                                     | Name of the registration type.                                                                         | Member                                                                                                 |
| `code`                                                                                                 | *string*                                                                                               | :heavy_minus_sign:                                                                                     | Code for this registration type.                                                                       | MemberCode                                                                                             |
| `description`                                                                                          | *string*                                                                                               | :heavy_minus_sign:                                                                                     | Detailed description of the registration type.                                                         | Registration type assigned to invitees who are members                                                 |
| `virtual`                                                                                              | *boolean*                                                                                              | :heavy_minus_sign:                                                                                     | True indicates the registration type is virtual.                                                       | true                                                                                                   |
| `openForRegistration`                                                                                  | *boolean*                                                                                              | :heavy_check_mark:                                                                                     | True indicates the registration type can be chosen for registration.                                   | true                                                                                                   |
| `automaticOpenDate`                                                                                    | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)          | :heavy_minus_sign:                                                                                     | The ISO 8601 formatted date-time (in UTC) the registration type automatically opens for registration.  | 2017-01-02T02:00:00Z                                                                                   |
| `automaticEndDate`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)          | :heavy_minus_sign:                                                                                     | The ISO 8601 formatted date-time (in UTC) the registration type automatically closes for registration. | 2017-01-02T02:00:00Z                                                                                   |
| `event`                                                                                                | [components.RegistrationTypeUpdateEvent](../../models/components/registrationtypeupdateevent.md)       | :heavy_minus_sign:                                                                                     | Event associated with the registration.                                                                |                                                                                                        |
| `id`                                                                                                   | *string*                                                                                               | :heavy_check_mark:                                                                                     | A unique identifier of the registration type.                                                          | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                                   |
| `capacity`                                                                                             | [components.CapacityJson1](../../models/components/capacityjson1.md)                                   | :heavy_minus_sign:                                                                                     | Represents capacity statistics of the registration type.                                               |                                                                                                        |