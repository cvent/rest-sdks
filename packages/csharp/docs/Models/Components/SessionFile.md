# SessionFile

Metadata for a file associated with a session.


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `File`                                                        | [SessionFileFile](../../Models/Components/SessionFileFile.md) | :heavy_check_mark:                                            | N/A                                                           |                                                               |
| `Href`                                                        | *string*                                                      | :heavy_check_mark:                                            | URL of a session's document                                   | https://example.com/files/session-document.png                |
| `FriendlyName`                                                | *string*                                                      | :heavy_minus_sign:                                            | Friendly name of the file                                     | Important Document                                            |
| `Type`                                                        | *string*                                                      | :heavy_minus_sign:                                            | Mime type of the file                                         | image/png                                                     |
| `Size`                                                        | *long*                                                        | :heavy_minus_sign:                                            | Size of the file in bytes                                     | 150                                                           |
| `DisplayEnabled`                                              | *bool*                                                        | :heavy_minus_sign:                                            | True indicates the file is displayed publicly.                | true                                                          |