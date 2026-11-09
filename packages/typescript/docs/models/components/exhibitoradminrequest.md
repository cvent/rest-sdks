# ExhibitorAdminRequest

Exhibitor admin.

## Example Usage

```typescript
import { ExhibitorAdminRequest } from "@cvent/sdk/models/components";

let value: ExhibitorAdminRequest = {
  exhibitor: {
    id: "4888db54-db22-11eb-8d19-0242ac130003",
  },
  firstName: "John",
  lastName: "Eddy",
  email: "john.eddy@example.com",
};
```

## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `exhibitor`                                                  | [components.Exhibitor](../../models/components/exhibitor.md) | :heavy_check_mark:                                           | Associated exhibitor.                                        |                                                              |
| `firstName`                                                  | *string*                                                     | :heavy_check_mark:                                           | First name of the exhibitor admin.                           | John                                                         |
| `lastName`                                                   | *string*                                                     | :heavy_check_mark:                                           | Last name of the exhibitor admin.                            | Eddy                                                         |
| `email`                                                      | *string*                                                     | :heavy_check_mark:                                           | Email address of the exhibitor admin.                        | john.eddy@example.com                                        |