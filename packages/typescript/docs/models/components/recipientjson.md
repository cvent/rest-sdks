# RecipientJson

Information of the recipient.

## Example Usage

```typescript
import { RecipientJson } from "@cvent/sdk/models/components";

let value: RecipientJson = {
  id: "2A941E55-3367-4C50-B21B-B6A7613DFB23",
  firstName: "Brett",
  lastName: "Lawler",
  emailAddress: "brett.lawler@example.com",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_minus_sign:                   | Unique ID of the recipient.          | 2A941E55-3367-4C50-B21B-B6A7613DFB23 |
| `firstName`                          | *string*                             | :heavy_minus_sign:                   | First name of the recipient.         | Brett                                |
| `lastName`                           | *string*                             | :heavy_minus_sign:                   | Last name of the recipient.          | Lawler                               |
| `emailAddress`                       | *string*                             | :heavy_minus_sign:                   | Email address of the recipient.      | brett.lawler@example.com             |