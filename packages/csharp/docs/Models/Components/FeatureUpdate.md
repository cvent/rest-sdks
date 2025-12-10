# FeatureUpdate

Representation of an event feature update request


## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           | Example                                                               |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `Type`                                                                | [FeatureTypeJson](../../Models/Components/FeatureTypeJson.md)         | :heavy_check_mark:                                                    | These are the types of features used in the event container events.   | Registration                                                          |
| `Enabled`                                                             | *bool*                                                                | :heavy_check_mark:                                                    | If a particular feature is enabled for the event                      | true                                                                  |
| `EnabledTier`                                                         | [TierJson](../../Models/Components/TierJson.md)                       | :heavy_minus_sign:                                                    | Represents the type of license that the user can choose.              | PREMIER                                                               |
| `Config`                                                              | [FeatureUpdateConfig](../../Models/Components/FeatureUpdateConfig.md) | :heavy_minus_sign:                                                    | Feature configuration.                                                |                                                                       |