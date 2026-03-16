# Weblink

Content of exhibitor weblink.


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               | Example                                                   |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `Event`                                                   | [EventJson6](../../Models/Components/EventJson6.md)       | :heavy_check_mark:                                        | The Associated Event.                                     |                                                           |
| `Exhibitor`                                               | [ExhibitorJson](../../Models/Components/ExhibitorJson.md) | :heavy_check_mark:                                        | The Associated Exhibitor.                                 |                                                           |
| `Name`                                                    | *string*                                                  | :heavy_check_mark:                                        | Display name of the weblink.                              | Marketing Page                                            |
| `Url`                                                     | *string*                                                  | :heavy_check_mark:                                        | The URL of the weblink.                                   | http://www.example.com                                    |
| `Hidden`                                                  | *bool*                                                    | :heavy_minus_sign:                                        | True indicates the weblink is hidden from attendees.      |                                                           |
| `Order`                                                   | *long*                                                    | :heavy_check_mark:                                        | Display order for exhibitor weblink content.              | 3                                                         |