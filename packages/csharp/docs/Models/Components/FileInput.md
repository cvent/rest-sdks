# FileInput

Content of exhibitor file.


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         | Example                                                             |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `Event`                                                             | [Event4](../../Models/Components/Event4.md)                         | :heavy_check_mark:                                                  | The Associated Event.                                               |                                                                     |
| `Exhibitor`                                                         | [Models.Components.Exhibitor](../../Models/Components/Exhibitor.md) | :heavy_check_mark:                                                  | The Associated Exhibitor.                                           |                                                                     |
| `DisplayName`                                                       | *string*                                                            | :heavy_check_mark:                                                  | Display name of the file.                                           | Marketing Page                                                      |
| `Hidden`                                                            | *bool*                                                              | :heavy_minus_sign:                                                  | True indicates the file is hidden from attendees.                   |                                                                     |
| `Order`                                                             | *long*                                                              | :heavy_check_mark:                                                  | Display order for exhibitor file content.                           | 3                                                                   |