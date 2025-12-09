# UpdateRegistrationTypeRequest

## Example Usage

```typescript
import { UpdateRegistrationTypeRequest } from "@cvent/sdk/models/operations";

let value: UpdateRegistrationTypeRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  registrationTypeId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  registrationTypeUpdate: {
    openForRegistration: true,
    automaticOpenDate: new Date("2017-01-02T02:00:00Z"),
    automaticEndDate: new Date("2017-01-02T02:00:00Z"),
    capacity: {
      total: 100,
    },
  },
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `id`                                                                                             | *string*                                                                                         | :heavy_check_mark:                                                                               | Unique ID of an event.                                                                           | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                             |
| `registrationTypeId`                                                                             | *string*                                                                                         | :heavy_check_mark:                                                                               | Unique ID of a registration type.                                                                | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                             |
| `registrationTypeUpdate`                                                                         | [components.RegistrationTypeUpdateInput](../../models/components/registrationtypeupdateinput.md) | :heavy_check_mark:                                                                               | Registration type details to be updated.                                                         |                                                                                                  |