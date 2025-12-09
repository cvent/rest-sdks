# CardTokenResponse

Card token resource created in response to generating a card token for a credit card.


## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 | Example                                                                     |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `Id`                                                                        | *string*                                                                    | :heavy_minus_sign:                                                          | A token that can be used to reference the credit card for a transaction.    | 00000000-0000-0000-0000-000000000000                                        |
| `CreditCard`                                                                | [CreditCardResponseJson](../../Models/Components/CreditCardResponseJson.md) | :heavy_minus_sign:                                                          | Credit Card Response Object                                                 |                                                                             |