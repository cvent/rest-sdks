# ActivityExhibitorJson

An activity exhibitor.

## Example Usage

```typescript
import { ActivityExhibitorJson } from "@cvent/sdk/models/components";

let value: ActivityExhibitorJson = {
  code: "CODE_UPDATE_1",
  marketingCode: "MARKETING_CODE_1",
  name: "Example Company",
};
```

## Fields

| Field                                   | Type                                    | Required                                | Description                             | Example                                 |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `id`                                    | *string*                                | :heavy_minus_sign:                      | The unique identifier of the exhibitor. |                                         |
| `code`                                  | *string*                                | :heavy_minus_sign:                      | Unique code of an exhibitor at a booth. | CODE_UPDATE_1                           |
| `marketingCode`                         | *string*                                | :heavy_minus_sign:                      | The marketing code of an exhibitor.     | MARKETING_CODE_1                        |
| `name`                                  | *string*                                | :heavy_minus_sign:                      | The Name of an exhibitor.               | Example Company                         |