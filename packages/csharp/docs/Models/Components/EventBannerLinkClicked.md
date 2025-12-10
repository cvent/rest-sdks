# EventBannerLinkClicked

The link on the banner clicked by an attendee.


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             | Example                                                                 |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `Exhibitor`                                                             | [ExhibitorJson1](../../Models/Components/ExhibitorJson1.md)             | :heavy_minus_sign:                                                      | An exhibitor.                                                           |                                                                         |
| `Platform`                                                              | *string*                                                                | :heavy_minus_sign:                                                      | The platform used by the user.                                          | Attendee Hub                                                            |
| `Banner`                                                                | [Banner](../../Models/Components/Banner.md)                             | :heavy_minus_sign:                                                      | The related banner                                                      |                                                                         |
| `Target`                                                                | [BannerLinkTargetJson](../../Models/Components/BannerLinkTargetJson.md) | :heavy_minus_sign:                                                      | The target of the link clicked on the banner.                           |                                                                         |