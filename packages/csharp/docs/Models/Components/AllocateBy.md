# AllocateBy

Specifies how to allocate a budgeted cost. AMOUNT allocates a fixed amount; PERCENTAGE allocates a percentage of the budget item's cost. For example, AMOUNT can allocate $700 from a $1,000 budget, while PERCENTAGE can allocate 70% of a $1,000 budget.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = AllocateBy.Percentage;
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `Percentage` | PERCENTAGE   |
| `Amount`     | AMOUNT       |