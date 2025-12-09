# BulkDataUploadResponse

The model representing the results of a bulk data upload


## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    | Example                                                                        |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `data`                                                                         | List\<[BulkDataPropertyJson](../../models/components/BulkDataPropertyJson.md)> | :heavy_minus_sign:                                                             | Collection of objects to be processed                                          |                                                                                |
| `count`                                                                        | *Optional\<Long>*                                                              | :heavy_minus_sign:                                                             | The number of successfully uploaded data records                               | 100                                                                            |