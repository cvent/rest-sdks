# ActivityAdJson

The details of the advertisement.


## Fields

| Field                                                       | Type                                                        | Required                                                    | Description                                                 | Example                                                     |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `Id`                                                        | *string*                                                    | :heavy_minus_sign:                                          | The unique identifier of the ad.                            | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                        |
| `Name`                                                      | *string*                                                    | :heavy_minus_sign:                                          | The name of the ad.                                         | New Year Sale                                               |
| `Product`                                                   | *string*                                                    | :heavy_minus_sign:                                          | The product for which ad is created                         | ATTENDEE_HUB                                                |
| `Location`                                                  | [AdLocationJson](../../Models/Components/AdLocationJson.md) | :heavy_minus_sign:                                          | The placement of the ad within the specific product.        | Home Page                                                   |
| `Attribution`                                               | [Attribution](../../Models/Components/Attribution.md)       | :heavy_minus_sign:                                          | The entity to which the ad is associated.                   |                                                             |