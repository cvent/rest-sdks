# SessionFile

Metadata for a file associated with a session.


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `file`                                                        | [SessionFileFile](../../models/components/SessionFileFile.md) | :heavy_check_mark:                                            | N/A                                                           |                                                               |
| `href`                                                        | *String*                                                      | :heavy_check_mark:                                            | URL of a session's document                                   | https://example.com/files/session-document.png                |
| `friendlyName`                                                | *Optional\<String>*                                           | :heavy_minus_sign:                                            | Friendly name of the file                                     | Important Document                                            |
| `type`                                                        | *Optional\<String>*                                           | :heavy_minus_sign:                                            | Mime type of the file                                         | image/png                                                     |
| `size`                                                        | *Optional\<Long>*                                             | :heavy_minus_sign:                                            | Size of the file in bytes                                     | 150                                                           |
| `displayEnabled`                                              | *Optional\<Boolean>*                                          | :heavy_minus_sign:                                            | True indicates the file is displayed publicly.                | true                                                          |