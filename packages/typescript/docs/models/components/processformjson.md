# ProcessFormJson

An object that contains the process form ID.

This is an **expandable** object and if requested will contain the name of a process form object.

## Example Usage

```typescript
import { ProcessFormJson } from "@cvent/sdk/models/components";

let value: ProcessFormJson = {
  id: "9c97eb50-9f88-4972-a603-f617fc3258dd",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_minus_sign:                   | The ID of the process form.          | 9c97eb50-9f88-4972-a603-f617fc3258dd |