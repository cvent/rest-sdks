# Weblink

Weblink of an exhibitor.


## Fields

| Field                                                | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `event`                                              | [Event4](../../models/components/Event4.md)          | :heavy_check_mark:                                   | Associated event.                                    |                                                      |
| `exhibitor`                                          | [Exhibitor](../../models/components/Exhibitor.md)    | :heavy_check_mark:                                   | Associated exhibitor.                                |                                                      |
| `name`                                               | *String*                                             | :heavy_check_mark:                                   | Display name of the weblink.                         | Marketing Page                                       |
| `url`                                                | *String*                                             | :heavy_check_mark:                                   | URL of the weblink.                                  | https://www.example.com                              |
| `hidden`                                             | *Optional\<Boolean>*                                 | :heavy_minus_sign:                                   | True indicates the weblink is hidden from attendees. |                                                      |
| `order`                                              | *long*                                               | :heavy_check_mark:                                   | Display order of the weblink.                        | 3                                                    |