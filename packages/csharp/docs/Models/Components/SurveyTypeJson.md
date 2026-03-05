# SurveyTypeJson

Describes the survey's type. `Standalone` indicates the survey exists independent of an event. `Event` indicates the survey is an event or session feedback survey. `Assessment` indicates the survey is associated with an event and is for assessing attendees.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = SurveyTypeJson.Standalone;
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `Standalone` | Standalone   |
| `Event`      | Event        |
| `Assessment` | Assessment   |