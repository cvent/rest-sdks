# EventStatusJson

Event status denotes if the event is in the past, present or future. Also can denote if the event was cancelled or deleted. 

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = EventStatusJson.Upcoming;
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `Upcoming`   | Upcoming     |
| `Ongoing`    | Ongoing      |
| `Completed`  | Completed    |
| `Cancelled`  | Cancelled    |
| `Deleted`    | Deleted      |
| `Processing` | Processing   |
| `Archived`   | Archived     |