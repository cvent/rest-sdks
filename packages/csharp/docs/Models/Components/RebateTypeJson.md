# RebateTypeJson

Rebate type for specifying the rebate value on citywide RFPs. If rebateType is `BY_AMOUNT`, the rebate value will be in decimal format. If rebateType is `BY_PERCENTAGE`, the rebate value will represent a percentage.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = RebateTypeJson.ByAmount;
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `ByAmount`     | BY_AMOUNT      |
| `ByPercentage` | BY_PERCENTAGE  |