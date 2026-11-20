# BidItemStatusType

The negotiation status of the bid item. For example, the corporation marks an item as `delete_requested`, and the hotel updates the item to `deleted` when it agrees. `not_offered`: The hotel does not offer the amenity. Applies only to the supply side.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = BidItemStatusType.Requested;
```


## Values

| Name              | Value             |
| ----------------- | ----------------- |
| `Requested`       | requested         |
| `DeleteRequested` | delete_requested  |
| `Deleted`         | deleted           |
| `NotOffered`      | not_offered       |