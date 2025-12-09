# TransactionJson

This is used to denote the id and merchant/processor transaction id for transaction items.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `Id`                                                                 | *string*                                                             | :heavy_check_mark:                                                   | A string that has to be a format matching the industry standard uuid | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                 |
| `ProcessorTransactionId`                                             | *string*                                                             | :heavy_minus_sign:                                                   | This denotes the online processor transaction Id for transactions.   | ch_3Lrr4TBhiDV0mZz50nZpGx4a                                          |