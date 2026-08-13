# BudgetVendorType

Indicates how the vendor was added to your account. CSN indicates the vendor was sourced from the Cvent Supplier Network. VENDOR indicates a user added the vendor information to your account. REPOSITE indicates the vendor was sourced from the Reposite.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = BudgetVendorType.NotSpecified;
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `NotSpecified` | NOT_SPECIFIED  |
| `Vendor`       | VENDOR         |
| `Csn`          | CSN            |
| `Reposite`     | REPOSITE       |