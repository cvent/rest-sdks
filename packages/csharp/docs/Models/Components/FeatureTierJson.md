# FeatureTierJson

Tier available for the feature


## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `Name`                                                                 | [TierJson](../../Models/Components/TierJson.md)                        | :heavy_check_mark:                                                     | Represents the type of license that the user can choose.               | PREMIER                                                                |
| `Locked`                                                               | *bool*                                                                 | :heavy_minus_sign:                                                     | If a particular tier is locked to perform any mutation over it         | false                                                                  |
| `LockReason`                                                           | *string*                                                               | :heavy_minus_sign:                                                     | Generic message informing tier to be locked due to some feature in use |                                                                        |