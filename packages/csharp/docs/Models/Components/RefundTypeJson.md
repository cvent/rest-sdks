# RefundTypeJson

The type of refund policy for the fee. `RefundByFixedAmount`: Returns a fixed amount to the attendee as chosen by the planner. `RefundByCancellationAmount`: Refunds everything to the attendee minus an cancellation fee chosen by the planner. `RefundByPercentage`: Refunds a percentage of the amount as chosen by the planner.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = RefundTypeJson.RefundByFixedAmount;
```


## Values

| Name                         | Value                        |
| ---------------------------- | ---------------------------- |
| `RefundByFixedAmount`        | RefundByFixedAmount          |
| `RefundByCancellationAmount` | RefundByCancellationAmount   |
| `RefundByPercentage`         | RefundByPercentage           |