# Bulk

Config details for bulk operations.


## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `Supported`                                                    | *bool*                                                         | :heavy_minus_sign:                                             | Indicates if the bulk operation is supported.                  | false                                                          |
| `MaxOperations`                                                | *long*                                                         | :heavy_minus_sign:                                             | An integer value specifying the maximum number of operations.  | 1                                                              |
| `MaxPayloadSize`                                               | *long*                                                         | :heavy_minus_sign:                                             | An integer value specifying the maximum payload size in bytes. | 1048576                                                        |