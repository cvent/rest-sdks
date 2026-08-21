# TaxStructure

Details about taxes and fees applicable to a room.


## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `DisclosureStatement`                                                        | *string*                                                                     | :heavy_check_mark:                                                           | Statement disclosing tax and fee information.                                | Total room charges will include all room fees and taxes (Subject to change). |
| `Items`                                                                      | List<[TaxAndFee](../../Models/Components/TaxAndFee.md)>                      | :heavy_check_mark:                                                           | List of tax or fee items.                                                    |                                                                              |