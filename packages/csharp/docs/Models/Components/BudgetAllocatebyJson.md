# BudgetAllocatebyJson

Specifies the method of budget allocation. Select "AMOUNT" to allocate a fixed amount (e.g., $700 from a $1000 budget), or "PERCENTAGE" to allocate based on a percentage (e.g., 70% of a $1000 budget).

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = BudgetAllocatebyJson.Percentage;
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `Percentage` | PERCENTAGE   |
| `Amount`     | AMOUNT       |