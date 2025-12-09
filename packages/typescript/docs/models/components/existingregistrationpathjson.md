# ExistingRegistrationPathJson

Represents the details of an existing registration path.

## Example Usage

```typescript
import { ExistingRegistrationPathJson } from "@cvent/sdk/models/components";

let value: ExistingRegistrationPathJson = {
  name: "Default Registration Path",
  code: "RegistrationPath1",
  description:
    "Registration path used for storing the default registration configuration",
};
```

## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               | Example                                                                   |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `name`                                                                    | *string*                                                                  | :heavy_minus_sign:                                                        | Name of the registration path.                                            | Default Registration Path                                                 |
| `code`                                                                    | *string*                                                                  | :heavy_minus_sign:                                                        | Code for this registration path.                                          | RegistrationPath1                                                         |
| `description`                                                             | *string*                                                                  | :heavy_minus_sign:                                                        | Detailed description of the registration path.                            | Registration path used for storing the default registration configuration |
| `id`                                                                      | *string*                                                                  | :heavy_minus_sign:                                                        | A unique identifier of the registration path.                             |                                                                           |