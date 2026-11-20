# RfpStatus

Status of the RFP. Returned as ACTIVE when no approval is required, or PENDING when approval is configured.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = RfpStatus.Pending;
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `Pending`   | PENDING     |
| `Active`    | ACTIVE      |
| `Awarded`   | AWARDED     |
| `Draft`     | DRAFT       |
| `Historic`  | HISTORIC    |
| `Cancelled` | CANCELLED   |
| `Deleted`   | DELETED     |