# AccountUsersFilter

A filter, sent in the body of the request, used to retrieve a filtered down list of account users.

## Example Usage

```typescript
import { AccountUsersFilter } from "@cvent/sdk/models/components";

let value: AccountUsersFilter = {
  filter: "contact.email eq 'jsmith@example.com'",
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `filter`                                                                           | *string*                                                                           | :heavy_minus_sign:                                                                 | A Cvent DSL filter expression used to apply a filtered down list of account users. | contact.email eq 'jsmith@example.com'                                              |