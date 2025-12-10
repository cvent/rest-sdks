# NameJson

The name of the user.

## Example Usage

```typescript
import { NameJson } from "@cvent/sdk/models/components";

let value: NameJson = {
  givenName: "Mike",
  familyName: "Stuart",
  middleName: "A",
  honorificPrefix: "Mr.",
};
```

## Fields

| Field                             | Type                              | Required                          | Description                       | Example                           |
| --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- |
| `givenName`                       | *string*                          | :heavy_check_mark:                | The given/first name of the user. | Mike                              |
| `familyName`                      | *string*                          | :heavy_check_mark:                | The family/last name of the user. | Stuart                            |
| `middleName`                      | *string*                          | :heavy_minus_sign:                | The middle name of the user.      | A                                 |
| `honorificPrefix`                 | *string*                          | :heavy_minus_sign:                | The prefix of the user.           | Mr.                               |