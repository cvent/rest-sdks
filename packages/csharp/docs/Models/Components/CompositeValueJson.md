# CompositeValueJson

The structured representation of a complex question answer. Contains the same data as `value`, parsed into typed objects instead of JSON-serialized strings. This field is **read-only** — to write complex question answers, use `value` instead.

The structure of the array depends on the question `type`.


## Supported Types

### ArrayOfMeetingRoomRequirementJson

```csharp
CompositeValueJson.CreateArrayOfMeetingRoomRequirementJson(/* values here */);
```

### ArrayOfSleepingRoomRequirementJson

```csharp
CompositeValueJson.CreateArrayOfSleepingRoomRequirementJson(/* values here */);
```

### ArrayOfBudgetEstimateJson

```csharp
CompositeValueJson.CreateArrayOfBudgetEstimateJson(/* values here */);
```
