# FileInput

File of an exhibitor.


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         | Example                                                             |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `Event`                                                             | [Event4](../../Models/Components/Event4.md)                         | :heavy_check_mark:                                                  | Associated event.                                                   |                                                                     |
| `Exhibitor`                                                         | [Models.Components.Exhibitor](../../Models/Components/Exhibitor.md) | :heavy_check_mark:                                                  | Associated exhibitor.                                               |                                                                     |
| `DisplayName`                                                       | *string*                                                            | :heavy_check_mark:                                                  | Display name of the file.                                           | Marketing Page                                                      |
| `Hidden`                                                            | *bool*                                                              | :heavy_minus_sign:                                                  | True indicates the file is hidden from attendees.                   |                                                                     |
| `Order`                                                             | *long*                                                              | :heavy_check_mark:                                                  | Display order of the file.                                          | 3                                                                   |