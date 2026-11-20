# ExistingAudienceSegmentCreationType

How the audience segment's membership is determined. MANUAL: a planner adds and removes attendees individually. RULE_BASED: attendees are added automatically when they match the segment's criteria rules.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = ExistingAudienceSegmentCreationType.Manual;
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `Manual`    | MANUAL      |
| `RuleBased` | RULE_BASED  |