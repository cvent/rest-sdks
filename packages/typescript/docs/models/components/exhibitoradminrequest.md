# ExhibitorAdminRequest

An object representing the exhibitor admin.

## Example Usage

```typescript
import { ExhibitorAdminRequest } from "@cvent/sdk/models/components";

let value: ExhibitorAdminRequest = {
  exhibitor: {
    id: "4888db54-db22-11eb-8d19-0242ac130003",
  },
  firstName: "John",
  lastName: "Eddy",
  email: "john.eddy@test.com",
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `exhibitor`                                                          | [components.ExhibitorJson](../../models/components/exhibitorjson.md) | :heavy_check_mark:                                                   | The Associated Exhibitor.                                            |                                                                      |
| `firstName`                                                          | *string*                                                             | :heavy_check_mark:                                                   | The first name of the exhibitor admin                                | John                                                                 |
| `lastName`                                                           | *string*                                                             | :heavy_check_mark:                                                   | The last name of the exhibitor admin                                 | Eddy                                                                 |
| `email`                                                              | *string*                                                             | :heavy_check_mark:                                                   | The email address of the exhibitor admin                             | john.eddy@test.com                                                   |