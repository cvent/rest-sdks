# BulkDataUploadResponse

The model representing the results of a bulk data upload


## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   | Example                                                                       |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `Data`                                                                        | List<[BulkDataPropertyJson](../../Models/Components/BulkDataPropertyJson.md)> | :heavy_minus_sign:                                                            | Collection of objects to be processed                                         |                                                                               |
| `Count`                                                                       | *long*                                                                        | :heavy_minus_sign:                                                            | The number of successfully uploaded data records                              | 100                                                                           |