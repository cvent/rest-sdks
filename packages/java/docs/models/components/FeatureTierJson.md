# FeatureTierJson

Tier available for the feature


## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `name`                                                                 | [TierJson](../../models/components/TierJson.md)                        | :heavy_check_mark:                                                     | Represents the type of license that the user can choose.               | PREMIER                                                                |
| `locked`                                                               | *Optional\<Boolean>*                                                   | :heavy_minus_sign:                                                     | If a particular tier is locked to perform any mutation over it         | false                                                                  |
| `lockReason`                                                           | *Optional\<String>*                                                    | :heavy_minus_sign:                                                     | Generic message informing tier to be locked due to some feature in use |                                                                        |