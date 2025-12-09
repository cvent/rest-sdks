# GeneralLedgerCodeJson

A general ledger code associated to a fee.


## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              | Example                                                                  |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `id`                                                                     | *Optional\<String>*                                                      | :heavy_minus_sign:                                                       | A unique identifier of the general ledger.                               | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d5                                     |
| `name`                                                                   | *Optional\<String>*                                                      | :heavy_minus_sign:                                                       | Name of the General Ledger.                                              | General Ledger                                                           |
| `code`                                                                   | *Optional\<String>*                                                      | :heavy_minus_sign:                                                       | General Ledger Code.                                                     | General Ledger Code                                                      |
| `allocation`                                                             | *Optional\<Double>*                                                      | :heavy_minus_sign:                                                       | The percentage of the fee that is attributed to the general ledger code. | 100                                                                      |