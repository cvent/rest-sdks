# SessionLocationInput

A location associated with a session, with a code and name. The response may include its read-only ID.

## Example Usage

```typescript
import { SessionLocationInput } from "@cvent/sdk/models/components";

let value: SessionLocationInput = {
  code: "ConfA",
  name: "Conference Room A",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `code`                               | *string*                             | :heavy_check_mark:                   | Code / Abbreviation of the location. | ConfA                                |
| `name`                               | *string*                             | :heavy_check_mark:                   | Name of the location.                | Conference Room A                    |