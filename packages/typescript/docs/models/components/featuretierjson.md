# FeatureTierJson

Tier available for the feature

## Example Usage

```typescript
import { FeatureTierJson } from "@cvent/sdk/models/components";

let value: FeatureTierJson = {
  name: "PREMIER",
  locked: false,
  lockReason: "",
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `name`                                                                 | [components.TierJson](../../models/components/tierjson.md)             | :heavy_check_mark:                                                     | Represents the type of license that the user can choose.               | PREMIER                                                                |
| `locked`                                                               | *boolean*                                                              | :heavy_minus_sign:                                                     | If a particular tier is locked to perform any mutation over it         | false                                                                  |
| `lockReason`                                                           | *string*                                                               | :heavy_minus_sign:                                                     | Generic message informing tier to be locked due to some feature in use |                                                                        |