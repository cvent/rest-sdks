# Weblink

Content of exhibitor weblink.


## Fields

| Field                                                | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `event`                                              | [Event1](../../models/components/Event1.md)          | :heavy_check_mark:                                   | The Associated Event.                                |                                                      |
| `exhibitor`                                          | [Exhibitor](../../models/components/Exhibitor.md)    | :heavy_check_mark:                                   | The Associated Exhibitor.                            |                                                      |
| `name`                                               | *String*                                             | :heavy_check_mark:                                   | Display name of the weblink.                         | Marketing Page                                       |
| `url`                                                | *String*                                             | :heavy_check_mark:                                   | The URL of the weblink.                              | http://www.example.com                               |
| `hidden`                                             | *Optional\<Boolean>*                                 | :heavy_minus_sign:                                   | True indicates the weblink is hidden from attendees. |                                                      |
| `order`                                              | *long*                                               | :heavy_check_mark:                                   | Display order for exhibitor weblink content.         | 3                                                    |