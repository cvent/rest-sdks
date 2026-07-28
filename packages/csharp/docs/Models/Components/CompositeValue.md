# CompositeValue

The structured representation of a complex question answer. Contains the same data as `value`, parsed into typed objects instead of JSON-serialized strings. This field is **read-only** — to write complex question answers, use `value` instead.

The structure of the array depends on the question `type`.


## Supported Types

### ArrayOfMeetingRoomRequirement

```csharp
CompositeValue.CreateArrayOfMeetingRoomRequirement(/* values here */);
```

### ArrayOfSleepingRoomRequirement

```csharp
CompositeValue.CreateArrayOfSleepingRoomRequirement(/* values here */);
```

### ArrayOfBudgetEstimate

```csharp
CompositeValue.CreateArrayOfBudgetEstimate(/* values here */);
```
