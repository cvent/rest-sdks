# FileInput

Content of exhibitor file.


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               | Example                                                   |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `event`                                                   | [EventJson6](../../models/components/EventJson6.md)       | :heavy_check_mark:                                        | The Associated Event.                                     |                                                           |
| `exhibitor`                                               | [ExhibitorJson](../../models/components/ExhibitorJson.md) | :heavy_check_mark:                                        | The Associated Exhibitor.                                 |                                                           |
| `displayName`                                             | *String*                                                  | :heavy_check_mark:                                        | Display name of the file.                                 | Marketing Page                                            |
| `hidden`                                                  | *Optional\<Boolean>*                                      | :heavy_minus_sign:                                        | True indicates the file is hidden from attendees.         |                                                           |
| `order`                                                   | *long*                                                    | :heavy_check_mark:                                        | Display order for exhibitor file content.                 | 3                                                         |